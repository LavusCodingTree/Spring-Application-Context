package com.js.ac;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

	// @Value("101")
	int id;

	// @Value("JAVA")
	String name;

	// @Value("2500")
	double price;

	@Value("103")
	  public void setId(int id) {
		this.id = id;
	}

	@Value("J2EE")
	public void setName(String name) {
		this.name = name;
	}

	@Value("4500")
	public void setPrice(double price) {
		this.price = price;
	}


	/*public Book(@Value("102") int id, @Value("SQL")String
	  name, @Value("3500")double price) { super(); this.id = id; this.name = name;
	  this.price = price; }*/
	 

	public void details() {
		System.out.println("Book Id = " + this.id);
		System.out.println("Book Name = " + this.name);
		System.out.println("Book Price = " + this.price);
	}

	
}
