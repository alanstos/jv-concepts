package br.com.concepts.dpatters.state.auxs;

class Orcamento {
	
	private double valor;
	
	private int estadoAtual;
	
	public static final int EM_APROVACAO = 1;
	public static final int APROVACAO    = 2;
	public static final int REPROVACAO   = 3;
	
	public Orcamento(double valor) {
		this.valor = valor;
	}
	
	public Orcamento(double valor, int estado ) {
		this.valor = valor;
		this.estadoAtual = estado;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void aplicaDescontoExtra() {
		if (estadoAtual == EM_APROVACAO){
			setValor( getValor() -  getValor() * 0.05 );
		}else 
			if (estadoAtual == APROVACAO){
				setValor( getValor() -  getValor() * 0.02 );
			} else {
				throw new RuntimeException("nao eh possivel aplicar desconto para o estado atual");
			}
	}

}