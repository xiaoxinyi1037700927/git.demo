package cn.controller;

import cn.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("ppp")
public class Controllers {
    @Autowired
    private ServiceImpl service;

    public int[] doget(){
        return service.select();
    }

    public void dopost(){

    }
}
