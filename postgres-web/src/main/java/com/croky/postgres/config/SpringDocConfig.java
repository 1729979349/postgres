package com.croky.postgres.config;

import com.croky.common.util.StringUtils;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.croky.postgres.SpringBootMain;

import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author Croky.Zheng
 * @date 2018年12月27日
 */
@Configuration
@RefreshScope
public class SpringDocConfig {
	private static final Logger log = LoggerFactory.getLogger(SpringDocConfig.class);
	@Value("${app.name}")
	private String appName = null;
	
	@Value("${app.version}")
	private String appVersion = null;
	
	@Value("${app.id}")
	private int appId;
/*
    @Bean
    public Docket docket(Environment environment) {
    	String basePackage = SpringBootMain.class.getPackage().getName() + ".web.controller";
		Profiles profiles = Profiles.of(StringUtils.split(profilesStr,','));
		boolean enable = environment.acceptsProfiles(profiles);
		Set<String> produces = new HashSet<String>();
		produces.add("application/json");
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                .select()
                //为当前包路径
                .apis(RequestHandlerSelectors.basePackage(basePackage))
                .paths(PathSelectors.any())
                .build()
				.produces(produces)
				.enable(enable);//是否允许运行
    }

 */
    
    //构建 api文档的详细信息函数,注意这里的注解引用的是哪个
    private OpenAPI apiInfo() {
		log.info("Exposing 2 endpoint(s) beneath base path /api-docs'");
//        return new ApiInfoBuilder()
//                //页面标题
//                .title(appName + " - springboot swagger3 RESTful API doc")
//                //版本号
//                .version(appVersion)
//				.termsOfServiceUrl("http://www.yaofanbao.com")
//                //描述
//                .description(appId + " - API文档")
//				.contact(new Contact("Croky.Zheng", "http://www.yaofanbao.com", "croky@126.com"))
//                .build();
//    }
		return new OpenAPI()
				.info(new Info().title(appName + " API 文档")
						.description(appName + " API文档以及web调试器,appId=" + appId)
						.version(appVersion)
						.license(new License().name("Apache 2.0").url("http://springdoc.org")))
				.externalDocs(new ExternalDocumentation()
						.description("欢行网络科技官方网站")
						.url("https://www.yaofanbao.com"));
	}
}