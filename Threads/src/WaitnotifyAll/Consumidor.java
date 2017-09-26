package WaitnotifyAll;


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
public class Consumidor implements Runnable {

    private Ponte ponte;

    public Consumidor(Ponte ponte) {
        this.ponte = ponte;
    }

    private Random random = new Random();

    @Override
    public void run() {
        int total = 0;
       
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(random.nextInt(3000));
               
                total +=ponte.get();
             System.err.println("\t" + total);
            } catch (InterruptedException ex) {  }

        }
    }
}
