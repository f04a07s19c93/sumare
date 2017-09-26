/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRISTAO
 */
public class Semaforo {
    
        String palavra;
    long tempo;

    public Semaforo(String palavra, long tempo) {
        this.palavra = palavra;
        this.tempo = tempo;
    }

    public void run() {
        try {
           // for (int i = 0; i < 1; i++) {
                System.out.println(palavra);
                Thread.sleep(tempo);
          //  }
        } catch (InterruptedException ex) {
           return ;
        }
    }

    public static void main(String[] args) {
        new PingPong("Verde", 1500).start();
        new PingPong("Amarelo", 2000).start();
         new PingPong("Vermlho", 1000).start();
        System.out.println("Ver Theads");

    }
}

    

