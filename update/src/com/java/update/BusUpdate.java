package com.java.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BusUpdate {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/bus_info";
		String name="root";
		String password="Xworkzodc@123";
		String updateQuery1 = "update bus_table set no_of_seats=30 where bus_id=101";
		String updateQuery2 = "update bus_table set no_of_seats=35 where bus_id=102";
		String updateQuery3 = "update bus_table set no_of_seats=36 where bus_id=103";
		String updateQuery4 = "update bus_table set no_of_seats=38 where bus_id=104";
		String updateQuery5 = "update bus_table set no_of_seats=40 where bus_id=105";
		String updateQuery6 = "update bus_table set no_of_seats=45 where bus_id=106";
		String updateQuery7 = "update bus_table set no_of_seats=42 where bus_id=107";
		String updateQuery8 = "update bus_table set no_of_seats=39 where bus_id=108";
		String updateQuery9 = "update bus_table set no_of_seats=50 where bus_id=109";
		String updateQuery10 = "update bus_table set no_of_seats=35 where bus_id=110";

		Connection connection=null;
			

			
			try {
				connection=DriverManager.getConnection(url,name,password);
				Statement statement = connection.createStatement();
				statement.executeUpdate(updateQuery1);
				statement.executeUpdate(updateQuery2);
				statement.executeUpdate(updateQuery3);
				statement.executeUpdate(updateQuery4);
				statement.executeUpdate(updateQuery5);
				statement.executeUpdate(updateQuery6);
				statement.executeUpdate(updateQuery7);
				statement.executeUpdate(updateQuery8);
				statement.executeUpdate(updateQuery9);
				statement.executeUpdate(updateQuery10);

				
				if(statement!=null)
				{
					System.out.println("updated successfully");
				}
				
			}catch (SQLException e) {
				
				e.printStackTrace();
			}

	}

}
