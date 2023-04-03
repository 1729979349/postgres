package com.croky.postgres.main.service;

import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.Lock;

/**
 * 
 * @author Croky
 * @date 2020-9-5 18:04:56
 */
public interface DistributedService {

	/**
	 * 获取分布式锁
	 * @param name
	 * @return
	 */
	Lock getLock(String name);

	/**
	  * 获取分布式Map
	 * @param name
	 * @return
	 */
	Map<Object, Object> buildMap(String name);

	/**
	  * 获取分布式异步Map
	 * @param name
	 * @return
	 */
	ConcurrentMap<Object, Object> buildConcurrentMap(String name);

	/**
	  * 获取一个联锁，只有当参数指定的所有锁都锁定成功时，才能获取一个连锁
	 * @param locks
	 * @return
	 */
	Lock getMultiLock(Lock ...locks);

	/**
	  * 获取一个红锁，红锁只需要部分锁成功，就能锁定成功
	 * @param locks
	 * @return
	 */
	Lock getRedLock(Lock ...locks);

}
