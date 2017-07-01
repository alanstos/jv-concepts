package br.com.concepts.dpatters.p2.memento.slim;

import java.util.Calendar;

public class Contrato {
	
	private Calendar data;
	private String cliente;
	private TipoContratoEnum tipo;
	
	public Contrato(Calendar data, String cliente, TipoContratoEnum tipo) {
		this.data = data;
		this.cliente = cliente;
		this.tipo = tipo;
	}
	
	public void avanca(){
		if ( tipo == TipoContratoEnum.NOVO) this.tipo = TipoContratoEnum.EM_ANDAMENTO;
		else if ( this.tipo == TipoContratoEnum.EM_ANDAMENTO) this.tipo = TipoContratoEnum.ACERTADO;
		else if ( this.tipo == TipoContratoEnum.ACERTADO ) this.tipo = TipoContratoEnum.CONCLUIDO;
	}

	public Calendar getData() {
		return data;
	}

	public String getCliente() {
		return cliente;
	}

	public TipoContratoEnum getTipo() {
		return tipo;
	}
	
	public Estado salvaEstado(){
		return new Estado( new Contrato(this.data, this.cliente, this.tipo)  );
	}
	
	public void restaura(Estado estado){
		this.data = estado.getContrato().getData();
		this.cliente = estado.getContrato().getCliente();
		this.tipo = estado.getContrato().getTipo();
	}

}
