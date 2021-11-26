package com.work.springframework.beans;

/**
 * @description:
 * @author: philipfry
 * @create: 2021-11-26 20:44
 **/
public class BeanDefinition {
    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
