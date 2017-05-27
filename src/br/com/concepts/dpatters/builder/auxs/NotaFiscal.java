package br.com.concepts.dpatters.builder.auxs;

import java.util.Calendar;
import java.util.List;

public class NotaFiscal {
	
	private String razaoSocial;
	private String cnpj;
	private Calendar dataEmissao;
	private double valorBruto;
	private double impostos;
	private List<ItemDaNota> itensNotas;
	private String observacao;
	public NotaFiscal(String razaoSocial, String cnpj, Calendar dataEmissao, double valorBruto, double impostos,
			List<ItemDaNota> itensNotas, String observacao) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.dataEmissao = dataEmissao;
		this.valorBruto = valorBruto;
		this.impostos = impostos;
		this.itensNotas = itensNotas;
		this.observacao = observacao;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public Calendar getDataEmissao() {
		return dataEmissao;
	}
	public double getValorBruto() {
		return valorBruto;
	}
	public double getImpostos() {
		return impostos;
	}
	public List<ItemDaNota> getItensNotas() {
		return itensNotas;
	}
	public String getObservacao() {
		return observacao;
	}
	@Override
	public String toString() {
		return "NotaFiscal [razaoSocial=" + razaoSocial + ", cnpj=" + cnpj 
				+ ", valorBruto=" + valorBruto + ", impostos=" + impostos + ", observacao=" + observacao + "]";
	}
	

}


