package br.com.concepts.dpatters.chainofresponsibility.slim;

class DescontoPorMaisDeQuinhentosReais implements Desconto{
	
	private Desconto proximo;

	public double desconta(Orcamento orcamento) {
		System.out.println("verificando DescontoPorMaisDeQuinhentosReais ");
		double desconto = 0;
		
		if (orcamento.getValor() > 500) {
			return orcamento.getValor() * 0.07;
		}else if ( desconto == 0 ) {
			desconto =  this.proximo.desconta(orcamento);
		}
		
		return 0;
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

}
