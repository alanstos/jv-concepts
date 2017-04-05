package br.com.concepts.dpatters.strategy.slim;


public class ISS implements Imposto {

	protected double calculaISS(Orcamento orcamento){
		return orcamento.getValor() * 0.06;
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return calculaISS(orcamento);
	}
}
