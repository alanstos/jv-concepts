package br.com.concepts.dpatters.p2.visitor.estruturadados.slim;

public class RaizQuadrada implements Expressao {
	
	private Expressao expressao;

	public RaizQuadrada(Expressao valor) {
		this.expressao = valor;
	}

	@Override
	public int avalia() {
		return (int) Math.sqrt( expressao.avalia() );
	}

	@Override
	public void aceitaOuVisita(Visitor impressoraVisitor) {
		impressoraVisitor.visitaRaizQuadrada(this);
		
	}

}
