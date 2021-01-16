package com.pyh.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class Company {
    private String name;
    @Resource
    private User users;
    @Autowired
    @Qualifier(value = "facilities2")
    private Facility facilities;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUsers() {
        return users;
    }

    public Facility getFacilities() {
        return facilities;
    }


}
