package br.com.concepts.dpatters.p2.flyweight.slim;

import java.util.Arrays;
import java.util.List;

import br.com.concepts.dpatters.p2.flyweight.slim.som.Piano;

/**
 * 
Uma Factory instancia uma classe que é importante/complexa, e seu processo de criação deve ser isolado.

Um Flyweight serve para quando temos muitas instâncias do mesmo objeto andando pelo sistema, e precisamos economizar. 
Para tal, o Flyweight faz uso de uma fábrica modificada, que guarda essas instâncias.
 *
 */
public class MainProgramaEleganteFlyweight {

	public static void main(String[] args) {
		
		NotasMusicais notas = new NotasMusicais();
		
		List<Nota> musica = Arrays.asList(
	            notas.pega("do"),  
	            notas.pega("doSustenido"),   
	            notas.pega("re"),    
	            notas.pega("mi"),    
	            notas.pega("fa"),    
	            notas.pega("fa"),    
	            notas.pega("fa"),    

	            notas.pega("do"),    
	            notas.pega("re"),    
	            notas.pega("do"),    
	            notas.pega("re"),    
	            notas.pega("re"),    
	            notas.pega("re"),

	            notas.pega("do"),    
	            notas.pega("sol"),    
	            notas.pega("fa"),    
	            notas.pega("mi"),    
	            notas.pega("mi"),    
	            notas.pega("mi"),

	            notas.pega("do"),    
	            notas.pega("re"),    
	            notas.pega("mi"),    
	            notas.pega("fa"),    
	            notas.pega("fa"),    
	            notas.pega("fa")
				);
		
		System.out.println(musica);
		
		Piano piano = new Piano();
		piano.toca(musica);
	}

}
