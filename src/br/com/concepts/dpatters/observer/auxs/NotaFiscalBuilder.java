package br.com.concepts.dpatters.observer.auxs;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.concepts.dpatters.builder.auxs.ItemDaNota;
import br.com.concepts.dpatters.builder.auxs.NotaFiscal;

 class NotaFiscalBuilder {
	private String razaoSocial;
	private String cnpj;
	private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
	private double valorBruto;
	private double imposto;
	private String observacao;
	private Calendar dataEmissao;

	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}
	
	public NotaFiscalBuilder addItens(ItemDaNota itemDaNota){
		this.todosItens.add(itemDaNota);
		this.valorBruto += itemDaNota.getValor();
		this.imposto += itemDaNota.getValor() * 0.05;
		return this;
	}
	
	public NotaFiscalBuilder comObservao(String observacao){
		this.observacao = observacao;
		return this;
	}
	
	public NotaFiscalBuilder naDataAtual(){
		this.dataEmissao = Calendar.getInstance();
		return this;
	}
	
	public NotaFiscal constroi(){
		NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, dataEmissao, valorBruto, imposto, todosItens, observacao);
		
		//TODO problema de classe acoplada demais
		enviaParaBanco(nf);
		enviaPorSms(nf);
		enviaPorEmail(nf);
		imprime(nf);
		
		return nf;
	}

	private void imprime(NotaFiscal nf) {
		// TODO Auto-generated method stub
		System.out.println("imprimindo nota fiscal...");
	}

	private void enviaPorEmail(NotaFiscal nf) {
		// TODO Auto-generated method stub
		System.out.println("enviando por email....");
	}

	private void enviaPorSms(NotaFiscal nf) {
		// TODO Auto-generated method stub
		System.out.println("enviando por sms..... ");
		
	}

	private void enviaParaBanco(NotaFiscal nf) {
		// TODO Auto-generated method stub
		System.out.println("gravando no banco de dados ....");
	}

}
