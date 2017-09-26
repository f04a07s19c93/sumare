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
public class Reptil extends Animal implements Alimentacao, Reproducao{
    
   private boolean corp_escamas;
    private boolean carapaca_com_placas;
    
    
    public boolean getEscamas(){//pegar
        return corp_escamas;
        }
       
      public void setEscamas(boolean escamasX){//inserir
            this.corp_escamas= escamasX;

      }
      //-------------
    public boolean getcarapaca_com_placas(){//pegar
        return carapaca_com_placas;
        }
       
      public void setcarapaca_com_placas(boolean carapaca_com_placasX){
            this.carapaca_com_placas= carapaca_com_placasX;

      }
   

    @Override
    public String alimentacao() {
        String alimentacao = "Carnívoro, Insetívoro, Herbívoro";//acrescentei Insetívoro, pois alguns repteis comem insetos tbm
    
        return alimentacao;
    
    }

    @Override
    public String reproducao() {
          String reproducao= "Dióicos e Ovíparos.";
      
      return reproducao;
    }
    
    
}
