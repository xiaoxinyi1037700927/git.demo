package com.ioc.annotation;

import org.springframework.stereotype.Component;

@Component("chongWu")
public class Pet {
    public Pet(){
        System.out.println("Pet被创建");
    }
}
