package com.java.dress.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.java.dress.dto.DressDto;
import com.java.dress.enumerator.DressEnum;


public class DressRunner {

	public static void main(String[] args) {

		
		DressDto dto1 =new DressDto(1, "saree", "silk", 2000, "divya", "divya@gmail.com", "d123", "gokak", "8123791097", 10);
		
		DressDto dto2 =new DressDto(2, "suit", "net", 1000, "guna", "guna@gmail.com", "g123", "belagavi", "2457891365", 9);

		DressDto dto3 =new DressDto(3, "kurta", "rayon", 500, "megha", "megha@gmail.com", "m123", "hasan", "2157896354", 8);

		DressDto dto4 =new DressDto(4, "lehenga", "velvet", 1500, "teju", "teju@gmail.com", "t123", "huballi", "8456123478", 7);

		DressDto dto5 =new DressDto(5, "gown", "satin", 2500, "laxmi", "laxmi@gmail.com", "l123", "bangalore", "9874563214", 6);

		DressDto dto6 =new DressDto(6, "dresses", "cotton", 3000, "vidya", "vidya@gmail.com", "v123", "mandya", "9582631478", 5);

		DressDto dto7 =new DressDto(7, "sharara", "crepe", 3500, "vani", "vani@gmail.com", "va123", "mysore", "9254631875", 4);

		DressDto dto8 =new DressDto(8, "jumpsuit", "polyester", 4000, "rani", "rani@gmail.com", "r123", "mumbai", "9856741236", 3);

		DressDto dto9 =new DressDto(9, "kaftan", "chiffon", 4500, "madhu", "madhu@gmail.com", "ma123", "haveri", "8564123975", 2);

		DressDto dto10 =new DressDto(10, "bodycone", "jersey", 5000, "khushi", "khushi@gmail.com", "k123", "udupi", "6859423615", 1);

		
		Connection connection=null;
		PreparedStatement prst=null;
		
		
		
		try {
			connection=DriverManager.getConnection(DressEnum.URL.getValue(), DressEnum.USERNAME.getValue(),
					DressEnum.PASSWORD.getValue());
			prst=connection.prepareStatement("insert into dress_table values(?,?,?,?,?,?,?,?,?,?)");
			prst.setInt(1, dto1.getId());
			prst.setString(2, dto1.getD_name());
			prst.setString(3, dto1.getMaterial());
			prst.setInt(4, dto1.getPrice());
			prst.setString(5, dto1.getC_name());
			prst.setString(6, dto1.getC_email());
			prst.setString(7, dto1.getC_pass());
			prst.setString(8, dto1.getC_add());
			prst.setString(9, dto1.getC_phone());
			prst.setInt(10, dto1.getQuantity());
			prst.executeUpdate();
			
			System.out.println("==================");
			
			prst.setInt(1, dto2.getId());
			prst.setString(2, dto2.getD_name());
			prst.setString(3, dto2.getMaterial());
			prst.setInt(4, dto2.getPrice());
			prst.setString(5, dto2.getC_name());
			prst.setString(6, dto2.getC_email());
			prst.setString(7, dto2.getC_pass());
			prst.setString(8, dto2.getC_add());
			prst.setString(9, dto2.getC_phone());
			prst.setInt(10, dto2.getQuantity());
			prst.executeUpdate();
			
			System.out.println("====================");
			
			prst.setInt(1, dto3.getId());
			prst.setString(2, dto3.getD_name());
			prst.setString(3, dto3.getMaterial());
			prst.setInt(4, dto3.getPrice());
			prst.setString(5, dto3.getC_name());
			prst.setString(6, dto3.getC_email());
			prst.setString(7, dto3.getC_pass());
			prst.setString(8, dto3.getC_add());
			prst.setString(9, dto3.getC_phone());
			prst.setInt(10, dto3.getQuantity());
			prst.executeUpdate();
			
			
			System.out.println("====================");
			
			prst.setInt(1, dto4.getId());
			prst.setString(2, dto4.getD_name());
			prst.setString(3, dto4.getMaterial());
			prst.setInt(4, dto4.getPrice());
			prst.setString(5, dto4.getC_name());
			prst.setString(6, dto4.getC_email());
			prst.setString(7, dto4.getC_pass());
			prst.setString(8, dto4.getC_add());
			prst.setString(9, dto4.getC_phone());
			prst.setInt(10, dto4.getQuantity());
			prst.executeUpdate();
			
			System.out.println("====================");
			
			prst.setInt(1, dto5.getId());
			prst.setString(2, dto5.getD_name());
			prst.setString(3, dto5.getMaterial());
			prst.setInt(4, dto5.getPrice());
			prst.setString(5, dto5.getC_name());
			prst.setString(6, dto5.getC_email());
			prst.setString(7, dto5.getC_pass());
			prst.setString(8, dto5.getC_add());
			prst.setString(9, dto5.getC_phone());
			prst.setInt(10, dto5.getQuantity());
			prst.executeUpdate();
			
			System.out.println("====================");
			
			prst.setInt(1, dto6.getId());
			prst.setString(2, dto6.getD_name());
			prst.setString(3, dto6.getMaterial());
			prst.setInt(4, dto6.getPrice());
			prst.setString(5, dto6.getC_name());
			prst.setString(6, dto6.getC_email());
			prst.setString(7, dto6.getC_pass());
			prst.setString(8, dto6.getC_add());
			prst.setString(9, dto6.getC_phone());
			prst.setInt(10, dto6.getQuantity());
			prst.executeUpdate();
			
			System.out.println("====================");
			
			prst.setInt(1, dto7.getId());
			prst.setString(2, dto7.getD_name());
			prst.setString(3, dto7.getMaterial());
			prst.setInt(4, dto7.getPrice());
			prst.setString(5, dto7.getC_name());
			prst.setString(6, dto7.getC_email());
			prst.setString(7, dto7.getC_pass());
			prst.setString(8, dto7.getC_add());
			prst.setString(9, dto7.getC_phone());
			prst.setInt(10, dto7.getQuantity());
			prst.executeUpdate();
			
			System.out.println("====================");
			
			prst.setInt(1, dto8.getId());
			prst.setString(2, dto8.getD_name());
			prst.setString(3, dto8.getMaterial());
			prst.setInt(4, dto8.getPrice());
			prst.setString(5, dto8.getC_name());
			prst.setString(6, dto8.getC_email());
			prst.setString(7, dto8.getC_pass());
			prst.setString(8, dto8.getC_add());
			prst.setString(9, dto8.getC_phone());
			prst.setInt(10, dto8.getQuantity());
			prst.executeUpdate();
			
			System.out.println("====================");
			
			prst.setInt(1, dto9.getId());
			prst.setString(2, dto9.getD_name());
			prst.setString(3, dto9.getMaterial());
			prst.setInt(4, dto9.getPrice());
			prst.setString(5, dto9.getC_name());
			prst.setString(6, dto9.getC_email());
			prst.setString(7, dto9.getC_pass());
			prst.setString(8, dto9.getC_add());
			prst.setString(9, dto9.getC_phone());
			prst.setInt(10, dto9.getQuantity());
			prst.executeUpdate();
			
			System.out.println("====================");
			
			prst.setInt(1, dto10.getId());
			prst.setString(2, dto10.getD_name());
			prst.setString(3, dto10.getMaterial());
			prst.setInt(4, dto10.getPrice());
			prst.setString(5, dto10.getC_name());
			prst.setString(6, dto10.getC_email());
			prst.setString(7, dto10.getC_pass());
			prst.setString(8, dto10.getC_add());
			prst.setString(9, dto10.getC_phone());
			prst.setInt(10, dto10.getQuantity());
			prst.executeUpdate();
			
			System.out.println("====================");
			
			
			
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
