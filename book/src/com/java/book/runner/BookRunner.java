package com.java.book.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.java.book.bookEnum.BookEnum;


public class BookRunner {
	public static void main(String[] args) {
	 
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection=DriverManager.getConnection(BookEnum.URL.getValue(), BookEnum.USERNAME.getValue(),
					BookEnum.PASSWORD.getValue());
			preparedStatement=connection.prepareStatement("insert into book_table values(?,?,?)");
			preparedStatement.setInt(1, 15);
			preparedStatement.setString(2, "gandhi");
			preparedStatement.setInt(3, 250);
			
			int value=preparedStatement.executeUpdate();
			
			if(value>0)
			{
				System.out.println("connected");
			}
			else
			{
				System.out.println("not connected");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		


	
	}
}
