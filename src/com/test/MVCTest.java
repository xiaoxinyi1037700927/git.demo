package com.test;

import com.controller.GetBookServlet;
import com.ioc.annotation.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MVCTest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        GetBookServlet getBookServlet = context.getBean("getBookServlet", GetBookServlet.class);
        List<String> bookList = getBookServlet.doGet();
        bookList.forEach(c-> System.out.println(c));
    }
}
