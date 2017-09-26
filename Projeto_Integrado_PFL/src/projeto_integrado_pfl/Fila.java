/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_integrado_pfl;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    private Queue<Integer> Fila;
    
    Fila(){
        Fila=new LinkedList();
    }
   
    public void inserir(int a){
        Fila.add(a);
    }
    
    public int remover(){
     return Fila.poll();   
    }
 
    public String imprimir(){
      return Fila.toString();
    }
    
    public void ordenar(){
        int numeros[]=new int[Fila.size()];
       
        int cont=0;
        for(int valores: Fila)
        {
            numeros[cont++]=valores;
        }
        
        for(int linha=0; linha < Fila.size(); linha++)
          for(int coluna=linha+1; coluna < Fila.size(); coluna++)
            {
                    if(numeros[linha]> numeros[coluna])
                    {
                        int aux=numeros[linha];
                        numeros[linha]=numeros[coluna];
                        numeros[coluna]=aux;
                    }
            }
        
        Fila.clear();
        
        for(int valores: numeros)
        {
            Fila.add(valores);
        }
    }
}
