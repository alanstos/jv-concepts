package br.com.concepts.dpatters.p2.dsl.interpreter.slim;

public class RaizQuadrada implements Expressao {
	
	private Expressao expressao;

	public RaizQuadrada(Expressao valor) {
		this.expressao = valor;
	}

	@Override
	public int avalia() {
		return (int) Math.sqrt( expressao.avalia() );
	}

}
