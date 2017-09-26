/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author Filipe
 */
public class Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          Esfera e = new Esfera();
        
        System.out.println("O VOLUME DA ESFERA COM O RAIO DE 4 É "+ e.CalculaVolume(4));
       
        Cubo c = new Cubo();
        
        System.out.println("O VOLUME DE UM CUBO COM LADO 4 É "+c.CalculaVolume(4));
        
    }
    
}
