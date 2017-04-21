package br.com.concepts.dpatters.templatemethod.slim;

class ICPP extends TemplateDeImpostoCondicional {

	@Override
	double impostoMaior(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	double impostoMenor(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

	@Override
	public boolean deveCalcularImpostoMenor(Orcamento orcamento) {
		return orcamento.getValor() > 500;
	}
}