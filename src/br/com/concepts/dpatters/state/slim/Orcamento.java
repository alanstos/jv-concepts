package br.com.concepts.dpatters.state.slim;

class Orcamento {
	
	private double valor;
	
	private IEstadoOrcamento estadoAtual;
	
	private boolean temDesconto;

	
	public Orcamento(double valor ) {
		this.valor = valor;
		this.estadoAtual = new EmAprovacao();
		this.temDesconto = false;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void aplicaDescontoExtra() {
		if (!this.temDesconto){
			estadoAtual.aplicarDesconto(this);
			this.temDesconto = true;
		}
		
	}
	
	public void mudaaEstado(IEstadoOrcamento novoEstado){
		this.estadoAtual = novoEstado;
	}
	
	public void aprova(){
		this.estadoAtual.aprovar(this);
	}
	
	public void reprova(){
		this.estadoAtual.reprovar(this);
	}
	
	public void finaliza(){
		this.estadoAtual.finalizar(this);
	}

}