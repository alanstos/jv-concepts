package br.com.concepts.dpatters.state.slim;

public class Finalizado implements IEstadoOrcamento {

	@Override
	public void aplicarDesconto(Orcamento o) {
		throw new RuntimeException("nao eh possivel aplicar desconto para o estado finalizado");
	}

	@Override
	public void aprovar(Orcamento o) {
		throw new RuntimeException("estado finalizado nao eh possivel aprovar");
	}

	@Override
	public void reprovar(Orcamento o) {
		throw new RuntimeException("estado finalizado nao eh possivel reprovar");

	}

	@Override
	public void finalizar(Orcamento o) {
		throw new RuntimeException("estado finalizado nao eh possivel finalizar");

	}

}
