package br.com.concepts.model;

public class GerandoPDF implements Runnable {
	
	public void executa(){
		for(int i = 0 ; i < 100 ; i++){
			System.out.println("gerando pdf");
		}
	}

	@Override
	public void run() {
		executa();
	}

}
