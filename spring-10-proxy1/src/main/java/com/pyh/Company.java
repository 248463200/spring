package com.pyh;

public class Company {
    private Customer customer;

    public Company() {
    }

    public Company(Customer customer) {
        this.customer = customer;
    }

    public void DevelopmentSoftware(){
        customer.DevelopmentSoftware();
    }
}
