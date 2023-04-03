package com.croky.postgres.main.manager.impl;


import com.croky.common.util.CollectionUtils;
import com.croky.postgres.dal.dao.extra.PlatformConfigurationTableExtraDAO;
import com.croky.postgres.dal.model.PlatformConfigurationTable;
import com.croky.postgres.dal.model.PlatformConfigurationTableExample;
import com.croky.postgres.main.manager.PlatformConfigurationTableManager;
import com.croky.postgres.main.service.dingdingService;
import com.croky.postgres.utils.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * @author: zzh
 * @version: 1.0
 * @date: 2022/12/6 14:16 星期二
 * Description
 */
@Component("platformConfigurationTableManager")
public class PlatformConfigurationTableManagerImpl implements PlatformConfigurationTableManager {

    private static final Logger log = LoggerFactory.getLogger(PlatformConfigurationTableManager.class);

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private dingdingService dingdingService;

    @Autowired
    private PlatformConfigurationTableExtraDAO platformConfigurationTableExtraDAO;

    @Override
    public void addPlatformConfigurationTable() {
        try {
            String sheetId = "kgqie6hm";
            //清空表里所有数据在新增
            log.info("addPlatformConfigurationTable 清空数据行数:{}", deleteAll());
            insert(dingdingService.getRowCellList(Constants.platform_workbook_id, sheetId, "A" + dingdingService.getForm(Constants.platform_workbook_id, sheetId) + ":S2"));
        } catch (Exception e) {
            log.error("平台账号配置表新增异常：{}", e.getMessage());
        }
    }


    @Override
    public List<PlatformConfigurationTable> syncConfigurationTable() {
        PlatformConfigurationTableExample table = new PlatformConfigurationTableExample();
        table.setOrderByClause("id");
        List<PlatformConfigurationTable> platformConfigurationTables = platformConfigurationTableExtraDAO.selectByExample(table);
        List<List<String>> list = new ArrayList<>();
        platformConfigurationTables.forEach(platformConfigurationTable -> {
            List<String> lists = new ArrayList<>();
            lists.add(platformConfigurationTable.getPasswordFailed());
//            lists.add(platformConfigurationTable.getEmailFailed());
//            lists.add(platformConfigurationTable.getPhoneFailed());
            list.add(lists);
        });
        try {
            // 更新配置表 异常信息
            dingdingService.updateTable(list, platformConfigurationTables.size() + 1);
        } catch (Exception e) {
            log.error("updateTable failed {}", e.getMessage());
        }
        return platformConfigurationTables;
    }

    @Override
    public void getRedisMessageUpdateFailedInfo() {
        SetOperations<String, String> setRedis = stringRedisTemplate.opsForSet();
        Set<String> members = setRedis.members("shop:account:fail");
        if (!CollectionUtils.isEmpty(members)) {
            for (String member : members) {
                log.info("member:{}", member);
                PlatformConfigurationTableExample example = new PlatformConfigurationTableExample();
                example.createCriteria().andStoreIdEqualTo(member);
                List<PlatformConfigurationTable> platformConfigurationTables = platformConfigurationTableExtraDAO.selectByExample(example);
                if (!CollectionUtils.isEmpty(platformConfigurationTables)) {
                    PlatformConfigurationTable platform = platformConfigurationTables.get(0);
                    platform.setPasswordFailed("true");
                    platformConfigurationTableExtraDAO.updateByPrimaryKeySelective(platform);
                }
            }

            stringRedisTemplate.delete("shop:account:fail");
        }

    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void insert(List<List<?>> rowCellList) {
        int i = 0;
        HashOperations<String, String, String> hashOperations = stringRedisTemplate.opsForHash();
        for (List<?> list : rowCellList) {
            i++;
            PlatformConfigurationTable configurationTable = new PlatformConfigurationTable();
            configurationTable.setActiveStatus(list.get(0).toString());
            configurationTable.setShopCountry(list.get(1).toString());
            configurationTable.setPlatform(list.get(2).toString());
            configurationTable.setCategory(list.get(3).toString());
            configurationTable.setBrand(list.get(4).toString());
            configurationTable.setStoreName(list.get(5).toString());
            configurationTable.setStoreId(list.get(6).toString());
            configurationTable.setLoginUrl(list.get(7).toString());
            configurationTable.setUsername(list.get(8).toString());
            configurationTable.setPassword(list.get(9).toString());
            configurationTable.setBindedEmail(list.get(10).toString());
            configurationTable.setBindedPhone(list.get(11).toString());
            configurationTable.setDataExtraction(list.get(12).toString());
            configurationTable.setPasswordFailed(list.get(13).toString());
            configurationTable.setEmailFailed(list.get(14).toString());
            configurationTable.setPhoneFailed(list.get(15).toString());
            configurationTable.setTeamRegion(list.get(16).toString());
            configurationTable.setTeamLeader(list.get(17).toString());
            configurationTable.setPic(list.get(18).toString());

            Date date = new Date();
            configurationTable.setCreateDateTime(date);
            configurationTable.setLastModifyDateTime(date);
            log.info("对象{}：{}", i, configurationTable);
            if (platformConfigurationTableExtraDAO.insertSelective(configurationTable) < 1)
                throw new RuntimeException("addPlatformConfigurationTable insert failed");

            redisSyncAccountPassword(configurationTable, hashOperations);
        }
    }


    //将配置表登录信息同步到redis
    public void redisSyncAccountPassword(PlatformConfigurationTable platform, HashOperations<String, String, String> redisHash) {
        if (platform.getActiveStatus().equals("Active")
                && platform.getDataExtraction().equals("true") && (platform.getPlatform().equals("Lazada") || platform.getPlatform().equals("Shopee"))) {//状态为Active 同步redis
            String loginKey = platform.getPlatform().toLowerCase() + ":" + platform.getShopCountry().toLowerCase() + ":login:" + platform.getStoreId();
            //先删除在同步
            stringRedisTemplate.delete(loginKey);
            String encryption = encryptionAndDecryption(platform.getPassword(), "Encryption");
            log.info("encryption2: {}", encryption);
            //同步
            redisHash.put(loginKey, "password", encryption.substring(2, encryption.length() - 1));
            redisHash.put(loginKey, "host", platform.getLoginUrl());
            redisHash.put(loginKey, "username", platform.getUsername());

        }
    }

    /**
     * 获取明文、密文
     *
     * @param password                明文或者密文
     * @param encryptionAndDecryption 加密或者解密
     * @return 返回明文、密文
     */
    private String encryptionAndDecryption(String password, String encryptionAndDecryption) {
        StringBuilder line = new StringBuilder();
        try {
            //设置命令行传入参数
            //TODO 本地（不用）与线上（！转换）切换
//            String[] str = new String[]{"D:\\tools\\python3.9\\python.exe", System.getProperty("user.dir") + "\\postgres-web\\src\\main\\webapp\\WEB-INF\\" + encryptionAndDecryption + ".py", password};
            String str = "python3 /data/app/"+encryptionAndDecryption+".py " + password;
            log.info("脚本路径:{}", str);
            Process pr = Runtime.getRuntime().exec(str);
            BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream(), StandardCharsets.UTF_8));
            String s;
            while ((s = in.readLine()) != null) {
                line.append(s);
            }
            in.close();
            pr.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return line.toString();
    }

    private int deleteAll() {
        return platformConfigurationTableExtraDAO.deleteAll();
    }
}
