package com.william.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {

		String jdbcUrl = "jdbc:mysql://localhost:3306/hb-01-one-to-one-uni?useSSl=false&serverTimezone=UTC";
		String user = "hbstudent";
		String pass = "hbstudent";
		
		try {
			System.out.println("Connecting to database" + jdbcUrl);
			Connection MyConn = DriverManager.getConnection(jdbcUrl, user, pass);
			
			System.out.println("Sucess");
			
		}catch(Exception exc) {
			exc.printStackTrace();
		}
		
	}

}
