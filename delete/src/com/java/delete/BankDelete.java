package com.java.delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BankDelete {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/bank_info";
		String name = "root";
		String password = "Xworkzodc@123";
		String deleteQuery1 = "delete from bank_details where bank_id=211";
		String deleteQuery2 = "delete from bank_details where bank_id=212";
		String deleteQuery3 = "delete from bank_details where bank_id=213";
		String deleteQuery4 = "delete from bank_details where bank_id=214";
		String deleteQuery5 = "delete from bank_details where bank_id=215";
		String deleteQuery6 = "delete from bank_details where bank_id=216";
		String deleteQuery7 = "delete from bank_details where bank_id=217";
		String deleteQuery8 = "delete from bank_details where bank_id=218";
		String deleteQuery9 = "delete from bank_details where bank_id=219";
		String deleteQuery10 = "delete from bank_details where bank_id=220";

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
