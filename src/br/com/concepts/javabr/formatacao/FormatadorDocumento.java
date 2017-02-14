package br.com.concepts.javabr.formatacao;

import br.com.caelum.stella.format.CNPJFormatter;
import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.format.Formatter;
import br.com.caelum.stella.format.NITFormatter;
import br.com.caelum.stella.format.TituloEleitoralFormatter;

public class FormatadorDocumento {
	
	public static void main(String[] args) {
		FormatadorDocumento t = new FormatadorDocumento();
		
	    String cpf = "862.883.667-57";
	    String cnpj = "31.372.523/0001-92";
	    
	    String tituloEleitor = "085501310108";
	    
	    String cpfSemFormatacao = t.unformat(new CPFFormatter() , cpf);  //cpfFormatter.unformat(cpf);
	    String cpfFormatacao = t.format(new CPFFormatter() , "96518486007");  //cpfFormatter.unformat(cpf);
	    
	    String cnpjSemFormat = t.unformat(new CNPJFormatter(), cnpj);  //cnpjFormatter.unformat(cnpj);
	    
	    String tituloUnFormat = t.unformat(new TituloEleitoralFormatter(), tituloEleitor);
	    
	    String tituloELFormat = t.format(new TituloEleitoralFormatter(), tituloEleitor);
	    
	    System.out.println("orig:          " + cpf);
	    System.out.println("cpf sem form:  "+cpfSemFormatacao);
	    System.out.println("cpf com form:  "+cpfFormatacao);
	    
	    System.out.println("orgin cnpj:    "+cnpj);
	    System.out.println("cnpj sem form: "+cnpjSemFormat);
	    
	    System.out.println("tit origin     "+tituloEleitor);
	    System.out.println("tit sem formt  "+tituloUnFormat);
	    System.out.println("tit com formt  "+tituloELFormat);
	    
	    Formatter formatter = new NITFormatter();
	    String unfotmatedValue = "17033259504";
	    String formatedValue = formatter.format(unfotmatedValue);
	    // formatedValue = "170.33259.50-4";
	    System.out.println(formatedValue);
	}
	
	public String unformat(Formatter formatter , String valor){
		return formatter.unformat(valor);
	}
	
	public String format(Formatter formatter , String valor){
		return formatter.format(valor);
	}	

}
