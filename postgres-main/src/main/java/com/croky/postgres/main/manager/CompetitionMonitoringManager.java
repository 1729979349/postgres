package com.croky.postgres.main.manager;

import com.croky.postgres.dal.model.CompetitionMonitoring;

import java.util.List;

/**
 * @author: zzh
 * @version: 1.0
 * @date: 2023/3/7 15:37 星期二
 * Description
 */
public interface CompetitionMonitoringManager {

    /**
     * 配置表同步mysql
     */
    void addCompetitionMonitoring();

    /**
     * 获取竞对监控ShopeeShopId所有数据
     */
    List<String> selectShopeeShopIdAll();


    /**
     * 获取竞对监控Lazada sg获取my所有数据
     */
    List<String> selectLazadaSgOrMyAll(String type);
}
