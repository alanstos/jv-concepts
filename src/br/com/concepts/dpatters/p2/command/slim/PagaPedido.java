package br.com.concepts.dpatters.p2.command.slim;

public class PagaPedido implements Comando {
	
	private Pedido pedido;

	public PagaPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public void executar() {
		System.out.println("pagando pedido "  + pedido);
		pedido.paga();
	}

}
