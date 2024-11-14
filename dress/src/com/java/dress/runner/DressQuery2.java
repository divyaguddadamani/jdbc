package com.java.dress.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.java.dress.enumerator.DressEnum;

public class DressQuery2 {

	public static void main(String[] args) {
		
		String query2="SELECT c_name FROM dress_table WHERE c_email = 'divya@gmail.com' AND c_pass='d123'";
		Connection connection=null;
		
		try {
			connection=DriverManager.getConnection(DressEnum.URL.getValue(), DressEnum.USERNAME.getValue(),
						DressEnum.PASSWORD.getValue());
			Statement statement=connection.createStatement();
			ResultSet resultSet2=statement.executeQuery(query2);
			while(resultSet2.next())
			{
				System.out.println(resultSet2.getString("c_name"));
			}
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
