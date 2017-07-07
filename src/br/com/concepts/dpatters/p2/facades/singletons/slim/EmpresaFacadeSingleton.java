package br.com.concepts.dpatters.p2.facades.singletons.slim;

public class EmpresaFacadeSingleton {
	
	private static EmpresaFacade instancia;
	
	public EmpresaFacade getInstancia(){
		
		if (instancia == null)
			instancia = new EmpresaFacade();
		
		return instancia;
	}

}
