package com.spring.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanLifeCycleDemo implements InitializingBean, DisposableBean, BeanPostProcessor {


    public void Init ()
    {
        System.out.println("Initialization");
    }

    public  void clean()

    {
        System.out.println("custom destroy");
    }
    public void destroy ()
    {
        System.out.println("Destroy");
    }

    public void afterPropertiesSet () throws Exception {
        System.out.println("After properties");

    }
}
