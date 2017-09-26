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
public class Arquivo2 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:/Users/TRISTAO/Documents/NetBeansProjects/Arquivo/files/texto.txt");
        Charset utf8 = StandardCharsets.UTF_8;
       
        
        /*ESCRITA */ 
        try(BufferedWriter  w =   Files.newBufferedWriter(path, utf8);){ // declaração
       //abertura
        w.write(" outro Texto\n");//escreve -utilização
        w.write("outro Texto\n");//escreve -utilização
        w.write("outro Texto\n");//escreve -utilização
        //w.flush();//só vale a pena colocar o flush quando o arquivo eh muito grande. o metodo close automaticamente chama o
        //metodo flush
      
      }catch(IOException e){
          e.printStackTrace();
      }
        /*LEITURA*/
       try(BufferedReader reader = Files.newBufferedReader(path,utf8)){//parametros:caminho e o padrao de codificação){
           String line = null;
        while((line = reader.readLine()) != null){//vai preencher a line com conteudo do metodo enquanto for diferente de null
                   System.out.println(line);
       }
       }catch( IOException e){
           e.printStackTrace();
       }
        
        
        }
    }
    

