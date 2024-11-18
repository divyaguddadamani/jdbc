package com.java.employee.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString

public class EmployeDto {
	
	private int id;
	private String name;
	private long phone;
	private String email;
	private int age;
	private int sal;

}
