package br.com.concepts.dpatters.p2.factory.slim;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Padrao factory pode ser utilizado quando vamos criar um object com caractistica unicas e nao sofrerao mudancas.
 * 
 * O padrao builder eh um padrao com carartisticas parecidas mas ele tem papel fundamental na criacao
 * de objetos dificeis de serem criado. Como por exemplo a Nota fiscal
 * 
 * -------------
 * 
 * Ambos são padrões de projeto que visam resolver problemas de criação de objetos. O que muda de um pro outro é basicamente a semântica.
 * Geralmente usamos um builder quando precisamos passar diversas informações para a lógica que monta o objeto. No caso da Nota Fiscal, passamos nome, ítens, etc.
 *
 * Usamos uma fábrica quando temos que isolar o processo de criação de um objeto em um único lugar. Essa fábrica pode descobrir como criar o objeto dentro dela própria, mas geralmente ela não precisa de muitas informações para criar o objeto.
 */
public class MainProgramaElegante {

	public static void main(String[] args) {
		
		try {
			Connection c = new ConexaoFactory().getConnection();
			
			PreparedStatement ps = c.prepareStatement("select * from table");
			
			//.....
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}

}
