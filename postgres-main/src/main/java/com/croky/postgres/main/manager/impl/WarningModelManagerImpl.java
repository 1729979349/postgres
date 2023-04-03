package com.croky.postgres.main.manager.impl;

import com.croky.common.util.CollectionUtils;
import com.croky.common.util.StringUtils;
import com.croky.postgres.client.model.EmployeeVO;
import com.croky.postgres.client.model.Result;
import com.croky.postgres.dal.dao.AlertDateDAO;
import com.croky.postgres.dal.dao.NailingCrowdDAO;
import com.croky.postgres.dal.dao.extra.*;
import com.croky.postgres.dal.model.*;
import com.croky.postgres.main.manager.WarningModelManager;
import com.croky.postgres.main.service.RobotService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Thread.sleep;

/**
 * @author: zzh
 * @version: 1.0
 * @date: 2023/3/23 11:17 星期四
 * Description
 */
@Component("warningModelManager")
public class WarningModelManagerImpl implements WarningModelManager {

    private static final Logger log = LoggerFactory.getLogger(WarningModelManagerImpl.class);

    @Resource
    private AlertStoreExtraDAO alertStoreExtraDAO;

    @Resource
    private SpAdsDwdExtraDAO spAdsDwdExtraDAO;

    @Resource
    private AlertThresholdExtraDAO alertThresholdExtraDAO;

    @Resource
    private PlatformConfigurationTableExtraDAO platformConfigurationTableExtraDAO;

    @Resource
    private RobotService robotService;

    @Resource
    private lzAdsDwdDAO lzAdsDwdDAO;

    @Resource
    private HzCnRoiDAO hzCnRoiDAO;

    @Resource
    private AlertDateDAO alertDateDAO;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Resource
    private NailingCrowdDAO nailingCrowdDAO;


    /**
     * 投产模型计算逻辑
     */
    public void productionModelCalculationLogic() {
        //获取预警阈值
        AlertThreshold threshold = alertThresholdExtraDAO.selectByExample(null).get(0);
        //获取平台账号配置信息
        PlatformConfigurationTableExample tableExample = new PlatformConfigurationTableExample();
        tableExample.createCriteria().andActiveStatusEqualTo("Active").andDataExtractionEqualTo("true").andStoreIdIsNotNull();
        List<PlatformConfigurationTable> platformConfigurationTables = platformConfigurationTableExtraDAO.selectByExample(tableExample);
        platformConfigurationTables.forEach(platformConfigurationTable -> {
            AlertStoreExample example = new AlertStoreExample();
            example.createCriteria().andStoreIdEqualTo(platformConfigurationTable.getStoreId());
            //通过storeId获取投产预警
            List<AlertStore> alertStores = alertStoreExtraDAO.selectByExample(example);
            try {
                dataMatching(alertStores, threshold);
            } catch (Exception e) {
                robotService.batchSend(new String[]{"16379243530361627"},"预警功能："+e.getMessage());
            }
        });
    }

    @Override
    public List<String> getAllEmployeeInfo() {
        RestTemplate restTemplate=new RestTemplate();
        String url = "http://regular.sciecomm.cn:22331/employee/probation?statusList=2,3,-1,5";
        ResponseEntity<Result> forEntity = restTemplate.getForEntity(url, Result.class);
        List<EmployeeVO> employeeS = Objects.requireNonNull(forEntity.getBody()).getModel();

        return employeeS.stream().map(ev -> ev.getName() + "_" + ev.getUserid()).collect(Collectors.toList());
    }

    @Override
    public String sendUserAlertInfo(List<String> slist, String alertInfo) {
        String[] userIds = slist.stream().map(s -> s.split("_")[s.split("_").length - 1]).toArray(String[]::new);
        String[] userNames= slist.stream().map(s -> s.split("_")[0]).toArray(String[]::new);
        StringBuilder filedInfo=new StringBuilder("报警信息,");
        try {
            robotService.batchSend(userIds,alertInfo);
            filedInfo.append("success:").append(Arrays.toString(userNames));
        } catch (Exception e) {
            filedInfo.append("fail:").append(Arrays.toString(userNames)).append(",失败信息:").append(e.getMessage());
        }
        return filedInfo.toString();
    }

