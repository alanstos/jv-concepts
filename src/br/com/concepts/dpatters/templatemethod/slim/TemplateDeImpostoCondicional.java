package br.com.concepts.dpatters.templatemethod.slim;

public class TemplateDeImpostoCondicional implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		
		if (deveCalcularImpostoMenor()){
			return impostoMenor();
		}else{
			return impostoMaior();
		}
		
		
	}

	private double impostoMaior() {
		// TODO Auto-generated method stub
		return 0;
	}

	private double impostoMenor() {
		// TODO Auto-generated method stub
		return 0;
	}

	private boolean deveCalcularImpostoMenor() {
		// TODO Auto-generated method stub
		return false;
	}
	
//    public double calcula(Orcamento orcamento) {
//
//        if(deveUsarMaximaTaxacao(orcamento)) {
//          return maximaTaxacao(orcamento);
//        } else {
//          return minimaTaxacao(orcamento);
//        }
//      }        
//
//      public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
//      public abstract double maximaTaxacao(Orcamento orcamento);
//      public abstract double minimaTaxacao(Orcamento orcamento);	

}
