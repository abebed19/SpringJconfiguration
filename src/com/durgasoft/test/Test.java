package com.durgasoft.test;

import com.durgasoft.beans.HelloBean;
import com.durgasoft.beans.WelcomeBean;
import com.durgasoft.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
//        WelcomeBean welcomeBean=(WelcomeBean) context.getBean("welcomeBean");//we can use method name as bean id
//        System.out.println( welcomeBean.getWelcomeMessage());
//        //ALternatively we can use Classname.class to access bean
//
//        //Accessing another bean
//        HelloBean helloBean=(HelloBean) context.getBean(HelloBean.class);
//        System.out.println(helloBean.sayHello());
    }
}
