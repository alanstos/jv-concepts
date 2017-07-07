package br.com.concepts.dpatters.p2.bridges.adapters.slim;

import java.io.InputStream;
import java.net.URL;


public class GoogleMaps implements Mapa {

	@Override
	public String devolveMapa(String endereco) {
		try {
			URL url = new URL("http://google.maps.com?rua=sobeedesce");
			InputStream openStream = url.openStream();
			return "";
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
