package com.pyh2;

public class ServiceProxy implements  Service {
    private ServiceImpl service;

    public void setService(ServiceImpl service) {
        this.service = service;
    }

    public void add() {
        service.add();
    }

    public void update() {
        service.update();
    }

    public void save() {
        service.save();
    }

    public void delete() {
        service.delete();

    }
}
