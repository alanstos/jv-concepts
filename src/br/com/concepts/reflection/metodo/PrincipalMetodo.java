package br.com.concepts.reflection.metodo;

import br.com.concepts.model.Usuario;

public class PrincipalMetodo {

	public static void main(String[] args) throws Exception {
		Usuario u = new Usuario("alan","alan@","admin",true);
		
		boolean valido = TratadorMetodo.validar(u);
		System.out.println(valido);
	}

}
