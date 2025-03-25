package ExercicioHashSet;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Bryan
 */
public class Atv4HashSet {

    public static void main(String[] args) {
    Set<String> cidades = new HashSet<>(); 
    
    cidades.add("Imbé");
    cidades.add("Tramandai");
    cidades.add("Osório");    
    cidades.add("Xangri-Lá");
    cidades.add("Capão da Canoa");
     
        System.out.println(cidades);
    
        if(cidades.isEmpty()) {
        System.out.println("A lista esta vazia");
        System.out.println(cidades);
        
        }else{
        System.out.println("A lista não está vazia");        
        }
        
    }    
}