package br.com.concepts.dpatters.strategy.slim;


public class ICMS implements Imposto{
	
	protected double calculaICMS(Orcamento orcamento){
		
		return orcamento.getValor() * 0.1;
		
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return calculaICMS(orcamento);
	}

}
