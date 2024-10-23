package com.xworkz.jdbc.data.data;

public class Animal {

	static {
		System.out.println("running static in animal");
	}
	{
		System.out.println("running instance block in animal");
	}
}
