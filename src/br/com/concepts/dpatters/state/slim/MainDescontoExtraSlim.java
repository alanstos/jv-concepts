package br.com.concepts.dpatters.state.slim;

public class MainDescontoExtraSlim {

	public static void main(String[] args) {
		
		Orcamento orc = new Orcamento(100);
		System.out.println(orc.getValor());
		orc.aplicaDescontoExtra();
		
		System.out.println(orc.getValor());
		
		orc.aprova();
		
		orc.aplicaDescontoExtra();

		System.out.println(orc.getValor());
		
		orc.finaliza();
		
		orc.aplicaDescontoExtra();
	}

}
