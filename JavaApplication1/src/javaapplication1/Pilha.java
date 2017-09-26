/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

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
////-----------------------------
      
   public int menorPilha(){
        Pilha.sort(null);
        return Pilha.get(0);
    }
    public int maiorPilha(){
        Pilha.sort(null);
        return Pilha.get(Pilha.size()-1);
    }
    
  public float media(){             
       float total =0;
        int tamanho=Pilha.size();
        for(int valores: Pilha)
        {
            total=total+valores;
        }
      return total/tamanho;
  }
    
    
    public String imprimir(){
        return Pilha.toString();
    }
    
}
