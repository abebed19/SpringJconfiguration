package com.durgasoft.config;

import com.durgasoft.beans.HelloBean;
import com.durgasoft.beans.WelcomeBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
    static {
        System.out.println("AppConfig class loading ");
    }
    public AppConfig(){
        System.out.println("AppConfig class instantiation");
    }
    @Bean
    public HelloBean helloBean(){
        HelloBean helloBean=new HelloBean();
        helloBean.setName("Abebe");
        return helloBean;
    }
    @Bean
    public WelcomeBean welcomeBean(){
        WelcomeBean welcomeBean=new WelcomeBean();
        welcomeBean.setName("Abebe");
        return welcomeBean;
    }

}
