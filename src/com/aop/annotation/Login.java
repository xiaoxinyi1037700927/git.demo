package com.aop.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Before;
@Component
@Aspect
@Order(1)
public class Login {

    @Before("execution(* com.aop.annotation.AppDaoimpl.*(..))")
    public void login(){
        System.out.println("login前置");
    }
}
