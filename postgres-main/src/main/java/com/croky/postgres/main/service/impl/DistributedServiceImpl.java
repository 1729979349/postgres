package com.croky.postgres.main.service.impl;

import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.Lock;

import org.redisson.RedissonMultiLock;
import org.redisson.RedissonRedLock;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.croky.postgres.main.service.DistributedService;
import org.springframework.stereotype.Service;

/**
 * 
 * @author Croky
 * @date 2020-9-5 18:05:18
 */
@Service("distributedService")
public class DistributedServiceImpl implements DistributedService {
	private static final Logger log = LoggerFactory.getLogger(DistributedServiceImpl.class);
	//基于Zookeeper的集群服务
	//private Map<String, DistributedAtomicLong> atomicLongMap = new HashMap<String, DistributedAtomicLong>();
	//private ReentrantLock changeMachineListLock = new ReentrantLock();

//	@Override
//	public InterProcessMutex getMutex(String name) {
//		//可重入锁
//		return new InterProcessMutex(client, lockPath + "/" + name);
//	}
//
//	@Override
//	public InterProcessSemaphoreMutex getSemaphoreMutex(String name) {
//		// 不可重入锁
//		return new InterProcessSemaphoreMutex(client, lockPath + "/" + name);
//	}
//
//	@Override
//	public ReadWriteLock getReadWriteLock(String name) {
//		return redisson.getReadWriteLock("anyRWLock");
//	}
//
//	@Override
//	public boolean createCounter(String key, long value) throws Exception {
//		DistributedAtomicLong atomicLong = atomicLongMap.get(key);
//		if (null == atomicLong) {
//			// 悲观锁
//			PromotedToLock PromotedToLock = null;
//			atomicLong = new DistributedAtomicLong(client, counterPath + "/" + key,
//					new ExponentialBackoffRetry(1000, 1), PromotedToLock);
//			atomicLongMap.put(key, atomicLong);
//		}
//		if (value > 0) {
//			return atomicLong.initialize(value);
//		}
//		return false;
//	}
//
//	@Override
//	public long counterIncrement(String key) throws Exception {
//		DistributedAtomicLong atomicLong = atomicLongMap.get(key);
//		if (null != atomicLong) {
//			return atomicLong.increment().postValue();
//		}
//		throw new NullPointerException("havn't Counter of key:" + key);
//	}
//
//	@Override
//	public long counterAdd(String key, long delta) throws Exception {
//		DistributedAtomicLong atomicLong = atomicLongMap.get(key);
//		if (null != atomicLong) {
//			return atomicLong.add(delta).postValue();
//		}
//		throw new NullPointerException("havn't Counter of key:" + key);
//	}
//
//	@Override
//	public long counterDecrement(String key) throws Exception {
//		DistributedAtomicLong atomicLong = atomicLongMap.get(key);
//		if (null != atomicLong) {
//			return atomicLong.decrement().postValue();
//		}
//		throw new NullPointerException("havn't Counter of key:" + key);
//	}
	@Autowired
	private RedissonClient redisson;


	@Override
	public Lock getLock(String name) {
		if (log.isDebugEnabled()) {
			log.debug("getLock:" + name);
		}
		return redisson.getLock(name);
		/*
		 * 
		// 加锁以后10秒钟自动解锁
		// 无需调用unlock方法手动解锁
		lock.lock(10, TimeUnit.SECONDS);
		
		// 尝试加锁，最多等待100秒，上锁以后10秒自动解锁
		boolean res = lock.tryLock(100, 10, TimeUnit.SECONDS);
		if (res) {
		   try {
		     ...
		   } finally {
		       lock.unlock();
		   }
		}
		//异步
		 * lock.lockAsync();
		lock.lockAsync(10, TimeUnit.SECONDS);
		Future<Boolean> res = lock.tryLockAsync(100, 10, TimeUnit.SECONDS);
		 */
		//redisson同时提供
		//redisson.getFairLock(name);//公平锁,它保证了当多个Redisson客户端线程同时请求加锁时，优先分配给先发出请求的线程
		//RedissonMultiLock lock = new RedissonMultiLock(lock1, lock2, lock3);//联锁，可以多个锁联合在一起，同时上锁才算成功
		//RedissonRedLock lock = new RedissonRedLock(lock1, lock2, lock3);//红锁，可以多个锁联合在一起，只需要多个节点上锁就算成功
	}
	
	@Override
	public Lock getMultiLock(Lock ...locks) {
		if (log.isDebugEnabled()) {
			log.debug("getMultiLock");
		}
		if ((null != locks) && (locks.length > 0)) {
			RLock[] rlocks = new RLock[locks.length];
			for (int i = 0; i < locks.length; i++) {
				if (locks[i] instanceof RLock) {
					rlocks[i] = (RLock) locks[i];
				}
			}
			return new RedissonMultiLock(rlocks);
		}
		return null;
	}
	
	@Override
	public Lock getRedLock(Lock ...locks) {
		if (log.isDebugEnabled()) {
			log.debug("getRedLock");
		}
		if ((null != locks) && (locks.length > 0)) {
			RLock[] rlocks = new RLock[locks.length];
			for (int i = 0; i < locks.length; i++) {
				if (locks[i] instanceof RLock) {
					rlocks[i] = (RLock) locks[i];
				}
			}
			return new RedissonRedLock(rlocks);
		}
		return null;
	}

	@Override
	public Map<Object, Object> buildMap(String name) {
		return redisson.getMap(name);
	}

	@Override
	public ConcurrentMap<Object,Object> buildConcurrentMap(String name) {
		return redisson.getMapCache(name);
	}

}
