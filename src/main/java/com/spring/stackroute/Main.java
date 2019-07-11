package com.spring.stackroute;

import com.spring.stackroute.domain.Actor;
import com.spring.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.xml.sax.helpers.XMLReaderFactory;

public class Main {
    public static void main(String[] args){
        //using applicationcontext
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Actor actor = (Actor)context.getBean("actor",Actor.class);
        Movie movie2=(Movie) context.getBean("movie");
        movie2.Action();

        //using BeanFactory
        ClassPathResource resource = new ClassPathResource("beans.xml");
        BeanFactory beanFactory=new XmlBeanFactory(resource);
        Movie movie = (Movie) context.getBean("movie",Movie.class);
       movie.Action();

        //Using BeanDefinitionRegistry and BeanDefinitionReader
        DefaultListableBeanFactory beanfactory = new DefaultListableBeanFactory();
        BeanDefinitionReader reader = new XmlBeanDefinitionReader(beanfactory);
        reader.loadBeanDefinitions(new FileSystemResource("src/main/resources/beans.xml"));
        Movie movie1=(Movie) beanFactory.getBean("movie");
        movie1.Action();
    }
}
