package com.croky.postgres.main.service;

import java.util.List;

/**
 * Description: 机器人相关接口
 * Copyright:   Copyright (c)2022
 * Company:     sci
 *
 * @author: 张李鑫
 * @version: 1.0
 * Create at:   2022-09-22 14:43:35
 * <p>
 * Modification History:
 * Date         Author      Version     Description
 * ------------------------------------------------------------------
 * 2022-09-22     张李鑫                     1.0         1.0 Version
 */
public interface RobotService {

    /**
     * 通过机器人批量发送消息
     * @param userIds 用户id集合
     * @param content 消息内容
     */
    void batchSend(String[]userIds,String content);
    /**
     * 通过机器人发送群聊消息
     * @param token 群的token
     * @param content 消息内容
     */
    void rotCrowdSend(String token,String content);

    /**
     * 通过机器人发送群聊消息
     * @param content 消息内容
     */
    void rotCrowdSend(String content);

    /**
     * 通过机器人发送群聊消息 (@单个)
     * @param userIds 用户id
     * @param content 消息内容
     */
    void singleCrowdSend(List<String> userIds, String content);
}
