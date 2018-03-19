package com;

import com.service.GenAirplane;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spirng容器的创建过程是怎样的？
 * bean的初始化过程是怎么样的？
 * bean之间的依赖是如何注入的？
 *
 * Created by yp on 2018/2/21 12:18
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml"},true,null);
        GenAirplane genAirplane = ac.getBean(GenAirplane.class);
        System.out.println(genAirplane.gen());
    }
}
