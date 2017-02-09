package br.com.concepts.javabr.validacao;

import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import br.com.caelum.stella.validation.TituloEleitoralValidator;
import br.com.caelum.stella.validation.Validator;

public class ValidacaoDocumento {

	public static void main(String[] args) {
		
		ValidacaoDocumento t = new ValidacaoDocumento();
		
		t.validandoCPF();
		t.validandoCNPJ();
		t.validandoTituloEleitor();
	}
	
	public void validandoCPF(){
		String cpf = "86288366757";
		
		try {
			
			validadorDocumento(new CPFValidator(), cpf);
			System.out.println("CPF valido");
			
		} catch (InvalidStateException e) {
			System.out.println("CPF invalido: "+ e);
		}
	}
	
	public void validandoCNPJ(){
		String cpf = "82588641000173";
		
		try {
			
			validadorDocumento(new CNPJValidator(), cpf);
			System.out.println("CNPJ valido");
			
		} catch (InvalidStateException e) {
			System.out.println("CNPJ invalido: "+ e);
		}
	}	
	
	public void validandoTituloEleitor(){
		String cpf = "417453530116";
		
		try {
			
			validadorDocumento(new TituloEleitoralValidator(), cpf);
			System.out.println("Titulo eleitor valido");
			
		} catch (InvalidStateException e) {
			System.out.println("Titulo eleitor invalido: "+ e);
		}
	}		
	
	public void validadorDocumento(Validator<String> validator, String valor){
		validator.assertValid(valor);
	}

}
