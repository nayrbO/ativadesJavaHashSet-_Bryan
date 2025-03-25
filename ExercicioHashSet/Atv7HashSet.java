package ExercicioHashSet;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Bryan
 */
public class Atv7HashSet {

    public static void main(String[] args) {
    Set<String> cores = new HashSet<>();    
    
    cores.add("Azul");
    cores.add("Branco");
    cores.add("Preto");    
    //cores.add("Vermelho");
    
        System.out.println(cores);
       
        if(cores.contains("Vermelho")) {
            System.out.println("A lista possui a cor vermelha!");    
        }else{
            System.out.println("A lista não possui a cor vermelha!");    
        }
    }    
}
