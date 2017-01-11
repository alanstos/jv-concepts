package br.com.concepts.reflection.erro;

public class ObjectBean {
	
	private String nome;
	
	public ObjectBean() {
	}	

	public ObjectBean(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void metodo(String param){
		
		System.out.println("executando metodo ...");
		
	}
	
	public void metodoExcecao(String param){
		
		throw new RuntimeException("com excecao");
		
	}	

}
