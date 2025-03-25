package ExercicioHashSet;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Bryan
 */
public class Atv8HashSet {
   
    public static void main(String[] args) {
    Set<String> cidades = new HashSet<>();
    
    cidades.add("Porto Alegre");
    cidades.add("Canoas");
    cidades.add("Arroio do Sal");
    cidades.add("Balneário Camboriú");
    cidades.add("São Paulo");
    
        System.out.println(cidades);
        
        if(cidades.remove("São Paulo")) {
            System.out.println(cidades);
        }    
    }   
}
