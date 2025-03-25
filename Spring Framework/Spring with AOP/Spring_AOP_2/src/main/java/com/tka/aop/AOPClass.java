package com.tka.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AOPClass {
	
//	@Before("execution(public void loginMsg())")
//	public void beforeLogin() {
//		System.out.println("Login here...!");
//	}
//	
//	@After("execution(public void loginMsg())")
//	public void afterLogin() {
//		System.out.println("Login successfully...!");
//	}
	
	@Around("execution (* com.tka.entity.Login.*())")
	// ("execution (* com.tka.entity.Recharge.*())")
	public void aroundMsg(ProceedingJoinPoint p) {
		System.out.println("Login here...!");
		try {
			p.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("Your Login Successfully...!");
	}
    
	

}
