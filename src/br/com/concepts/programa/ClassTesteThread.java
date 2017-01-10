package br.com.concepts.programa;

import br.com.concepts.model.BarraDeProgresso;
import br.com.concepts.model.GerandoPDF;

public class ClassTesteThread {

	public static void main(String[] args) {
		
		GerandoPDF gerandoPdf = new GerandoPDF();
		
		Thread th1 = new Thread(gerandoPdf);
		th1.start();
		
		BarraDeProgresso barraProgresso = new BarraDeProgresso();
		
		Thread th2 = new Thread(barraProgresso);
		th2.start();

	}

}
