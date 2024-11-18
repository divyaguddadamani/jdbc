package com.java.order.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
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
		 
		 int ref=Integer.valueOf(price);
		 
		 OrderDto dto= new OrderDto(fname, ref,customerName, Phone, quantity);
		 OrderServiceImpl serve=new OrderServiceImpl();
		boolean refs=serve.result(dto);
		if(refs)
		{
		    req.setAttribute("msg", "saved");
			System.out.println("is saved");
		}
		else {
			req.setAttribute("msgs", "not saved");
			System.out.println("is not saved");
		}
		

		 
		 RequestDispatcher dispatcher=req.getRequestDispatcher("index.jsp");
		 dispatcher.forward(req, resp);
		 
		 
	}
	
	
	

}
