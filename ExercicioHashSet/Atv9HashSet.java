package ExercicioHashSet;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Bryan
 */
public class Atv9HashSet {
    
    public static void main(String[] args) {
    Set<Character> caracteres = new HashSet<>();   
    
    for(char c = 'a'; c <= 'z'; c++){   
    caracteres.add(c);
    }
        System.out.println(caracteres);
     System.out.println(caracteres.size());
     
     
    }
}
