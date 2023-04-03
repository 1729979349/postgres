package com.croky.postgres.main.manager.impl;

import com.croky.postgres.dal.dao.extra.AlertStoreExtraDAO;
import com.croky.postgres.dal.model.AlertStore;
import com.croky.postgres.main.manager.AlertStoreManager;
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
import java.util.Objects;

/**
 * @author: zzh
 * @version: 1.0
 * @date: 2023/2/13 15:43 星期一
 * Description
 */
@Component("alertStoreManager")
public class AlertStoreManagerImpl implements AlertStoreManager {

    private static final Logger log = LoggerFactory.getLogger(AlertDateManagerImpl.class);

    @Autowired
    private dingdingService dingdingService;

    @Autowired
    private AlertStoreExtraDAO alertStoreExtraDAO;

    @Override
    public void addAlertStore() {
        try {
            String sheetId = "st-85453444-51336";
            //清空表里所有数据在新增
            log.info("addAlertStore 清空数据行数:{}", deleteAll());
            //表格总行数
            long rows = dingdingService.getForm(Constants.alert_workbook_id, sheetId);
            insert(dingdingService.getRowCellList(Constants.alert_workbook_id, sheetId, "A" + rows + ":O2"));
        } catch (Exception e) {
            log.error("预警店铺新增异常：{}", e.getMessage());
        }
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void insert(List<List<?>> rowCellList) {
        int i = 0;
        for (List<?> list : rowCellList) {
            i++;
            AlertStore store = new AlertStore();
            store.setCountry(list.get(0).toString());
            store.setBrand(list.get(1).toString());
            store.setPlatform(list.get(2).toString());
            store.setStoreName(list.get(3).toString());
            store.setStoreId(list.get(4).toString());
            store.setMktType(list.get(5).toString());
            store.setTl(list.get(6).toString());
            store.setTlMinDay(Objects.equals(list.get(7), "") ? 0 : Short.parseShort(list.get(7).toString()));
            store.setPic(list.get(8).toString());
            store.setPicMinDay(Objects.equals(list.get(9), "") ? 0 : Short.parseShort(list.get(9).toString()));
            store.setMktPic(list.get(10).toString());
            store.setMktPicMinDay(Objects.equals(list.get(11), "") ? 0 : Short.parseShort(list.get(11).toString()));
            store.setIsManual(list.get(12).toString());
            store.setRoiB(list.get(13).toString());
            store.setRemarks(list.get(14).toString());

            Date date = new Date();
            store.setCreateDateTime(date);
            store.setLastModifyDateTime(date);
            log.info("预警店铺对象{}：{}", i, store);
            if (alertStoreExtraDAO.insertSelective(store) < 1)
                throw new RuntimeException("addAlertStore insert failed");
        }
    }


    private int deleteAll() {
        return alertStoreExtraDAO.deleteAll();
    }
}
