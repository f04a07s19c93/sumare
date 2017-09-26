
import arquivo.Conta;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRISTAO
 */
public class Serializa {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        String [] nomes = {"RICARDO","BEATRIZ","SANDRA"};
        
        Conta conta1 = new Conta("XTI",111_222_333.444);
        Conta conta2 = new Conta("BIR",111_222_333.444);
        
        
        /*ESCRITA DE OBJETO*/
        FileOutputStream fos = new FileOutputStream("C:/Users/TRISTAO/Documents/NetBeansProjects/Arquivo/files/objeto.ser");
        
        ObjectOutputStream oss = new ObjectOutputStream(fos);
        oss.writeObject(conta1);
        oss.writeObject(conta2);
        oss.close();
        
        /*LEITURA DO OBJETO*/
        FileInputStream fis= new FileInputStream("C:/Users/TRISTAO/Documents/NetBeansProjects/Arquivo/files/objeto.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Conta c1 = (Conta) ois.readObject();
        Conta c2 = (Conta) ois.readObject();
        ois.close();
       c1.exibeSaldo();
       c2.exibeSaldo();
    }
            
}
