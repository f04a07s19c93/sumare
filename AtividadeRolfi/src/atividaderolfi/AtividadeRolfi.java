/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividaderolfi;

import static java.awt.image.ImageObserver.ERROR;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.WeakHashMap;

/**
 *
 * @author TRISTAO
 */
public class AtividadeRolfi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Tela tela = new Tela();
        tela.setVisible(true);
      
    /*  System.out.println("\nArrayList:");
       Colecoes l1= new  Colecoes(new ArrayList<>());
        l1.inserir(10);
        l1.inserir(3);
        l1.inserir(-7);
        l1.inserir(0);      
        l1.ordenar();
        System.out.print("Ordenado: ");
        l1.imprimir(new ArrayList<>());
        
        System.out.println("\nVector:");
        Colecoes l2= new  Colecoes(new Vector<>());
        l2.inserir(10);
        l2.inserir(20);
        l2.inserir(-17);
        l2.inserir(10);
         l2.ordenar();
        System.out.print("Ordenado: ");
        l2.imprimir(new Vector<>());
              
        
       
        
        System.out.println("\nLinkedList:");
        Colecoes l3= new  Colecoes(new LinkedList<>());
        l3.inserir(5);
        l3.inserir(2);
        l3.inserir(-6);
        l3.inserir(10);  
        l3.ordenar();
        System.out.print("Ordenado: ");
        l3.imprimir(new LinkedList<>());
        
        System.out.println("\nStack:");
        Colecoes l4=new  Colecoes(new Stack<Integer>());
        l4.inserir(5);
        l4.inserir(2);
        l4.inserir(-6);
        l4.inserir(10); 
        l4.ordenar();
        System.out.print("Ordenado: ");
        l4.imprimir(new Stack<Integer>());
        
        System.out.println("\nPriorityQueue:");
        Colecoes l5= new  Colecoes(new PriorityQueue<>());
        l5.inserir(50);
        l5.inserir(20);
        l5.inserir(-60);
        l5.inserir(100);  
        l5.ordenar();
        System.out.print("Ordenado: ");
        l5.imprimir(new PriorityQueue<>());
        
        System.out.println("\nArrayDeque:");
        Colecoes l6= new  Colecoes(new ArrayDeque <>());
        l6.inserir(-5);
        l6.inserir(12);
        l6.inserir(62);
        l6.inserir(-1);       
        l6.ordenar();
        System.out.print("Ordenado: ");
        l6.imprimir(new ArrayDeque <>());
        
        System.out.println("\nHashSet:");
         Colecoes l7= new  Colecoes(new HashSet <>());
        l7.inserir(15);
        l7.inserir(22);
        l7.inserir(12);
        l7.inserir(-15); 
        System.out.print("--Ordenado: ");
        l7.ordenar2();
     
        
        
        System.out.println("\nTreeSet:");
        Colecoes l8= new  Colecoes(new TreeSet <>());   
        l8.inserir(3);
        l8.inserir(12);
        l8.inserir(9);
        l8.inserir(89);     
        l8.ordenar();
        System.out.print("Ordenado: ");
        l8.imprimir(new TreeSet <>());
        
        
        System.out.println("\nLinkedHashSet:");
        Colecoes l9= new  Colecoes(new LinkedHashSet <>());   
        l9.inserir(7);
        l9.inserir(2);
        l9.inserir(3);
        l9.inserir(55);        
        l9.ordenar();
        System.out.print("Ordenado: ");
        l9.imprimir(new LinkedHashSet <>());
        
     
        //---------------------------------------------
        System.out.println("\nHashMap: ");
        Colecoes l10= new  Colecoes(new HashMap <>());   
       l10.inserirMap(0,40);
       l10.inserirMap(1,20);
       l10.inserirMap(2,10);
       l10.inserirMap(3,-10);        
       l10.ordenarMap();
       System.out.print("Ordenado: ");
       l10.imprimirMap(new HashMap <>());

       
        System.out.println("\nLinkedHashMap: ");
       Colecoes l12= new  Colecoes(new LinkedHashMap <>());   
       l12.inserirMap(0,5);
       l12.inserirMap(1,2);
       l12.inserirMap(2,3);
       l12.inserirMap(3,2); 
       l12.inserirMap(4,-5);      
       
       l12.ordenarMap();
       System.out.print("Ordenado: ");
       l12.imprimirMap(new LinkedHashMap <>());
       
        System.out.println("\nTreeMap: ");
        Colecoes l13= new  Colecoes(new TreeMap <>());   
        l13.inserirMap(0,5);
        l13.inserirMap(1,-22);
        l13.inserirMap(2,50);
        l13.inserirMap(3,-7); 
        l13.ordenarMap();
        System.out.print("Ordenado: ");
       l13.imprimirMap(new TreeMap <>());
       
      
        System.out.println("\nnao foi ---IdentityHashMap:");               
       Colecoes l14= new  Colecoes(new IdentityHashMap <>());   
       l14.inserirMap(0,5);
       l14.inserirMap(1,2);
       l14.inserirMap(2,3);
       l14.inserirMap(3,75);
         l14.ordenarMap();
        System.out.print("Ordenado: ");
       l14.imprimirMap(new IdentityHashMap <>());
        
       
        Colecoes l15= new  Colecoes(new WeakHashMap <Integer,Integer>());
        System.out.println("\n ORDEM DECRESCENTE--WeakHashMap: ");
        l15.inserirMap(0,8);
       l15.inserirMap(1,9);
       l15.inserirMap(2,-10);
       l15.inserirMap(3,-7); 
         l15.ordenarMap();
        System.out.print("Ordenado: ");
       l15.imprimirMap(new WeakHashMap <Integer,Integer>());
       
       Colecoes l16= new  Colecoes(new  Hashtable <Integer,Integer>());
        System.out.println("\nORDEM DECRESCENTE -Hashtable: ");
       l16.inserirMap(0,8);
       l16.inserirMap(1,-9);
       l16.inserirMap(2,1);
       l16.inserirMap(3,7);
       l16.inserirMap(4,-70); 
          l16.ordenarMap();
        System.out.print("Ordenado: ");
       l16.imprimirMap(new  Hashtable <Integer,Integer>());
        
   
      
      
          */
          
          
    }
    
}
