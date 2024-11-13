package com.java.bus.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.java.bus.busEnum.BusEnum;

public class BusRunner {

	public static void main(String[] args) {

		Connection connection = null;
		PreparedStatement prst = null;

		try {
			connection = DriverManager.getConnection(BusEnum.URL.getValue(), BusEnum.USERNAME.getValue(),
					BusEnum.PASSWORD.getValue());
			prst = connection.prepareStatement("insert into bus_table values(?,?,?)");

			prst.setInt(1, 15);
			prst.setString(2, "huballi");
			prst.setString(3, "gokak");

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
