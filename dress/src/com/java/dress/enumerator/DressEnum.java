package com.java.dress.enumerator;

public enum DressEnum {
	URL("jdbc:mysql://localhost:3306/dress_info"),
	USERNAME("root"),
	PASSWORD("Xworkzodc@123");

	private final String result;

	private DressEnum(String result)
	{
		this.result=result;
	}

	public String getValue() {
		return result;
		
	}
}
