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
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author TRISTAO
 */
public class DesafioArquivo {

    
    public static void insereArquivo(Path  p, Charset u, String nome, double saldo,int num) {
        try (BufferedWriter w = Files.newBufferedWriter(p, u);) { // declaração
            //abertura
            w.write(num+" nome: "+nome+" saldo: "+saldo+"\n");//escreve -utilização

            //w.flush();//só vale a pena colocar o flush quando o arquivo eh muito grande. o metodo close automaticamente chama o
            //metodo flush
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
    
    public static void imprimeArquivo(Path path, Charset charset ){
        
        try(BufferedReader reader = Files.newBufferedReader(path,charset)){//parametros:caminho e o padrao de codificação){
           String line = null;
        while((line = reader.readLine()) != null){//vai preencher a line com conteudo do metodo enquanto for diferente de null
                   System.out.println(line);
       }
       }catch( IOException e){
           e.printStackTrace();
       }
    }
    
   

    public static void main(String[] args) {
       
        Path path = Paths.get("C:/Users/TRISTAO/Documents/NetBeansProjects/Arquivo/files/exercicio.txt");
        Charset utf8 = StandardCharsets.UTF_8;
        String nome;
        double saldo;
        int num=1;
         
        nome="filipe augusto";
        saldo=2000;
        
        insereArquivo(path, utf8, nome, saldo,num);
        imprimeArquivo(path, utf8);
        

    }

}
