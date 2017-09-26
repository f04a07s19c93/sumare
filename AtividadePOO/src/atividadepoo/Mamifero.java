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
public class Mamifero extends Animal implements Alimentacao, Reproducao{
    
   private int porcentagem_pelo; 
   private String locomocao;
    
      public int getporcentagem_pelos(){//pegar
        return porcentagem_pelo;
        }
       
      public void setporcentagem_pelo(int porcentagem_peloX){
            this.porcentagem_pelo= porcentagem_peloX;

        }
           //----------------
       public String getLocomocao(){//pegar
        return locomocao;
        }
       
      public void setLocomocao(String locomocaoX){
            this.locomocao= locomocaoX;

        }
      
      
    

    @Override
    public String alimentacao() {
      String alimentacao = " Carnívoro, Herbívoro,  Omnívoros.  ";
      
        return alimentacao;
    }
    
    
  
    

    @Override
    public String reproducao() {//reparar futuramente
       String reproducao= "Dióicos e Viviparidade.";// embrião se desenvolve dentro do útero materno
   
        return reproducao;
    }
    
    
        
}
