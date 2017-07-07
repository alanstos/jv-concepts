package br.com.concepts.dpatters.p2.visitor.estruturadados.slim;

public class ImpressoraVisitor implements Visitor {
	

	@Override
	public void visitaSoma(Soma soma) {
		System.out.print("(");
		
		soma.getEsquerda().aceitaOuVisita(this) ;
		
		System.out.print("+");
		
		soma.getDireita().aceitaOuVisita(this);
		
		System.out.print(")");
	}
	

	@Override
	public void visitaSubtracao(Subtracao subtracao) {
		System.out.print("(");
		
		subtracao.getEsquerda().aceitaOuVisita(this);;
		
		System.out.print("-");
		
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
