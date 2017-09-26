/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexemplo;

/**
 *
 * @author TRISTAO
 */
public class JavaExemplo implements Runnable {

    static int total;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            total += i;
        }
    }

    
    public static void main(String[] args) throws InterruptedException {
        
        Thread t = new Thread(new JavaExemplo());
        t.start();
        System.out.println("Total é igual a :" + total);

    }

}
