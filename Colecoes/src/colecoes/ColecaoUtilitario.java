/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author TRISTAO
 */
public class ColecaoUtilitario {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Guarana");
        list.add("Açai");
        list.add("banana");
        list.add("uva");
        list.add("Coco");
        System.out.println(list);
        Collections.sort(list);//ordem alfabetica
        System.out.println(list);
        Collections.reverse(list);//ordem invertida
        System.out.println(list);        
        Collections.shuffle(list);//ordem aleatoria
        System.out.println(list);
        
        Collections.addAll(list, "Laranja","Cupuaçu","Limão","Laranja");//add itens na lista
        System.out.println(list);
        System.out.println(Collections.frequency(list, "Laranja"));//frequencia que a palavra aparece
        
        
        List<String> lista2 = Arrays.asList("Acerola","Graviola");
        boolean d =Collections.disjoint(list, lista2);//verifica se existem uma colecao dentro de outra colecao
        
        
        Collections.sort(list);
       int indice= Collections.binarySearch(list, "Guarana");//pesquisa a posição de um elemento
        System.out.println(indice);
        
        
        Collections.fill(list,"Açai");
        System.out.println(list);
        
        //coleção que não pode ser modificada
       Collection<String> constante =
        Collections.unmodifiableCollection(list);
        
    }
    
}
