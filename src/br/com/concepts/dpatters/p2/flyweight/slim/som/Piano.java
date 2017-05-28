package br.com.concepts.dpatters.p2.flyweight.slim.som;

import java.util.List;

import org.jfugue.player.Player;

import br.com.concepts.dpatters.p2.flyweight.slim.Nota;

public class Piano {

	public void toca(List<Nota> notas){
		
		Player player =new Player();
		
		StringBuilder musica = new StringBuilder();
		for (Nota nota : notas) {
			musica.append(nota.simbolo().toString() + " ");
		}
		
		player.play(musica.toString());
	}
}
