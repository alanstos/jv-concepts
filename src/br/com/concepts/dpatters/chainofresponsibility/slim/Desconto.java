package br.com.concepts.dpatters.chainofresponsibility.slim;


public interface Desconto {
	
    double desconta(Orcamento orcamento);
    
    void setProximo(Desconto proximo);

}
