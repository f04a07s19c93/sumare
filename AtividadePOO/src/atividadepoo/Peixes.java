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
public class Peixes extends Animal implements Alimentacao, Reproducao{
    
    private boolean corpo_escamas;
    
    
    public boolean getCorpo_escamas(){
        
        return corpo_escamas;
        
    }
    
    public void setCorpo_escamas(boolean corpo_escamasX){
        
        this.corpo_escamas= corpo_escamasX;
    }
//-----------------------------
    
    
    @Override
    public String alimentacao() {
       String alimentacao = "Herbívoro, Carnívoro e Insetívoro";
       
        return alimentacao;
    }

    @Override
    public String reproducao() {
      String reproducao= "Dióicos, monóicos e Ovíparos";
      
     return reproducao;
    }
    
    
}
