
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
public class PingPong extends Thread {

    String palavra;
    long tempo;

    public PingPong(String palavra, long tempo) {
        this.palavra = palavra;
        this.tempo = tempo;
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(palavra);
                Thread.sleep(tempo);
            }
        } catch (InterruptedException ex) {
           return ;
        }
    }

    public static void main(String[] args) {
        new PingPong("Ping", 1500).start();
        new PingPong("Pong", 3500).start();
        System.out.println("Ver Theads");

    }
}
