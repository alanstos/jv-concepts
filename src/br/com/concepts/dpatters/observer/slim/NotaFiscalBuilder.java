package br.com.concepts.dpatters.observer.slim;

import java.util.ArrayList;
import java.util.Arrays;
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
	
	private List<AcaoPosGerarNota> todasAcoes;
	
	public NotaFiscalBuilder() {
		this.todasAcoes = new ArrayList<AcaoPosGerarNota>();
	}
	
	void addAcao(AcaoPosGerarNota acao){
		this.todasAcoes.add(acao);
	}
	
	void addAcao(AcaoPosGerarNota ...acao){
		this.todasAcoes.addAll(Arrays.asList(acao));
	}

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
		
		for(AcaoPosGerarNota acao : todasAcoes){
			acao.executa(nf);
		}
		
		return nf;
	}


}
