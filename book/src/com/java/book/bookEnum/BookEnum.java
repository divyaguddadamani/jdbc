package com.java.book.bookEnum;

public enum BookEnum {
	
	URL("jdbc:mysql://localhost:3306/book_info"),USERNAME("root"),PASSWORD("Xworkzodc@123");
	
	private final String result;
	private BookEnum(String result)
	{
		this.result=result;
	}
	public String getValue() {
		return result;
		
	}

}
