package br.com.concepts.dpatters.state.slim.ex1;

public interface EstadoConta {
	
	void saque(Conta conta, int valor);
	
	void deposito(Conta conta, int valor);

}
