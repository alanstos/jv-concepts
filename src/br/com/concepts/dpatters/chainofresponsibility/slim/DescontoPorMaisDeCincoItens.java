package br.com.concepts.dpatters.chainofresponsibility.slim;

class DescontoPorMaisDeCincoItens implements Desconto {
	
	private Desconto proximo;

	public double desconta(Orcamento orcamento) {
		System.out.println("verificando DescontoPorMaisDeCincoItens ");
		double desconto = 0;
		
		if (orcamento.getItens().size() > 5) {
			desconto = orcamento.getValor() * 0.1;
		}else if ( desconto == 0 ) {
			desconto = this.proximo.desconta(orcamento);
		}
		
		return 0;
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}	

}
