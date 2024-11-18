package com.java.employee.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.java.employee.dto.EmployeDto;
import com.java.employee.enumerator.EmployeEnum;


public class EmployeRepoImpl implements EmployeRepo{

	@Override
	public boolean save(EmployeDto dto) {
		
		boolean valid=true;
		Connection connection=null;
		PreparedStatement prst=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			connection=DriverManager.getConnection(EmployeEnum.URL.getvalue(),EmployeEnum.USERNAME.getvalue(),EmployeEnum.PASSWORD.getvalue());
			prst=connection.prepareStatement("insert into emp_table values(?,?,?,?,?,?)");
			prst.setInt(1, dto.getId());
			prst.setString(2, dto.getName());
			prst.setLong(3, dto.getPhone());
			prst.setInt(5, dto.getAge());
			prst.setInt(6, dto.getSal());
			prst.setString(4, dto.getEmail());
			
			int val= prst.executeUpdate();
			if(val>0)
			{
				valid=true;
				System.out.println("saved");
			}
			else
			{
				valid=false;
				System.out.println("not saved");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return valid;
	}

	

}
