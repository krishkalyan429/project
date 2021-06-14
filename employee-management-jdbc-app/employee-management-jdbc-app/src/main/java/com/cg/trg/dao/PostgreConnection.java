package com.cg.trg.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Utility class
public class PostgreConnection {
	
	static {
		try {
			//explicitly loading postgres driver
			//from JDBC API 4 onwards, we don't require to
			//explicitly load the driver
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException {
		return DriverManager
				.getConnection("jdbc:postgresql://localhost:5432/empdb","postgres","Krish@429");
	}

}
