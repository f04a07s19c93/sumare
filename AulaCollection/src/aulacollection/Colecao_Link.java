/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulacollection;

import java.util.Collections;
import java.util.LinkedList;

public class Colecao_Link {
    LinkedList<Integer> lista;
    Colecao_Link()
    { 
      lista=new LinkedList<Integer>();
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
           Collections.sort(lista);
    }
    
}
