package br.com.concepts.dpatters.chainofresponsibility.auxs;

class DescontoPorMaisDeQuinhentosReais implements Desconto{
	
	public double desconta(Orcamento orcamento) {
		if (orcamento.getValor() > 500) {
			return orcamento.getValor() * 0.07;
		} 
		
		return 0;
	}

}
