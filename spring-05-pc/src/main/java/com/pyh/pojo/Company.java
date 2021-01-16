package com.pyh.pojo;

import java.util.*;

public class Company {
    private String name;
    private User users;

    public Company() {
    }

    public Company(String name, User users) {
        this.name = name;
        this.users = users;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUsers() {
        return users;
    }

    public void setUsers(User users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", users=" + users +
                '}';
    }
}
