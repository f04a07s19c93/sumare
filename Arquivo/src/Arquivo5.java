
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javafx.stage.DirectoryChooser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRISTAO
 */
public class Arquivo5 {
    public static void main(String[] args) throws IOException {
        
        
        
        Iterable<Path> dirs =  FileSystems.getDefault().getRootDirectories();//recuperar diretorio raiz
       
        for(Path path : dirs){
            System.out.println(path);
        }
        
        /*LISTAR UM CONTEÚDO DE UM DIRETORIO*/
        Path dir = Paths.get("C:/Users/TRISTAO/Documents/NetBeansProjects/Arquivo");
       try( DirectoryStream<Path> stream = Files.newDirectoryStream(dir)){
           
            for(Path path : stream){
            System.out.println(path.getFileName());
        }
           
       }catch(IOException | DirectoryIteratorException e ){
           e.printStackTrace();
       }
    
    /*PARTIÇÕES DO COMPUTADOR*/
    
    FileSystem fs = FileSystems.getDefault();
    
        for(FileStore store : fs.getFileStores()){
 
            System.out.println("Unidade:"+store.toString());//
            System.out.println("Total:"+store.getTotalSpace());
            System.out.println("total disponível:"+store.getUsableSpace());
            System.out.println("Utilizada: "+(store.getTotalSpace()-store.getUsableSpace()));
        }
}
}
