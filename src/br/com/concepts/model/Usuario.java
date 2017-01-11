package br.com.concepts.model;

public class Usuario {
	
	private String nome;
	private String email;
	private String papel;
	private Boolean ativo;
	
	public Usuario(String nome, String email, String papel, Boolean ativo) {
		super();
		this.nome = nome;
		this.email = email;
		this.papel = papel;
		this.ativo = ativo;
	}
	
	public Usuario(String nome) {
		super();
		this.nome = nome;
	}	
	
	public Usuario() {
		super();
	}

	public boolean validarNome(){
		System.out.println("validando nome...");
		return this.nome != null && this.nome.length() > 3;
	}
	
	public boolean validarEmail(){
		System.out.println("validando email...");
		return this.email != null && this.email.contains("@");
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPapel() {
		return papel;
	}
	public void setPapel(String papel) {
		this.papel = papel;
	}
	public Boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", email=" + email + ", papel="
				+ papel + ", ativo=" + ativo + "]";
	}
	
	

}
