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
public class Insectos extends Animal implements Alimentacao, Reproducao{
    
    int qtd_patas;
    boolean asas;

    
    
     public int getqtd_patas(){
        
        return qtd_patas;
        
    }
    
    public void setqtd_patas(int qtd_patasX){
        
        this.qtd_patas= qtd_patasX;//maioria dos insetos possuem tres pares de patas
                        ///  aracnídeos -Possuem quatro pares de patas (
                            ///ARTRÓPODES possuem cinco pares de patas
        }
    //-------------------
     public boolean getasas(){
        
        return asas;
        
    }
    
    public void setasas(boolean asasX){
        
        this.asas= asasX;
    }
    

    
    @Override
    public String alimentacao() {
      String alimentacao = "Herbívoro, Insetívoro, hematófagas ";
      
        return alimentacao;
        
        
    }

    @Override
    public String reproducao() {
        String reproducao= "Dióicos e Ovíparos";
      
      return reproducao; 
    }
    
    
    
}
