package com.work.springframework.beans.factory.support;

import com.work.springframework.beans.factory.config.BeanDefinition;

/**
 * @description:
 * @author: philipfry
 * @create: 2021-07-28 10:15
 **/
public interface BeanDefinitionRegistry {

    void registryBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
