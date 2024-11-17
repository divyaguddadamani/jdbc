package com.java.order.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.order.dto.OrderDto;
import com.java.order.service.OrderServiceImpl;

@WebServlet("/order")
public class OrderServlet  extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String fname=req.getParameter("name");
		 String price=req.getParameter("price");
		 String customerName=req.getParameter("c_name");
		 String Phone=req.getParameter("phone");
		 String quantity=req.getParameter("quantity");
		 
		 OrderDto dto= new OrderDto(fname, price, customerName, Phone, quantity);
		 OrderServiceImpl serve=new OrderServiceImpl();
		serve.result(dto);
		

		 
		 
		 
		 
	}
	
	
	

}
