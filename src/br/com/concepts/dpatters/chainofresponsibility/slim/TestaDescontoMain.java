package br.com.concepts.dpatters.chainofresponsibility.slim;

public class TestaDescontoMain {
	
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(500.0);
		orcamento.addItem(new Item(1, "abc"));
		orcamento.addItem(new Item(2, "123"));
		
		double calcula = new CalculadorDeDescontos().calcula(orcamento);
		
		System.out.println(calcula);
	}

}
