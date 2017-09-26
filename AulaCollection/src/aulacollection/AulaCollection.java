/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulacollection;

import java.util.Collection;
import java.util.ArrayList;
import java.util.*;
/**
 *
 * @author rolfi.gomes
 */
public class AulaCollection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Integer> al
                =new LinkedList<Integer>();
        /*
        long tempoi, tempof;
        tempoi = System.currentTimeMillis();
        
        String x=
                this.txtA.getText();
        String valor[]=x.split(",");
        
        for(int i=0; i< valor.length; i++)
            al.add(valor[i]);
        
        this.txtA.setText(
             this.txtA.getText()+
             "LinkedList" + (tf-ti)
        );*/
        
        al.add(10);
        al.add(7);
        al.add(9);
        al.add(-5);
        al.add(0);
        
        Collections.sort(al);
        
       // tempof = System.currentTimeMillis();
        
       // System.out.println("LinkedList" + (tempof-tempoi) );
        //9,10
        al.remove(0);
        al.remove(new Integer(0));
        al.remove(al.indexOf(7));
        
        if(al.contains(new Integer(10))==true )
        {
            System.out.println("Existe !");
        }
        else
        {  
            System.out.println("Não Existe !");
        }
        
        System.out.println(
           al.toString() );
        
        
        //OBJETO CRIADO
        
        Colecao_Link lista=new Colecao_Link();
        lista.inserir(10);
        lista.inserir(3);
        lista.inserir(-7);
        lista.inserir(0);
        lista.remover(0);
        lista.ordenar();
        lista.imprimir();
        
        //OBJETO GERAL
       
        Colecao_Geral lista2=
       new Colecao_Geral
       (new ArrayList<Integer>());
        lista2.inserir(10);
        lista2.inserir(3);
        lista2.inserir(-7);
        lista2.inserir(0);
        lista2.remover(0);
        lista2.ordenar();
        lista2.imprimir();
        
         Colecao_Geral lista3=
       new Colecao_Geral
       (new Vector<Integer>());
         
         
          Colecao_Geral lista4=
       new Colecao_Geral
       (new HashSet<Integer>());
          
           Colecao_Geral lista5=
       new Colecao_Geral
       (new LinkedList<Integer>());
           
           Colecao_Geral_Map m1=
       new Colecao_Geral_Map
     (new TreeMap<Integer, Integer>());
       //inicial
           //Adicionar os dados da TEXTAREA
       //tempo final
  //MOSTRA - O TEMPO  FINAL-INICIAL, TREEMAP
        
        
    }
    
}
