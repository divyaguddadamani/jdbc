package com.java.employee.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.employee.dto.EmployeDto;
import com.java.employee.service.EmployeeServiceImpl;

@WebServlet("/send")
public class EmployeeServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id =req.getParameter("id");
		String name=req.getParameter("name");
		String phone=req.getParameter("number");
		String email=req.getParameter("email");
		String age=req.getParameter("age");
		String sal=req.getParameter("sal");
		
		int ref1=Integer.valueOf(id);
		long ref2=Long .valueOf(phone);
		int ref3=Integer.valueOf(age);
		int ref4=Integer.valueOf(sal);
		
		EmployeDto dto =new EmployeDto(ref1, name, ref2, email, ref3, ref4);
		EmployeeServiceImpl impl=new EmployeeServiceImpl();
		boolean ans=impl.result(dto);
		if(ans)
		{
			req.setAttribute("success", " data saved");
			System.out.println("data saved");
		}
		else
		{
			req.setAttribute("failure", "data not saved");
			System.out.println("data not saved");
		}
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("index.jsp");
		 dispatcher.forward(req, resp);
		 
	}

}
