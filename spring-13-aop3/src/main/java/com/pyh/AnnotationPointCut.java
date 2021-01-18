package com.pyh;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;

@Aspect
public class AnnotationPointCut {

    @Before("execution(* com.pyh.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("=======执行方法前1=======");
    }

    @After("execution(* com.pyh.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("=======执行方法后2=======");
    }

    @Around("execution(* com.pyh.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint pj) throws Throwable {
        Signature signature =pj.getSignature();
        System.out.println("===环绕前===,执行方法"+signature);
        Object proceed=  pj.proceed();
        System.out.println("===环绕后===,返回"+proceed);

    }
}
