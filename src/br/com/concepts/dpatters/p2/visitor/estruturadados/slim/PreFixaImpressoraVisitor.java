package br.com.concepts.dpatters.p2.visitor.estruturadados.slim;

public class PreFixaImpressoraVisitor implements Visitor {
	

	@Override
	public void visitaSoma(Soma soma) {
		
		System.out.print("+");
		
		System.out.print("(");
		
		soma.getEsquerda().aceitaOuVisita(this) ;

		soma.getDireita().aceitaOuVisita(this);
		
		System.out.print(")");
	}
	

	@Override
	public void visitaSubtracao(Subtracao subtracao) {
		
		System.out.print("-");
		
		System.out.print("(");
		
		subtracao.getEsquerda().aceitaOuVisita(this);;
		
		subtracao.getDireita().aceitaOuVisita(this);
		
		System.out.print(")");
	}

	@Override
	public void visitaNumero(Numero numero) {
		System.out.print(numero.getNumero());
	}
	
	public void visitaRaizQuadrada(RaizQuadrada raizQuadrada){
		System.out.print( " ( R-> " );
		System.out.print(raizQuadrada.avalia());
		System.out.print( " )" );
	}

}
