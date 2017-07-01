package br.com.concepts.dpatters.p2.dsl.interpreter.slim;

public class Subtracao implements Expressao {

	private Expressao direita;
	private Expressao esquerda;

	public Subtracao(Expressao esquerda, Expressao direita) {
		this.direita = direita;
		this.esquerda = esquerda;
	}

	@Override
	public int avalia() {
		
		return esquerda.avalia() - direita.avalia();
	}
	
	

}
