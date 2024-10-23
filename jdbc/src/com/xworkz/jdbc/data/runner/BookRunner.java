package com.xworkz.jdbc.data.runner;

import com.xworkz.jdbc.data.data.Book;

public class BookRunner {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Class.forName("com.xworkz.jdbc.data.Book");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Book book=new Book("java", 100);
		System.out.println(book);
	}

}
