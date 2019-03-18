package com.apooboo.aspectdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthAspect {

    @Pointcut("@annotation(com.apooboo.aspectdemo.annotation.AdminOnly) && within(com.apooboo.aspectdemo..*)")
    private void matchAnno(){

    }

    @Before("matchAnno()")
    public void before(){
        System.out.println("##########before");
    }

}
