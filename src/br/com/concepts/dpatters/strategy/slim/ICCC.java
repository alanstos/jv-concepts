package br.com.concepts.dpatters.strategy.slim;


public class ICCC implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		if (orcamento.getValor() < 1000){
			//5%
			return orcamento.getValor() * 0.05;
		} else if ( orcamento.getValor() >= 1000 && orcamento.getValor() <= 3000 ){
			//7%
			return orcamento.getValor() * 0.07;
		} else if ( orcamento.getValor() > 3000 ) {
			//8% + 30
			return (orcamento.getValor() * 0.08) + 30;
		}

		throw new RuntimeException("Ocorreu um erro ao calcular o imposto ICCC com valor = " + orcamento.getValor());
	}

}
