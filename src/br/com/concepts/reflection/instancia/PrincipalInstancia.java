package br.com.concepts.reflection.instancia;

import br.com.concepts.model.Usuario;

public class PrincipalInstancia {

	public static void main(String[] args) throws Exception {
		
		CriacaoInstancia c = new CriacaoInstancia();
		
		Usuario u2 = c.create(Usuario.class);
		u2.setNome("Gota");
		
		System.out.println(u2.getNome());
		
		Usuario u3 = c.create(Usuario.class,"Avatar");	
		
		System.out.println(u3.getNome());	
		
		
		//
		Usuario usuario = new Usuario("ze", "ze@gmail.com", "admin", true);
		
		System.out.println( c.getXML(usuario) );


	}

}
