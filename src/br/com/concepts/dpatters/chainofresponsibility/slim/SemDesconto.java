package br.com.concepts.dpatters.chainofresponsibility.slim;

public class SemDesconto implements Desconto {

	@Override
	public double desconta(Orcamento orcamento) {
		System.out.println("verificando... SemDesconto");
		return 0;
	}

	@Override
	public void setProximo(Desconto proximo) {
		// sem proximo. Nao tem
	}

}
