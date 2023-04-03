package com.croky.postgres.main.task;

import java.util.Date;

/**
 * 
 * @author Croky.Zheng
 * 2020年2月11日 上午3:35:48
 */
public interface TaskExecutor {

	/**
	 * 添加一个周期性任务
	 * @param task			任务执行体 实现Runnable方法
	 * @param cron			周期cron表达式
	 * @return
	 */
	boolean addCronTask(Runnable task, String cron);

	/**
	 * 添加一个定时任务
	 * @param task			任务执行体 实现Runnable方法
	 * @param nextExecuteTime		执行时间
	 * @return
	 */
	boolean addTriggerTask(Runnable task, Date nextExecuteTime);

}
