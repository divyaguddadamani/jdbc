package com.jdbc.connection.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TrainRunner {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/jdbc";
		String userName="root";
		String password="Xworkzodc@123";
		
		Connection connection=null;
		
		try {
			
			connection=DriverManager.getConnection(url,userName,password);
			if(connection != null) {
			System.out.println("connected");
			}
			else {
				System.out.println(" not connected");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
