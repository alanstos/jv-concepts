package br.com.concepts.dpatters.decorator.slim.ex1;

import java.util.ArrayList;
import java.util.List;

abstract class Filtro {
	
	//protected List<Filtro> filtros = new ArrayList<Filtro>();
	protected Filtro outroFiltro;

	public Filtro(Filtro outroFiltro) {
		this.outroFiltro = outroFiltro;
	}
	
	public Filtro(){};
	
	//public abstract List<Conta> filtrar(List<Conta> contas);
	
	public abstract boolean contem(Conta conta);
	
	protected List<Conta> filtra(List<Conta> contas){
		
		List<Conta> filtradas = new ArrayList<Conta>();
		
		for (Conta conta : contas) {
			
			if (contem(conta)){
				filtradas.add(conta);
			}
				
		}
		
		if (this.outroFiltro != null){
			filtradas.addAll(this.outroFiltro.filtra(contas));
		}
		
		return filtradas;
	}

}