    @Override
    public List<String> getAllCrowd() {

        return nailingCrowdDAO.selectByExample(null).stream().map(nc -> nc.getCrowdName()+"_"+nc.getCrowdToken()).collect(Collectors.toList());
    }

    @Override
    public String sendCrowdAlertInfo(List<String> slist, String alertInfo) {
        List<String> success=new ArrayList<>();
        Map<String,String> failed=new HashMap<>();
        for (String s : slist) {
            String[] s1 = s.split("_");
            try {
                robotService.rotCrowdSend(s1[1],alertInfo);
                success.add(s1[0]);
            } catch (Exception e) {
                failed.put(s1[0],e.getMessage());
            }
        }
        return "报警信息," + "success:" + Arrays.toString(success.toArray(new String[success.size()])) + ",fail:{" + failed + "}";
    }

    public void dataMatching(List<AlertStore> alertStores, AlertThreshold threshold) {
        if (CollectionUtils.isEmpty(alertStores))
            return;
        for (AlertStore alertStore : alertStores) {
            if ((alertStore.getPlatform().equals("Shopee")) || (alertStore.getPlatform().equals("Lazada"))) {
                log.info("alertStore：{}", alertStore);
                if (alertStore.getMktType().equals("All") && alertStore.getPlatform().equals("Lazada")) //不处理
                    continue;

                getHistoryAndYesterdayRoi(alertStore, threshold, null, null, null, null);
            } else if (alertStore.getCountry().equals("CN")) {
                log.info("alertStore：{}", alertStore);
                String tableName = null, transactionAmount = null, spend = null;
                switch (alertStore.getMktType()) {
                    case "直通车" -> {
                        tableName = "hz_almm_ztc_dwd";
                        transactionAmount = "总成交金额";
                        spend = "花费";
                    }
                    case "引力魔方" -> {
                        tableName = "hz_almm_ylmf_dwd";
                        transactionAmount = "成交金额";
                        spend = "花费";
                    }
                    case "万相台" -> {
                        tableName = "hz_almm_wxt_promotion_data_dwd";
                        transactionAmount = "\"总成交金额(元)\"";
                        spend = "\"消耗(元)\"";
                    }
                    case "品销宝" -> {
                        tableName = "hz_almm_pxb_account_statement_zh_dwd";
                        transactionAmount = "成交金额";
                        spend = "消耗";
                    }
                    case "全站推广" -> {
                        tableName = "hz_pdd_station_wide_promotion_dwd";
                        transactionAmount = "\"交易额(元)\"";
                        spend = "\"花费(元)\"";
                    }
                }
                getHistoryAndYesterdayRoi(alertStore, threshold, hashMap.get(alertStore.getStoreId()), tableName, transactionAmount, spend);
            }
        }
    }

