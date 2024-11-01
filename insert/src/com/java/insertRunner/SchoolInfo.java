package com.java.insertRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SchoolInfo {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/school_info";
		String userName = "root";
		String password = "Xworkzodc@123";
		String insertQuery = "insert  into school_table values  " + "(2, 'CBSE School', 100000), "
				+ "(3, 'NPS', 128425), " + "(4, 'Bishop Cotton Boys School', 520000), "
				+ "(5, 'Bishop Cotton Girls School', 520000), " + "(6, 'DPS', 450000), "
				+ "(7, 'Inventure Academy', 300000), " + "(8, 'The International School', 600000), "
				+ "(9, 'Vidya Shilp Academy', 350000), " + "(10, 'Ryan International', 180000), "
				+ "(11, 'St. Joseph’s School', 200000), " + "(12, 'Euro School', 160000), "
				+ "(13, 'Canadian International', 550000), " + "(14, 'Valley School', 275000), "
				+ "(15, 'Sophia High School', 210000), " + "(16, 'Jain International Residential School', 650000), "
				+ "(17, 'Ebenezer International School', 480000), " + "(18, 'Delhi Public School', 420000), "
				+ "(19, 'Sri Kumaran Children’s Home', 230000), " + "(20, 'Baldwin Boys High School', 190000), "
				+ "(21, 'Baldwin Girls High School', 195000), " + "(22, 'Presidency School', 250000), "
				+ "(23, 'Oxford English School', 120000), " + "(24, 'Clarence High School', 215000), "
				+ "(25, 'Christ Academy', 275000)";

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
