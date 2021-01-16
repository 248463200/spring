package com.pyh.pojo;

public class Company {
    private String name;
    private User users;
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

    public void setUsers(User users) {
        this.users = users;
    }

    public void setFacilities(Facility facilities) {
        this.facilities = facilities;
    }
}