    /**
     * 获取历史与昨天 roi
     *
     * @param alertStore 预警对象
     */
    private void getHistoryAndYesterdayRoi(AlertStore alertStore, AlertThreshold threshold, String storeId, String tableName, String transactionAmount, String spend) {
        AlertDateExample dateExample = new AlertDateExample();
        dateExample.createCriteria().andDateOfDataEqualTo(new Date(System.currentTimeMillis() - 1000 * 60 * 60 * 24 )).andCountryEqualTo(alertStore.getCountry());
        List<AlertDate> alertDates = alertDateDAO.selectByExample(dateExample);
        //获取昨天日期是否 是在大促日期中
        String contain = CollectionUtils.isEmpty(alertDates) ? "not in" : "in";
        List<Float> roiAll = new ArrayList<>(); // 历史roi
        Map<String, Object> yesterdayRoi = new HashMap<>();//昨天roi
        String mktType = alertStore.getMktType();
        if (alertStore.getCountry().equals("CN")) { //国内平台
            roiAll = hzCnRoiDAO.getCNShopNameAll(storeId, tableName, transactionAmount, spend, alertStore.getCountry(), contain);
            yesterdayRoi = hzCnRoiDAO.getCNShopNameYesterday(storeId, tableName, transactionAmount, spend);
        } else { // lazada  shopee
            switch (mktType) {
                case "Shop Search Ad", "Product Search Ad", "Discovery Ads" -> { //shopee
                    yesterdayRoi = spAdsDwdExtraDAO.getYesterdayRoi(alertStore.getStoreId(), mktType);
                    roiAll = spAdsDwdExtraDAO.getRoiDescType(alertStore.getStoreId(), mktType, alertStore.getCountry(), contain);
                }
                case "Shop Search Ad + Product Search Ad" -> {
                    String[] split = mktType.split(" \\+ ");
                    yesterdayRoi = spAdsDwdExtraDAO.getYesterdayRoiTwo(alertStore.getStoreId(), split[0], split[1]);
                    roiAll = spAdsDwdExtraDAO.getRoiDescTypeTwo(alertStore.getStoreId(), split[0], split[1], alertStore.getCountry(), contain);
                }
                case "All" -> {
                    yesterdayRoi = spAdsDwdExtraDAO.getYesterdayRoiAll(alertStore.getStoreId());
                    roiAll = spAdsDwdExtraDAO.getRoiDescTypeAll(alertStore.getStoreId(), alertStore.getCountry(), contain);
                }
                case "Standard,ALL", "Automated,ALL" -> { // lazadda
                    roiAll = lzAdsDwdDAO.getLazadaIsNotIDRCampaignTypeRoi(alertStore.getStoreId(), mktType.split(",")[0], alertStore.getCountry(), contain);
                    yesterdayRoi = lzAdsDwdDAO.getLazadaIsNotIDRCampaignTypeYesterdayRoi(alertStore.getStoreId(), mktType.split(",")[0]);
                }
                case "Standard,Sponsored Products", "Standard,Sponsored Search", "Automated,Sponsored Products", "Automated,Sponsored Search" -> {
                    roiAll = lzAdsDwdDAO.getLazadaIsNotIDRCampaignTypeAndPlacementRoi(alertStore.getStoreId(), mktType.split(",")[1], mktType.split(",")[0], alertStore.getCountry(), contain);
                    yesterdayRoi = lzAdsDwdDAO.getLazadaIsNotIDRCampaignTypeAndPlacementYesterdayRoi(alertStore.getStoreId(), mktType.split(",")[1], mktType.split(",")[0]);
                }
                case "Manual,Promosi Rekomendasi", "Manual,Promosi Pencarian" -> {
                    roiAll = lzAdsDwdDAO.getLazadaIsIDRCampaignTypeAndPlacementRoi(alertStore.getStoreId(), mktType.split(",")[1], mktType.split(",")[0], alertStore.getCountry(), contain);
                    yesterdayRoi = lzAdsDwdDAO.getLazadaIsIDRCampaignTypeAndPlacementYesterdayRoi(alertStore.getStoreId(), mktType.split(",")[1], mktType.split(",")[0]);
                }
            }
        }
        enterTheMouth(roiAll, yesterdayRoi, alertStore, threshold);

    }

    /**
     * @param roiAll       获取历史每天相应的roi
     * @param yesterdayRoi 获取昨天相应的roi
     * @param alertStore   预警对象
     * @param threshold    预警阈值
     */
    private void enterTheMouth(List<Float> roiAll, Map<String, Object> yesterdayRoi, AlertStore alertStore, AlertThreshold threshold) {
        log.info("历史数据量：{},昨天roi：{}", roiAll == null ? null : roiAll.size(), yesterdayRoi);
        //没数据 跳过循环 或者 获取昨天的roi为空不计算（说明没有数据） 或者 investment没有投入金额
        if (roiAll == null || yesterdayRoi == null || yesterdayRoi.get("roi") == null || Float.parseFloat(yesterdayRoi.get("investment").toString()) == 0)
            return;

        //获取roi_a、roi_c
        Map<String, Float> map = roiCalculation(threshold, roiAll);
        //发送警告
        sendWarning(alertStore, map.get("roi_a"), map.get("roi_c"), Float.parseFloat(yesterdayRoi.get("roi").toString()));
    }

