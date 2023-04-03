package com.croky.postgres.dal.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author Croky.Zheng
 * @Date 2018年9月14日
 * @tags
 */
@Configuration
//加上这个注解，使得支持事务
@EnableTransactionManagement
@MapperScan(basePackages = "com.croky.postgres.dal.cluster", sqlSessionTemplateRef = "clusterSqlSessionTemplate")
public class MyBatisClusterConfigurer  {
    private static final Logger log = LoggerFactory.getLogger(MyBatisClusterConfigurer.class);

    @Autowired
    @Qualifier("clusterDataSource")
    private DataSource clusterDataSource;


    @Bean(name = "clusterSqlSessionFactory")
    public SqlSessionFactory clusterSqlSessionFactory() {
        log.debug("sqlSessionFactoryBean1 init()");
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(clusterDataSource);
        //无法自动注入
//        bean.setPlugins(plugins());
        try {
            return bean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Bean(name = "clusterSqlSessionTemplate")
    public SqlSessionTemplate clusterSqlSessionTemplate() {
        log.debug("clusterSqlSessionTemplate init()");
        return new SqlSessionTemplate(clusterSqlSessionFactory());
    }


    @Bean(name = "clusterTransactionManager")
    public TransactionManager clusterTransactionManager() {
        return new DataSourceTransactionManager(clusterDataSource);
    }
}
