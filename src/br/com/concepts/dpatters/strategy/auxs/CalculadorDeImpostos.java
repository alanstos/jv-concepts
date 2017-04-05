package br.com.concepts.dpatters.strategy.auxs;

public class CalculadorDeImpostos {
	
	protected void realizaCalculo(Orcamento orcamento, String imposto ){ 
         
		if ("ICMS".equals(imposto)) {

			double icms = orcamento.getValor() * 0.1;
			System.out.println(icms); // imprimirá 50.0

		} else if ("ISS".equals(imposto)) {

			double iss = orcamento.getValor() * 0.06;
			System.out.println(iss); // imprimirá 30.0

		} else {
			throw new RuntimeException("Tipo de imposto invalido");
		}
                    
	}

}
