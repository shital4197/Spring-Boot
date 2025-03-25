package com.tka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tka.config.MyConfigClass;
import com.tka.entity.Recharge;

public class MainClass {
	
	public static void main(String[] args) {
		
		ApplicationContext contex = new AnnotationConfigApplicationContext(MyConfigClass.class);
		Recharge r = contex.getBean(Recharge.class);
		r.Recharge();
	
	}

}
