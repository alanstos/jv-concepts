package br.com.concepts.dpatters.state.slim;

public class Aprovado implements IEstadoOrcamento{

	@Override
	public void aplicarDesconto(Orcamento o) {
		o.setValor( o.getValor() - o.getValor() * 0.02 );
	}

	@Override
	public void aprovar(Orcamento o) {
		throw new RuntimeException("orcado aprovado nao eh possivel aprovar novamente");
	}

	@Override
	public void reprovar(Orcamento o) {
		throw new RuntimeException("orcado aprovado nao eh possivel reprovado ");		
	}

	@Override
	public void finalizar(Orcamento o) {
		o.mudaaEstado(new Finalizado());
	}

}
