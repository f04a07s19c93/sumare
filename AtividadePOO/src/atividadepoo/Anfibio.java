/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadepoo;

/**
 *
 * @author Filipe
 */
public class Anfibio extends Animal implements Reproducao, Alimentacao {
    
    boolean pele_nua;//pecilotérmicos - sangue frio
    
    
      public boolean getpele_nua(){
        
        return pele_nua;
        
    }
    
    public void setpele_nua(boolean pele_nuaX){
        
        this.pele_nua= pele_nuaX;
    }
    
    
    
    

    @Override
    public String reproducao() {
      
      String reproducao= "Dióicos e Ovíparos.";
     
      return reproducao; 
    }

    @Override
    public String alimentacao() {
      String alimentacao = "Insetívoro";
       
        return alimentacao;
    }
    
    
    
    
    
}
