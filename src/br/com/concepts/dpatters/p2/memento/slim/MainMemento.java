package br.com.concepts.dpatters.p2.memento.slim;

import java.util.Calendar;

//O Memento é um padrão de projeto que nos ajuda a salvar e restaurar estados de objetos
public class MainMemento {
	
	public static void main(String[] args) {
		Historico historico = new Historico();
		Contrato c1 = new Contrato(Calendar.getInstance(), "Coca cola", TipoContratoEnum.NOVO);
		
		historico.adiciona(c1.salvaEstado());
		print(c1);
		
		c1.avanca();
		
		historico.adiciona(c1.salvaEstado());
		print(c1);
		
		c1.avanca();
		
		historico.adiciona(c1.salvaEstado());
		print(c1);
		
		c1.restaura(historico.pega(0));
		
		print(c1);
		
		c1.restaura(historico.pega(1));
		
		print(c1);
	}
	
	public static void print(Contrato contrato){
		System.out.println(contrato.getTipo());
	}

}
