package br.com.concepts.dpatters.decorator.slim.ex1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainTesteContasDecorator {

	public static void main(String[] args) {
		Conta conta0 = new Conta(0, 10, Calendar.getInstance());
		Conta conta1 = new Conta(1, 200, Calendar.getInstance());
		Conta conta2 = new Conta(2, 400, Calendar.getInstance());
		Conta conta3 = new Conta(3, 10000000, Calendar.getInstance());
		
		List<Conta> contasFiltro = new ArrayList<Conta>();
		contasFiltro.add(conta0);
		contasFiltro.add(conta1);
		contasFiltro.add(conta2);
		contasFiltro.add(conta3);
		
		Filtro filtro = new FiltroSaldoMenor100(new FiltroSaldoMaior500k());
		
		List<Conta> contasAnalise = filtro.filtra(contasFiltro);
		
		System.out.println(contasAnalise.size());
		
		for (Conta conta : contasAnalise) {
			System.out.println(conta);
		}
	}

}
