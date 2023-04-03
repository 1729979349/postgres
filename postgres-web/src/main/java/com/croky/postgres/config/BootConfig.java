package com.croky.postgres.config;

import com.croky.postgres.endpoint.EndpointConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;

import com.alibaba.druid.support.http.StatViewServlet;
import com.croky.common.servlet.filter.ParameterFilter;
import com.croky.common.servlet.filter.SecurityFilter;
import com.croky.common.servlet.listener.LoadConfigureListener;
import com.croky.common.servlet.servlet.DataModelViewServlet;
import com.croky.common.util.StringUtils;

/**
 * 
 * @author Croky.Zheng
 * 2020年2月2日 上午1:47:23
 */
@Configuration
@PropertySource("classpath:application.properties")
public class BootConfig {
	private static final Logger log = LoggerFactory.getLogger(BootConfig.class);

	@Value("${management.endpoints.web.base-path}")
	private String actuatorBasePath;
	/**
	 *  数据模型展示 一定要加，不然这个方法不会运行
	 * @return
	 */
	@Bean 
	public ServletRegistrationBean<DataModelViewServlet> dataModelViewServletRegistrationBean() { // 一定要返回ServletRegistrationBean
		ServletRegistrationBean<DataModelViewServlet> bean = new ServletRegistrationBean<DataModelViewServlet>(
				new DataModelViewServlet());
		String url = actuatorBasePath + "/" + EndpointConstants.DmdEndpointName + ".html";
		bean.addUrlMappings(url); // 访问路径值
		bean.setLoadOnStartup(-1);//第一次打开时才加载
		log.info("Exposing 2 endpoint(s) beneath base path " + url);
		return bean;
	}
	

	/**
	 * 数据库链接druid的监视页面加载
	 * @return
	 */
	@Bean //druid
	public ServletRegistrationBean<StatViewServlet> statViewServletRegistrationBean() { // 一定要返回ServletRegistrationBean
		ServletRegistrationBean<StatViewServlet> bean = new ServletRegistrationBean<StatViewServlet>(
				new StatViewServlet());
		String url = actuatorBasePath + "/" + EndpointConstants.DruidEndpointName + "/*";
		bean.addUrlMappings(url); // 访问路径值
		bean.setLoadOnStartup(-1);//第一次打开时才加载
		bean.setName("druidServlet");
		log.info("Exposing 2 endpoint(s) beneath base path " + url);
		return bean;
	}
	
	@Bean //hystrix.stream
	public ServletRegistrationBean<HystrixMetricsStreamServlet> hystrixMetricsStreamServletRegistrationBean() { // 一定要返回ServletRegistrationBean
		ServletRegistrationBean<HystrixMetricsStreamServlet> bean = new ServletRegistrationBean<HystrixMetricsStreamServlet>(
				new HystrixMetricsStreamServlet());
		String url = actuatorBasePath + "/hystrix.stream";
		bean.addUrlMappings(url); // 访问路径值
		bean.setLoadOnStartup(1);
		bean.setName("HystrixMetricsStreamServlet");
		log.info("Exposing 2 endpoint(s) beneath base path " + url);
		return bean;
	}
	
	/**
	 * 加载配置文件，使用这个listener后，可以使用ConfigUtils来获取application.propertion中的值
	 * @return
	 */
	@Bean
	public ServletListenerRegistrationBean<LoadConfigureListener> servletListenerRegistrationBean() {
		ServletListenerRegistrationBean<LoadConfigureListener> servletListenerRegistrationBean = new ServletListenerRegistrationBean<LoadConfigureListener>(
				new LoadConfigureListener());
		return servletListenerRegistrationBean;
	}

	/**
	 * 对请求参数的处理，比如将request替换成能阻止xss的XssHttpServletRequestWrapper
	 * @return
	 */
	@Bean
	public FilterRegistrationBean<ParameterFilter> pringParamterFilterRegistration() {
		FilterRegistrationBean<ParameterFilter> filterRegistrationBean = new FilterRegistrationBean<ParameterFilter>(
				new ParameterFilter());
		filterRegistrationBean.setName("parameterFilter");
		// filterRegistrationBean.addInitParameter("encoding", "utf-8");
		// filterRegistrationBean.addInitParameter("forceEncoding", "false");
		filterRegistrationBean.addInitParameter("using", "true");
		filterRegistrationBean.addInitParameter("xss", "false");
		filterRegistrationBean.setOrder(1);
		filterRegistrationBean.addUrlPatterns("/*");
		return filterRegistrationBean;
	}

