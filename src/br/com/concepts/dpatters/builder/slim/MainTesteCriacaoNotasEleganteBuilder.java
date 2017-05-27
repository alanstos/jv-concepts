package br.com.concepts.dpatters.builder.slim;

import br.com.concepts.dpatters.builder.auxs.ItemDaNota;
import br.com.concepts.dpatters.builder.auxs.NotaFiscal;

public class MainTesteCriacaoNotasEleganteBuilder {

	public static void main(String[] args) {
		NotaFiscalBuilder criador = new NotaFiscalBuilder();
		criador.paraEmpresa("Minha empresa sa")
		.comCnpj("100.100.100/0001-00")
		.addItens(new ItemDaNota("a",100))
		.addItens(new ItemDaNota("b",700))
		.comObservao("bla bla")
		.naDataAtual();
		
		NotaFiscal notaFiscal = criador.constroi();
		System.out.println(notaFiscal);

	}

}
