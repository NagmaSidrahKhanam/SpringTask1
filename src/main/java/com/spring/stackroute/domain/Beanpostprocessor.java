package com.spring.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class Beanpostprocessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Post Process Before Initialization"  +beanName);
        return beanName;    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
         System.out.println("Post Process After Initialization"  +beanName);
        return beanName;                                                      
    }

//    @Override
//    public Object postProcessBeforeInitialization(Object bean, String beanName)
//    {
//        System.out.println("Post Process Before Initialization"  +beanName);
//        return beanName;
//    }
//    @Override
//    public Object postProcessAfterInitialization(Object bean, String beanName)
//    {
//        System.out.println("Post Process After Initialization"  +beanName);
//        return beanName;
//    }
}
