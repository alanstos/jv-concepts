package br.com.concepts.dpatters.strategy.auxs;

public class MainTeste {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(100.0);
		new CalculadorDeImpostos().realizaCalculo(orcamento,"ISS");

	}

}
