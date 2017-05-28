package br.com.concepts.dpatters.state.auxs;

public class MainDescontoExtraAuxs {

	public static void main(String[] args) {
		
		Orcamento orc = new Orcamento(100, Orcamento.EM_APROVACAO);
		System.out.println(orc.getValor());
		
//		if (estadoAtual == EM_APROVACAO){
//			setValor( getValor() -  getValor() * 0.05 );
//		}else 
//			if (estadoAtual == APROVACAO){
//				setValor( getValor() -  getValor() * 0.02 );
		orc.aplicaDescontoExtra();
		
		System.out.println(orc.getValor());

	}

}
