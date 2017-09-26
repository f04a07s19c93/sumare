/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    private Queue<Integer>  Fila=new LinkedList();;
   // ArrayList<Integer> auxFila = new ArrayList<Integer>();
    
   
   
    public void inserir(int a){
        Fila.add(a);
    }
    
  
 
    public String imprimir(){
      return Fila.toString();
    }
 
    
    //-----------------------
     public int menorFila(){
        int numeros[]=new int[Fila.size()];
       
        int cont=0;
        for(int valores: Fila)
        {
            numeros[cont++]=valores;
        }
        
        for(int linha=0; linha < Fila.size(); linha++)
          for(int coluna=0; coluna < Fila.size(); coluna++)
            {
                    if(numeros[linha]< numeros[coluna])
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
        
        return numeros[0];
    }
    
     //-------------------
       public int maiorFila(){
        int numeros[]=new int[Fila.size()];
       
        int cont=0;
        for(int valores: Fila)
        {
            numeros[cont++]=valores;
        }
        
        for(int linha=0; linha < Fila.size(); linha++)
          for(int coluna=0; coluna < Fila.size(); coluna++)
            {
                    if(numeros[linha]< numeros[coluna])
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
        
        return numeros[numeros.length-1];//pega na posicao
    }
       
       
       //-------------------
        int total = 0;
        int tamanho;
       
       public int media(){      
       tamanho=Fila.size();
        for(int valores: Fila)
        {
            
            total=total+valores;
        }
        
      return total/tamanho;
    } 
       
       
    
}
