package com.java.customer.insertRead;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerInsert {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/product";
		String userName = "root";
		String password = "Xworkzodc@123";
		String insertQuery = "INSERT INTO product_table (c_id, c_name, c_phone, c_email, c_add, p_id, p_name, p_cost, p_var, p_mgf, p_exp, p_quantity) VALUES " +
                "(1, 'Rajesh Kumar', 98765432, 'rajesh.kumar@inmail.com', ' MG Road, Bangalore', 'P101', 'Laptop', '75000.50', 1, '2023-01-15', '2026-01-15', 10)," +
                "(2, 'Aishwarya Reddy', 98887766, 'aishwarya.reddy@inmail.com', ' Indira Nagar, Hyderabad', 'P102', 'Headphones', '1500.00', 2, '2023-03-10', '2025-03-10', 50)," +
                "(3, 'Vikram Singh', 97654321, 'vikram.singh@inmail.com', ' Banjara Hills, Hyderabad', 'P103', 'Smartphone', '45000.75', 3, '2023-05-05', '2025-05-05', 30)," +
                "(4, 'Sushmita Sharma', 98761234, 'sushmita.sharma@inmail.com', ' Park Street, Kolkata', 'P104', 'Refrigerator', '25000.99', 1, '2022-11-20', '2028-11-20', 5)," +
                "(5, 'Prakash Patel', 99112233, 'prakash.patel@inmail.com', ' MG Road, Mumbai', 'P105', 'Microwave Oven', '12000.30', 2, '2022-12-01', '2026-12-01', 7)," +
                "(6, 'Anjali Mehta', 95556677, 'anjali.mehta@inmail.com', ' Marine Drive, Mumbai', 'P106', 'Washing Machine', '22000.80', 3, '2023-02-15', '2027-02-15', 3)," +
                "(7, 'Manoj Kumar', 94445567, 'manoj.kumar@inmail.com', ' T Nagar, Chennai', 'P107', 'Blender', '3000.45', 2, '2023-04-10', '2025-04-10', 20)," +
                "(8, 'Priya Yadav', 98765432, 'priya.yadav@inmail.com', ' Anna Nagar, Chennai', 'P108', 'Toaster', '2500.00', 1, '2023-01-22', '2024-01-22', 15)," +
                "(9, 'Deepak Gupta', 91234567, 'deepak.gupta@inmail.com', ' Connaught Place, Delhi', 'P109', 'Television', '55000.60', 3, '2022-09-15', '2028-09-15', 8)," +
                "(10, 'Neha Sharma', 90011234, 'neha.sharma@inmail.com', ' Hauz Khas, Delhi', 'P110', 'Air Conditioner', '35000.99', 2, '2023-03-20', '2027-03-20', 4)," +
                "(11, 'Rajeev Verma', 93939393, 'rajeeve.verma@inmail.com', ' Jayanagar, Bangalore', 'P111', 'Dishwasher', '22000.00', 1, '2023-06-15', '2026-06-15', 10)," +
                "(12, 'Kavita Singh', 97432111, 'kavita.singh@inmail.com', ' MG Road, Pune', 'P112', 'Vacuum Cleaner', '3500.99', 1, '2023-07-01', '2025-07-01', 8)," +
                "(13, 'Abhishek Roy', 90234567, 'abhishek.roy@inmail.com', ' Salt Lake, Kolkata', 'P113', 'Coffee Maker', '4500.50', 1, '2023-05-20', '2025-05-20', 5)," +
                "(14, 'Sonia Kapoor', 93445566, 'sonia.kapoor@inmail.com', ' Andheri West, Mumbai', 'P114', 'Iron', '1500.25', 1, '2023-02-10', '2024-02-10', 12)," +
                "(15, 'Amit Joshi', 98473344, 'amit.joshi@inmail.com', ' Malad East, Mumbai', 'P115', 'Fan', '1200.00', 1, '2022-12-25', '2024-12-25', 25)," +
                "(16, 'Tanya Rani', 92456789, 'tanya.rani@inmail.com', ' Sarjapur Road, Bangalore', 'P116', 'Air Purifier', '12000.00', 1, '2023-08-15', '2025-08-15', 15)," +
                "(17, 'Ravi Kumar', 98865544, 'ravi.kumar@inmail.com', ' Lower Parel, Mumbai', 'P117', 'Mixer Grinder', '5500.75', 2, '2023-04-25', '2025-04-25', 20)," +
                "(18, 'Madhavi Rao', 97123344, 'madhavi.rao@inmail.com', ' BTM Layout, Bangalore', 'P118', 'Water Purifier', '4500.00', 1, '2023-06-10', '2025-06-10', 18)," +
                "(19, 'Arvind Kumar', 94477888, 'arvind.kumar@inmail.com', ' Indirapuram, Ghaziabad', 'P119', 'Refrigerator', '30000.00', 2, '2023-02-15', '2027-02-15', 10)," +
                "(20, 'Priyanka Gupta', 95532211, 'priyanka.gupta@inmail.com', ' New Friends Colony, Delhi', 'P120', 'Oven', '8000.50', 1, '2023-07-10', '2025-07-10', 5);";

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, userName, password);
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate(insertQuery);

			if (result > 0) {
				System.out.println("data successfully saved ");
			} else {
				System.out.println("data is  not saved ");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		
	}

}
