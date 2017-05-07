package br.com.concepts.dpatters.state.slim;

public class EmAprovacao implements IEstadoOrcamento{
	
	public void aplicarDesconto(Orcamento o){
		o.setValor( o.getValor() -  o.getValor() * 0.05 );
	}

	@Override
	public void aprovar(Orcamento o) {
		o.mudaaEstado(new Aprovado());
	}

	@Override
	public void reprovar(Orcamento o) {
		o.mudaaEstado(new Reprovado());
	}

	@Override
	public void finalizar(Orcamento o) {
		// TODO Auto-generated method stub
		
	}

}
