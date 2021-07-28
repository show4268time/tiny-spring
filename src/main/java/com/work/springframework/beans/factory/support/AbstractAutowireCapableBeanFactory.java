package com.work.springframework.beans.factory.support;

import com.work.springframework.beans.BeansException;
import com.work.springframework.beans.factory.config.BeanDefinition;

/**
 * @description:
 * @author: philipfry
 * @create: 2021-07-28 15:42
 **/
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (Exception e) {
            throw new BeansException("Instantiation of bean failed", e);
        }

        addSingleton(beanName, bean);

        return bean;
    }
}
