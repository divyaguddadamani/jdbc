package com.xworkz.jdbc.enumerator;

public enum jobEnum {
	

URL("jdbc:mysql://localhost:3306/job"),
USERNAME("root"),
PASSWORD("Xworkzodc@123");
	
	private final String  result;
	
	private jobEnum(String  result) {
		this.result=result;
	}
		
	public String getvalue()
	{
		return result;
		
	}
	
	

}
