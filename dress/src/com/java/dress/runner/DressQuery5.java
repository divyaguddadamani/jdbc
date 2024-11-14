package com.java.dress.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.java.dress.enumerator.DressEnum;

public class DressQuery5 {

	public static void main(String[] args) {
		
		String query5="select c_email,c_pass from dress_table where c_phone='9874563214' AND d_name='gown'";
		
		Connection connection=null;
		try {
			
		connection=DriverManager.getConnection(DressEnum.URL.getValue(),DressEnum.USERNAME.getValue(),DressEnum.PASSWORD.getValue());
		Statement statement=connection.createStatement();
		ResultSet resultSet5=statement.executeQuery(query5);
		
		while(resultSet5.next())
		{
			String res=resultSet5.getString("c_email");
			System.out.println(res);
			System.out.println("============");
			String res1=resultSet5.getString("c_pass");
			System.out.println(res1);
		}
		
		} catch (SQLException e) {


			e.printStackTrace();
		}
	}

}
