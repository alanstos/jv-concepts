package br.com.concepts.reflection.metodo;

import java.lang.reflect.Method;

public class TratadorMetodo {
	
	public static boolean validar(Object o) throws Exception {
		boolean valido = true;
		
		Class<?> clazz = o.getClass();
		
		Method[] methods = clazz.getDeclaredMethods();
		
		for(Method m : methods){
			if (m.getName().startsWith("validar") 
					&& m.getGenericReturnType().equals(boolean.class)
					&& m.getGenericParameterTypes().length == 0){
				Boolean validado = (Boolean) m.invoke(o);
				valido = valido && validado;
			}
		}
		
		return valido;
	}

}
