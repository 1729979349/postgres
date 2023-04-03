//package com.croky.postgres.config;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.reactive.DispatcherHandler;
//import org.springframework.web.reactive.config.EnableWebFlux;
//import org.springframework.web.reactive.config.WebFluxConfigurer;
//import org.springframework.web.server.WebHandler;
//
///**
// * @author Croky
// * @date 2021-08-14 16:49
// */
//
//@Configuration
//@ComponentScan
//@EnableWebFlux
//public class WebfluxConfig implements WebFluxConfigurer {
//
//    @Bean
//    public WebHandler webHandler(ApplicationContext applicationContext) {
//        DispatcherHandler dispatcherHandler = new DispatcherHandler(applicationContext);
//        return dispatcherHandler;
//    }
//
//
//}