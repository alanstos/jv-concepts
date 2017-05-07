package br.com.concepts.dpatters.state.slim.ex1;

public class Negativa implements EstadoConta {

	@Override
	public void saque(Conta conta, int valor) {
		throw new RuntimeException("nao eh possivel saque para conta negativa");
	}

	@Override
	public void deposito(Conta conta, int valor) {
		conta.setSaldo( conta.getSaldo() + ( valor * 0.95 ) );
		if ( conta.getSaldo() >= 0){
			conta.mudaEstado(new Positiva());
		}
	}

}
