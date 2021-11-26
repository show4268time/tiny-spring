package com.work.springframework.beans;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @description:
 * @author: philipfry
 * @create: 2021-11-26 20:43
 **/
public class BeanFactory {
    private ConcurrentHashMap<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String beanName){
        return beanDefinitionMap.get(beanName).getBean();
    }

    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition){
        beanDefinitionMap.put(beanName, beanDefinition);
    }
}
