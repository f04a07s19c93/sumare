/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividaderolfi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.JOptionPane;

/**
 *
 * @author TRISTAO
 */
public class Colecoes {

    Collection<Integer> c1;

    Colecoes(Collection<Integer> objColecao) {
        c1 = objColecao;
    }
    Map<Integer, Integer> c2;

    Colecoes(Map<Integer, Integer> objColecaoMap) {
        c2 = objColecaoMap;
    }

    public void inserirMap(int index,
            int valor) {
        c2.put(index, valor);
    }
    

    public void inserir(Integer obj) {
        c1.add(obj);
    }
    
    

    public String ordenar_e_tempo(Collection<Integer> obj,String nome,int tamanho) {
        
        int tempoInicio, tempoFinal;
        tempoInicio = (int) System.currentTimeMillis();

        for (int ii = 0; ii < 10000*tamanho; ii++) {//
            obj.add(ii);
        }

        Iterator<Integer> i = obj.iterator();
        while (i.hasNext()) {
            i.next();
        }

        tempoFinal = (int) System.currentTimeMillis();
      // System.out.println(" Tempo em Milisegundos:" + (tempoFinal - tempoInicio));
        String tempo = nome+": Tempo em Milisegundos: " + (tempoFinal - tempoInicio);
//----------------------------------------------
        // Collections.sort((List<Integer>) c1);
        int n[] = new int[c1.size()];

        int cont = 0;
        //recebe os valores e passa para um vetor
        for (int valores : c1) {
            n[cont++] = valores;
        }

        //loop onde ocorre o ordenação
        for (int y = 0; y < c1.size(); y++) {
            for (int c = y + 1; c < c1.size(); c++) {
                if (n[y] > n[c]) {
                    int aux = n[y];
                    n[y] = n[c];
                    n[c] = aux;
                }
            }
        }
        //limpa a colecao
        c1.clear();
        //add os valores ordenador para a colecao
        for (int valores : n) {
            c1.add(valores);
        }

        //tempo da ordenação
        return tempo;
    }

    public String ordenar_e_tempoMap(Map<Integer, Integer> obj,String nome,int tamanho) {

       
        long tempoInicio, tempoFinal;

        tempoInicio = System.currentTimeMillis();

        for (int i = 0; i < 10000*tamanho; i++) {
            obj.put(i, i);
        }

        Set<Integer> chaves = obj.keySet();
        Iterator<Integer> i = chaves.iterator();
        while (i.hasNext()) {

            i.next();
        }

        tempoFinal = System.currentTimeMillis();
      // System.out.println(" Tempo em Milisegundos:" + (tempoFinal - tempoInicio));
        String tempo = nome+": Tempo em Milisegundos: " + (tempoFinal - tempoInicio);

        //---------------------------------------
        //converter map para lista
        ArrayList<Integer> ajuda = new ArrayList<>(c2.values());
        int n[] = new int[c2.size()];
        int cont = 0;
        //recebe os valores e passa para um vetor
        for (int valores : ajuda) {
            n[cont++] = valores;
        }

        //loop onde ocorre a ordenação
        for (int oo = 0; oo < c2.size(); oo++) {
            for (int c = oo + 1; c < c2.size(); c++) {
                if (n[oo] > n[c]) {
                    int aux = n[oo];
                    n[oo] = n[c];
                    n[c] = aux;
                }
            }
        }

        //limpa a colecao
        c2.clear();

        //add os valores ordenados para a colecao
        int cont2 = 0;
        ajuda.clear();
        int auxcont = 0;
        for (int valores : n) {
            auxcont = cont2++;
            // JOptionPane.showMessageDialog(null,n[cont2++]);
            ajuda.add(valores);
            c2.put(auxcont, ajuda.get(auxcont));

        }
return tempo;
    }

    public String ordenar_e_tempo2(Collection<Integer> obj,String nome,int tamanho) {
          int tempoInicio, tempoFinal;
        tempoInicio = (int) System.currentTimeMillis();

        for (int ii = 0; ii < 10000*tamanho; ii++) {
            obj.add(ii);
        }

        Iterator<Integer> i = obj.iterator();
        while (i.hasNext()) {
            i.next();
        }

        tempoFinal = (int) System.currentTimeMillis();
       // System.out.println(" Tempo em Milisegundos:" + (tempoFinal - tempoInicio));
        String tempo = nome+": Tempo em Milisegundos: " + (tempoFinal - tempoInicio);
        
        
        TreeSet o = new TreeSet();
        o.addAll(c1);
        System.out.println(o);
        return tempo;

    }

}
