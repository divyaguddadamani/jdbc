package com.java.dress.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.java.dress.enumerator.DressEnum;

public class DressQuery6 {

	public static void main(String[] args) {
		
		String query6="select d_name,c_name from dress_table where id<5";
		
		Connection connection=null;
		try {
			connection=DriverManager.getConnection(DressEnum.URL.getValue(),DressEnum.USERNAME.getValue(),DressEnum.PASSWORD.getValue());
			Statement statement=connection.createStatement();
			ResultSet resultSet6=statement.executeQuery(query6);
			while(resultSet6.next())
			{
				String res1=resultSet6.getString("d_name");
				String res2=resultSet6.getString("c_name");
				System.out.println(res1);
				System.out.println("===============");
				System.out.println(res2);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
