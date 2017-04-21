package br.com.concepts.dpatters.templatemethod.slim;

public class MainTemplateMethod {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(100d);
		orcamento.addItem(new Item("chocolate", 10));
		
		ICPP icpp = new ICPP();
		double impostoIcpp = icpp.calcula(orcamento);
		
		System.out.println(impostoIcpp);
	}

}
