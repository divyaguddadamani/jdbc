package com.java.person.insertRead;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonInsert {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/person";
		String userName = "root";
		String password = "Xworkzodc@123";

		String insertQuery = "INSERT INTO person_table (id, name, email, phone, age, education, `add`, state, country, sal, dob, pass) VALUES " +
                "(1, 'Divya', 'divya@gmail.com', 98765432, 30, 'BSc', 'Bangalore', 'Karnataka', 'India', 50000, '1993-11-25', 'password123')," +
                "(2, 'Ravi', 'ravi@gmail.com', 98765431, 28, 'MSc', 'Chhattisgarh', 'Chhattisgarh', 'India', 55000, '1995-06-20', 'password456')," +
                "(3, 'Anjali', 'anjali@gmail.com', 98543212, 35, 'PhD', 'Mumbai', 'Maharashtra', 'India', 70000, '1988-03-10', 'password789')," +
                "(4, 'Priya', 'priya@gmail.com', 98763213, 25, 'BBA', 'Hyderabad', 'Telangana', 'India', 45000, '1998-11-15', 'password101')," +
                "(5, 'Amit', 'amit@gmail.com', 98763214, 40, 'MBA', 'Lucknow', 'Uttar Pradesh', 'India', 80000, '1983-01-22', 'password202')," +
                "(6, 'Meera', 'meera@gmail.com', 98543215, 32, 'BCom', 'Bangalore', 'Karnataka', 'India', 60000, '1991-09-25', 'password303')," +
                "(7, 'Vikram', 'vikram@gmail.com', 76543216, 27, 'MSc', 'Karnataka', 'Karnataka', 'India', 52000, '1996-05-14', 'password404')," +
                "(8, 'Asha', 'asha@gmail.com', 98763217, 29, 'MA', 'Mumbai', 'Maharashtra', 'India', 53000, '1994-07-30', 'password505')," +
                "(9, 'Harsh', 'harsh@gmail.com', 98543218, 38, 'BSc', 'Maharashtra', 'Maharashtra', 'India', 65000, '1986-12-05', 'password606')," +
                "(10, 'Sanya', 'sanya@gmail.com', 96543219, 26, 'BBA', 'Delhi', 'Delhi', 'India', 48000, '1997-04-22', 'password707')," +
                "(11, 'Arjun', 'arjun@gmail.com', 98543220, 33, 'PhD', 'Madhya Pradesh', 'Madhya Pradesh', 'India', 72000, '1990-08-18', 'password808')," +
                "(12, 'Neha', 'neha@gmail.com', 98743221, 31, 'MSc', 'Odisha', 'Odisha', 'India', 54000, '1992-02-14', 'password909')," +
                "(13, 'Siddharth', 'siddharth@gmail.com', 98543222, 37, 'MBA', 'Hyderabad', 'Telangana', 'India', 75000, '1986-03-21', 'password100')," +
                "(14, 'Pooja', 'pooja@gmail.com', 98765423, 24, 'BCom', 'Mumbai', 'Maharashtra', 'India', 47000, '1999-06-28', 'password200')," +
                "(15, 'Rahul', 'rahul@gmail.com', 98765224, 34, 'BSc', 'Chandigarh', 'Chandigarh', 'India', 68000, '1989-07-13', 'password300')," +
                "(16, 'Sushma', 'sushma@gmail.com', 98543225, 26, 'BBA', 'Bangalore', 'Karnataka', 'India', 49000, '1997-09-10', 'password400')," +
                "(17, 'Rohit', 'rohit@gmail.com', 98743226, 31, 'MSc', 'West Bengal', 'West Bengal', 'India', 61000, '1992-10-01', 'password500')," +
                "(18, 'Anita', 'anita@gmail.com', 98543227, 29, 'PhD', 'Karnataka', 'Karnataka', 'India', 70000, '1994-12-14', 'password600')," +
                "(19, 'Nikhil', 'nikhil@gmail.com', 96543228, 36, 'BCom', 'Bihar', 'Bihar', 'India', 66000, '1987-05-09', 'password700')," +
                "(20, 'Ritika', 'ritika@gmail.com', 98543229, 30, 'MA', 'Mumbai', 'Maharashtra', 'India', 55000, '1993-03-04', 'password800');";
				Connection connection = null;

	        try {
	            connection = DriverManager.getConnection(url, userName, password);
	            Statement statement = connection.createStatement();
	            int result = statement.executeUpdate(insertQuery);

	            if (result > 0) {
	                System.out.println("Data successfully saved.");
	            } else {
	                System.out.println("Data not saved.");
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        } 
	    }
	}