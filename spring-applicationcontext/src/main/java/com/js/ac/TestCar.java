package com.js.ac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestCar {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		
		Car c = (Car) applicationContext.getBean("cr");
		
		c.start();
		
	}

}
