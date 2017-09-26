/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecoes;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author TRISTAO
 */
public class ColecaoQueue {
    
    public static void main(String[] args) {
        //FIFO
        //FIRST 
        Queue <String> fila = new LinkedList<>();
        fila.add("Ricardo");
        fila.add("Sandra");
        fila.offer("Beatriz");
        
        System.out.println(fila);
        System.out.println(fila.peek());//mostra quem é o proximo da fila
        System.out.println(fila.poll());//remove o elemento do inicio da fila
        System.out.println(fila);
        
        /*outros métodos disponíveis em linkedlist*/
        LinkedList<String> f = (LinkedList<String>)fila;
        f.addFirst("Caio");
        f.add("filie");
        f.addLast("Juliana");
        f.peekFirst();//primeira pessoa da fila
        f.peekLast();//ultima pessoa da fila
        f.pollFirst();//remove a primeira
        f.pollLast();//remove a ultima
        System.out.println(f);
        
    }
    
}
