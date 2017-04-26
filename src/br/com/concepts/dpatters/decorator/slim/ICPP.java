package br.com.concepts.dpatters.decorator.slim;

class ICPP extends Imposto {
	
	public ICPP() {
	}
	
	public ICPP(Imposto outroImposto){
		super(outroImposto);
	}
	
	public double calcula(Orcamento orcamento) {
		if (orcamento.getValor() > 500) {
			return orcamento.getValor() * 0.07 + calculaOutroImposto(orcamento);
		} else {
			return orcamento.getValor() * 0.05 + calculaOutroImposto(orcamento);
		}
	}

}
