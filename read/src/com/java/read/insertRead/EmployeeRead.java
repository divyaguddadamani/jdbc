package com.java.read.insertRead;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeRead {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/employee_info";
		String userName = "root";
		String password = "Xworkzodc@123";
		
        String query1 = "SELECT * FROM employee_table";
        String query2 = "SELECT Efullname FROM employee_table WHERE Eemail = 'divya@gmail.com'";
        String query3 = "SELECT Eaddress FROM employee_table WHERE Efullname = 'darshan' AND Eage = 28";
        String query4 = "SELECT Eemail, Epassword FROM employee_table WHERE Eage = 40";
        String query5 = "SELECT Eemail, Epassword FROM employee_table WHERE Eage = 36 AND Efullname = 'vikas'";
        String query6 = "SELECT Efullname FROM employee_table WHERE id > 10";

        Connection connection = null;

        try {
            
            connection = DriverManager.getConnection(url, userName, password);

            
            Statement statement1 = connection.createStatement();
            ResultSet resultSet1 = statement1.executeQuery(query1);
            while (resultSet1.next()) {
                System.out.println("ID: " + resultSet1.getInt("id") + ", Name: " + resultSet1.getString("Efullname"));
            }

            
            Statement statement2 = connection.createStatement();
            ResultSet resultSet2 = statement2.executeQuery(query2);
            while (resultSet2.next()) {
                System.out.println("Name: " + resultSet2.getString("Efullname"));
            }

            
            Statement statement3 = connection.createStatement();
            ResultSet resultSet3 = statement3.executeQuery(query3);
            while (resultSet3.next()) {
                System.out.println("Address: " + resultSet3.getString("Eaddress"));
            }

       
            Statement statement4 = connection.createStatement();
            ResultSet resultSet4 = statement4.executeQuery(query4);
            while (resultSet4.next()) {
                System.out.println("Email: " + resultSet4.getString("Eemail") + ", Password: " + resultSet4.getString("Epassword"));
            }

           
            Statement statement5 = connection.createStatement();
            ResultSet resultSet5 = statement5.executeQuery(query5);
            while (resultSet5.next()) {
                System.out.println("Email: " + resultSet5.getString("Eemail") + ", Password: " + resultSet5.getString("Epassword"));
            }

            
            Statement statement6 = connection.createStatement();
            ResultSet resultSet6 = statement6.executeQuery(query6);
            while (resultSet6.next()) {
                System.out.println("Name: " + resultSet6.getString("Efullname"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        
        }
    }
}
