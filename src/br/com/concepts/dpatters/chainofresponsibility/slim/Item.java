package br.com.concepts.dpatters.chainofresponsibility.slim;

class Item {
	
	private String nome;
	private Integer codigo;

	public Item(Integer codigo, String nome) {
		this.codigo =codigo;
		this.nome =nome;
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
