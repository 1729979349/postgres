package com.croky.postgres.main.manager.impl;

import com.croky.postgres.dal.dao.extra.PlatformDimensionReportExtraDAO;
import com.croky.postgres.dal.model.PlatformDimensionReport;
import com.croky.postgres.main.manager.PlatformDimensionReportManager;
import com.croky.postgres.main.service.dingdingService;
import com.croky.postgres.utils.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @author: zzh
 * @version: 1.0
 * @date: 2023/3/6 14:30 星期一
 * Description
 */
@Component("platformDimensionReportManager")
public class PlatformDimensionReportManagerImpl implements PlatformDimensionReportManager {

    private static final Logger log= LoggerFactory.getLogger(PlatformDimensionReportManagerImpl.class);

    @Autowired
    private PlatformDimensionReportExtraDAO platformDimensionReportExtraDAO;

    @Autowired
    private dingdingService dingdingService;

    @Override
    public void addPlatformDimensionReport() {
        try {
            String sheetId = "st-7c301482-30694";
            //清空表里所有数据在新增
            log.info("addPlatformDimensionReport 清空数据行数:{}", deleteAll());
            insert(dingdingService.getRowCellList(Constants.platform_workbook_id, sheetId, "A" + dingdingService.getForm(Constants.platform_workbook_id, sheetId) + ":S2"));
        } catch (Exception e) {
            log.error("平台报表维度新增异常：{}", e.getMessage());
        }
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void insert(List<List<?>> rowCellList) {
        int i = 0;
        for (List<?> list : rowCellList) {
            i++;
            PlatformDimensionReport report = new PlatformDimensionReport();
            report.setChannel(list.get(0).toString());
            report.setPlatformType(list.get(1).toString());
            report.setPlatform(list.get(2).toString());
            report.setDataCategory(list.get(3).toString());
            report.setSourceCategory(list.get(4).toString());
            report.setSource(list.get(5).toString());
            report.setTableNameDwd(list.get(6).toString());

            Date date = new Date();
            report.setCreateDateTime(date);
            report.setLastModifyDateTime(date);
            log.info("报表维度对象{}：{}", i, report);
            if (platformDimensionReportExtraDAO.insertSelective(report) < 1)
                throw new RuntimeException("addPlatformDimensionReport insert failed");
        }


    }


    private int deleteAll(){
        return platformDimensionReportExtraDAO.deleteAll();
    }
}
