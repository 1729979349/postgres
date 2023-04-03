package com.croky.postgres.main.task;

import com.croky.postgres.main.task.impl.TaskExecutorImpl;
import com.croky.common.util.DateUtils;
import com.croky.common.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.File;
import java.util.Date;

/**
 * 清理临时文件
 * @author Croky.Zheng
 * @date 2021-05-11 19:42
 */
@EnableScheduling
@Component
public class TempFileCleanTask {
    Logger log = LoggerFactory.getLogger(TempFileCleanTask.class);

    @Value("${app.upload.path}")
    private String uploadPath;
    @Value("${app.upload.validDays}")
    private int validDays = 3;
    @Value("${app.task.allow}")
    private boolean allow;

    @PostConstruct
    public void checkUploadFileExiest() {
        if (!allow) {  return;}
        log.debug("checkUploadFileExiest task will executing...");
        File file = new File(uploadPath);
        if (file.exists() && file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    /**
     * 每天凌晨3点执行
     */
    @Scheduled(cron="0 0 3 * * ?")
    private void deleteExpireFile() {
        if (!allow) {  return;}
        log.debug("deleteExpireFile task will executing...");
        if (StringUtils.isNotBlank(uploadPath)) {
            File path = new File(uploadPath);
            if (path.exists() && path.isDirectory()) {
                for (File file : path.listFiles()) {
                    if (DateUtils.daysOfBetweenNow(new Date(file.lastModified())) < (validDays*-1)) {
                        file.delete();
                        log.info("deleteExpireFile:" + file.getAbsolutePath());
                    }
                }
            }
        } else {
            log.error("deleteExpireFile failed!upload path is null");
        }
    }

    // 每30秒执行一次
    // @Scheduled(cron="0/30 0 0 * * ?")
    // @Scheduled(initialDelay = 10000, fixedDelay = 300000) //该方法某一次执行结束后，开始计算时间，当时间达到300000秒，就开始再次执行该方法
    // 每次执行间隔300秒，如果上一个执行未结束，则等待（被阻塞）,在执行方法是加上@Async（类上使用@EnableAsync），则会多线程执行
    @Scheduled(initialDelay = 10000, fixedRate = 300000)
    private void executeClusterService() {
        if (!allow) {  return;}
        log.debug("executeClusterServiceJob task will executing...");
    }

}
