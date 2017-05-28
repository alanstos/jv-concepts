package br.com.concepts.dpatters.p2.flyweight.slim;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotasMusicais2 {

    private static Map<String, Nota> notas = new HashMap<String, Nota>();
    private static List<Class<? extends Nota>> clazzes;

    static {
         clazzes = Arrays.asList(
                    Do.class, Re.class, Mi.class, Fa.class, 
                    Sol.class, La.class, Si.class);
    }

    public Nota pega(String nome) {
        try {
            if(!notas.containsKey(nome)) {
                for(Class<? extends Nota> clazz : clazzes) {
                    if(clazz.getSimpleName().toLowerCase().equals(nome)) {
                        notas.put(nome, (Nota) clazz.newInstance());
                        break;
                    }
                }
            }

            return notas.get(nome);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}