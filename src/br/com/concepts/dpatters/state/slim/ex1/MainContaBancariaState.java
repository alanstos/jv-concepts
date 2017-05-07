package br.com.concepts.dpatters.state.slim.ex1;

public class MainContaBancariaState {

	public static void main(String[] args) {
		Conta conta = new Conta(100);
		conta.deposito(100);
		
		System.out.println(conta.getSaldo());
		
		conta.saque(50);
		
		System.out.println(conta.getSaldo());
		
		conta.saque(300);
		
		System.out.println(conta.getSaldo());
		
		conta.saque(400);
	}

}
