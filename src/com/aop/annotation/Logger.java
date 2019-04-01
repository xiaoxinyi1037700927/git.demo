package com.aop.annotation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logger {
    @After("execution(* com.aop.annotation.AppDaoimpl.*(..))")
    public void log(){
        System.out.println("后置通知");
    }
}
