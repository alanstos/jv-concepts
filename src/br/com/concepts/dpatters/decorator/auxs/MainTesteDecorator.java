package br.com.concepts.dpatters.decorator.auxs;

class MainTesteDecorator {
	
	public static void main(String[] args) {
		
		Imposto icppSimples = new ICPP();
		Orcamento orcamento = new Orcamento(300);
		
		double valorImpostoSimples = icppSimples.calcula(orcamento);
		
		System.out.println(valorImpostoSimples);
		
		//Agora imagina se for um imposto composto??
		//new ICPP() + new IKCV()
		
		//Vamos utilizar o DECORATOR
		
	}
}
