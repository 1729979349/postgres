package com.croky.postgres.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.web.annotation.WebEndpoint;
import org.springframework.stereotype.Component;

/**
 * @author Croky
 * @date 2020-12-19 20:12
 */
@WebEndpoint(id = EndpointConstants.DmdEndpointName)  //web公开
@Component
public class DmdEndpoint {
    @ReadOperation
    public String get(String page){
        return EndpointConstants.DmdEndpointName;
    }

//    @WriteOperation
//    public String post(){
//        return "post";
//    }
//
//    @DeleteOperation
//    public String delete(){
//        return "delete";
//    }
}
