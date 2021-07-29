package com.work.springframework.beans.factory.support;

import com.work.springframework.beans.BeansException;
import com.work.springframework.beans.factory.BeanFactory;
import com.work.springframework.beans.factory.config.BeanDefinition;

/**
 * @description:
 * @author: philipfry
 * @create: 2021-07-28 15:24
 **/
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) {

        return doGetBean(name, null);
    }

    @Override
    public Object getBean(String name, Object... args) {

        return doGetBean(name, args);
    }


    protected <T> T doGetBean(final String beanName, final Object[] args) {
        Object singleton = getSingleton(beanName);
        if (singleton != null) {
            return (T) singleton;
        }

        BeanDefinition beanDefinition = getBeanDefinition(beanName);

        return (T) createBean(beanName, beanDefinition, args);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException;

}
