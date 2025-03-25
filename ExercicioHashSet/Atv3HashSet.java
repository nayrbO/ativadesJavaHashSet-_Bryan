package ExercicioHashSet;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Bryan
 */
public class Atv3HashSet {
 
    public static void main(String[] args) {
    Set<Integer> numeros = new HashSet<>();
    
    numeros.add(1);
    numeros.add(2);
    numeros.add(3);    
    numeros.add(4);
    numeros.add(5);
    
        System.out.println(numeros);
        
        numeros.clear();
        
        
        if(numeros.isEmpty()); {
        System.out.println("A lista esta limpa");
        System.out.println(numeros);
        }
   }
}
