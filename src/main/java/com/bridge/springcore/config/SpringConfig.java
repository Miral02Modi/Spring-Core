package com.bridge.springcore.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public final class SpringConfig {
	
	private static ApplicationContext applicationContext;
	
	private SpringConfig() {
	}
	
	public static ApplicationContext getApplicationContext() {
		if(applicationContext == null) {
			applicationContext = new ClassPathXmlApplicationContext("beans.xml");
			return applicationContext;
		}else {
			return applicationContext;
		}
	}
	
}
