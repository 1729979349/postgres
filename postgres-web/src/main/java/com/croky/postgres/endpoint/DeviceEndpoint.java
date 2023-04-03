package com.croky.postgres.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.web.annotation.WebEndpoint;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Croky
 * @date 2020-12-20 14:49
 */
@WebEndpoint(id = EndpointConstants.DeviceEndpointName)  //web公开
public class DeviceEndpoint {
    @ReadOperation
    public Map<String, Object> get(){
        Runtime runtime = Runtime.getRuntime();
        Map<String, Object> map = new HashMap<>();
        map.put("processors", Runtime.getRuntime().availableProcessors());
        map.put("free-memory", runtime.freeMemory());
        map.put("max-memory", runtime.maxMemory());
        map.put("total-memory", runtime.totalMemory());
        return map;
    }
}
