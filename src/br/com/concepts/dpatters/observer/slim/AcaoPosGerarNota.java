package br.com.concepts.dpatters.observer.slim;

import br.com.concepts.dpatters.builder.auxs.NotaFiscal;

public interface AcaoPosGerarNota {
	
	void executa(NotaFiscal nf);

}
