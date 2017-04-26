package br.com.concepts.dpatters.decorator.slim.ex1;

public class FiltroSaldoMenor100 extends Filtro {
	
	public FiltroSaldoMenor100() {
		super();
	}
	
	public FiltroSaldoMenor100(Filtro filtro){
		super(filtro);
	}
	
	private boolean isSaldoMenor100(Conta conta){
		return conta.getSaldo() < 100 ? true : false;
	}

	@Override
	public boolean contem(Conta conta) {
		System.out.println("contem saldo menor 100");
		return isSaldoMenor100(conta);
	}

}
