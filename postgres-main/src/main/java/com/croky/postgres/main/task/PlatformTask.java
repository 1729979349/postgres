package com.croky.postgres.main.task;

import com.croky.postgres.main.manager.PlatformConfigurationTableManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author: zzh
 * @version: 1.0
 * @date: 2022/12/15 15:05 星期四
 * Description 平台账号配置表定时同步mysql、redis
 */
@EnableScheduling
@Component
public class PlatformTask {

    private static final Logger log = LoggerFactory.getLogger(PlatformTask.class);

    @Value("${spring.profiles.active}")
    private String idDev;

    @Autowired
    private PlatformConfigurationTableManager platformConfigurationTableManager;


    @Scheduled(cron = "20 40 * * * ?")
    public void configurationTableSycnRedis() throws InterruptedException {
        if(!idDev.equals("prod")){
            log.info("is not prod");
            return;
        }
        log.info("redis账户密码同步开始...{}", new Date());
        //获取最新配置表登录信息同步redis
        platformConfigurationTableManager.addPlatformConfigurationTable();
        Thread.sleep(8000);
        //同步redis错误信息
        platformConfigurationTableManager.getRedisMessageUpdateFailedInfo();
        Thread.sleep(8000);
        //mysql 错误信息同步配置表
        platformConfigurationTableManager.syncConfigurationTable();
        log.info("redis账户密码同步结束...{}", new Date());
    }

}
