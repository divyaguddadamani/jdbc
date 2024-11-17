package com.java.order.repository;

import com.java.order.dto.OrderDto;

public interface OrderRepo {
	boolean save(OrderDto dto);

}
