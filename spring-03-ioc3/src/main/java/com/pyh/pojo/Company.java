package com.pyh.pojo;

public class Company {
    private String name;
    public Company(){
        System.out.println("Company被初始化");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
