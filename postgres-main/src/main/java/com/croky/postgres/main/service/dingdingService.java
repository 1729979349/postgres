package com.croky.postgres.main.service;

import com.aliyun.dingtalkdoc_1_0.models.GetSheetResponseBody;

import java.util.List;

/**
 * @author: zzh
 * @version: 1.0
 * @date: 2022/12/6 11:30 星期二
 * Description
 */
public interface dingdingService {

       /**
        * 获取表格内容
        * @return
        * @throws Exception
        */
       List<List<?>> getRowCellList(String workbookId,String sheetId,String rangAddress) throws Exception;

       /**
        * 更新钉钉表格
        * @return 被更新的range地址
        */
       String updateTable(List<List<String>> slist,int rowSize) throws Exception;

       /**
        * 获取表行数
        * @param workbookId
        * @param sheetId
        * @return
        * @throws Exception
        */
       long getForm( String workbookId, String sheetId) throws Exception;
}
