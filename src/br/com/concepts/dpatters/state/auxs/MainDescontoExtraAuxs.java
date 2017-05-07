package br.com.concepts.dpatters.state.auxs;

public class MainDescontoExtraAuxs {

	public static void main(String[] args) {
		
		Orcamento orc = new Orcamento(100, Orcamento.EM_APROVACAO);
		System.out.println(orc.getValor());
		orc.aplicaDescontoExtra();
		
		System.out.println(orc.getValor());

	}

}
