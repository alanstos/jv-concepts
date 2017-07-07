package br.com.concepts.dpatters.p2.command.slim;

import java.util.Calendar;

public class Pedido {
	
	private String cliente;
	private double valor;
	private Status status;
	private Calendar dataFinalizacao;
	
	public Pedido(String cliente, double valor) {
		this.cliente = cliente;
		this.valor = valor;
		this.status = Status.NOVO;
	}
	
	public void paga(){
		this.status = Status.PAGO;
	}
	
	public void finaliza(){
		this.status = Status.ENTREGUE;
		this.dataFinalizacao = Calendar.getInstance();
	}
	
	@Override
	public String toString() {
		return this.cliente;
	}
	


}
