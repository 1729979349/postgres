package com.croky.postgres.main.service.impl;

import com.alibaba.nacos.common.utils.MD5Utils;
import com.croky.common.util.StringUtils;
import com.croky.postgres.client.model.BotRes;
import com.croky.postgres.main.service.RobotService;
import com.croky.postgres.utils.JsonUtils;
import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiRobotSendRequest;
import com.dingtalk.api.response.OapiRobotSendResponse;
import com.taobao.api.ApiException;
import org.bouncycastle.jcajce.provider.digest.MD5;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

/**
 * Description:
 * Copyright:   Copyright (c)2022
 * Company:     sci
 *
 * @author: 张李鑫
 * @version: 1.0
 * Create at:   2022-09-22 14:47:26
 * <p>
 * Modification History:
 * Date         Author      Version     Description
 * ------------------------------------------------------------------
 * 2022-09-22     张李鑫                     1.0         1.0 Version
 */
@Service
public class RobotServiceImpl implements RobotService {
    private static final Logger log = LoggerFactory.getLogger(RobotServiceImpl.class);

    private final String defaultToken = "691e0de716f0d505c19c5583dc2350ea07062f289bc0bd5ca6ab1aecbed4868f";


    @Override
    public void batchSend(String[] userIds, String content) {
        try {
            HashMap<String, Object> map = new HashMap<>(2);
            map.put("userIds", userIds);
            map.put("content", content);
            BotRes botRes = sendPost("http://60.12.241.126:7001/api/robot/batch_send", map, BotRes.class);
            if (!botRes.getSuccess()) {
                log.error(JsonUtils.toJsonString(botRes));
            }
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
    }


    @Override
    public void rotCrowdSend(String token, String content) {
        try {
            HashMap<String, Object> map = new HashMap<>(2);
            map.put("token", token);
            map.put("content", content);
            BotRes botRes = sendPost("http://60.12.241.126:7001/api/robot/crowd_send", map, BotRes.class);
            if (!botRes.getSuccess()) {
                log.error(JsonUtils.toJsonString(botRes));
            }
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
    }

    @Override
    public void rotCrowdSend(String content) {
        try {
            HashMap<String, Object> map = new HashMap<>(2);
            map.put("token", defaultToken);
            map.put("content", content);
            BotRes botRes = sendPost("http://60.12.241.126:7001/api/robot/crowd_send", map, BotRes.class);
            if (!botRes.getSuccess()) {
                log.error(JsonUtils.toJsonString(botRes));
            }
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
    }


    @Override
    public void singleCrowdSend(List<String> userIds, String content) {
        try {
            DingTalkClient client=new DefaultDingTalkClient("https://oapi.dingtalk.com/robot/send?access_token="+defaultToken);
            OapiRobotSendRequest request = new OapiRobotSendRequest();
            request.setMsgtype("text");
            OapiRobotSendRequest.Text text = new OapiRobotSendRequest.Text();
            text.setContent("@"+StringUtils.join(userIds, '@') + " "+content);
            request.setText(text);
            OapiRobotSendRequest.At at = new OapiRobotSendRequest.At();
            at.setAtUserIds(userIds);
//           isAtAll类型如果不为Boolean，请升级至最新SDK
            at.setIsAtAll(false);
            request.setAt(at);
            OapiRobotSendResponse response = client.execute(request);
            log.info("群聊@发送:{}",response.getBody());
        } catch (ApiException e) {
            log.error(e.getMessage(),e);
        }
    }

    public <T> T sendPost(String url, HashMap<String, Object> map, Class<T> clazz) {
        try {
            RestTemplate restTemplate=new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
            headers.setContentType(type);
            HttpEntity<Object> formEntity = new HttpEntity<Object>(JsonUtils.toJsonString(map), headers);
            return restTemplate.exchange(url, HttpMethod.POST, formEntity, clazz).getBody();
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }

}
