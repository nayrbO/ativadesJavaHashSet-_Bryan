package ExercicioHashSet;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Bryan
 */

public class Atv1HashSet {
    
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();
        
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        numeros.add(10);
        
        System.out.println(numeros);
        
        if(numeros.contains(5)) {
            System.out.println("O número 5 foi encontrado");    
        }
        
    }  
}
