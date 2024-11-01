package com.java.insertRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BusInfoRunner {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/bus_info";
		String name="root";
		String password="Xworkzodc@123";
		String insertQuery
		="insert into bus_table values(120,'DIVYA',35)";
		

		Connection connection=null;
		try {
			connection=DriverManager.getConnection(url,name,password);
			Statement statement=connection.createStatement();
			int value=statement.executeUpdate(insertQuery);
		
			if(value>0)
			{
				System.out.println("data is saved");
			}
			else {
				System.out.println("data is not saved");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
