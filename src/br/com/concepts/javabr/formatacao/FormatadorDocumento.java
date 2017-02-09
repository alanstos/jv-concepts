package br.com.concepts.javabr.formatacao;

import br.com.caelum.stella.format.CPFFormatter;

public class FormatadorDocumento {
	
	public static void main(String[] args) {
		FormatadorDocumento t = new FormatadorDocumento();
		
	    String cpf = "862.883.667-57";
	    String cnpj = "98.610.832/001-24";
	    String tituloEleitor = "417453530116";
	    
	    CPFFormatter cpfFormatter = new CPFFormatter();
	    String cpfSemFormatacao = cpfFormatter.unformat(cpf);
	    
	    System.out.println(cpf);
	}

}
