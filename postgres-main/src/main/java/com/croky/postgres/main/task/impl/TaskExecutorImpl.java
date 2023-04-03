package com.croky.postgres.main.task.impl;

import java.io.File;
import java.util.Date;

import com.croky.postgres.main.task.TaskExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.DependsOn;
import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.TriggerContext;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.config.CronTask;
import org.springframework.scheduling.config.TriggerTask;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;

import com.croky.postgres.main.config.TaskConfiguration;
import com.croky.common.util.StringUtils;
import com.croky.common.util.DateUtils;

import javax.annotation.PostConstruct;

/**
 * 所有的任务都在这里执行
 * @author Croky.Zheng
 * 2019年9月9日 下午6:08:07
 */
//需要注解@Scheduled得到执行
@Component("taskScheduler")
public class TaskExecutorImpl implements TaskExecutor {
	Logger log = LoggerFactory.getLogger(TaskExecutorImpl.class);

	@Override
	public boolean addCronTask(Runnable task,String cron) {
		if (null == TaskConfiguration.taskRegistrar) {
			log.error("task threadpool = null!");
			return false;
		}
		
		if (null == task) {
			throw new NullPointerException("task = null!");
		}
		CronTask cronTask = new CronTask(task, new CronTrigger(cron));
		TaskConfiguration.taskRegistrar.addCronTask(cronTask);
		return true;
	}
	
	@Override
	public boolean addTriggerTask(Runnable task,Date nextExecuteTime) {
		if (null == TaskConfiguration.taskRegistrar) {
			log.error("task threadpool = null!");
			return false;
		}
		
		if (null == task) {
			throw new NullPointerException("task = null!");
		}
		TriggerTask triggerTask = new TriggerTask(task, new Trigger() {
			@Override
			public Date nextExecutionTime(TriggerContext triggerContext) {
				return nextExecuteTime;
			}
			
		});
		TaskConfiguration.taskRegistrar.addTriggerTask(triggerTask);
		return true;
	}
}
