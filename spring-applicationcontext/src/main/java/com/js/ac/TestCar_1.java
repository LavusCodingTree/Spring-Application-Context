package com.js.ac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestCar_1 {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

		Car_1 c = (Car_1) context.getBean("car_1");

		c.e.start();

		c.move();
	}
}
