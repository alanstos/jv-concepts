package br.com.concepts.reflection.erro;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TratandoErro {
	
	public static void main(String[] args) throws Exception   {
		
		ObjectBean obj = new ObjectBean();
		
		Class<?> c = obj.getClass();
		
		Method method = c.getMethod("metodo",String.class ); //NoSuchMethodException
		method.invoke(obj, ""); //IllegalAccessException, IllegalArgumentException, InvocationTargetException
		
		
		
		try {
			
			//chamando metodo com excecao
			Method methodExcecao = c.getMethod("metodoExcecao", String.class);
			methodExcecao.invoke(obj, "");
			
		} catch (InvocationTargetException ite) {
			
			//InvocationTargetException encapsula a exception
			
			Exception ex = (Exception) ite.getTargetException();
			
			ex.printStackTrace();
			
//			ite.getTargetException().printStackTrace();
		}
		
	}

}
