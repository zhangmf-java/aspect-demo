package com.apooboo.aspectdemo.aspect;

import com.apooboo.aspectdemo.service.AuthService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthAspect {

    @Autowired
    AuthService authService;


    @Pointcut("@annotation(com.apooboo.aspectdemo.annotation.AdminOnly)")
    private void adminOnly(){

    }

    @Before("adminOnly()")
    public void check(JoinPoint joinPoint){
        authService.checkAccess();
    }

}
