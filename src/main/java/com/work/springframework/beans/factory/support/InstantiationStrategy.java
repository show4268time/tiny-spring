package com.work.springframework.beans.factory.support;

import com.work.springframework.beans.BeansException;
import com.work.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @description: Bean 实例化策略
 * @author: philipfry
 * @create: 2021-07-28 19:02
 **/
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;

}
