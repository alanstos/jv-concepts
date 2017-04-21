package br.com.concepts.dpatters.templatemethod.slim;

public class IKCV extends TemplateDeImpostoCondicional {

	private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getValor() > 100)
				return true;
		}

		return false;
	}

	@Override
	double impostoMaior(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

	@Override
	double impostoMenor(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	public boolean deveCalcularImpostoMenor(Orcamento orcamento) {
		return orcamento.getValor() > 500 && temItemMaiorQue100ReaisNo(orcamento);
	}

}
