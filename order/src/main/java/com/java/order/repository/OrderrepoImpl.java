package com.java.order.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.java.order.dto.OrderDto;
import com.java.order.orderEnum.OrderEnum;


public class OrderrepoImpl implements OrderRepo{

	@Override
	public boolean save(OrderDto dto) {
		
		
		
		boolean ans=false;
		Connection connection=null;
		PreparedStatement prst=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
		}

		try {
			connection=DriverManager.getConnection(OrderEnum.URL.getvalue(),OrderEnum.USERNAME.getvalue(),OrderEnum.PASSWORD.getvalue());
			prst=connection.prepareStatement("insert into order_table values(?,?,?,?,?)");
			prst.setString(1, dto.getFood_name());
			prst.setString(2, dto.getPrice());
			prst.setString(3, dto.getC_name());
			prst.setString(4, dto.getC_phone());
			prst.setString(5, dto.getQuantity());
			
			int pk=prst.executeUpdate();
			if(pk>0)
			{
				ans=true;
				System.out.println("saved");
			}
			else
			{	ans=false;
				System.out.println("not saved");
			}
			
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		return ans;
		
		
		
	}

}
