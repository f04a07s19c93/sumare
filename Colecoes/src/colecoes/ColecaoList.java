/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecoes;

import java.util.ArrayList;
import java.util.*;
/**
 *
 * @author TRISTAO
 */
public class ColecaoList {
    public static void main(String[] args) {
        List<String> list = new ArrayList ();
        
        list.add("futebol");
        list.add("natação");
        list.add("Boxe");
        list.add("Volei");
        list.add("basquete");
        list.add("tênis");
        list.add("futebol");
        System.out.println(list);
        
        //passar para letras maiusculas
        for(int i =0;i<list.size();i++){
            String letra=list.get(i);
            list.set(i,letra.toUpperCase());
        }
        
        System.out.println(list);
        System.out.println(list.indexOf("BOXE"));
        System.out.println(list.subList(2, 5));
        list.subList(2, 4).clear();
        System.out.println(list);
             
        
        
    }
           
    
}
