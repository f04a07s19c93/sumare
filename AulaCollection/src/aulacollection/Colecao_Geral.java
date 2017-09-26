/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulacollection;

import java.util.*;

public class Colecao_Geral {
    Collection<Integer> lista;
    
    Colecao_Geral
   (Collection<Integer> obj)
   {
       lista=obj;
   }
   
    public void remover(Integer obj){
        lista.remove(obj);
    }
    public void remover(int index)
    {
        lista.remove(index);
    }
    public void inserir(Integer obj)
    {
        lista.add(obj);
    }
    public boolean buscar(Integer obj)
    {
        return lista.contains(obj);
    }
    
    public void imprimir()
    {
        System.out.println(
                lista.toString());
    }
    
    public void ordenar()
    {
        
        ArrayList<Integer> al=
       new ArrayList<Integer>();
        
        al.addAll(lista);
        
       Collections.sort(al);
       
       lista.clear();
       
       lista.addAll(al);
       
    }
    
}
