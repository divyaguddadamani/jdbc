package com.xworkz.jdbc.data.runner;

public class BankRunner {
	public static void main(String[] args) {
		try {
			Class.forName("com.xworkz.jdbc.data.Bank");
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not fount/ class not found");
			e.printStackTrace();
		}
	}

}
