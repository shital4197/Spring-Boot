package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.entity.Employee;

@Configuration("com.entity")
public class ConfigClass {
	
	@Bean
	public Employee emp() {
		return new Employee();
	}

}
