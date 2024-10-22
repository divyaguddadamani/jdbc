package com.xworkz.jdbc.data.runner;

import com.xworkz.jdbc.data.Animal;

public class AnimalRunner {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.xworkz.jdbc.data.Animal");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		Animal animal =new Animal();
		animal.getClass();
	}

	
	
}
