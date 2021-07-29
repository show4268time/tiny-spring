package com.work.springframework.beans.factory.support;

import com.work.springframework.beans.BeansException;
import com.work.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @description:
 * @author: philipfry
 * @create: 2021-07-28 19:11
 **/
public class SimpleInstantiationStrategy implements InstantiationStrategy {
    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException {
        try {
            if (ctor != null) {
                return ctor.newInstance(args);
            } else {
                return beanDefinition.getBeanClass().newInstance();
            }
        } catch (Exception e) {
            throw new BeansException("Failed to instantiate [" + beanName + "]", e);
        }
    }
}
