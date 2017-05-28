package br.com.concepts.dpatters.p2.flyweight.slim;

import java.util.HashMap;
import java.util.Map;

public class NotasMusicais {
	
	private static Map<String,Nota> notas = new HashMap<String, Nota>();
	
	static {
		notas.put("do", new Do());
		notas.put("re", new Re());
		notas.put("mi", new Mi());
		notas.put("fa", new Fa());
		notas.put("sol", new Sol());
		notas.put("la", new La());
		notas.put("si", new Si());
	}
	
	public Nota pegaNota(String nomeNota){
		return notas.get(nomeNota);
	}
	
	public Nota pega(String nomeNota){
		return pegaNota(nomeNota);
	}
}
