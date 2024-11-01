package com.java.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BankUpdate {

	public static void main(String[] args) {


		String url="jdbc:mysql://localhost:3306/bank_info";
		String name="root";
		String password="Xworkzodc@123";
		String updateQuery1 = "update bank_details set ifsc_code='SBI123' where bank_id=201";
		String updateQuery2 = "update bank_details set ifsc_code='HDFC123' where bank_id=202";
		String updateQuery3 = "update bank_details set ifsc_code='HDFC234' where bank_id=203";
		String updateQuery4 = "update bank_details set ifsc_code='IDFC123' where bank_id=204";
		String updateQuery5 = "update bank_details set ifsc_code='AXIS123' where bank_id=205";
		String updateQuery6 = "update bank_details set ifsc_code='PNB123' where bank_id=206";
		String updateQuery7 = "update bank_details set ifsc_code='BOB123' where bank_id=207";
		String updateQuery8 = "update bank_details set ifsc_code='CAN123' where bank_id=208";
		String updateQuery9 = "update bank_details set ifsc_code='UNI123' where bank_id=209";
		String updateQuery10 = "update bank_details set ifsc_code='IND123' where bank_id=210";

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
