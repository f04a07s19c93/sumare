/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author TRISTAO
 */
public class Arquivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       //apartir do java  7
        Path path = Paths.get("C:\\Users\\TRISTAO\\Documents\\NetBeansProjects\\Arquivo\\files/texto.txt");
        System.out.println(path.toAbsolutePath());//caminho absoluto
        System.out.println(path.getParent());//caminho do pai
        System.out.println(path.getRoot());//raiz
        System.out.println(path.getFileName());//nome do arquivo
        
        /*
       CRIAÇÃO DE DIRETÓRIOS
        */
        Files.createDirectories(path.getParent());
        
        /*ESCREVER E LER ARQUIVOS*/
        byte[] bytes = "Meu texto".getBytes();
        Files.write(path, bytes);//paramentros:caminho e os bytes
        //metodo write: cria o arquivo caso ele nao exista, abre esse arquivo, escreve dentro desse arquivo e fecha o arquivo
        
       byte [] retorno =  Files.readAllBytes(path);//metodo readallbytes retorna um conjunto de bytes
        System.out.println(new String(retorno));
    }
    
}
