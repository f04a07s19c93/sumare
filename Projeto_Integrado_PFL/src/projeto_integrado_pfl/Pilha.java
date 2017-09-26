/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_integrado_pfl;

/**
 *
 * @author rolfi.gomes
 */

import java.util.Stack;

public class Pilha {
    Stack<Integer> Pilha;
    
    Pilha(){
        Pilha=new Stack<Integer>();
    }
    
    public void inserir(int valor){
        Pilha.push(valor);
    }
    public int remover(){
        return Pilha.pop();
    }
    
    public int get_topo()
    {
        return Pilha.peek();
    }
    
    public void ordenar()
    {
       Pilha.sort(null);
    }
    
    public String imprimir(){
        return Pilha.toString();
    }
    
}
