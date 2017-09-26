/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecoes;

import java.util.ArrayList;

/**
 *
 * @author TRISTAO
 */
public class Generico<E> {

    E elemento;//elemento generico

    public E getElemento() {
        return elemento;
    }

    public void setElemento(E elemento) {
        this.elemento = elemento;
    }

    public double soma(ArrayList<? extends Number> lista) {
        double total = 0;
        for (Number number : lista) {
            total += number.doubleValue();
        }
        return total;
    }

    public static void main(String[] args) {

        Generico<String> g = new Generico<>();
        g.setElemento("Lago G");
        String s = g.getElemento().toUpperCase();
        System.out.println(s);
        Generico<Integer> i = new Generico<>();
        
        
        
    }

}
