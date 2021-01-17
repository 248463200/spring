package com.pyh2;

public class Test {
    public static void main(String[] args) {
        ServiceImpl service = new ServiceImpl();
        ServiceProxy proxy = new ServiceProxy();
        proxy.setService(service);
        proxy.add();
    }
}
