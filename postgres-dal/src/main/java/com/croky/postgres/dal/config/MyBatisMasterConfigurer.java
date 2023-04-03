package com.croky.postgres.dal.config;

import com.github.pagehelper.PageHelper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.MybatisProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

/**
 *
 * @author Croky.Zheng
 * @Date 2018年9月14日
 * @tags
 */
@Configuration
//加上这个注解，使得支持事务
@EnableTransactionManagement
@MapperScan(basePackages = "com.croky.postgres.dal.dao", sqlSessionTemplateRef = "sqlSessionTemplate")
public class MyBatisMasterConfigurer {
	private static final Logger log = LoggerFactory.getLogger(MyBatisMasterConfigurer.class);

    @Autowired
    @Qualifier("dataSource")
    private DataSource dataSource;

    @Primary
    @Bean(name = "masterTransactionManager")
    public PlatformTransactionManager masterTransactionManager() {
         return new DataSourceTransactionManager(dataSource);
    }

    @Bean
    @Primary
    public MybatisProperties mybatisProperties() {
        MybatisProperties prop = new MybatisProperties();
        org.apache.ibatis.session.Configuration config = new org.apache.ibatis.session.Configuration();
        // 开启mybatis开启数据库字段自动映射驼峰命名规则java属性
        config.setMapUnderscoreToCamelCase(true);
        prop.setConfiguration(config);
        return prop;
    }


    @Bean
    public PageHelper pageHelper() {
    	log.debug("MyBatisConfiguration.pageHelper()");
        PageHelper pageHelper = new PageHelper();
        Properties p = new Properties();
        //使用mysql数据库
        p.setProperty("helperDialect", "mysql");
        //将RowBounds第一个参数offset当成pageNum页码使用
        p.setProperty("offsetAsPageNum", "true");
        //使用RowBounds分页进行count查询
        p.setProperty("rowBoundsWithCount", "true");
        //pageNum<1查询第一页，如果pageNum>pages查询最后一页
        p.setProperty("reasonable", "true");
        //支持通过Mapper接口参数来传递分页参数
        p.setProperty("supportMethodsArguments", "true");
        //always总是返回PageInfo类型,check检查返回类型是否为PageInfo,none返回Page
        p.setProperty("returnPageInfo", "check");
        p.setProperty("params", "count=countSql");
        pageHelper.setProperties(p);
        return pageHelper;
    }

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory() {
    	log.debug("sqlSessionFactoryBean init()");
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        //无法自动注入
        //bean.setPlugins(plugins());
        try {
        	//ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
            //bean.setConfigLocation(resolver.getResource("classpath:mybatis-config.xml")
            return bean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
    	log.debug("sqlSessionTemplate init()");
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
