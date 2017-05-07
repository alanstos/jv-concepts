package br.com.concepts.dpatters.state.slim;

public class Reprovado implements IEstadoOrcamento {

	@Override
	public void aplicarDesconto(Orcamento o) {
		throw new RuntimeException("nao eh possivel aplicar desconto para o estado reprovado");
	}

	@Override
	public void aprovar(Orcamento o) {
		throw new RuntimeException("estado reprovado nao eh possivel aprovar");
	}

	@Override
	public void reprovar(Orcamento o) {
		throw new RuntimeException("estado reprovado nao eh possivel reprovar");

	}

	@Override
	public void finalizar(Orcamento o) {
		o.mudaaEstado(new Finalizado());
	}

}
