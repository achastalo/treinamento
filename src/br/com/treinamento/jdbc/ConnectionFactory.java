package br.com.treinamento.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:postgresql://localhost/treinamento", "postgres", "server");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
