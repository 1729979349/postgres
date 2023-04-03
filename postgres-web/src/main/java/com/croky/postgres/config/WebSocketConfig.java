package com.croky.postgres.config;

import com.croky.postgres.handler.TestWebSocketHandler;
import com.croky.postgres.handler.TestWebSocketInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * @author Croky
 * @Date 2022/8/23 13:44
 */
@Configuration
//@EnableWebSocket //需要添加spring-boot-starter-websocket
public class WebSocketConfig implements WebSocketConfigurer {
    public final static String WEBSOCKET_PATH = "/websocket";
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        // 注册websocket组件 添加处理器和拦截器
        // websocket是websocket服务器的请求路径可以自己定义
        registry.addHandler(new TestWebSocketHandler(), "/websocket")
                // 指定自定义拦截器
                .addInterceptors(new TestWebSocketInterceptor())
                // 允许跨域
                .setAllowedOrigins("*");

        // 在某些低版本的浏览器中不支持websocket可以用sock-js替代
        registry.addHandler(new TestWebSocketHandler(), "/websocket/socketJS")
                .addInterceptors(new TestWebSocketInterceptor())
                .setAllowedOrigins("*")
                // 开启sockJs支持
                .withSockJS();
    }

    @Bean
    public ServerEndpointExporter serverEndpointExporter()
    {
        return new ServerEndpointExporter();
    }
}
