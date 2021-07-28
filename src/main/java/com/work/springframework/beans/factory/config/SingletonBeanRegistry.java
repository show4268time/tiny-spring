package com.work.springframework.beans.factory.config;

/**
 * @description:
 * @author: philipfry
 * @create: 2021-07-27 20:50
 **/
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

}
