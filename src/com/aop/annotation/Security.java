package com.aop.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect//切面
@Order(2)
public class Security {
    @Before("execution(* com.aop.annotation.AppDaoimpl.*(..))")
    public void isSecurity(){
        System.out.println("前置通知");
    }
}
