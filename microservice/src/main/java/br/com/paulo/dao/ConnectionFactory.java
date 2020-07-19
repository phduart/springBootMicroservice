package br.com.paulo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnnection() throws SQLException {
		return DriverManager
	            .getConnection("jdbc:mysql://localhost:3306/teste?useTimezone=true&serverTimezone=UTC", 
	            		"spring", 
	            		"spring");
	}
}
