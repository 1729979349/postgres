package com.croky.postgres.config;

import java.util.List;

import com.croky.postgres.endpoint.EndpointConstants;
import org.apache.catalina.connector.Connector;
import org.apache.tomcat.util.http.LegacyCookieProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.*;

/**
 * web-mvc配置类
 * @author Croky.Zheng
 * 2020年6月18日 下午11:13:42
 */
@Configuration
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {

    @Value("${management.endpoints.web.base-path}")
    private String actuatorBasePath;

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //由于路径问题，跳转成功但是无法正常显示,引用的外部资源路径对应不上
        //registry.addViewController("/doc.html").setViewName("forward:/swagger-ui/index.html");
        //跳转成功，但是有个点不掉的小弹窗，Unable to infer base url. This is common when using dynamic servlet registration or when the API is behind an API Gateway. The base url is the root of where all the swagger resources are served. For e.g. if the api is available at http://example.org/api/v2/api-docs then the base url is http://example.org/api/. Please enter the location manually:
        //String swaggerUrl = actuatorBasePath + "/" + EndpointConstants.SwaggerEndpointName + "/";
        //registry.addViewController(swaggerUrl).setViewName("forward:/swagger-ui/index.html");
        String dmdUrl = actuatorBasePath + "/" + EndpointConstants.DmdEndpointName;
        registry.addViewController(dmdUrl).setViewName("forward:" + dmdUrl + ".html");//指定到dmd.html
        //跳转成功，但是由于url对应的路径会直接跳转到/druid/index.html导致失败,最终成功是通过配置management.endpoints.web.path-mapping.druid = druid/index.html
        //url = actuatorBasePath + "/" + EndpointConstants.DruidEndpointName;
        //registry.addViewController(url).setViewName("forward:" + url + "/index.html");//指定到druid/index.html
        //设置为最高优先级
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
    }
 
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //swagger,可加可不加
        registry.addResourceHandler("/swagger-ui/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/springfox-swagger-ui/");
        //hystrix,必须加
        registry.addResourceHandler("/hystrix/**")
                .addResourceLocations("classpath:/static/hystrix/");
        //unknow
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
        //druid,可加可不加
        registry.addResourceHandler(actuatorBasePath + "/druid/*")
                .addResourceLocations("classpath:/support/");
    }

//    @Bean
//    public HandlerInterceptorAdapter handlerInterceptorAdapter(){
//        return  new AuthorizationInterceptor();
//    }
// 
//    @Bean
//    public HandlerMethodArgumentResolver handlerMethodArgumentResolver(){
//        return  new CurrentUserMethodArgumentResolver();
//    }
    /**
     * 添加允许的字符，依据RFC 7230 and RFC 3986，url中包含的字符做了限制
     * swagger是将请求转为类似curl的方式，对特殊符号没做处理
     * @return
     */
    @Bean
    public ConfigurableServletWebServerFactory webServerFactory() {
        TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
        factory.addConnectorCustomizers(new TomcatConnectorCustomizer() {
            @Override
            public void customize(Connector connector) {
                connector.setProperty("relaxedQueryChars", "|{}[]");
            }
        });
        return factory;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //registry.addInterceptor(handlerInterceptorAdapter()).addPathPatterns("/**");
    }
 
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        //这里设置后,以servlet中的cors可能有些冲突,不过这里更巧妙，可以决定哪些对外开放
        registry.addMapping("/**")
                .allowedHeaders("*")
                .allowedMethods("POST","GET","PUT","DELETE")
                .allowedOrigins("*");
    }
 
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        //argumentResolvers.add(handlerMethodArgumentResolver());

    }


    /**
     * 解决问题：
     * There was an unexpected error (type=Internal Server Error, status=500).
     * An invalid domain [.localhost.com] was specified for this cookie
     *
     * @return
     */
    @Bean
    public WebServerFactoryCustomizer<TomcatServletWebServerFactory> cookieProcessorCustomizer() {
        return (factory) -> factory.addContextCustomizers(
                (context) -> context.setCookieProcessor(new LegacyCookieProcessor()));
    }
}
