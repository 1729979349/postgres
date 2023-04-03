package com.croky.postgres.config;
import java.lang.management.ManagementFactory;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.Health.Builder;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * @author Croky.Zheng
 * 2017年5月26日
 */
@Component
//public class ActuatorConfig implements HealthIndicator {
public class ActuatorConfig extends AbstractHealthIndicator {
//	@Override
//	public Health health() {
//		int errorCode = check(); // perform some specific health check
//        if (errorCode != 0) {
//            return Health.down().withDetail("Error Code", errorCode).build();
//        }
//		Builder builder = Health.up();
////		builder.withDetail("classLoading", ManagementFactory.getClassLoadingMXBean());
////		builder.withDetail("compilation", ManagementFactory.getCompilationMXBean());
////		builder.withDetail("operatingSystem", ManagementFactory.getOperatingSystemMXBean());
////		builder.withDetail("thread", ManagementFactory.getThreadMXBean());
////		builder.withDetail("memoryManager", ManagementFactory.getMemoryManagerMXBeans());
////		builder.withDetail("garbageCollector", ManagementFactory.getGarbageCollectorMXBeans());
////		builder.withDetail("memoryPool", ManagementFactory.getMemoryPoolMXBeans());
//		//builder.withDetail("platform", ManagementFactory.getPlatformMBeanServer());
//		builder.withDetail("memory", ManagementFactory.getMemoryMXBean());
//		//会导致页面装载不完，太长了
////		builder.withDetail("runtime", ManagementFactory.getRuntimeMXBean());
//        return builder.build();
//	}
@Override
protected void doHealthCheck(Health.Builder builder) throws Exception {
	// TODO implement some check
	boolean running = true;
	if (running) {
		builder.withDetail("memory", ManagementFactory.getMemoryMXBean());
		builder.up();
	} else {
		builder.down().withDetail("running", "false");;
	}
}
	private int check() {
		return 0;
	}
}
