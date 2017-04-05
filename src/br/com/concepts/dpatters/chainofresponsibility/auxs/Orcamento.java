package br.com.concepts.dpatters.chainofresponsibility.auxs;

import java.util.ArrayList;
import java.util.List;

class Orcamento {
	
	private double valor;
	
	private List<Item> itens;

	public Orcamento(double valor) {
		this.valor = valor;
		this.itens = new ArrayList<Item>();
	}
	
	public void addItem(Item item){
		this.itens.add(item);
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

}