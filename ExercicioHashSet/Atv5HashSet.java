package ExercicioHashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Bryan
 */
public class Atv5HashSet {
    
    public static void main(String[] args) {
    Set<String> cores = new HashSet<>();
    
    cores.add("Azul");
    cores.add("Azul Marinho");
    cores.add("Ciano");
    cores.add("Azul Esverdeado");
    cores.add("Azul Escuro");
    
        ArrayList<String> listacores = new ArrayList<>(cores);
        System.out.println("LISTA DE AZUIS");
        System.out.println(listacores);
        
    }   
}
