//package com.croky.postgres.client;
//
//import feign.Client;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
//import org.springframework.cloud.netflix.ribbon.SpringClientFactory;
//import org.springframework.cloud.openfeign.ribbon.CachingSpringLoadBalancerFactory;
//import org.springframework.cloud.openfeign.ribbon.LoadBalancerFeignClient;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.net.ssl.*;
//import java.security.KeyManagementException;
//import java.security.NoSuchAlgorithmException;
//import java.security.cert.CertificateException;
//import java.security.cert.X509Certificate;
//
///**
// * @author Croky
// * @date 2020-11-18
// */
//@Configuration
//public class ArchetypeFeignConfig {
//    private static final Logger log = LoggerFactory.getLogger(ArchetypeFeignConfig.class);
//    @Bean
//    @ConditionalOnMissingBean
//    public Client feignClient(CachingSpringLoadBalancerFactory cachingFactory,
//                              SpringClientFactory clientFactory) throws NoSuchAlgorithmException, KeyManagementException {
//        SSLContext ctx = SSLContext.getInstance("SSL");
//        X509TrustManager tm = new X509TrustManager() {
//            @Override
//            public void checkClientTrusted(X509Certificate[] chain,
//                                           String authType) throws CertificateException {
//            }
//
//            @Override
//            public void checkServerTrusted(X509Certificate[] chain,
//                                           String authType) throws CertificateException {
//            }
//
//            @Override
//            public X509Certificate[] getAcceptedIssuers() {
//                return null;
//            }
//        };
//        ctx.init(null, new TrustManager[]{tm}, null);
//        return new LoadBalancerFeignClient(new Client.Default(ctx.getSocketFactory(),
//                new HostnameVerifier() {
//
//                    @Override
//                    public boolean verify(String hostname, SSLSession session) {
//                        // TODO Auto-generated method stub
//                        return true;
//                    }
//                }),
//                cachingFactory, clientFactory);
//    }
//}
