package com.croky.postgres.web.controller;

import com.croky.common.lang.Result;
import com.croky.postgres.main.manager.WarningModelManager;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: zzh
 * @version: 1.0
 * @date: 2023/3/24 16:39 星期五
 * Description
 */
@RestController
@RequestMapping("warningModel")
public class WarningModelController {

    @Resource
    private WarningModelManager warningModelManager;


    @GetMapping("getAllEmployeeInfo")
    @Operation(summary = "获取所有员工信息", description = "返回 员工姓名、员工userId")
    public Result<List<String>> getAllEmployeeInfo() {

        return Result.normal(warningModelManager.getAllEmployeeInfo());
    }


    @PostMapping("sendAlertInfo")
    @Operation(summary = "通过列表给相应人员发送钉钉机器人预警信息", description = "用户输入 用户列表,预警信息")
    public Result<String> sendAlertInfo(@RequestParam("slist") List<String> slist, @RequestParam("alertInfo") String alertInfo) {

        return Result.normal(warningModelManager.sendUserAlertInfo(slist, alertInfo));
    }


    @GetMapping("getAllCrowd")
    @Operation(summary = "获取预警群信息", description = "返回群名称 、机器人token")
    public Result<List<String>> getAllCrowd() {

        return Result.normal(warningModelManager.getAllCrowd());
    }

    @PostMapping("sendCrowdAlertInfo")
    @Operation(summary = "通过列表给相应群发送钉钉机器人预警信息", description = "用户输入 群列表、预警信息")
    public Result<String> sendCrowdAlertInfo(@RequestParam("slist") List<String> slist, @RequestParam("alertInfo") String alertInfo) {

        return Result.normal(warningModelManager.sendCrowdAlertInfo(slist, alertInfo));
    }

}
