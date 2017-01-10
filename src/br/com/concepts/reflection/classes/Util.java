package br.com.concepts.reflection.classes;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Util {
	
	public static List<String> buscaStringEmAtributos(Object o, String buscada){
	    try {
	        List<String> lista = new ArrayList<>();
	        Class<?> c = o.getClass();
	        for(Field f : c.getFields()){
	            Object value = f.get(o);
	            if(value != null){
	                String strValue = value.toString();
	                if(strValue.contains(buscada)){
	                    lista.add(f.getName());
	                }
	            }
	        }
	        return lista;
	    } catch (Exception e) {
	        e.printStackTrace();
	        throw new RuntimeException(e);
	    }
	}	

}
