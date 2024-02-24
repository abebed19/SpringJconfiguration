package com.durgasoft.beans;

public class HelloBean {
    static {
        System.out.println("HelloBean  class loading");
    }
    public HelloBean(){
        System.out.println("HelloBean  class instantiation");
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String sayHello(){
        return "Hello "+name+"!,Good Morning";
    }
}
