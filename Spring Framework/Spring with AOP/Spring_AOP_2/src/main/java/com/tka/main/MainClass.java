package com.tka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tka.configClass.ConfigClass;
import com.tka.entity.Login;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
		Login l1 = context.getBean(Login.class);
		l1.loginMsg();

	}

}
