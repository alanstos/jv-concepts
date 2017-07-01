package br.com.concepts.dpatters.p2.dsl.interpreter.slim;

public class Soma implements Expressao {

	private Expressao direita;
	private Expressao esquerda;

	public Soma(Expressao esquerda, Expressao direita) {
		this.direita = direita;
		this.esquerda = esquerda;
	}

	@Override
	public int avalia() {
		return esquerda.avalia() + direita.avalia();
	}

}
