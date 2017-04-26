package br.com.concepts.dpatters.decorator.slim.ex1;

public class FiltroSaldoMaior500k extends Filtro {
	
	private boolean isSaldoMaior500k(Conta conta){
		return conta.getSaldo() > 500 ? true : false;
	}

	@Override
	public boolean contem(Conta conta) {
		System.out.println("contem saldo maior que 500");
		return isSaldoMaior500k(conta);
	}

}
