package com.pyh;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterLog implements AfterReturningAdvice {
    public void afterReturning(Object o, Method method, Object[] objects, Object target) throws Throwable {
        System.out.println("执行了"+method.getName()+"返回结果为"+o);
    }
}
