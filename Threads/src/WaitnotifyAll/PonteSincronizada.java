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
public class PonteSincronizada implements Ponte {

    private int valor = -1;
    private boolean ocupada = false;//nao ocupada-false

    @Override
    public synchronized void set(int valor) throws InterruptedException {
        while (ocupada) {
            System.out.println("Ponte cheia. Produtor aguarda.");
            wait();
        }
        System.out.print("Produziu " + valor);
        this.valor = valor;
        ocupada = true;
        notifyAll();
    }

    @Override
    public synchronized int get() throws InterruptedException {
        while(!ocupada){
            System.out.println("Ponte vazia. Consumidor aguarda");
            wait();
        }
        System.err.print("Consumiu " + valor);
        ocupada=false;
        notifyAll();//notificar todas as threads que o status mudou
        return valor;
    }   

}
