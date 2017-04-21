package br.com.concepts.dpatters.templatemethod.slim;

public abstract class TemplateDeImpostoCondicional implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		
		if (deveCalcularImpostoMenor(orcamento)){
			return impostoMenor(orcamento);
		}else{
			return impostoMaior(orcamento);
		}
		
		
	}

	abstract double impostoMaior(Orcamento orcamento);

	abstract double impostoMenor(Orcamento orcamento);

	public abstract boolean deveCalcularImpostoMenor(Orcamento orcamento);

}
