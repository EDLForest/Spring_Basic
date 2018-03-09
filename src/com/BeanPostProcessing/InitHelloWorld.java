package com.BeanPostProcessing;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitHelloWorld implements BeanPostProcessor{
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Before Initialization: " + bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beabName) throws BeansException {
        System.out.println("After Initialization: " + bean);
        return bean;
    }
}
