package com.tiany.jwsdemo.util;

public enum RespCode {

    SUCCESS(0, "请求成功"),
    WARN(-1, "错误");

    private int code;
    private String msg;

    RespCode(int code, String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }
    public String getMsg() {
        return msg;
    }
}

