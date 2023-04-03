package com.croky.postgres.main.manager;

import java.util.List;

/**
 * @author: zzh
 * @version: 1.0
 * @date: 2023/3/23 11:16 星期四
 * Description 预警模型
 */
public interface WarningModelManager {


    /**
     * 投产预警
     */
    void productionModelCalculationLogic();

    /**
     * 获取所有员工 姓名 userid
     * @return 返回拼接 格式：userName_userId
     */
    List<String> getAllEmployeeInfo();

    /**
     *  通过机器人给相应的人发送预警信息
     * @param slist 预警人 信息
     * @return 返回预警信息
     */
    String sendUserAlertInfo(List<String> slist,String alertInfo);


    /**
     * 获取所有预警群信息
     * @return 列表
     */
    List<String> getAllCrowd();

    /**
     *  通过机器人给相应的群发送预警信息
     * @param slist 预警群信息
     * @return 返回预警信息
     */
    String sendCrowdAlertInfo(List<String> slist,String alertInfo);


}
