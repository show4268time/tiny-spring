package com.work.springframework.beans;

/**
 * @description: Bean 异常
 * @author: philipfry
 * @create: 2021-07-27 20:32
 **/
public class BeansException extends RuntimeException{

    public BeansException(String message) {
        super(message);
    }

    public BeansException(String message, Throwable cause) {
        super(message, cause);
    }
}
