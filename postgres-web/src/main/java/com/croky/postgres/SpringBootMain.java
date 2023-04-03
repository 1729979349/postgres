package com.croky.postgres;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * 
 * @author Croky.Zheng 2017年3月6日
 */
@SpringBootApplication(scanBasePackages= {/*"com.croky.microware.bdsc",*/"com.croky.postgres","com.croky.common.servlet"})
@EnableHystrix
@EnableHystrixDashboard
@EnableDiscoveryClient
@EnableFeignClients(basePackages= {"com.croky.**.client"})
public class SpringBootMain {
	public static void main(String[] args) throws Exception {
		// redis使用lettuce会遇到这个问题,设置io.netty.noUnsafe属性为true，则默认会使用Heap堆内存创建ByteBuf
		//System.setProperty("io.netty.noUnsafe", "true");
		// dubbo日志用slf4j，springboot用logback
		System.setProperty("nacos.logging.path","/opt/logs/postgres");
		SpringApplication.run(SpringBootMain.class, args);
	}
}
