package com.work.springframework.beans.factory.support;

import com.work.springframework.beans.BeansException;
import com.work.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @description:
 * @author: philipfry
 * @create: 2021-07-28 15:42
 **/
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    private InstantiationStrategy instantiationStrategy = new SimpleInstantiationStrategy();

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException {
        Object bean = null;
        try {
            bean = createBeanInstance(beanName, beanDefinition, args);
        } catch (Exception e) {
            throw new BeansException("Instantiation of bean failed", e);
        }

        addSingleton(beanName, bean);

        return bean;
    }

    protected Object createBeanInstance(String beanName,  BeanDefinition beanDefinition, Object[] args) throws BeansException{
        Constructor constructor = null;
            for (Constructor ctor : beanDefinition.getBeanClass().getConstructors()){
                if(args != null && ctor.getParameterCount() == args.length){
                    constructor = ctor;
                    break;
                }
            }

        return instantiationStrategy.instantiate(beanDefinition, beanName, constructor, args);
    }
}
