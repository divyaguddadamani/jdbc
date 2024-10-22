package com.xworkz.jdbc.data;

public class Book {
	String bookname;
	double price;
	public Book(String bookname, double price) {
		super();
		this.bookname = bookname;
		this.price = price;
	}
	
	static{
		System.out.println("static block");
		
	}

	@Override
	public String toString() {
		return "Book [bookname=" + bookname + ", price=" + price + "]";
	}
	
}
