/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package javaapplication1;

import static java.lang.Integer.max;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lista {

    ArrayList<Integer> l1 = new ArrayList<Integer>();

    public void insereList(int n){
        l1.add(n);
    }
    public String imprimeList(){
        return l1.toString();
    }
   
    public int menorList(){
        l1.sort(null);
        return l1.get(0);
    }
    public int maiorList(){
        l1.sort(null);
        return l1.get(l1.size()-1);
    }
    
     public float media(){             
       float total =0;
        int tamanho=l1.size();
        for(int valores: l1)
        {
            total=total+valores;
        }
      return total/tamanho;
  }
    
 
   
    
}
