package com.java.dress.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.java.dress.enumerator.DressEnum;

public class DressQuery4 {

	public static void main(String[] args) {
		String query4="SELECT c_email,c_pass FROM dress_table WHERE c_phone = '6859423615'";
		Connection connection=null;
		
		try {
			connection=DriverManager.getConnection(DressEnum.URL.getValue(),DressEnum.USERNAME.getValue(),DressEnum.PASSWORD.getValue());
			Statement statement=connection.createStatement();
			ResultSet resultSet4=statement.executeQuery(query4);
			while(resultSet4.next())
			{
				System.out.println(resultSet4.getString("c_email"));
				System.out.println("============");
				System.out.println(resultSet4.getString("c_pass"));
			}
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
