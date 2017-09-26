
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRISTAO
 */
public class Arquivo4 {
    
    public static void main(String[] args) throws IOException {
        
        Path path = Paths.get("C:/Users/TRISTAO/Documents/NetBeansProjects/Arquivo/files/exercicio.txt");
        System.out.println(Files.exists(path));//o caminho existe?
        System.out.println(Files.isDirectory(path));//é um diretorio?
        System.out.println(Files.isRegularFile(path));// é um arquivo regular(arquivo de texte,imagem)?
        System.out.println(Files.isReadable(path));//pode ser lido?
        System.out.println(Files.isExecutable(path));//pode ser executado?
        System.out.println(Files.size(path));//tamanho real do arquivo
        System.out.println(Files.getLastModifiedTime(path));//ultima vez que foi modificado
        System.out.println(Files.getOwner(path));//dona do arquivo
        System.out.println(Files.probeContentType(path));//o tipo do arquivo, se imagem, se video e etc...
             
        
        /*EXCLUSAO DE ARQUIVOS*/
        //Files.delete(path);
        //Files.deleteIfExists(path);
        
        
        /*CREATE
        */
       Path path2 =  Paths.get("C:/Users/TRISTAO/Documents/NetBeansProjects/Arquivo/files/exercicio2.txt");
       Files.deleteIfExists(path);
       Files.createFile(path);//cria arquivo em branco
       Files.write(path2,"Seu texto".getBytes());
       
       /*COPIA*/
       
        Path copia =  Paths.get("C:/Users/TRISTAO/Documents/NetBeansProjects/Arquivo/files/copia.txt");
        Files.copy(path2,copia,StandardCopyOption.REPLACE_EXISTING);//substituir caso o arquivo exista
     
        
        /*MOVER*/
        Path mover = Paths.get("C:/Users/TRISTAO/Documents/NetBeansProjects/Arquivo/files/move/copia.txt");
        Files.createDirectories(mover.getParent());
        Files.move(path2,mover,StandardCopyOption.REPLACE_EXISTING);
    }
            
}
