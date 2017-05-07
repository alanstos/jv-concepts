package br.com.concepts.dpatters.state.slim;

public interface IEstadoOrcamento {
	
	void aplicarDesconto(Orcamento o);
	
	void aprovar(Orcamento o);
	
	void reprovar(Orcamento o);
	
	void finalizar(Orcamento o);

}
