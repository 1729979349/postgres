package com.croky.postgres.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.web.annotation.WebEndpoint;
import org.springframework.stereotype.Component;

/**
 * @author Croky
 * @date 2020年12月19日
 */
//@Endpoint(id = "druid") //web,jmx公开
//@JmxEndpoint  //jmx公开
@WebEndpoint(id = EndpointConstants.DruidEndpointName)  //web公开
@Component
public class DruidEndpoint {
    @ReadOperation
    public String get(){
        return EndpointConstants.DruidEndpointName;
    }
}
