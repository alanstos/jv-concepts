package br.com.concepts.dpatters.p2.visitor.estruturadados.slim;

public class Divisao implements Expressao {
	
	private Expressao esquerda;
	private Expressao direita;

	public Divisao(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	}

	@Override
	public int avalia() {
		return esquerda.avalia() / direita.avalia();
	}

	@Override
	public void aceitaOuVisita(Visitor impressoraVisitor) {
		// TODO Auto-generated method stub
		
	}

}
