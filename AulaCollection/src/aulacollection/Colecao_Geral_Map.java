/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulacollection;

/**
 *
 * @author rolfi.gomes
 */
import java.util.*;
public class Colecao_Geral_Map {
    Map<Integer,Integer> listamap;
    
    Colecao_Geral_Map(Map<Integer,Integer> obj)
    {
        listamap=obj;
    }
    
    public void inserir(int index,
            Integer valor)
    {
        listamap.put(index, valor);
    }
    public void remover(Integer valor)
    {
        listamap.remove(valor);
    }
    
    public void remover(int index)
    {
        listamap.remove(index);
    }
    
    
}

