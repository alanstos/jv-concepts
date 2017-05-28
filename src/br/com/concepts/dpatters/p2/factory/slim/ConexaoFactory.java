package br.com.concepts.dpatters.p2.factory.slim;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class ConexaoFactory {

	public Connection getConnection() {
		try {
			
			//poderia ser definido o banco da variavel de ambiente do sistema
			@SuppressWarnings("unused")
			String banco = System.getenv("tipoBanco");
			
			return DriverManager.getConnection("jdbc:oracle//localhost/meubanco", "root", "456");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
