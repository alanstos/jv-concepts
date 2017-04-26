package br.com.concepts.dpatters.decorator.slim.ex1;

import java.util.Calendar;

class Conta {
	
	private Integer numero;
	private double saldo;
	private Calendar dataAbertura;
	public Conta(Integer numero, double saldo, Calendar dataAbertura) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.dataAbertura = dataAbertura;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Calendar getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + ", dataAbertura=" + dataAbertura + "]";
	}

	
}
