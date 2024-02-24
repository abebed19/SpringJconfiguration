package com.durgasoft.beans;

public class WelcomeBean {

    static {
        System.out.println("Welcome bean class loading");
    }
    public WelcomeBean(){
        System.out.println("Welcome bean class instantiation");
    }
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWelcomeMessage(){
        return "Hello "+name+"!, welcome to Durga Software solutions";
    }
}
