package br.com.concepts.dpatters.state.slim.ex1;

public class Positiva implements EstadoConta {

	@Override
	public void saque(Conta conta, int valor) {
		conta.setSaldo( conta.getSaldo() - valor );
		if ( conta.getSaldo() < 0){
			conta.mudaEstado(new Negativa());
		}
			
	}

	@Override
	public void deposito(Conta conta, int valor) {
		conta.setSaldo( conta.getSaldo() + ( valor * 0.98 ) );
	}

}
