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
public class Cubo implements Densidade, Volume, cor {
    private float densidade=(float) 2.3;
    
    @Override
    public void MostraDensidade(){
        
        System.out.println("A densidade do cubo é "+densidade);
    }

    @Override
    public double CalculaVolume(double lado) {
       return Math.pow(lado,3);
    }

    @Override
    public void MostraCor(String cor) {
       System.out.print("A cor do cubo  passou  a ser "+cor);
    }
    
    
    
}
