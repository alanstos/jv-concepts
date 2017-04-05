package br.com.concepts.dpatters.strategy.slim;


/**
 * Eliminando os condicionais com polimorfismo e o pattern Strategy
 * @author alansantos
 *
 */
public class CalculadorDeImpostos {
	
	//maneira correta
	protected void realizaCalculo(Orcamento orcamento,Imposto imposto){
		double valorImposto = imposto.calcula(orcamento);
		System.out.println( valorImposto );
	}
	
	//maneira feia
	protected void realizaCalculo(Orcamento orcamento, String imposto ){ 
        
		if ("ICMS".equals(imposto)) {

			double icms = new ICMS().calculaICMS(orcamento);
			System.out.println(icms); 

		} else if ("ISS".equals(imposto)) {

			double iss = new ISS().calculaISS(orcamento);
			System.out.println(iss); 

		} else {
			throw new RuntimeException("Tipo de imposto invalido");
		}
                    
	}

}
