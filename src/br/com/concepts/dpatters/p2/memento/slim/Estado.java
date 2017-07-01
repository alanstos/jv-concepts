package br.com.concepts.dpatters.p2.memento.slim;

//ESTADO PROVISORIO, PODERIA NAO UTILIZAR ESSE CLASSE E UTILIZAR O CONTRATO.JAVA, 
//MAS CASO QUERIA GUARDAR OUTROS VALORES, EXEMPLO, HORA, SERA UTIL O ESTADO.JAVA
public class Estado {
	
	private Contrato contrato;

	public Estado(Contrato contrato) {
		super();
		this.contrato = contrato;
	}

	public Contrato getContrato() {
		return contrato;
	}
	
	
}
