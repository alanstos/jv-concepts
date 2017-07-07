package br.com.concepts.dpatters.p2.visitor.estruturadados.slim;

public interface Expressao {

	int avalia();

	void aceitaOuVisita(Visitor impressoraVisitor);

}
