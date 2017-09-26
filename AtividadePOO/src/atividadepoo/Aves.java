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
public class Aves extends Animal implements Alimentacao, Reproducao{
    
    private boolean corpo_coberto_penas;
    private boolean voa;
    
     public boolean getCorpo_coberto_penas(){//pegar
        return corpo_coberto_penas;
        }
       
      public void setcorpo_coberto_penas(boolean corpo_coberto_penasX){//inserir
            this.corpo_coberto_penas= corpo_coberto_penasX;

      }
      //-------------
    public boolean getvoa(){//pegar
        return voa;
        }
       
      public void setvoa(boolean voaX){
            this.voa= voaX;

      }
    
    

    @Override
    public String alimentacao() {
      String alimentacao = "Insetívoro, Herbívoro, Carnívoro";//acrescentei Insetívoro, pois aves comem insetos tbm
      
        return alimentacao;
    }

    @Override
    public String reproducao() {//reparar futuramente
       String reproducao= "Dióicos e Ovíparos.";//dióicos -é quando existe a participação de dois seres de uma determinada espécie, possuindo um deles testículos ( macho) e o outro ovários (fêmea).
                    //ovíparos-  são aqueles cujo embrião se desenvolve dentro de um ovo em ambiente externo sem ligação com o corpo da mãe
        return reproducao;
    }}
        