    /**
     * 走模型并发送警告
     */
    private void sendWarning(AlertStore alertStore, float roi_a, float roi_c, float roi) {
        log.info("走模型...");
        try {
            sleep(5000); //机器人接口一分钟请求不能超过20次
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        date.setTime(date.getTime() - 86400000);
        String height;
        //为true roi_b不为空走模型逻辑
        if (alertStore.getIsManual().equals("true")) {
            float tmRoi_b = Float.parseFloat(alertStore.getRoiB());
            if (tmRoi_b < roi_c) {
                if ((roi < roi_a ||  roi < tmRoi_b)&& roi>0) { //低值警告
                    height = "过低";
                    whetherTheStorePredictedYesterday(alertStore, roi, simpleDateFormat.format(date), height);
                } else if (roi >= roi_c && roi > 0) { //高值警告
                    height = "过高";
                    whetherTheStorePredictedYesterday(alertStore, roi, simpleDateFormat.format(date), height);
                }

            } else if (tmRoi_b >= roi_c) {
                if (roi <= tmRoi_b && roi > 0) {
                    height = "过低";
                    whetherTheStorePredictedYesterday(alertStore, roi, simpleDateFormat.format(date), height);
                }
            }
        } else {
            //为false判定roi是否小于 roi_a 大于roi_c
            if (roi < roi_a) {
                //投产比：过小
                height = "过低";
                whetherTheStorePredictedYesterday(alertStore, roi, simpleDateFormat.format(date), height);
            } else if (roi >= roi_c && roi > 0) {
                //投产比：过大
                height = "过高";
                whetherTheStorePredictedYesterday(alertStore, roi, simpleDateFormat.format(date), height);
            }
        }
    }


    /**
     * 机器人发送群预警通知
     *
     * @param alertStore 预警对象
     * @param roi        昨天的roi
     */
    private void whetherTheStorePredictedYesterday(AlertStore alertStore, float roi, String date, String height) {
        String alertsCount = stringRedisTemplate.opsForValue().get(alertStore.getStoreId() + alertStore.getMktType());
        boolean valBool = true;
        boolean alertBool = false;
        log.info("alertsCount:{}", alertsCount);
         String too = height.equals("过高") ? "too high" : "too low";
        String  warn=" 在 "+date  +"，"+ alertStore.getPlatform() + "的" + alertStore.getStoreName() + "，在 " + alertStore.getMktType() + "， 渠道的投产值为" + roi + "，"+ height + "，请关注！(at "+date+", for "+alertStore.getPlatform()+" on "+ alertStore.getStoreName() + ", the ROI of ads on "+alertStore.getMktType()+" is " + roi + ", which is "+too+". Please pay attention!)";
        if (alertsCount == null) {
            valBool = false;
            stringRedisTemplate.opsForValue().set(alertStore.getStoreId() + alertStore.getMktType(), "11", 1450, TimeUnit.MINUTES); //过期时间一天多十分钟
        } else if (alertsCount.length() == alertStore.getMktPicMinDay()) {
            alertBool = true;
        } else if (alertsCount.length() == alertStore.getPicMinDay()) { //单天已经是第3天了
            alertBool = true;
            robotService.singleCrowdSend(getUserIds(alertStore.getPic()),warn);
        } else if (alertsCount.length() >= alertStore.getTlMinDay()) {
            alertBool = true;
            robotService.singleCrowdSend(getUserIds(alertStore.getPic()), warn);
            robotService.singleCrowdSend(getUserIds(alertStore.getTl()), warn);
        }
        if (alertStore.getMktPicMinDay() == 1 || alertBool) //为1 每天预警
            robotService.singleCrowdSend(getUserIds(alertStore.getMktPic()), warn);

        if (valBool)
            stringRedisTemplate.opsForValue().set(alertStore.getStoreId() + alertStore.getMktType(), alertsCount + "1", 1450, TimeUnit.MINUTES); //每次长度加1 过期时间一天多十分钟
    }

    /**
     * 获取用户userId
     *
     * @param userName 用户名称
     * @return 不存在返回
     */
    public List<String> getUserIds(String userName) {
        log.info("用户名称：{}", userName);
        if (StringUtils.isBlank(userName))
            return null;
        String[] split = userName.split("<");
        List<String> strs = new ArrayList<>();
        for (String s : split) {
            strs.add(getUserId(s.substring(1)));//获取@后面字符
        }
        return strs;
    }


    public String getUserId(String userName) {
        EmployeeVO employeeVO;
        employeeVO = sendGet(userName);
        if (employeeVO != null) {
            return employeeVO.getUserid();
        }
        String two = userName.substring(1, !userName.contains("(") ? userName.length() : userName.indexOf("(")).replace(" ", ""); // 括号前面字符
        employeeVO = sendGet(two);
        if (employeeVO != null)
            return employeeVO.getUserid();
        String three = userName.substring(userName.indexOf("(") + 1, !userName.contains(")") ? userName.length() : userName.lastIndexOf(")")).replace(" ", ""); //  括号里面字符
        employeeVO = sendGet(three);
        if (employeeVO != null)
            return employeeVO.getUserid();
        String four = two.substring(0, two.length() / 2 - 1); // 括号前面字符一半
        employeeVO = sendGet(four);
        if (employeeVO != null)
            return employeeVO.getUserid();
        String five = three.contains("(") ? three.substring(three.indexOf("(") + 1, three.indexOf(")")) : null; // 括号里面括号字符
        employeeVO = sendGet(five);
        if (employeeVO != null)
            return employeeVO.getUserid();

        return userName;
    }

    public EmployeeVO sendGet(String userName) {
        log.info("截取userName：{}", userName);
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://regular.sciecomm.cn:22331/employee/probation?employeeName=" + userName + "&statusList=2,3,-1,5";
        ResponseEntity<Result> forEntity = restTemplate.getForEntity(url, Result.class);
        if (CollectionUtils.isEmpty(Objects.requireNonNull(forEntity.getBody()).getModel())) {
            return null;
        } else {
            log.info("用户长度：{}", forEntity.getBody().getModel().size());
            return forEntity.getBody().getModel().get(0);
        }

    }

    /**
     * roi_a roi_c 计算方式
     *
     * @param threshold 预计阈值
     * @param roiAll    对应的roi
     * @return 计算的roi_a roi_c
     */
    private Map<String, Float> roiCalculation(AlertThreshold threshold, List<Float> roiAll) {
        /*
         *      Q1 1-100 25   50
         *          Q1（对应ROI） = 100 （数据量） × 0.25（下四分位）
         *          Q1 = 25   13
         *      Q3
         *          Q3 = （对应ROI） = 100（数据量） × 0.25（上四分位）
         *          Q3 = 75  38
         *      IQR
         *          IQR（四份位距） = Q3 - Q1
         *          IQR = 75 - 25
         *          IQR = 50
         *
         *      ROI_A 下限
         *          ROI_A = 25 （Q1） - 1.5（预警阈值 ROI_A value） × 50 （IQR）
         *          ROI_A = 0 （结果值为：-50 不存在负数结果为：0）
         *      ROI_C 上限
         *          ROI_C = 75 （Q1） + 1.5（预警阈值 ROI_C value） × 50 （IQR）
         *          ROI_C = 150
         *      ROI_B 极限值
         *          ORI_B = 预警店铺.roi_b
         */
        int dateVolume = roiAll.size();//数据量
        int sizeA = (int) (dateVolume - dateVolume * 0.25);
        int sizeC = (int) (dateVolume - (dateVolume - dateVolume * 0.25));
        log.info("sizeA:{},sizeC:{}", sizeA, sizeC);
        float Q1 = roiAll.get(sizeA);
        float Q3 = roiAll.get(sizeC);
        float IQR = Q3 - Q1;
        float roi_a = Q1 - Float.parseFloat(threshold.getRoiA()) * IQR;
        if (roi_a < 0)
            roi_a = 0;
        float roi_c = Q3 + Float.parseFloat(threshold.getRoiA()) * IQR;
        Map<String, Float> map = new HashMap<>();
        map.put("roi_a", roi_a);
        map.put("roi_c", roi_c);
        log.info("数据量：{},Q1：{},Q3：{},roi_a：{},roi_c：{}", dateVolume, Q1, Q3, roi_a, roi_c);
        return map;
    }

    private final HashMap<String, String> hashMap = new HashMap<>() {{
        put("243131953", "sorbushwqjd");
        put("516193996", "tigerbalmhbhwqjd%");
        put("370484106", "blancdouxhwqjd");
        put("250389763", "jenorishwqjd");
        put("219523582", "bachahwqjd");

    }};
}
