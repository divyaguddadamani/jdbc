package com.java.customer.insertRead;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerRead {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/product";
		String userName = "root";
		String password = "Xworkzodc@123";
		String Query1="SELECT * FROM product_table";
		String Query2="SELECT c_name FROM product_table WHERE c_email = 'prakash.patel@inmail.com' AND c_phone=99112233";
		String Query3="SELECT c_add FROM product_table WHERE c_name = 'Anjali Mehta' AND c_phone = 95556677";
		String Query4="SELECT c_email FROM product_table WHERE c_phone = 95556677";
		String Query5="SELECT c_email FROM product_table WHERE c_phone = 97432111 AND c_name = 'Kavita Singh'";
		String Query6="SELECT c_name FROM product_table WHERE c_id > 5";

Connection connection= null;
		
		try {
			connection=DriverManager.getConnection(url, userName, password);
			Statement statement1 =connection.createStatement();
			ResultSet resultSet1= statement1.executeQuery(Query1);
			
			while(resultSet1.next()) {
				System.out.println(resultSet1.getString("c_name"));
				
			}
			
			Statement statement2=connection.createStatement();
			ResultSet resultSet2=statement2.executeQuery(Query2);
			while(resultSet2.next()) {
				System.out.println(resultSet2.getString("c_name"));
			}
			
			Statement statement3=connection.createStatement();
			ResultSet resultSet3=statement3.executeQuery(Query3);
			while(resultSet3.next()) {
				System.out.println(resultSet3.getString("c_add"));
			}
			
			Statement statement4=connection.createStatement();
			ResultSet resultSet4=statement4.executeQuery(Query4);
			while(resultSet4.next()) {
				System.out.println(resultSet4.getString("c_email"));
				
			}
			
			Statement statement5=connection.createStatement();
			ResultSet resultSet5=statement5.executeQuery(Query5);
			while(resultSet5.next()) {
				System.out.println(resultSet5.getString("c_email"));
			}
			
			Statement statement6=connection.createStatement();
			ResultSet resultSet6=statement5.executeQuery(Query6);
			while(resultSet6.next()) {
				System.out.println(resultSet6.getString("c_name"));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
	}

}
