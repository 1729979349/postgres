package com.croky.postgres.main.manager.impl;

import com.croky.postgres.dal.dao.extra.AlertThresholdExtraDAO;
import com.croky.postgres.dal.model.AlertThreshold;
import com.croky.postgres.main.manager.AlertThresholdManager;
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
 * @date: 2023/2/13 15:45 星期一
 * Description
 */
@Component("alertThresholdManager")
public class AlertThresholdManagerImpl implements AlertThresholdManager {

    private static final Logger log = LoggerFactory.getLogger(AlertThresholdManagerImpl.class);

    @Autowired
    private dingdingService dingdingService;

    @Autowired
    private AlertThresholdExtraDAO alertThresholdExtraDAO;


    @Override
    public void addAlertThreshold() {
        try {
            String sheetId = "st-85453444-51357";
            //清空表里所有数据在新增
            log.info("addAlertThreshold 清空数据行数:{}", deleteAll());
            //表格总行数
            long rows = dingdingService.getForm( Constants.alert_workbook_id, sheetId);
            insert(dingdingService.getRowCellList(Constants.alert_workbook_id, sheetId, "A" + rows + ":B2"));
        } catch (Exception e) {
            log.error("预警阈值新增异常：{}", e.getMessage());
        }
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void insert(List<List<?>> rowCellList) {
        int i = 0;
        for (List<?> list : rowCellList) {
            i++;
            AlertThreshold threshold = new AlertThreshold();
            threshold.setRoiA(list.get(0).toString());
            threshold.setRoiC(list.get(1).toString());

            Date date = new Date();
            threshold.setCreateDateTime(date);
            threshold.setLastModifyDateTime(date);
            log.info("预警阈值对象{}：{}", i, threshold);
            if (alertThresholdExtraDAO.insertSelective(threshold) < 1)
                throw new RuntimeException("addAlertThreshold insert failed");
        }

    }

    private int deleteAll() {
        return alertThresholdExtraDAO.deleteAll();
    }
}

