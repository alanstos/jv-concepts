package br.com.concepts.encurtador.url;

import java.util.Random;


public class Shortener {
	
	private static final String BASE_URL_SHORT = "http://shortener";
	//XYhakR

	public static void main(String[] args) {
		
		Shortener s = new Shortener();
		
		System.out.println(s.geraUrlShort("alan.com.br","qualquer_coisa"));
		System.out.println(s.geraUrlShort("alan.com.br"));
		
		System.out.println(s.gerarString());
		
		s.gera();
		s.gera();
		s.gera();
		s.gera();

	}
	
	public String geraUrlShort(String url){
		
		return geraUrlShort(url, null);
		
	}

	
	public String geraUrlShort(String url, String customAlias){
		
		String custom = "";
		
		if (!isEmpty(customAlias)){
			//TODO busca no banco se existe
			
			custom = customAlias;
		}else{
			custom = gerarString();
		}
		
		return BASE_URL_SHORT + "/u/"+custom;
		
	}
	
	public String gerarString(){
		return gerarString(7,"ABCDEFGHIJKLMNPQRSTUVXZWYabcdefghijklmnopqrstuvxzwy");
	}	
	
	public String gerarString(int tamanho, String letras) {
		Random random = new Random();
		StringBuilder saida = new StringBuilder();
		for (int i = 0; i < tamanho; i++) {
			saida.append(letras.charAt(random.nextInt(letras.length())));
		}
		return saida.toString();
	}
	
	public void gera(){
		Random random = new Random();
		System.out.println(random.nextInt(10));
	}
	
	public boolean isEmpty(String valor){
		return valor == null || valor.isEmpty();
	}

}
