package com.tiany.jwsdemo.util;

public class MyException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public MyException() {
        super("未知异常");
    }

    public MyException(String message) {
        super(message);
    }

}
