package br.com.concepts.dpatters.p2.visitor.estruturadados.slim;

public interface Visitor {

	void visitaSoma(Soma soma);

	void visitaSubtracao(Subtracao subtracao);

	void visitaNumero(Numero numero);

	void visitaRaizQuadrada(RaizQuadrada raizQuadrada);

}