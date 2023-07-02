package com.js.ac;

import org.springframework.stereotype.Component;

@Component(value = "cr")
public class Car {

	public void start() {
		System.out.println("Car is Started");
	}
}
