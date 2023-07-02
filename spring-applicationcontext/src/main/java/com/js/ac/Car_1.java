package com.js.ac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car_1 {
	
	@Autowired
	Engine e;
	
	public void move() {
		System.out.println("Car is Moving");
	}

}
