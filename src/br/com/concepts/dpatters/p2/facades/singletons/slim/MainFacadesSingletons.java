package br.com.concepts.dpatters.p2.facades.singletons.slim;

public class MainFacadesSingletons {
	
	//O Singleton possibilita que o usuário crie uma instância global para determinado objeto. Isso pode ser interessante, mas tem problemas similares ao de variáveis globais no mundo procedural, afinal o objeto é único e disponível para todos.
	//Se não usar com parcimônia, o seu código sofrerá problemas de manutenção.

	public static void main(String[] args) {
		EmpresaFacade facade = new EmpresaFacadeSingleton().getInstancia();
	}

}
