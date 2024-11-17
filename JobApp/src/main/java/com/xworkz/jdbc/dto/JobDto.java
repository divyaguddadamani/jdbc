package com.xworkz.jdbc.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class JobDto {
	
	private String name;
	private String  age;
	private String phone;
	private String address;
	private String email;
	

	
}
