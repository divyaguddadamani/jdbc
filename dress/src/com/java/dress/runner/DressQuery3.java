package com.java.dress.runner;

import java.lang.Thread.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.java.dress.enumerator.DressEnum;

public class DressQuery3 {

	public static void main(String[] args) {
		String query3="SELECT c_add FROM dress_table WHERE c_name = 'guna' AND c_phone = '2457891365'";
		Connection connection=null;
		
		try {
			connection=DriverManager.getConnection(DressEnum.URL.getValue(), DressEnum.USERNAME.getValue(),
							DressEnum.PASSWORD.getValue());
			Statement statement=connection.createStatement();
			ResultSet resultSet3=statement.executeQuery(query3);
			while(resultSet3.next())
			{
				System.out.println(resultSet3.getString("c_add"));
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
