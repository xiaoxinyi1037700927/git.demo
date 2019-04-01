package com.ioc.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCAnnotationTest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person singleton = context.getBean("p", Person.class);
        System.out.println(singleton);
        //singleton.sleep();
       // ((ClassPathXmlApplicationContext) context).close();
    }
}
