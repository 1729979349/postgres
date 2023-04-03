package com.croky.postgres.client.model;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wangzengyi
 * date 2022-05-18 18:52
 * Description: 下拉框员工VO
 */
public class EmployeeVO implements Serializable {

    @Schema(title = "用户名")
    private String name;

    private String userid;

    @Schema(title = "职位")
    private String position;

    @Schema(title = "岗位职级")
    private String positionLevel;

    @Schema(title = "所属部门")
    private String dept;

    private String deptIds;

    @Schema(title = "工号")
    private String jobNumber;

    @Schema(title = "手机号")
    private String mobile;

    @Schema(title = "邮箱")
    private String email;

    @Schema(title = "员工类型")
    private String employeeType;

    @Schema(title = "归属公司")
    private String contractCompanyName;

    @Schema(title = "归属BU")
    private String ascriptionBu;

    @Schema(title = "入职时间")
    private String confirmJoinTime;

    @Schema(title = "正常转正日期")
    private Date confirmationTime;

    // 试用期
    private String probationPeriodType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPositionLevel() {
        return positionLevel;
    }

    public void setPositionLevel(String positionLevel) {
        this.positionLevel = positionLevel;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDeptIds() {
        return deptIds;
    }

    public void setDeptIds(String deptIds) {
        this.deptIds = deptIds;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getContractCompanyName() {
        return contractCompanyName;
    }

    public void setContractCompanyName(String contractCompanyName) {
        this.contractCompanyName = contractCompanyName;
    }

    public String getConfirmJoinTime() {
        return confirmJoinTime;
    }

    public void setConfirmJoinTime(String confirmJoinTime) {
        this.confirmJoinTime = confirmJoinTime;
    }

    public String getProbationPeriodType() {
        return probationPeriodType;
    }

    public void setProbationPeriodType(String probationPeriodType) {
        this.probationPeriodType = probationPeriodType;
    }

    public Date getConfirmationTime() {
        return confirmationTime;
    }

    public void setConfirmationTime(Date confirmationTime) {
        this.confirmationTime = confirmationTime;
    }

    public String getAscriptionBu() {
        return ascriptionBu;
    }

    public void setAscriptionBu(String ascriptionBu) {
        this.ascriptionBu = ascriptionBu;
    }
}
