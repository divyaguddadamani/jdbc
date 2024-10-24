package com.java.insertRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BankInfoRunner {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/bank_info";
		String userName="root";
		String password="Xworkzodc@123";
		String insertQuery=
			"insert into bank_details values(210, 'Bank of India', 'BOI0002468')";
		
		Connection connection=null;
		try {
			connection=DriverManager.getConnection(url,userName,password);
			Statement statement=connection.createStatement();
			int values=statement.executeUpdate(insertQuery);
		
			if(values>0)
			{
				System.out.println("data is saved successfully");
			}
			else
			{
				System.out.println("data is  not saved ");
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
