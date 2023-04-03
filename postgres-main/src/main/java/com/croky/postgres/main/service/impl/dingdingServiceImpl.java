package com.croky.postgres.main.service.impl;

import com.alibaba.druid.sql.ast.expr.SQLLiteralExpr;
import com.aliyun.dingtalkdoc_1_0.models.*;
import com.aliyun.teautil.models.RuntimeOptions;
import com.croky.postgres.main.service.dingdingService;
import com.croky.postgres.utils.Constants;
import com.croky.postgres.utils.document.WordUtils;
import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiGettokenRequest;
import com.dingtalk.api.response.OapiGettokenResponse;
import com.taobao.api.ApiException;
import org.apache.commons.collections4.Get;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author: zzh
 * @version: 1.0
 * @date: 2022/12/6 11:30 星期二
 * Description
 */
@Service("dingdingService")
public class dingdingServiceImpl implements dingdingService {

    private static final Logger log= LoggerFactory.getLogger(dingdingServiceImpl.class);

    @Override
    public List<List<?>> getRowCellList(String workbookId,String sheetId,String rangAddress) throws Exception {
        //从0下标开始 getForm().getLastNonEmptyRow()
        return getRowCell(workbookId,sheetId,rangAddress);
    }

    @Override
    public String updateTable(List<List<String>> list,int rowSize) throws Exception {
        return updateCell(list,rowSize);
    }

    public static void main(String[] args) throws Exception {
        //正式表格id:MeYVOLjK1L2Jnpz2
        //测试表格:id:X8oLl9YV3aeelapY

        dingdingServiceImpl service=new dingdingServiceImpl();
        List<List<String>> lists=new ArrayList();
//        Long lastNonEmptyRow = service.getForm().getLastNonEmptyRow()+1;
//        System.out.println(lastNonEmptyRow);
//        for (int i=1;i<lastNonEmptyRow;i++){
//            List<String> slist=new ArrayList<>();
//            slist.add(i+i+"");
//            slist.add(i+i+"");
//            slist.add(i+i+"");
//            lists.add(slist);
//        }
//        System.out.println(lists.size());
//        service.updateCell(lists,lastNonEmptyRow);
        //大促日期（kgqie6hm） 预警店铺（st-85453444-51336） 预警阈值（st-85453444-51357）
        service.getAllWorksheet();

    }

    /**
     *  获取列内容 行内容
     * @return 表格内容
     * @throws Exception
     */
    private List<List<?>> getRowCell(String workbookId,String sheetId,String rangAddress) throws Exception{
        log.info("表格总长度：{}",rangAddress);
        com.aliyun.dingtalkdoc_1_0.Client client = createClient();
        com.aliyun.dingtalkdoc_1_0.models.GetRangeHeaders getRangeHeaders = new com.aliyun.dingtalkdoc_1_0.models.GetRangeHeaders();
        getRangeHeaders.xAcsDingtalkAccessToken = token();
        com.aliyun.dingtalkdoc_1_0.models.GetRangeRequest getRangeRequest = new com.aliyun.dingtalkdoc_1_0.models.GetRangeRequest()
                .setOperatorId(Constants.operator_id);

        GetRangeResponse rangeWithOptions = client.getRangeWithOptions(workbookId, sheetId, rangAddress, getRangeRequest, getRangeHeaders, new RuntimeOptions());
        return rangeWithOptions.body.values;
    }



    /**
     * 获取表格 多少行多少列
     * @return GetSheetResponseBody
     * @throws Exception
     */
    public long getForm(String workbookId,String sheetId) throws Exception {
        com.aliyun.dingtalkdoc_1_0.Client client = createClient();
        com.aliyun.dingtalkdoc_1_0.models.GetSheetHeaders getSheetHeaders = new com.aliyun.dingtalkdoc_1_0.models.GetSheetHeaders();
        getSheetHeaders.xAcsDingtalkAccessToken = token();
        com.aliyun.dingtalkdoc_1_0.models.GetSheetRequest getSheetRequest = new com.aliyun.dingtalkdoc_1_0.models.GetSheetRequest()
                .setOperatorId(Constants.operator_id);
        GetSheetResponse sheetWithOptions = client.getSheetWithOptions(workbookId, sheetId, getSheetRequest, getSheetHeaders, new RuntimeOptions());

        return sheetWithOptions.body.getLastNonEmptyRow()+1;
    }

    private String updateCell(List<List<String>> list,long sizeRow) throws Exception {
        com.aliyun.dingtalkdoc_1_0.Client client = createClient();
        com.aliyun.dingtalkdoc_1_0.models.UpdateRangeHeaders updateRangeHeaders = new com.aliyun.dingtalkdoc_1_0.models.UpdateRangeHeaders();
        updateRangeHeaders.xAcsDingtalkAccessToken = token();
        com.aliyun.dingtalkdoc_1_0.models.UpdateRangeRequest updateRangeRequest = new com.aliyun.dingtalkdoc_1_0.models.UpdateRangeRequest()
                .setOperatorId(Constants.operator_id)
                .setValues(list);
        //正式表格id:MeYVOLjK1L2Jnpz2
        //测试表格:id:X8oLl9YV3aeelapY
        return client.updateRangeWithOptions("MeYVOLjK1L2Jnpz2", "kgqie6hm", "N2:N"+sizeRow+"",
                    updateRangeRequest, updateRangeHeaders, new com.aliyun.teautil.models.RuntimeOptions()).toString();
    }

    private String token() throws ApiException {
        DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/gettoken");
        OapiGettokenRequest req = new OapiGettokenRequest();
        req.setAppkey("dingyduxiqbjcgrcfyfg");
        req.setAppsecret("Dnap26MQ57BM-cvsbZDXYkfg-KT-9kJ0s1fGztYcKJCrEV3PRpVxh-KUNomt39UG");
        req.setHttpMethod("GET");
        OapiGettokenResponse rsp  = client.execute(req);
        return rsp.getAccessToken();
    }


    private void getAllWorksheet() throws Exception {
        com.aliyun.dingtalkdoc_1_0.Client client = createClient();
        com.aliyun.dingtalkdoc_1_0.models.GetAllSheetsHeaders getAllSheetsHeaders = new com.aliyun.dingtalkdoc_1_0.models.GetAllSheetsHeaders();
        getAllSheetsHeaders.xAcsDingtalkAccessToken = token();
        com.aliyun.dingtalkdoc_1_0.models.GetAllSheetsRequest getAllSheetsRequest = new com.aliyun.dingtalkdoc_1_0.models.GetAllSheetsRequest()
                .setOperatorId(Constants.operator_id);

        GetAllSheetsResponse response = client.getAllSheetsWithOptions("7jP2lRKA3NW2n8g5", getAllSheetsRequest, getAllSheetsHeaders, new RuntimeOptions());
        for (GetAllSheetsResponseBody.GetAllSheetsResponseBodyValue getAllSheetsResponseBodyValue : response.body.value) {
            System.out.println(getAllSheetsResponseBodyValue.id);
            System.out.println(getAllSheetsResponseBodyValue.name);
        }
    }

    private  com.aliyun.dingtalkdoc_1_0.Client createClient() throws Exception {
        com.aliyun.teaopenapi.models.Config config = new com.aliyun.teaopenapi.models.Config();
        config.protocol = "https";
        config.regionId = "central";
        return new com.aliyun.dingtalkdoc_1_0.Client(config);
    }
}
