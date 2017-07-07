package br.com.concepts.dpatters.p2.facades.singletons.slim;

public class EmpresaFacade {
	
	protected EmpresaFacade() {
		//protected ou private
	}
	//COMENTADO PARA NAO DAR ERRO DE COMPILACAO
	// O IMPORTANTE EH O CONCEITO
	/*
    public Cliente buscaCliente(String cpf) {
        return new ClienteDao().buscaPorCpf(cpf);
    }
    public Fatura criaFatura(Cliente cliente, double valor) {
        Fatura fatura = new Fatura(cliente, valor);
        return fatura;
    }

    public Cobranca geraCobranca(Fatura fatura) {
        Cobranca cobranca = new Cobranca(Tipo.BOLETO, fatura);
        cobranca.emite();

        return cobranca;
    }

    public ContatoCliente fazContato(Cliente cliente, Cobranca cobranca) {
        ContatoCliente contato = new ContatoCliente(cliente, cobranca);
        contato.dispara();

        return contato;
    }
    */

}
