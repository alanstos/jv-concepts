package br.com.concepts.reflection.classes;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class MapeadorClasse {
	
	private Map<Class<?>, Class<?>> mapa = new HashMap<Class<?>, Class<?>>();
	
	
	private Properties getProperties(String nomeArquivo) throws Exception{
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream(nomeArquivo);
		
		p.load(fis);
		
		return p;
	}
	
	public void load(String nomeArquivo) throws Exception{
		
		Properties p = getProperties(nomeArquivo);
		
		for (Object key : p.keySet()) {
			Class<?> intef = Class.forName(key.toString());
			Class<?> impl = Class.forName(p.getProperty(key.toString()));
			
			if (!intef.isInterface()){
				throw new RuntimeException(intef + " nao é uma interface.");
			}
			
			if (!intef.isAssignableFrom(impl)){
				throw new RuntimeException(intef + " nao é uma pai da classe " + impl);
			}
			
			mapa.put(intef, impl);
		}
	}
	
	public Class<?> getImplementacao(Class<?> clazz){
		return mapa.get(clazz);
	}
	
	public void imprimirMapa(){
		for (Class<?> intef : mapa.keySet()) {
			System.out.println(intef + " " + mapa.get(intef) );
		}
	}
	

}
