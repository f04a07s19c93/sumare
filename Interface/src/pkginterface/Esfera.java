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
public class Esfera implements cor, Densidade, Volume {
    private float densidade = (float) 2.5;
    
    public void MostraCor(String Cor){
        
        
        System.out.println("A COR DO CUBO PASSOU A SER "+Cor);
    }

    @Override
    public void MostraDensidade() {
        System.out.println("A DENSIDADE DO CUBO É "+ densidade);
        
    }

    @Override
    public double CalculaVolume(double raio) {
      double volume = (Math.pow(raio,3)*(3.0/4.0)*Math.PI);
    return volume;
    }
    
    
}
