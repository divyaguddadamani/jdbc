package com.java.movie.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.java.movie.enumerator.MovieEnum;

public class MovieRunner {

	public static void main(String[] args) {

		Connection connection = null;
		PreparedStatement prst = null;

		try {
			connection = DriverManager.getConnection(MovieEnum.URL.getValue(), MovieEnum.USERNAME.getValue(),
					MovieEnum.PASSWORD.getValue());
			prst = connection.prepareStatement("insert into movie_table values(?,?,?)");
			prst.setInt(1, 15);
			prst.setString(2, "ugramm");
			prst.setInt(3, 210);

			int ref = prst.executeUpdate();

			if (ref > 0) {
				System.out.println("connected");
			} else {
				System.out.println("not connected");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