	/**
	 * 跨域访问，在前后端分离的情况下，访问一个网站下的多个二级域名
	 * @return
	 */
//	@Bean
//	public FilterRegistrationBean<CorsFilter> corsFilterRegistration() {
//		FilterRegistrationBean<CorsFilter> filterRegistrationBean = new FilterRegistrationBean<CorsFilter>(
//				new CorsFilter());
//		filterRegistrationBean.setName("corsFilter");
//		filterRegistrationBean.addInitParameter("using", "true");
//		filterRegistrationBean.addInitParameter("origin", "*");//允许访问的ip或者域名
//		filterRegistrationBean.addInitParameter("headers", "Cookie");
//		filterRegistrationBean.addInitParameter("maxAge","7200");//2小时内不用发起预检请求
//		filterRegistrationBean.setOrder(2);
//		filterRegistrationBean.addUrlPatterns("/*");
//		return filterRegistrationBean;
//	}
	
    @Bean
    public FilterRegistrationBean<SecurityFilter> securityFilterRegistration() {
        java.util.List<String> whiteUrl = new java.util.ArrayList<String>();
        //swagger-ui
        whiteUrl.add("/swagger-ui/**");
        whiteUrl.add("/configuration/**");
        whiteUrl.add("/webjars/**");
        whiteUrl.add("/v2/api-docs/**");
        whiteUrl.add("/v3/api-docs/**");
        whiteUrl.add("/swagger-resources/**");
        
        //监控
        whiteUrl.add("/actuator/**");
        whiteUrl.add("/hystrix/**");

        //数据库链接druid
        whiteUrl.add("/druid/**");

		//api-docs
		whiteUrl.add("/api-docs/**");

		//websocket
		whiteUrl.add("/websocket/**");
		//whiteUrl.add("/socket-js/**");

        
        //登录页面
        //登录页面的url地址,为null值会导致整个filter加载崩溃
        String loginUrl = "";
        if (StringUtils.isNotBlank(loginUrl)) {
        	whiteUrl.add(loginUrl);
        }
        
        String whiteUrlStr = StringUtils.join(whiteUrl,',');
        log.info("访问白名单:" + whiteUrlStr);

        FilterRegistrationBean<SecurityFilter> filterRegistrationBean = new FilterRegistrationBean<SecurityFilter>(new SecurityFilter());
        filterRegistrationBean.setName("securityFilter");
        filterRegistrationBean.addInitParameter("using", "true");//是否打开安全验证
        filterRegistrationBean.addInitParameter("loginUrl", loginUrl);//登录页面的url地址
        filterRegistrationBean.addInitParameter("loginKey", "token");//验证是否登录的key值,默认为token
        filterRegistrationBean.addInitParameter("authClass", "com.croky.common.servlet.filter.serurity.provider.SimpleSecurityAuthorized");//使用登录验证的类
        filterRegistrationBean.addInitParameter("useJson", "true");//使用json作为返回数据的格式
        filterRegistrationBean.addInitParameter("allowVisitor", "true");//是否允许游客,为true会建一个临时用户,通过RequestUtils.getLoginUser()可以获取
        filterRegistrationBean.addInitParameter("whiteUrl", whiteUrlStr);//白名单
        filterRegistrationBean.setOrder(3);
        filterRegistrationBean.addUrlPatterns("/*");
        return filterRegistrationBean;
    }
    
    /**
     * http访问模板，用来发起api请求 
     * @param restTemplateBuilder
     * @return
     */
    @Bean
	@LoadBalanced
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
        return restTemplateBuilder.build();
    }
    
    /**
          * 日志level有4个级别
     * 1.NONE，不记录任何日志
     * 2.BASIC，仅记录请求方法、URL以及响应状态码和执行时间
     * 3.HEADRES，除了BASIC以外的还会记录请求和响应的头信息
     * 4.FULL,所有
     * @return
     */
//    @Bean
//    Logger.Level feignLogger(){
//        return Logger.Level.FULL;
//    }

}
