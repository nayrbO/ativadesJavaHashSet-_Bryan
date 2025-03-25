package ExercicioHashSet;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Bryan
 */
public class Atv2HashSet {
    
    public static void main(String[] args) {
    Set<String> frutas = new HashSet<>();    
    
    frutas.add("Maçã");
    frutas.add("Bergamota");
    frutas.add("Banana");    
      
        System.out.println(frutas);
        
        if(frutas.remove("Banana")) {
            System.out.println("A fruta banana foi removida");
            System.out.println(frutas);
        }
    }    
}
