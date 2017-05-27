package br.com.concepts.dpatters.observer.slim;

import br.com.concepts.dpatters.builder.auxs.ItemDaNota;
import br.com.concepts.dpatters.builder.auxs.NotaFiscal;

public class MainTesteAcoes {

	public static void main(String[] args) {
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		//ou
//		builder.addAcao(new NotaFiscalDao());
//		builder.addAcao(new EnviadorDeEmail());
//		builder.addAcao(new EnviadorDeSMS());
//		builder.addAcao(new Impressora());
		//ou
		builder.addAcao(new NotaFiscalDao()
		,new EnviadorDeEmail()
		,new EnviadorDeSMS()
		,new Impressora());
		
		
		builder.paraEmpresa("xpto").comCnpj("3373")
				.addItens(new ItemDaNota("z", 10)).comObservao("d").naDataAtual();
		
		NotaFiscal notaFiscal = builder.constroi();
		System.out.println(notaFiscal);
	}

}
