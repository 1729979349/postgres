package com.croky.postgres.main.config;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

/**
 * springboot 定时任务的配置类
 * @author Croky.Zheng
 * 2020年1月29日 上午2:05:24
0- */
@Configuration
//开启定时器
@EnableScheduling
//开启多线程，开启后多个定时任务不会互相影响
@EnableAsync
@PropertySource(value={"classpath:bootstrap.properties","classpath:application.properties"})
public class TaskConfiguration implements SchedulingConfigurer {
	Logger log = LoggerFactory.getLogger(TaskConfiguration.class);

	@Value("${app.scheduling.threadPoolSize}")
	private int threadPoolSize = 3;
	
	private ScheduledExecutorService executorService = null;
	
	private ExecutorService shareExecutorService = null;
	
	public static ScheduledTaskRegistrar taskRegistrar;
	
	@PostConstruct
	public void init() {
		log.debug("init scheduler threadPoolSize=" + threadPoolSize);		
		executorService = Executors.newScheduledThreadPool(threadPoolSize);
		shareExecutorService = Executors.newCachedThreadPool();
	}
	
	@Override
	public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
		TaskConfiguration.taskRegistrar = taskRegistrar;
		taskRegistrar.setScheduler(executorService);
	}

//    @Bean //另一种不用实现接口SchedulingConfigurer的方式
//    public TaskScheduler taskScheduler() {
//    	ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
//        scheduler.setPoolSize(threadPoolSize);
//        return scheduler;
//    }
	
	@Bean
	public ScheduledExecutorService scheduler() {
		return executorService;
	}
	
	@Bean
	public ExecutorService shareExecutorService() {
		return shareExecutorService;
	}
}