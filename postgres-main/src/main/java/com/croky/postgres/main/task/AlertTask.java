package com.croky.postgres.main.task;

import com.croky.postgres.main.manager.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

import java.util.Date;

/**
 * @author: zzh
 * @version: 1.0
 * @date: 2023/2/13 16:28 星期一
 * Description 预警配置表定时同步mysql
 */
@EnableScheduling
@Component
public class AlertTask {

    private static final Logger log = LoggerFactory.getLogger(AlertTask.class);

    @Value("${spring.profiles.active}")
    private String idDev;

    @Autowired
    private AlertDateManager alertDateManager;

    @Autowired
    private AlertStoreManager alertStoreManager;

    @Autowired
    private AlertThresholdManager alertThresholdManager;

    @Autowired
    private CompetitionMonitoringManager competitionMonitoringManager;

    @Autowired
    private PlatformDimensionReportManager platformDimensionReportManager;

    @Autowired
    private WarningModelManager warningModelManager;

    @Scheduled(cron = "20 44 9-23 * * ?")
    public void configurationTable() {
        if(!idDev.equals("prod")){
            log.info("is not prod");
            return;
        }
        log.info("钉钉表格同步开始...{}", new Date());
        //大促日期
        alertDateManager.addAlertDate();
        //预警店铺
        alertStoreManager.addAlertStore();
        //预警阈值
        alertThresholdManager.addAlertThreshold();
        //竞对监控
        competitionMonitoringManager.addCompetitionMonitoring();
        //报表维度
        platformDimensionReportManager.addPlatformDimensionReport();
        log.info("钉钉表格同步结束...{}", new Date());
    }

    @Scheduled(cron = "20 30 13 * * ?")
    public void Alert() {
        if(!idDev.equals("prod")){
            log.info("is not prod");
            return;
        }
        log.info("预警开始...{}", new Date());
        //投产预警
        warningModelManager.productionModelCalculationLogic();

        log.info("预警结束...{}", new Date());
    }


}
