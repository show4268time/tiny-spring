package com.work.springframework.beans.factory.config;

/**
 * @description:
 * @author: philipfry
 * @create: 2021-07-27 20:48
 **/
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
