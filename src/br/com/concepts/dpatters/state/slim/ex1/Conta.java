package br.com.concepts.dpatters.state.slim.ex1;

public class Conta {
	
	private double saldo;
	
	private EstadoConta estadoAtual;

	public Conta(double saldo) {
		super();
		this.saldo = saldo;
		this.estadoAtual = new Positiva();
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void saque(int valor){
		this.estadoAtual.saque(this, valor);
	}
	
	public void deposito(int valor){
		this.estadoAtual.deposito(this, valor);
	}

	public void mudaEstado(EstadoConta novoEstado) {
		this.estadoAtual = novoEstado;
	}

}
