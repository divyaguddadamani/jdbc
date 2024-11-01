package com.java.delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class School_delete {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/school_info";
		String name = "root";
		String password = "Xworkzodc@123";
		String deleteQuery1 = "delete from school_table where school_id=11";
		String deleteQuery2 = "delete from school_table where school_id=12";
		String deleteQuery3 = "delete from school_table where school_id=13";
		String deleteQuery4 = "delete from school_table where school_id=14";
		String deleteQuery5 = "delete from school_table where school_id=15";
		String deleteQuery6 = "delete from school_table where school_id=16";
		String deleteQuery7 = "delete from school_table where school_id=17";
		String deleteQuery8 = "delete from school_table where school_id=18";
		String deleteQuery9 = "delete from school_table where school_id=19";
		String deleteQuery10 = "delete from school_table where school_id=20";

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(url, name, password);

			Statement statement = connection.createStatement();
			statement.executeUpdate(deleteQuery1);
			statement.executeUpdate(deleteQuery2);
			statement.executeUpdate(deleteQuery3);
			statement.executeUpdate(deleteQuery4);
			statement.executeUpdate(deleteQuery5);
			statement.executeUpdate(deleteQuery6);
			statement.executeUpdate(deleteQuery7);
			statement.executeUpdate(deleteQuery8);
			statement.executeUpdate(deleteQuery9);
			statement.executeUpdate(deleteQuery10);

			if (statement != null) {
				System.out.println("deleted successfully");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
