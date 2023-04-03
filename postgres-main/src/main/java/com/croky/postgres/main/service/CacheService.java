package com.croky.postgres.main.service;

import java.util.concurrent.TimeUnit;

//import org.redisson.api.RedissonClient;
import org.springframework.cache.Cache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

public interface CacheService {

	/**
	 * 清理单个商品的缓存
	 */
	void cleanItemCache();

	/**
	 * 清理商品列表分页的缓存
	 * beforeInvocation=true 表示在方法执行之前,就执行缓存清理工作
	 */
	void cleanItemsCache();

	
	/**
	 * 在同一个Service中，方法A调用方法B，aop定义的方法无法执行
	 * 一些注解切入，比如Cacheable则会失效，用如下方式来调用，则可以使用切入
	 * ((Service)AopContext.currentProxy()).B()
	 * @return
	 */
	Object currentProxy();

	/**
	 * 设置默认缓存单位
	 * @param defaultTimeUnit
	 */
	void setDefaultTimeUnit(TimeUnit defaultTimeUnit);

	/**
	 * 获取本地缓存管理器
	 * @return
	 */
	SimpleCacheManager getLocalCacheManager();

	/**
	 * 获取本地缓存
	 * @param name
	 * @return
	 */
	Cache getLocalCache(String name);

	/**
	 * 设置默认过期时间
	 * @param defaultTimeout
	 */
	void setDefaultTimeout(long defaultTimeout);

	/**
	 * 访问远程缓存获取一个值
	 * @param key
	 * @return
	 */
	String getFromRemote(String key);

	/**
	 * 写数据到远程缓存
	 * @param key
	 * @param value
	 */
	void putToRemote(String key, String value);

	/**
	 * 获取StringRedisTemplate
	 * @return
	 */
	StringRedisTemplate getStringRedisTemplate();

	/**
	 * 获取RedisTemplate
	 * @return
	 */
	RedisTemplate<Object, Object> getRedisTemplate();

	/**
	 * 
	 * @param name
	 * @param key
	 * @param value
	 */
	void putToLocal(String name, String key, Object value);

	/**
	 * 
	 * @param <T>
	 * @param name
	 * @param key
	 * @param clazz
	 * @return
	 */
	<T> T getFromLocal(String name, String key, Class<T> clazz);

	/**
	 * 获取一个Redisson对象
	 * @return
	 */
//	RedissonClient getRedisson();

}
