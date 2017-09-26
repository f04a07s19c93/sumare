/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refinado;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TRISTAO
 */
public class Garbage {
    
    
    public static long carregarMemoria(){
        List<Integer> list = new ArrayList<>();
        
        for( int i=0; i<100_000;i++){
            list.add(i);
        }
        return Runtime.getRuntime().freeMemory();//retorna a quantidade de memoria livre
    }
    
    
    
    public static void main(String[] args) {
        
        Runtime rt = Runtime.getRuntime();
        int mb=1_048_576;//total de bytes em 1Mb
        double total = rt.maxMemory()/mb;//o metodo retorna a quantidade total disponivel para a jvm executar
        
        double inicio = total -(carregarMemoria()/mb);
            System.out.println(total+"Mb");
            System.out.println(inicio+"Mb");
            
            
            rt.runFinalization();//finalizar todos os objs que foram carregados na memoria
            rt.gc();//chamar o metodo que força a execução do garbage collector
            
                    double fim= total -(rt.freeMemory()/mb);
                    
                    System.out.println("Inicio: "+inicio+"\nFinal: "+fim);
    }
            
    
}
