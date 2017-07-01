package br.com.concepts.dpatters.p2.dsl.interpreter.slim;

//O padrão é bastante útil quando temos que implementar interpretadores para DSLs, ou coisas similares. 
//É um padrão bem complicado, mas bastante interessante.

//O padrão Interpreter é geralmente útil para interpretar DSLs 
//(se você não sabe o que é uma DSL, pode ler mais sobre isso aqui:
//http://pt.wikipedia.org/wiki/Linguagem_de_dom%C3%ADnio_espec%C3%ADfico. 
//É comum que, ao ler a string (como por exemplo 2+3/4), o programa 
//transforme-o em uma melhor estrutura de dados (como as nossas classes Expressao) e aí interprete essa árvore.
public class MainDslInterpreter {

	public static void main(String[] args) {
		// exp = (10 - 5) + (2 + 10) = 17
		
		Expressao esquerda = new Subtracao( new Numero(10), new Numero(5) );
		Expressao direita = new Soma( new Numero(2), new Numero(10) );
		
		Expressao result = new Soma( esquerda, direita );
		
		int valorResult = result.avalia();
		
		System.out.println(valorResult);
		
		RaizQuadrada raizQuadrada = new RaizQuadrada(new Numero(25));
		
		System.out.println("Raiz quadrada = " + raizQuadrada.avalia());
	}

}
