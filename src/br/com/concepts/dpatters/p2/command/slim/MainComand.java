package br.com.concepts.dpatters.p2.command.slim;

// encapsula comando a ser executado no futuro
public class MainComand {
	
	public static void main(String[] args) {
		
		Pedido pedido1 = new Pedido("boliveira", 100);
		Pedido pedido2 = new Pedido("Cunha", 400);
		
		PagaPedido paga1 = new PagaPedido(pedido1);
		PagaPedido paga2 = new PagaPedido(pedido2);
		
		
		FilaDeTrabalho fila = new FilaDeTrabalho();
		
		
		fila.adiciona(paga1);
		fila.adiciona(paga2);
		fila.adiciona(new ConcluirPedido(pedido1));
		
		fila.processa();
	}

}
