package com.aop.annotation;

import org.springframework.stereotype.Component;

/*核心类*/
@Component("app")
public class AppDaoimpl {
    public void selectMoney(){
        System.out.println("你的账户余额是1000w");
    }
    public void zhuan(){
        System.out.println("转账失败");
    }
}
