package br.com.concepts.dpatters.templatemethod.auxs;

class Item {
	
	private String nome;
	private Integer codigo;
	private Integer valor;

	public Item(Integer codigo, String nome, Integer valor) {
		this.codigo =codigo;
		this.nome =nome;
		this.valor=valor;		
	}
	
	public Item(String nome, Integer valor) {
		this.nome =nome;
		this.valor=valor;		
	}	
	
	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	
}
