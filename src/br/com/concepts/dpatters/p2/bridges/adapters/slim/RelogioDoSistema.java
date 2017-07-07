package br.com.concepts.dpatters.p2.bridges.adapters.slim;

import java.util.Calendar;

public class RelogioDoSistema implements Relogio {

	@Override
	public Calendar getHoje() {
		return Calendar.getInstance();
	}

}
