package com.java.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SchoolUpdate {

	public static void main(String[] args) {
		



		String url="jdbc:mysql://localhost:3306/school_info";
		String name="root";
		String password="Xworkzodc@123";
		String updateQuery1 = "update school_table set school_name='adarash' where school_id=1";
		String updateQuery2 = "update school_table set school_name='Inventure Academy' where school_id=2";
		String updateQuery3 = "update school_table set school_name=' ges eng medium' where school_id=3";
		String updateQuery4 = "update school_table set school_name='mayure' where school_id=4";
		String updateQuery5 = "update school_table set school_name='kle' where school_id=5";
		String updateQuery6 = "update school_table set school_name='angadi' where school_id=6";
		String updateQuery7 = "update school_table set school_name='national' where school_id=7";
		String updateQuery8 = "update school_table set school_name='aitm' where school_id=8";
		String updateQuery9 = "update school_table set school_name='jss' where school_id=9";
		String updateQuery10 = "update school_table set school_name='vtu' where school_id=10";

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
