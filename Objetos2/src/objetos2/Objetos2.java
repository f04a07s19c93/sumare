/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos2;


import java.util.*;
import java.lang.*;

/**
 *
 * @author Usuário
 */
public class Objetos2 {

    public static void objs(Collection<Integer> obj,String nome)
    {
        
        long tinicio, tfinal;        

       //long tinicio2= System.nanoTime();
 
         tinicio= System.currentTimeMillis();

         for(int i=0;i< 1000000; i++)
               obj.add(i);            
        
        Iterator<Integer> i= obj.iterator();
        while(i.hasNext())  {
            //System.out.println(i.next());
            i.next();
        }

        
       tfinal= System.currentTimeMillis();
       System.out.println(nome+" Tempo Milisegundos:"+ (tfinal-tinicio) );
        
    }    
    
    public static void objs(Map<Integer, Integer> obj,String nome)
    {
        
        long tinicio, tfinal;        

       //long tinicio2= System.nanoTime();
 
         tinicio= System.currentTimeMillis();

         for(int i=0;i< 1000000; i++)
               obj.put(i,i);            
        
        Set<Integer> chaves = obj.keySet();
        Iterator<Integer> i= chaves.iterator();
        while(i.hasNext())  {
            //System.out.println(i.next());
            i.next();
        }

        
       tfinal= System.currentTimeMillis();
       System.out.println(nome+" Tempo Milisegundos:"+ (tfinal-tinicio) );
        
    }    
    
    public static void main(String[] args) {
                
        
        //LIST - LISTAS
        objs(new ArrayList<Integer>(),"ArrayList");
        objs(new Vector<Integer>(),"Vector");
        objs(new LinkedList<Integer>(),"LinkedList");
        
        
        //Collections Gerais
        objs(new Stack<Integer>(),"Stack");
        objs(new PriorityQueue<Integer>(),"PriorityQueue");
        objs(new ArrayDeque<Integer>(),"ArrayDeque");        
                
        //SET - CONJUNTOS
        objs(new TreeSet<Integer>(),"TreeSet");
        objs(new HashSet<Integer>(),"HashSet");
        objs(new LinkedHashSet<Integer>(),"LinkedHashSet");
        
        
        //MAP - MAPAS
        objs(new HashMap<Integer,Integer>(),"HashMap");
        objs(new LinkedHashMap<Integer,Integer>(),"LinkedHashMap");
        objs(new TreeMap<Integer,Integer>(),"TreeMap");
        objs(new Hashtable<Integer,Integer>(),"Hashtable");
        objs(new IdentityHashMap<Integer,Integer>(),"IdentityHashMap");
        objs(new WeakHashMap<Integer,Integer>(),"WeakHashMap");
                        
    }
}
