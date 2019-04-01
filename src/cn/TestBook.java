package cn;

import cn.controller.Controllers;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestBook {
    @Test
    public void aa(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Controllers ppp = context.getBean("ppp", Controllers.class);
        int[] doget = ppp.doget();
        System.out.println(Arrays.toString(doget));
    }
}
