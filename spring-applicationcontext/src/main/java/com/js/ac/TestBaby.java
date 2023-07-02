package com.js.ac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBaby {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

		Baby b = (Baby) context.getBean("baby");

		b.cry();
		b.cream.eat();
	}

}
