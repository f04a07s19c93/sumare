
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author TRISTAO
 */
public class Teste implements Runnable {
    
    TesteClass pessoa= new TesteClass();

  

    public static void main(String[] args) {  
        
        
        Teste irAsCompras = new Teste();
         new Thread(irAsCompras, "Jorge").start();
        new Thread(irAsCompras, "Moreno").start();
        new Thread(irAsCompras, "Braulio").start();
        new Thread(irAsCompras, "Pedro").start();
        new Thread(irAsCompras, "Filipe").start();
    }
    
    @Override
    public void run() { 
        Random aleatorio = new Random();
        int encherGarrafa=1;
        try {
            String cliente = Thread.currentThread().getName();
            for (int i = 0; i < 20; i++) {
                pessoa.beber(aleatorio.nextInt(80)+50, cliente);

                if (pessoa.getLitros()< 0) {
                    System.out.println("Vinho acabou !");
                   // pessoa.litros=+1000;
                }
            }
        } catch (InterruptedException ex) {
        } 
    }
}

