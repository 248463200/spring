package com.pyh.pojo;

import java.util.*;

public class Company {
    private String name;
    private User users;
    private String[] computers;
    private List<String> books;
    private Set<String> cars;
    private Map<String,String> cards;
    private String describute;
    private Properties info;

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

    public String[] getComputers() {
        return computers;
    }

    public void setComputers(String[] computers) {
        this.computers = computers;
    }

    public List<String> getBooks() {
        return books;
    }

    public void setBooks(List<String> books) {
        this.books = books;
    }

    public Set<String> getCars() {
        return cars;
    }

    public void setCars(Set<String> cars) {
        this.cars = cars;
    }

    public String getDescribute() {
        return describute;
    }

    public void setDescribute(String describute) {
        this.describute = describute;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }

    public Map<String, String> getCards() {
        return cards;
    }

    public void setCards(Map<String, String> cards) {
        this.cards = cards;
    }


    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", users=" + users +
                ", computers=" + Arrays.toString(computers) +
                ", books=" + books +
                ", cars=" + cars +
                ", cards=" + cards +
                ", describute='" + describute + '\'' +
                ", info=" + info +
                '}';
    }
}
