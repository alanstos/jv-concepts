package br.com.concepts.reflection.instancia;

import java.lang.reflect.Field;

public class CriacaoInstancia {
	
	public <T> T create(Class<T> clazz) throws Exception{
		T c = clazz.newInstance();
		
		return c;
	}
	
	public <T> T create(Class<T> clazz, String params) throws Exception{
		
		T c = clazz.getDeclaredConstructor(String.class).newInstance(params);
		
		return c;
	}	
	
	
	public String getXML(Object o) throws Exception{
		
		StringBuilder sb = new StringBuilder();
		
		Class<?> c = o.getClass();
		
		sb.append("<"+ c.getSimpleName() + "> \n ");
		
		for(Field f : c.getDeclaredFields() ){
			f.setAccessible(true);
			sb.append(" <" + f.getName() + ">  ");
			sb.append(f.get(o) );
			
			sb.append(" </" + f.getName() + "> \n ");
			
		}
		
		sb.append("</"+ c.getSimpleName() + "> ");
		
		return sb.toString();
	}

}
