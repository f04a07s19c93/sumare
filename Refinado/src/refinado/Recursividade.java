/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refinado;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.DirectoryChooser;

/**
 *
 * @author TRISTAO
 */
public class Recursividade {
    
    public static int soma(int x){
       
        if(x==0){
        return 0;    
        }else{
            System.out.println(x);
            return x+soma(x-1);
        }
        
    }
    
    
    public static void listar(Path path){
        if(Files.isRegularFile(path)){
            System.out.println(path.toAbsolutePath());
        }else{
            System.err.println(path.toAbsolutePath());
            try {
                DirectoryStream<Path> strem = Files.newDirectoryStream(path);
                
                for(Path p : strem){
                    listar(p);
                   // System.out.println(p.toAbsolutePath());
                }
                
            }catch (IOException ex) {}
        }
        
        
    }
    public static int potencia(int x, int e){
        if(e==1){
         return x;   
        }else{
            return x* potencia(x,e-1);
        }
        
    }
    
    public static void main(String[] args) {
        System.out.println(soma(10));
        System.out.println("------------------");
        System.out.println(potencia(3,4));
    
        listar(Paths.get("C:/xti/"));
        
    }
    
}
