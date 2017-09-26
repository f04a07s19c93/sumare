/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Serializa2 {

    public static void armazenarContas(ArrayList<Conta> contas) throws IOException {

        try (FileOutputStream fos = new FileOutputStream("C:/Users/TRISTAO/Documents/NetBeansProjects/Arquivo/files/contas.ser")) {
            try (ObjectOutputStream oss = new ObjectOutputStream(fos)) {
                oss.writeObject(contas);
            }
        }
    }

    public ArrayList<Conta> recuperarContas() throws IOException, ClassNotFoundException {
        try (FileInputStream fis = new FileInputStream("C:/Users/TRISTAO/Documents/NetBeansProjects/Arquivo/files/contas.ser")) {
            try (ObjectInputStream ois = new ObjectInputStream(fis)) {
               return (ArrayList<Conta>) ois.readObject();                
            }
        }

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Path path = Paths.get("C:/Users/TRISTAO/Documents/NetBeansProjects/Arquivo/files/exercicio.txt");
        //  Charset utf8 = StandardCharsets.UTF_8;
        ArrayList<Conta> contas = new ArrayList<>();
        contas.add(new Conta("Filipe A", 200000));
        contas.add(new Conta("Augusto", 10000));
        contas.add(new Conta("Pedro", 50000));
        contas.add(new Conta("Monica", 500));
        contas.add(new Conta("Lurdes", 2000));

        Serializa2 operacao = new Serializa2();
        operacao.armazenarContas(contas);
        operacao.recuperarContas();

        ArrayList<Conta> contas2 = operacao.recuperarContas();
        for (Conta conta : contas2) {
            conta.exibeSaldo();
        }
    }
}
