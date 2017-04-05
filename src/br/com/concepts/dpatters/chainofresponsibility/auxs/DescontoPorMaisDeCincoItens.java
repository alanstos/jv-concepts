package br.com.concepts.dpatters.chainofresponsibility.auxs;

class DescontoPorMaisDeCincoItens implements Desconto {
	
	public double desconta(Orcamento orcamento) {
		if (orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.1;
		}
		
		return 0;
	}	

}
