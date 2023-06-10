package com.jamir.hoteljava.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MYSQLConnection {
	
	@Bean
	@SuppressWarnings("finally")
	public Connection connect() {
		Connection conn = null;
		
		try {			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteljava", "root", "123456");
			System.out.println("ok");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {
				return conn;
			}else {
				return null;
			}
		}
	}
}
