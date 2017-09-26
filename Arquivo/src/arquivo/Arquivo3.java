/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import static java.nio.file.Files.write;
import static java.nio.file.Files.write;
import static java.nio.file.Files.write;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;





public class Arquivo3 { 
   public static Path path = Paths.get("C:/Users/TRISTAO/Documents/NetBeansProjects/Arquivo/files/exercicio.txt");
   public static Charset utf8 = StandardCharsets.UTF_8;  
    
   public static void armazenarContas(ArrayList<Conta> contas) throws IOException { 
            
         try(BufferedWriter writer  = Files.newBufferedWriter(path, utf8)){
             
             for (Conta conta : contas){
                 writer.write(conta.getCliente()+";"+conta.getSaldo()+"\n");
             }       
         }catch(Exception e){}
    }
   
   
   public ArrayList<Conta> recuperarContas() throws IOException{
    ArrayList<Conta> contas = new   ArrayList<>();
       try(BufferedReader reader = Files.newBufferedReader(path,utf8)){
         String line = null;
           while((line = reader.readLine())!=null){
              String[] t = line.split(";");
              // System.out.println(t[0]+t[1]);
               Conta conta = new Conta(t[0],Double.parseDouble(t[1]));
               contas.add(conta);
          }
       }
       
        return contas;
    }
    
    
    public static void main(String[] args) throws IOException {
        
         // Path path = Paths.get("C:/Users/TRISTAO/Documents/NetBeansProjects/Arquivo/files/exercicio.txt");
        //  Charset utf8 = StandardCharsets.UTF_8;
        
        ArrayList<Conta> contas = new ArrayList<>();
        contas.add(new Conta("Filipe A",200000));
        contas.add(new Conta("Augusto",10000));
        contas.add(new Conta("Pedro",50000));
        contas.add(new Conta("Monica",500));
        contas.add(new Conta("Lurdes",2000));
        /*for(int i=0;i <5;i++){
        //System.out.println(contas.toArray());
       
    }*/
        
       Arquivo3 operacao = new Arquivo3();
       operacao.armazenarContas(contas);
       operacao.recuperarContas();
       
      ArrayList<Conta> contas2 =  operacao.recuperarContas();
      for(Conta conta : contas2){
          conta.exibeSaldo();
      }
}
}