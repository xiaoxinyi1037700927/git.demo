package com.ioc.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("p")
//上面注解等价于在applicationContext.xml文件中配置了一个bean标签,id属性=p
//@Repository 数据库访问层
//@Services 业务层
//@Controllers 控制层
@Scope("singleton"                                                                                                                                                                                                                                                                                                                                                                                                                                                                 )//指定作用域：singleton,prototype,request,session
@Lazy(false)
public class Person {
    @Autowired
    private Pet pet;

    public Person() {
        System.out.println("Person对象被创建");
    }

    public void sleep() {
        System.out.println("人喜欢睡觉");
    }

    @Override
    public String toString() {
        return "Person{" +
                "pet=" + pet +
                '}';
    }
}
