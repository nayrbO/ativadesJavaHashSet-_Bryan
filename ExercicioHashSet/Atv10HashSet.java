package ExercicioHashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Atv10HashSet {

    public static void main(String[] args) {
    Set<String> animais = new HashSet<>(Arrays.asList("Jaguara", "Lião", "Javaleu"));     
     
        System.out.println("A LISTA DE ANIMAIS É:");
    
        System.out.println(animais);
    
        Iterator<String> iterator = animais.iterator();
        String animal =  iterator.next();
        System.out.println(animal);
    }    
}
