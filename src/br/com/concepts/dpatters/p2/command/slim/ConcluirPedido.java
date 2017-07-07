package br.com.concepts.dpatters.p2.command.slim;

public class ConcluirPedido implements Comando {

	private Pedido pedido;
	
	public ConcluirPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	@Override
	public void executar() {
		System.out.println("finalizando pedido "  + pedido);
		this.pedido.finaliza();
	}

}
