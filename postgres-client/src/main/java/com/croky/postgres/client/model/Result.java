package com.croky.postgres.client.model;

import org.apache.poi.ss.formula.functions.T;

import java.util.List;

/**
 * @author: zzh
 * @version: 1.0
 * @date: 2023/2/23 15:11 星期四
 * Description
 */
public class Result {

    protected List<EmployeeVO> model;
    protected int code;
    protected String message;

    public List<EmployeeVO> getModel() {
        return model;
    }

    public void setModel(List<EmployeeVO> model) {
        this.model = model;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
