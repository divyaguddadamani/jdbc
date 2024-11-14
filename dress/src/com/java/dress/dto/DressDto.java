package com.java.dress.dto;

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

public class DressDto {
	
	private int id;
	private String d_name;
	private String material;
	private int price;
	private String c_name;
	private String c_email;
	private String c_pass;
	private String c_add;
	private String c_phone;
	private int quantity;
	
	

}
