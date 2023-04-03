package com.croky.postgres.main.manager.impl;

import com.croky.postgres.dal.dao.extra.AlertDateExtraDAO;
import com.croky.postgres.dal.model.AlertDate;
import com.croky.postgres.main.manager.AlertDateManager;
import com.croky.postgres.main.service.dingdingService;
import com.croky.postgres.utils.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author: zzh
 * @version: 1.0
 * @date: 2023/2/13 15:44 星期一
 * Description
 */
@Component("alertDateManager")
public class AlertDateManagerImpl implements AlertDateManager {

    private static final Logger log = LoggerFactory.getLogger(AlertStoreManagerImpl.class);

    @Autowired
    private dingdingService dingdingService;

    @Autowired
    private AlertDateExtraDAO alertDateExtraDAO;


    @Override
    public void addAlertDate() {
        try {
            String sheetId = "kgqie6hm";
            //清空表里所有数据在新增
            log.info("addAlertDate 清空数据行数:{}", deleteAll());
            //表格总行数
            long rows = dingdingService.getForm(Constants.alert_workbook_id, sheetId);
            insert(dingdingService.getRowCellList(Constants.alert_workbook_id, sheetId, "A" + rows + ":G2"));
        } catch (Exception e) {
            log.error("大促日期新增异常：{}", e.getMessage());
        }
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void insert(List<List<?>> rowCellList) {
        int i = 0;
        Date startDate = new Date();
        Date endDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for (List<?> list : rowCellList) {
            int startDay = Integer.parseInt(list.get(3).toString());
            int endDay = Integer.parseInt(list.get(4).toString());
            //25569(注：这里指1900-1970具体的天数)
            startDate.setTime((startDay - 25569) * 24 * 60 * 60 * 1000L);
            endDate.setTime((endDay - 25569) * 24 * 60 * 60 * 1000L);
            i++;
            AlertDate alertDate = new AlertDate();
            alertDate.setCountry(list.get(0).toString());
            alertDate.setTier(list.get(1).toString());
            alertDate.setName(list.get(2).toString());
            alertDate.setStartDate(sdf.format(startDate));
            alertDate.setEndDate(sdf.format(endDate));
            alertDate.setPlatform(list.get(5).toString());
            alertDate.setYear(list.get(6).toString());

            Date date = new Date();
            alertDate.setCreateDateTime(date);
            alertDate.setLastModifyDateTime(date);
            log.info("大促日期对象{}：{}", i, alertDate);

            while (startDay<=endDay) {
                Date dateOfData = new Date((startDay - 25569) * 24 * 60 * 60 * 1000L);
                alertDate.setDateOfData(dateOfData);
                if (alertDateExtraDAO.insertSelective(alertDate) < 1)
                    throw new RuntimeException("addAlertDate insert failed");

                if (startDay == endDay)
                    break;

                startDay++;
            }
        }
    }


    private int deleteAll() {
        return alertDateExtraDAO.deleteAll();
    }
}
