package com.jdbc.connection.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentRunner {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/Studentinfo";
		String name="root";
		String email="Xworkzodc@123";
		

		Connection connection=null;
		
		try {
			
			connection=DriverManager.getConnection(url,name,email);
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
