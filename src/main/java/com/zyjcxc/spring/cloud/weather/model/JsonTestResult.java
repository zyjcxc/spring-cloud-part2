package com.zyjcxc.spring.cloud.weather.model;

import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * @author mengqa
 * @create 2018-11-25 19:54
 **/
@JsonRootName("result")
public class JsonTestResult<T> {

    private int resultCode;

    private String message;

    private T data;

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
