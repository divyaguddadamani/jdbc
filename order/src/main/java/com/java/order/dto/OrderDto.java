package com.java.order.dto;

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
public class OrderDto {
	private String food_name;
	private String price;
	private String c_name;
	private String c_phone;
	private String quantity;
	
	

}
