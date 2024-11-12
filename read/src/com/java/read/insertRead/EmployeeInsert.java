package com.java.read.insertRead;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeInsert {
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/employee_info";
		String userName = "root";
		String password = "Xworkzodc@123";
		String insertQuery = "INSERT INTO employee_table (id, Efullname, Eage, Esal, Eemail, Eaddress, Epassword, Edob, Eexp, Egender, EcurrentLocation, EeducationHistory) VALUES " +
		        "(1, 'divya', 30, 50000, 'divya@gmail.com', ' Street A', 'divya123', '2001-11-25', 5, 'Female', 'gokak', 'BE')," +
		        "(2, 'darshan', 28, 45000, 'darshu@gmail.com', ' Street B', 'dar123', '1996-03-15', 3, 'Male', 'belagavi', 'BSc')," +
		        "(3, 'deepak', 35, 70000, 'deepak@gmail.com', ' Street C', 'dee123', '1989-09-25', 10, 'Male', 'usa', 'MSc')," +
		        "(4, 'vidya', 27, 48000, 'vidya@gmail.com', ' Street D', 'vid123', '1997-01-08', 2, 'Female', 'paris', 'BA')," +
		        "(5, 'karan', 40, 80000, 'karan@gmail.com', ' Street E', 'karan123', '1984-11-22', 15, 'Male', 'mumbai', 'MBA')," +
		        "(6, 'madhu', 32, 60000, 'madhu@gmail.com', ' Street F', 'mad123', '1992-07-10', 8, 'Female', 'bangalore', 'BCom')," +
		        "(7, 'varun', 29, 47000, 'varun@gmail.com', ' Street G', 'varun1233', '1995-04-30', 4, 'Male', 'gadag', 'BBA')," +
		        "(8, 'vani', 26, 43000, 'vani@gmail.com', ' Street H', 'vani123', '1998-08-20', 3, 'Female', 'hasan', 'MA')," +
		        "(9, 'arun', 34, 65000, 'arun@gmail.com', ' Street I', 'arun123', '1990-12-01', 9, 'Male', 'mysore', 'MSc')," +
		        "(10, 'kavya', 33, 62000, 'kavya@gmail.com', ' Street J', 'kav123', '1991-05-18', 7, 'Female', 'udupi', 'PhD')," +
		        "(11, 'kiran', 31, 52000, 'kiran@gmail.com', ' Street K', 'kir123', '1993-09-14', 6, 'Male', 'belagavi', 'MA')," +
		        "(12, 'navya', 29, 49000, 'navya@gmail.com', ' Street L', 'nav123', '1995-11-29', 5, 'Female', 'gokak', 'BBA')," +
		        "(13, 'vikas', 36, 72000, 'vikas@gmail.com', ' Street M', 'vik123', '1988-03-10', 12, 'Male', 'goa', 'MBA')," +
		        "(14, 'anjali', 25, 42000, 'anjali@gmail.com', ' Street N', 'anj123', '1999-10-25', 2, 'Female', 'delhi', 'BA')," +
		        "(15, 'akash', 30, 50000, 'akash@gmail.com', ' Street O', 'aka123', '1994-01-30', 6, 'Male', 'dubai', 'MSc')," +
		        "(16, 'akshata', 28, 46000, 'akshata@gmail.com', ' Street P', 'akas123', '1996-06-12', 4, 'Female', 'hubbali', 'MA')," +
		        "(17, 'kartik', 27, 44000, 'kartik@gmail.com', ' Street Q', 'kar123', '1997-04-02', 3, 'Male', 'savadatti', 'BSc')," +
		        "(18, 'supriya', 33, 64000, 'suppi@gmail.com', ' Street R', 'sup123', '1991-09-19', 7, 'Female', 'haveri', 'PhD')," +
		        "(19, 'amit', 35, 71000, 'amit@gmail.com', ' Street S', 'ami123', '1989-02-15', 10, 'Male', 'bali', 'MBA')," +
		        "(20, 'priyank', 32, 58000, 'priyank@gmail.com', ' Street T', 'pri123', '1992-11-05', 8, 'Female', 'mumbai', 'BCom');";

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, userName, password);
			Statement statement = connection.createStatement();
			int values = statement.executeUpdate(insertQuery);

			if (values > 0) {
				System.out.println("data successfully saved ");
			} else {
				System.out.println("data is  not saved ");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		
	}

}
