package com.pyh;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocaionHandler implements InvocationHandler {
    private Object target;


    public void setTarget(Object target) {
        this.target = target;
    }

    public Object getTarget() {
        return  Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        Object result =  method.invoke(target,args);
        return result;
    }

    public void log(String method){
        System.out.println("执行了"+method+"方法");
    }


}
