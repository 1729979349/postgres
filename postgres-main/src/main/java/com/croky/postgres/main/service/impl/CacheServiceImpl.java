package com.croky.postgres.main.service.impl;

import java.util.concurrent.TimeUnit;

//import org.redisson.api.RedissonClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.ApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import com.croky.postgres.main.service.CacheService;

/**
 * 
 * @author Croky
 * 2019年7月8日
 */
@Service("cacheService")
public class CacheServiceImpl implements CacheService {
	private static final Logger log = LoggerFactory.getLogger(CacheServiceImpl.class);
	
	@Autowired
	private ApplicationContext applicationContext;//	    
	
	@Autowired
    private StringRedisTemplate stringRedisTemplate;

	@Autowired
	private RedisTemplate<Object, Object> redisTemplate;

	@Autowired
	private SimpleCacheManager localCacheMananger;
	
//	@Autowired
//	private RedissonClient redisson;
	
	//默认以分钟为单位
	private TimeUnit defaultTimeUnit = TimeUnit.MINUTES;
	
	//默认30分钟，半个小时
	private long defaultTimeout = 30L;
	
	@Override
	@CacheEvict(allEntries=true,beforeInvocation=true)
	public void cleanItemCache() {
		if(log.isDebugEnabled()) {
			log.debug("cleanItemCache...");
		}
	}
	
	@Override
	@CacheEvict(value= {"items"},allEntries=true,beforeInvocation=true)
	public void cleanItemsCache() {
		if(log.isDebugEnabled()) {
			log.debug("cleanItemsCache...");
		}
	}

	/**************************系统代码*********************************/
	 
	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}
	
	@Override
	public Object currentProxy() {
		return AopContext.currentProxy();
	}

	@Override
	public StringRedisTemplate getStringRedisTemplate() {
		return stringRedisTemplate;
	}

	@Override
	public RedisTemplate<Object, Object> getRedisTemplate() {
		return redisTemplate;
	}

	@Override
	public void putToRemote(String key,String value) {
		stringRedisTemplate.opsForValue().set(key, value, defaultTimeout, defaultTimeUnit);
	}

	@Override
	public String getFromRemote(String key) {
		return stringRedisTemplate.opsForValue().get(key);
	}

	@Override
	public void putToLocal(String name,String key,Object value) {
		this.getLocalCache(name).put(key, value);
	}

	@Override
	public <T> T getFromLocal(String name,String key,Class<T> clazz) {
		return this.getLocalCache(name).get(key,clazz);
	}

	@Override
	public void setDefaultTimeUnit(TimeUnit defaultTimeUnit) {
		this.defaultTimeUnit = defaultTimeUnit;
	}
	
	
	@Override
	public void setDefaultTimeout(long defaultTimeout) {
		this.defaultTimeout = defaultTimeout;
	}

	@Override
	public Cache getLocalCache(String name) {
		return this.localCacheMananger.getCache(name);
	}
	
	@Override
	public SimpleCacheManager getLocalCacheManager() {
		return this.localCacheMananger;
	}

//	@Override
//	public RedissonClient getRedisson() {
//		return redisson;
//	}
}
