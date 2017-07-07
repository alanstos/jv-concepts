package br.com.concepts.dpatters.p2.visitor.estruturadados.slim;


public class MainVisitor {

	public static void main(String[] args) {
		// exp = (10 - 5) + (2 + 10) = 17
		
		Expressao esquerda = new Subtracao( new Numero(10), new Numero(5) );
		Expressao direita = new Soma( new Numero(2), new Numero(10) );
		
		Expressao result = new Soma( esquerda, direita );
		
		int valorResult = result.avalia();
		
		System.out.println(valorResult);
		
		RaizQuadrada raizQuadrada = new RaizQuadrada(new Numero(25));
		
		System.out.println("Raiz quadrada = " + raizQuadrada.avalia());
		
		//IMPRIMIR A EXPRESSAO MATEMATICA UTILIZANDO O PADRAO VISITOR
		System.out.println("====  VISITOR =====");
		
		Visitor impressoraVisitor = new ImpressoraVisitor();
		
		result.aceitaOuVisita(impressoraVisitor);
		
		System.out.println("");
		
		System.out.println("====  VISITOR =====");
		
		raizQuadrada.aceitaOuVisita(impressoraVisitor);
	}

}
