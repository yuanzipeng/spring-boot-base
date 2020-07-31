package com.boot.exception.exception;

/**
 * 自定义业务异常
 */
public class ServiceException extends Exception {
    public ServiceException (String msg){
        super(msg);
    }
}
