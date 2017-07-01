package br.com.concepts.dpatters.p2.dsl.interpreter.slim;

public class Numero implements Expressao {

	private int numero;

	public Numero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public int avalia() {
		return numero;
	}

}
