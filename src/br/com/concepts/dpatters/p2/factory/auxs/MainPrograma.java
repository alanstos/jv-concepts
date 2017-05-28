package br.com.concepts.dpatters.p2.factory.auxs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MainPrograma {

	public static void main(String[] args) throws SQLException {
		Connection c = DriverManager.getConnection("jdbc:mysql//localhost/meubanco","root","123");
		
		PreparedStatement ps = c.prepareStatement("select * from tabela");
		
		//....
	}

}
