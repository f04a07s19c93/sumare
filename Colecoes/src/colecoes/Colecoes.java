/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 *
 * @author TRISTAO
 */
public class Colecoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Collection<String> c = new ArrayList();
        c.add("A");
        c.add("E");
        c.add("I");
        c.add("O");
        c.add("U");
        System.out.println(c.toString());//apresenta
        System.out.println(c.isEmpty());//verifica se esta vazia
        System.out.println(c.contains("A"));//VERIFICA SE TEM UM ELEMENTO
        //c.remove("U");
     //   System.out.println(c.toString());
     Collection<String> c2 =  Arrays.asList("B","D");
     c.addAll(c2);
        System.out.println(c.toString());     
        System.out.println(c.containsAll(c2));//verifica se tem o obj
        c.removeAll(c2);//remove tudo
        System.out.println(c.toString());
        
        /*PERCORRER OS ELEMENTOS*/
        for(String string : c){
             System.out.println(string);
        }
        
        String [] s = c.toArray(new String[c.size()]);//retorna um array de strings q tenha a quantidade do tamanho
        System.out.println(Arrays.toString(s));
        
        c.clear();//limpa toda a colecao
                
    }
    
}
