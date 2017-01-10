package br.com.concepts.reflection.classes;

import java.util.List;

public class PrincipalClasse {

	public static void main(String[] args) throws Exception {

		MapeadorClasse mapeador = new MapeadorClasse();
		mapeador.load("interf-impl.properties");
		
//		mapeador.imprimirMapa();
		System.out.println(mapeador.getImplementacao(List.class));
	}

}
