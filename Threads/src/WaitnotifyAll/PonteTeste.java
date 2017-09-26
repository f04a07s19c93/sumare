/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WaitnotifyAll;

/**
 *
 * @author TRISTAO
 */
public class PonteTeste {
    
    
    public static void main(String[] args) {
        Ponte ponte =new PonteSincronizada();
        System.out.println("\t un \t"+"total");
        new Thread( new Produtor(ponte)).start();
         new Thread( new Consumidor(ponte)).start();
    }
}
