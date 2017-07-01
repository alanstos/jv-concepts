package br.com.concepts.dpatters.p2.memento.slim;

import java.util.ArrayList;
import java.util.List;

public class Historico {
	
	List<Estado> estadosSalvos = new ArrayList<Estado>(); 

	public void adiciona(Estado estado){
		estadosSalvos.add(estado);
	}
	
	public Estado pega(int index){
		return estadosSalvos.get(index);
	}
}
