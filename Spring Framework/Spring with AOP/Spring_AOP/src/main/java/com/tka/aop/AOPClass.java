package com.tka.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
//import org.aspectj.lang.annotation.Before;

@Component
@Aspect
public class AOPClass {
	
//	@Before("execution (public void Recharge())")
//	public void beforeMsg() {
//		System.out.println("Recharge Expire Soon.....!");
//	}
//	
//    @After("execution (public void Recharge())")
//	public void afterMeg() {
//		System.out.println("Recharge Successfully Done.....!");
//	}
	
	@Around("execution (* com.tka.entity.Recharge.*())")
	public void aroundMsg(ProceedingJoinPoint p) {
		System.out.println("Recharge Expire Soon.....!");
		try {
			p.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("Recharge Successfully Done.....!");
	}
    
}
