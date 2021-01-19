package com.pyh.base.log;

public class AspectLog {
    public void before(){
        System.out.println("=======执行方法前=======");
    }

    public void after(){
        System.out.println("=======执行方法后=======");
    }
}
