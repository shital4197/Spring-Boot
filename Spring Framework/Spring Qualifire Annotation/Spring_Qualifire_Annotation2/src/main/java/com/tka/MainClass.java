package com.tka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
		Person person = context.getBean(Person.class);
		System.out.println(person.getPayment1().myPayment());
		System.out.println(person.getPayment2().myPayment());
	}

}
