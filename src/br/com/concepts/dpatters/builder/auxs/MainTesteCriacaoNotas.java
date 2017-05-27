package br.com.concepts.dpatters.builder.auxs;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class MainTesteCriacaoNotas {
	


	public static void main(String[] args) {
		List<ItemDaNota> itens = Arrays.asList(new ItemDaNota("a", 100),new ItemDaNota("b", 700));
		
		double valorTotal = 0;
		for(ItemDaNota i : itens){
			valorTotal += i.getValor();
		}
		
		double impostoNota = valorTotal * 0.05;
		
		NotaFiscal notaFiscal = new NotaFiscal("cocao", "0338938383", Calendar.getInstance(), 
				valorTotal, impostoNota, itens, "varios itens");
		
		System.out.println(notaFiscal);
	}
}
