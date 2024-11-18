package com.java.order.service;

import com.java.order.dto.OrderDto;
import com.java.order.repository.OrderrepoImpl;


public class OrderServiceImpl implements OrderService {

	@Override
	public boolean result(OrderDto dto) {
		boolean isvalid=true;
		System.out.println("name:"+dto.getFood_name());
		System.out.println("price:" +dto.getPrice());
		System.out.println("customer name:"+dto.getC_name());
		System.out.println("phone:"+dto.getC_phone());
		System.out.println("quantity:"+dto.getQuantity());
		if(isvalid) {
		OrderrepoImpl repo= new OrderrepoImpl();
		boolean ref=repo.save(dto);
		System.out.println(ref);
		
		}
	return isvalid;
	}

}
