package com.croky.postgres.main.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 
 * @author Croky
 * @date 2020-8-24 20:03:26
 */
@Configuration
//标注启动了缓存
@EnableCaching
@PropertySource(value={"classpath:bootstrap.properties","classpath:application.properties"})
@RefreshScope
public class NacosConfiguration {
	@Value("${useLocalCache:false}")
    private boolean useLocalCache;

	public boolean isUseLocalCache() {
		return useLocalCache;
	}

	public void setUseLocalCache(boolean useLocalCache) {
		this.useLocalCache = useLocalCache;
	}
}
