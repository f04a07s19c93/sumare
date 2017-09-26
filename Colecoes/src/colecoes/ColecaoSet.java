/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecoes;


import static java.rmi.Naming.list;
import java.util.Arrays;
import static java.util.Collections.list;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 *
 * @author TRISTAO
 */
public class ColecaoSet {
      
       public static void main(String[] args) {
        String[] cores ={"verde","amarelo","azul","verde","branco","verde","azul","verde","branco","amarelo"};
        List<String> list = Arrays.asList(cores);
        System.out.println(list);
        
        Set<String> set = new HashSet<>(list);
           System.out.println(set);
    }
     
    
    
}
