/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemas;

import java.io.Console;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 *
 * @author TRISTAO
 */
public class Sistemas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Properties p = System.getProperties();
        System.out.println(p.getProperty("java.version"));
        
        /*
        Set<Object> pk = p.keySet();
        
        for(Object key: pk){
            
            System.out.println(key+" = "+ p.get(key));
        }*/
        
       /* Console c= System.console();
        System.out.println("Digite o login:");
       String user = c.readLine();
        System.out.println("Digite a senha");
       char[] pass = c.readPassword();
        System.out.println("Usuario:"+user+"\nSenha: "+pass);*/
    Runtime.getRuntime().exec("notepad");
    }
    
    
}
