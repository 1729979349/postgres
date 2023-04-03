package com.croky.postgres.main.manager;

import com.croky.postgres.dal.model.PlatformConfigurationTable;

import java.util.List;

/**
 * @author: zzh
 * @version: 1.0
 * @date: 2022/12/6 14:16 星期二
 * Description
 */
public interface PlatformConfigurationTableManager {

    /**
     * 配置表同步mysql、redis
     */
    void addPlatformConfigurationTable();

    /**
     * mysql 错误信息同步配置表
     */
    List<PlatformConfigurationTable> syncConfigurationTable();

    /**
     * redis错误信息爬取
     */
    void getRedisMessageUpdateFailedInfo();
}
