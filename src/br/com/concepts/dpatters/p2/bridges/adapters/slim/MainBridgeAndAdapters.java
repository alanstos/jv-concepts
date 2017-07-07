package br.com.concepts.dpatters.p2.bridges.adapters.slim;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Calendar;

public class MainBridgeAndAdapters {
	
	public static void mainOld(String[] args) throws IOException {
		
		//imagina que temos que buscar mapas
		
		URL url = new URL("http://google.maps.com?rua=sobeedesce");
		InputStream openStream = url.openStream();
		
		// le o stream e pega o conteudo

		// faz algo com o mapa

	}

	public static void main(String[] args) {
		
		/**
		Com isso, conseguimos mudar facilmente a implementação ao longo do nosso código, já que dependemos de uma interface.
		Repare que essa interface é uma "ponte" para a implementação concreta. O nome desse padrão de projeto é justamente esse: bridge.
		*/
		Mapa mapa = new GoogleMaps();
		String conteudo = mapa.devolveMapa("rua sobre e desce");
		
		
		
		/**
		 Quando temos um conjunto de classes legadas, que achamos que seu uso vai sujar o novo sistema, 
		 criamos um "adaptador" que facilita sua utilização. O nome desse padrão de projetos é Adapter.
		 */
		Calendar hoje = new RelogioDoSistema().getHoje();
	}
}
