package com.java.dress.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.java.dress.enumerator.DressEnum;

public class DressQuery1 {

	public static void main(String[] args) {

		String query1="select * from dress_table";
		Connection connection=null;
		
		try {
			connection=DriverManager.getConnection(DressEnum.URL.getValue(), DressEnum.USERNAME.getValue(),
					DressEnum.PASSWORD.getValue());
			Statement statement1 =connection.createStatement();
			ResultSet resultSet1=statement1.executeQuery(query1);
			while(resultSet1.next()) {
				System.out.println(resultSet1.getInt("id"));
				System.out.println("============");
				System.out.println(resultSet1.getString("d_name"));
				System.out.println("============");
				System.out.println(resultSet1.getString("material"));
				System.out.println("============");
				System.out.println(resultSet1.getInt("price"));
				System.out.println("============");
				System.out.println(resultSet1.getString("c_name"));
				System.out.println("============");
				System.out.println(resultSet1.getString("c_email"));
				System.out.println("============");
				System.out.println(resultSet1.getString("c_pass"));
				System.out.println("============");
				System.out.println(resultSet1.getString("c_add"));
				System.out.println("============");
				System.out.println(resultSet1.getString("c_phone"));
				System.out.println("============");
				System.out.println(resultSet1.getInt("quantity"));
				System.out.println("============");
				
				
			}
			} 
		
		catch (SQLException e) 
		{
		
			e.printStackTrace();
		}
		
		
	}

}
