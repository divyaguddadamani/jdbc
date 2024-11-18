package com.java.employee.enumerator;

public enum EmployeEnum {

	URL("jdbc:mysql://localhost:3306/employee"),
	USERNAME("root"),
	PASSWORD("Xworkzodc@123");
	
	private final String value;

	private EmployeEnum(String value) {
		this.value = value;
	}
	public String getvalue()
	{
		return value;
		
	}
}
