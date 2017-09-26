
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
public class PingPongRunnable implements Runnable {

    String palavra;
    long tempo;

    public PingPongRunnable(String palavra, long tempo) {
        this.palavra = palavra;
        this.tempo = tempo;
    }

    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                System.out.println(palavra);
                Thread.sleep(tempo);
            }
        } catch (InterruptedException ex) {
           return ;
        }
    }

    public static void main(String[] args) {
        Runnable ping = new PingPongRunnable("Ping", 1500);
        Runnable pong = new PingPongRunnable("Pong", 2000);
        
        
        new Thread(ping,"ping").start();
        new Thread(pong,"pong").start();
        
        System.out.println("Ver threads");
    }
}

