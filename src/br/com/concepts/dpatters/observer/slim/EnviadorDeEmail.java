package br.com.concepts.dpatters.observer.slim;

import br.com.concepts.dpatters.builder.auxs.NotaFiscal;

public class EnviadorDeEmail implements AcaoPosGerarNota{

	@Override
	public void executa(NotaFiscal nf) {
		// TODO Auto-generated method stub
		System.out.println("enviando por email....");
	}

}
