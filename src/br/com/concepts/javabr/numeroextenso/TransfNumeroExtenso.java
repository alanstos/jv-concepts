package br.com.concepts.javabr.numeroextenso;

import br.com.caelum.stella.inwords.FormatoDeExtenso;
import br.com.caelum.stella.inwords.FormatoDeInteiro;
import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.InteiroSemFormato;
import br.com.caelum.stella.inwords.NumericToWordsConverter;

public class TransfNumeroExtenso {

	public static void main(String[] args) {
		
		// ****************** //

		emPalavrasComUnidade(1000150.99);
		
		emPalavrasSemUnidade(1000150.99);
		
		formatoEmReal(1000150.99);
		
		// ****************** //
		
		numeroToPalavra(3018.9, new FormatoDeReal());
		
		// ****************** //		
	
	}
	
	public static void numeroToPalavra(double numero, FormatoDeExtenso formatoDeExtenso){
		NumericToWordsConverter converter = new NumericToWordsConverter(formatoDeExtenso);  
		String extenso = converter.toWords(numero);  
		System.out.println(extenso);
	}	
	
	public static void emPalavrasComUnidade(double numero){
		NumericToWordsConverter converter;  
		converter = new NumericToWordsConverter(new FormatoDeInteiro());  
		String extenso = converter.toWords(numero);  
		System.out.println(extenso);
		//um milhão e cento e cinquenta inteiros e novecentos e noventa milésimos
	}
	
	public static void emPalavrasSemUnidade(double numero){
		NumericToWordsConverter converter;  
		converter = new NumericToWordsConverter(new InteiroSemFormato());  
		String extenso = converter.toWords(numero);  
		System.out.println(extenso);
		// um milhão e cento e cinquenta e um		
	}
	
	public static void formatoEmReal(double numero){
		NumericToWordsConverter converter;  
		converter = new NumericToWordsConverter(new FormatoDeReal());  
		String extenso = converter.toWords(numero);  
		System.out.println(extenso);
		// um milhão e cento e cinquenta reais e noventa e nove centavos			
	}

}
