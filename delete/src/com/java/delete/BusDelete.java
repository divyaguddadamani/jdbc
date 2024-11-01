package com.java.delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BusDelete {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/bus_info";
		String name = "root";
		String password = "Xworkzodc@123";
		String deleteQuery1 = "delete from bus_table where bus_id=111";
		String deleteQuery2 = "delete from bus_table where bus_id=112";
		String deleteQuery3 = "delete from bus_table where bus_id=113";
		String deleteQuery4 = "delete from bus_table where bus_id=114";
		String deleteQuery5 = "delete from bus_table where bus_id=115";
		String deleteQuery6 = "delete from bus_table where bus_id=116";
		String deleteQuery7 = "delete from bus_table where bus_id=117";
		String deleteQuery8 = "delete from bus_table where bus_id=118";
		String deleteQuery9 = "delete from bus_table where bus_id=119";
		String deleteQuery10 = "delete from bus_table where bus_id=120";

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
				System.out.println("delete successfully");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

	

	}

}
