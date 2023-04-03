package com.croky.postgres.dal.config;

import com.alibaba.druid.filter.Filter;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.wall.WallConfig;
import com.alibaba.druid.wall.WallFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * Copyright:   Copyright (c)2022
 * Company:     sci
 *
 * @author: 张李鑫
 * @version: 1.0
 * Create at:   2022-08-04 18:26:39
 * <p>
 * Modification History:
 * Date         Author      Version     Description
 * ------------------------------------------------------------------
 * 2022-08-04     张李鑫                     1.0         1.0 Version
 */
@Configuration
public class ClusterDataSourceConfig {

    private static final Logger log = LoggerFactory.getLogger(ClusterDataSourceConfig.class);
    @Value("${spring.datasource.cluster.jdbc.url}")
    private String extraUrl;
    @Value("${spring.datasource.cluster.jdbc.password}")
    private String extraPassword;
    @Value("${spring.datasource.cluster.jdbc.username}")
    private String extraUserName;

    @Value("${jdbc.driverClass}")
    private String driverClass;

    @Value("${jdbc.maxActive}")
    private int maxActive;

    @Value("${jdbc.minIdle}")
    private int minIdle;

    @Value("${jdbc.maxWait}")
    private long maxWait;

    @Value("${jdbc.removeAbandoned}")
    private boolean removeAbandoned = true;

    @Value("${jdbc.removeAbandonedTimeout}")
    private int removeAbandonedTimeout = 180;

    @Value("${jdbc.logAbandoned}")
    private boolean logAbandoned = true;

    @Value("${jdbc.timeBetweenEvictionRunsMillis}")
    private int timeBetweenEvictionRunsMillis = 3600000;

    @Value("${jdbc.minEvictableIdleTimeMillis}")
    private int minEvictableIdleTimeMillis = 3600000;

    @Value("${jdbc.defaultAutoCommit}")
    private boolean defaultAutoCommit = true;

    @Value("${jdbc.validationQuery}")
    private String validationQuery = "SELECT 1";

    @Value("${jdbc.testOnBorrow}")
    private boolean testOnBorrow = true;


    @Bean(name = "clusterDataSource")
    public DruidDataSource clusterDataSource() throws SQLException {
        log.debug("get clusterDataSource()");
        log.debug("extraUrl:{}",extraUrl);

        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(extraUrl);
        dataSource.setUsername(extraUserName);
        dataSource.setPassword(extraPassword);
        //最大连接池数量
        dataSource.setMaxActive(maxActive);
        //最小连接数
        dataSource.setMinIdle(minIdle);
        //初始化连接池大小
        dataSource.setInitialSize((maxActive + minIdle) / 2);
        //获取连接时最大等待时间，单位毫秒。配置了maxWait之后，缺省启用公平锁，并发效率会有所下降，如果需要可以通过配置useUnfairLock属性为true使用非公平锁
        dataSource.setMaxWait(maxWait);
        dataSource.setRemoveAbandoned(removeAbandoned);
        dataSource.setRemoveAbandonedTimeout(removeAbandonedTimeout);
        dataSource.setLogAbandoned(logAbandoned);
        dataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        dataSource.setDefaultAutoCommit(defaultAutoCommit);
        //用来检测连接是否有效的sql，要求是一个查询语句。如果validationQuery为null，testOnBorrow、testOnReturn、testWhileIdle都不会其作用
        dataSource.setValidationQuery(validationQuery);
        //申请连接时执行validationQuery检测连接是否有效，做了这个配置会降低性能
        dataSource.setTestOnBorrow(testOnBorrow);
        //是否缓存preparedStatement，也就是PSCache。PSCache对支持游标的数据库性能提升巨大，比如说oracle。在mysql下建议关闭
        dataSource.setPoolPreparedStatements(false);
        //归还连接时执行validationQuery检测连接是否有效，做了这个配置会降低性能
        dataSource.setTestOnReturn(false);
        //不影响性能，并且保证安全性。申请连接的时候检测，如果空闲时间大于timeBetweenEvictionRunsMillis，执行validationQuery检测连接是否有效。
        dataSource.setTestWhileIdle(true);
        dataSource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        //使用非公平锁
        dataSource.setUseUnfairLock(true);
        //配置filter  stat=统计  log4j=日志  wall=防注入
        dataSource.setFilters("stat,wall");
        dataSource.setProxyFilters(filters());
        dataSource.init();
        return dataSource;
    }
    private List<Filter> filters() {
        List<Filter> filters = new ArrayList<Filter>();
        WallFilter filter =  new WallFilter();
        WallConfig config = new WallConfig();
        config.setDir("META-INF/druid/wall/mysql");
        config.setDeleteAllow(false);//不允许执行物理删除语句
        filter.setDbType("mysql");//mysql,oracle,sqlserver,postgres
        filter.setConfig(config);
        return filters;
    }
}
