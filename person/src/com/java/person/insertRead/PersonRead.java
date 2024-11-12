package com.java.person.insertRead;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonRead {

	public static void main(String[] args) {
		
			String url = "jdbc:mysql://localhost:3306/person";
			String userName = "root";
			String password = "Xworkzodc@123";
			
			String query1 ="SELECT * FROM person_table";
			String query2 ="SELECT name FROM person_table WHERE email = 'divya@gmail.com'";
			String query3 ="SELECT `add` FROM person_table WHERE name = 'Priya' AND phone = 98763213";
			String query4 ="SELECT email, pass FROM person_table WHERE phone = 98765224";
			String query5 ="SELECT email, pass FROM person_table WHERE phone = 98543229 AND name = 'Ritika'";
			String query6 ="SELECT name FROM person_table WHERE id > 10";


	        Connection connection = null;

	        try {
	            
	            connection = DriverManager.getConnection(url, userName, password);

	            
	            Statement statement1 = connection.createStatement();
	            ResultSet resultSet1 = statement1.executeQuery(query1);
	            while (resultSet1.next()) {
	            	System.out.println(resultSet1.getString("name"));  }

	            
	            Statement statement2 = connection.createStatement();
	            ResultSet resultSet2 = statement2.executeQuery(query2);
	            while (resultSet2.next()) {
	            	System.out.println(resultSet2.getString("name"));
	            }

	            
	            Statement statement3 = connection.createStatement();
	            ResultSet resultSet3 = statement3.executeQuery(query3);
	            while (resultSet3.next()) {
	            	System.out.println(resultSet3.getString("add"));
	            }

	       
	            Statement statement4 = connection.createStatement();
	            ResultSet resultSet4 = statement4.executeQuery(query4);
	            while (resultSet4.next()) {
	            	System.out.println(resultSet4.getString("email"));  }

	           
	            Statement statement5 = connection.createStatement();
	            ResultSet resultSet5 = statement5.executeQuery(query5);
	            while (resultSet5.next()) {
	            	System.out.println(resultSet5.getString("email"));   }

	            
	            Statement statement6 = connection.createStatement();
	            ResultSet resultSet6 = statement6.executeQuery(query6);
	            while (resultSet6.next()) {
	            	System.out.println(resultSet6.getString("name"));     
	            }
	        }
	         catch (SQLException e) {
	            e.printStackTrace();
	        
	        }

			
	}
  }
