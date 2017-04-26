package br.com.concepts.dpatters.decorator.slim;

public class IKCV extends Imposto {

	public IKCV() {
	}
	
	public IKCV(Imposto outroImposto){
		super(outroImposto);
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		double result = 0;
		if (orcamento.getValor() > 500 && temItemMaiorQue100ReaisNo(orcamento)) {
			result = orcamento.getValor() * 0.10;
		} else {
			result = orcamento.getValor() * 0.06;
		}
		return result + calculaOutroImposto(orcamento);
	}

	private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getValor() > 100)
				return true;
		}

		return false;
	}

}
