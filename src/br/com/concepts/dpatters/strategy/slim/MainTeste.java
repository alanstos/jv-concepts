package br.com.concepts.dpatters.strategy.slim;


public class MainTeste {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(500.0);
		
		Imposto icms = new ICMS();
		Imposto iss = new ISS();
		Imposto iccc = new ICCC();
		
		new CalculadorDeImpostos().realizaCalculo(orcamento, icms); /*ou */ write( icms.calcula(orcamento));
		
		new CalculadorDeImpostos().realizaCalculo(orcamento, iss);
		new CalculadorDeImpostos().realizaCalculo(orcamento, iccc);
	}
	
	public static void write(double valor){
		System.out.println(valor);
	}

}
