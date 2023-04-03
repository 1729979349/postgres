package com.croky.postgres.client.model;

/**
 * Description:
 * Copyright:   Copyright (c)2022
 * Company:     sci
 *
 * @author: 张李鑫
 * @version: 1.0
 * Create at:   2022-10-25 13:03:21
 * <p>
 * Modification History:
 * Date         Author      Version     Description
 * ------------------------------------------------------------------
 * 2022-10-25     张李鑫                     1.0         1.0 Version
 */
public class Err {
    private String code;
    private String requestId;
    private String message;

    public Err() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Err{" +
                "code='" + code + '\'' +
                ", requestId='" + requestId + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
