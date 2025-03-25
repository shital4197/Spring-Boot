package com.tka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfigClass.class);
		User user = context.getBean(User.class);
		System.out.println(user.getSim1().myCalling());
		System.out.println(user.getSim2().myCalling());
	}

}
