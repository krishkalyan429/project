package com.cg.trg.dao;
import java.sql.Connection;

public class TestConnection {

	public static void main(String[] args) {
		try {
			Connection connection= PostgreConnection.getConnection();
			if(connection !=null) {
				System.out.println("Connected to PostgreSQL..");
			}else {
				System.out.println("Unable to connect to PostgreSQL..");
			}						
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
