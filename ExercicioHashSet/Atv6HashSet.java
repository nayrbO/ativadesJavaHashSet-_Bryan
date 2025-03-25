package ExercicioHashSet;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Bryan
 */
public class Atv6HashSet {
 
    public static void main(String[] args) {
    Set<String> animais = new HashSet<>();
    
    animais.add("Cachorro");
    animais.add("Gato");
    animais.add("Cavalo");
    
        System.out.println(animais);
        
        if(animais.contains("Gato")) {
            System.out.println("A sua lista tem um gato, woow maneiro!");
        }
    }
}
