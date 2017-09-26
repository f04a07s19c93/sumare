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
public class B {
    static int total;
    public void run(){
        for (int i = 0; i < 10; i++) {
            total+=i;
        }
        notify();
    }
    
    public static void main(String[] args) {
        
        
    }
    
}
