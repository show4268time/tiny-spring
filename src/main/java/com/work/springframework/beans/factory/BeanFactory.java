package com.work.springframework.beans.factory;

/**
 * @description: Bean 工厂
 * @author: philipfry
 * @create: 2021-07-27 20:46
 **/
public interface BeanFactory {

    Object getBean(String name);

    Object getBean(String name, Object... args);

}
