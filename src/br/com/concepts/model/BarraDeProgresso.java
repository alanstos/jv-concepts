package br.com.concepts.model;

public class BarraDeProgresso implements Runnable {
	
	public void executa(){
		for(int i = 0 ; i < 100 ; i++){
			System.out.println("carregando barra de progresso");
		}
	}

	@Override
	public void run() {
		executa();
		
	}

}
