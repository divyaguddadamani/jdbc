package com.xworkz.jdbc.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.dto.JobDto;
import com.xworkz.jdbc.enumerator.jobEnum;

public class JobRepoImpl implements JobRepo{


	@Override
	public boolean save(JobDto dto) {
		boolean ans=false;
		Connection connection=null;
		PreparedStatement prst=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
		}

		try {
			connection=DriverManager.getConnection(jobEnum.URL.getvalue(),jobEnum.USERNAME.getvalue(),jobEnum.PASSWORD.getvalue());
			prst=connection.prepareStatement("insert into job_table values(?,?,?,?,?)");
			prst.setString(1, dto.getName());
			prst.setString(2, dto.getAge());
			prst.setString(3, dto.getPhone());
			prst.setString(4, dto.getAddress());
			prst.setString(5, dto.getEmail());
			
			int value=prst.executeUpdate();
			if(value>0)
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
