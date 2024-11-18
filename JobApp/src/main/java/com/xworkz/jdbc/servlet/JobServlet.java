package com.xworkz.jdbc.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.jdbc.dto.JobDto;
import com.xworkz.jdbc.service.JobService;
import com.xworkz.jdbc.service.JobServiceImpl;
@WebServlet("/send")
public class JobServlet extends HttpServlet {
	
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	 String name=req.getParameter("name");
	 String age=req.getParameter("age");
	 String phone=req.getParameter("number");
	 String address=req.getParameter("addr");
	 String email=req.getParameter("email");
	 
	 
			 
	 JobDto dto=new JobDto(name, age, phone,address,email);
	 JobServiceImpl serve=new JobServiceImpl();
	 
	 boolean variables=serve.save(dto);
	 if(variables)
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
