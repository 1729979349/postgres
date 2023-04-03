package com.croky.postgres.main.manager.impl;

import com.croky.common.util.StringUtils;
import com.croky.postgres.dal.dao.extra.CompetitionMonitoringExtraDAO;
import com.croky.postgres.dal.model.CompetitionMonitoring;
import com.croky.postgres.main.manager.CompetitionMonitoringManager;
import com.croky.postgres.main.service.dingdingService;
import com.croky.postgres.utils.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: zzh
 * @version: 1.0
 * @date: 2023/3/7 15:37 星期二
 * Description
 */
@Component("competitionMonitoringManager")
public class CompetitionMonitoringManagerImpl implements CompetitionMonitoringManager {

    private static final Logger log = LoggerFactory.getLogger(CompetitionMonitoringManagerImpl.class);

    @Autowired
    private dingdingService dingdingService;

    @Autowired
    private CompetitionMonitoringExtraDAO competitionMonitoringExtraDAO;

    @Override
    public void addCompetitionMonitoring() {
        try {
            String sheetId = "kgqie6hm";
            //清空表里所有数据在新增
            log.info("addCompetitionMonitoring 清空数据行数:{}", deleteAll());
            //表格总行数
            long rows = dingdingService.getForm(Constants.competition_workbook_id, sheetId);
            insert(dingdingService.getRowCellList(Constants.competition_workbook_id, sheetId, "A" + rows + ":G2"));
        } catch (Exception e) {
            log.error("竞对监控新增异常：{}", e.getMessage());
        }
    }

    @Override
    public List<String> selectShopeeShopIdAll() {

        return competitionMonitoringExtraDAO.selectByExample(null).stream().map(CompetitionMonitoring::getShopeeShopId).filter(StringUtils::isNotBlank).toList();
    }

    @Override
    public List<String> selectLazadaSgOrMyAll(String type) {

        return competitionMonitoringExtraDAO.selectByExample(null).stream().map(CompetitionMonitoring::getLazada).
                map(s -> s=s.indexOf("?")>0?s.substring(0,s.indexOf("?")):s).map(s -> s=s.endsWith("/")?s:s+"/").
                map(s -> s=s.replace("shop/","")).filter(s -> s.contains(type)).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        String s="https://www.lazada.sg/shop/oppo/?spm=a2?o42.home.search.4.654346b5TYrAiU&_keyori=ss&from=suggest_sis&sis_suggestion_click=OPPO%20Flagship%20Store,oppo&sugg=oppo_3_1";

        System.out.println(s.substring(0,s.indexOf("?")));
    }

    private void insert(List<List<?>> rowCellList) {
        int i = 0;
        for (List<?> list : rowCellList) {
            i++;
            CompetitionMonitoring monitoring = new CompetitionMonitoring();
            monitoring.setBrand(list.get(0).toString());
            monitoring.setLazada(list.get(1).toString());
            monitoring.setShopee(list.get(2).toString());
            monitoring.setShopeeShopId(list.get(3).toString());
            monitoring.setQoo10(list.get(4).toString());
            monitoring.setTmall(list.get(5).toString());
            monitoring.setJd(list.get(6).toString());

            Date date = new Date();
            monitoring.setCreateDateTime(date);
            monitoring.setLastModifyDateTime(date);
            log.info("竞对监控对象{}：{}", i, monitoring);
            if (competitionMonitoringExtraDAO.insertSelective(monitoring) < 1)
                throw new RuntimeException("addCompetitionMonitoring insert failed");
        }
    }


    private int deleteAll() {
        return competitionMonitoringExtraDAO.deleteAll();
    }

}
