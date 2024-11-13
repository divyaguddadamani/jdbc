package com.java.bus.busEnum;

public enum BusEnum {

URL("jdbc:mysql://localhost:3306/bus"),
USERNAME("root"),
PASSWORD("Xworkzodc@123");
	
	private final String result;
	private BusEnum(String result)
	{
		this.result=result;
	}
	public String getValue() {
		return result;
		
	}

}
