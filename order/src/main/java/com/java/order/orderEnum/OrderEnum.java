package com.java.order.orderEnum;

public enum OrderEnum {

URL("jdbc:mysql://localhost:3306/order"),
USERNAME("root"),
PASSWORD("Xworkzodc@123");
	
	private final String  value;
	
	private OrderEnum(String  value) {
		this.value=value;
	}
		
	public String getvalue()
	{
		return value;
		
	}
	
	

}
