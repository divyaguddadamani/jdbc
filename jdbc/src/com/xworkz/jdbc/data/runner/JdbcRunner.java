package com.xworkz.jdbc.data.runner;

public class JdbcRunner {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is present ");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver is not present");
			e.printStackTrace();
		}

	}

}
