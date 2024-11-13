package com.java.movie.enumerator;

public enum MovieEnum {
URL("jdbc:mysql://localhost:3306/movie_info"),
USERNAME("root"),
PASSWORD("Xworkzodc@123");
	
	private final String result;
	private MovieEnum(String result)
	{
		this.result=result;
	}
	public String getValue() {
		return result;
		
	}

}
