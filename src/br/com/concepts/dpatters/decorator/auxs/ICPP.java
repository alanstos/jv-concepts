package br.com.concepts.dpatters.decorator.auxs;

class ICPP implements Imposto {
	
	public double calcula(Orcamento orcamento) {
		if (orcamento.getValor() > 500) {
			return orcamento.getValor() * 0.07;
		} else {
			return orcamento.getValor() * 0.05;
		}
	}

}
