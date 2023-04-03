package com.croky.postgres.client.model;

/**
 * Description:
 * Copyright:   Copyright (c)2022
 * Company:     sci
 *
 * @author: 张李鑫
 * @version: 1.0
 * Create at:   2022-09-22 15:22:58
 * <p>
 * Modification History:
 * Date         Author      Version     Description
 * ------------------------------------------------------------------
 * 2022-09-22     张李鑫                     1.0         1.0 Version
 */
public class BotRes {
    private Boolean success;
    private String message;
    private Err err;

    public BotRes() {
    }

    public Err getErr() {
        return err;
    }

    public void setErr(Err err) {
        this.err = err;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "BotRes{" +
                "success=" + success +
                ", message='" + message + '\'' +
                ", err=" + err +
                '}';
    }
}

