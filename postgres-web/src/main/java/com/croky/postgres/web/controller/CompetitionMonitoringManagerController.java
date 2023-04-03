package com.croky.postgres.web.controller;

import com.croky.common.lang.Result;
import com.croky.postgres.main.manager.CompetitionMonitoringManager;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: zzh
 * @version: 1.0
 * @date: 2023/3/7 16:06 星期二
 * Description
 */
@RestController
@RequestMapping("competition")
public class CompetitionMonitoringManagerController {

    @Autowired
    private CompetitionMonitoringManager competitionMonitoringManager;


    @GetMapping("selectAll")
    @Operation(summary = "获取竞对监控数据", description = "所有数据")
    public Result<List<String>> selectAll() {

        return Result.normal(competitionMonitoringManager.selectShopeeShopIdAll());
    }

    @GetMapping("selectLazadaSgOrMyAll")
    @Operation(summary = "获取竞对监控所有Lazada列", description = "某列数据")
    public Result<List<String>> selectLazadaSgOrMyAll(@RequestParam("type") String type) {

        return Result.normal(competitionMonitoringManager.selectLazadaSgOrMyAll(type));
    }
}
