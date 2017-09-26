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
public class Animal {
    
    private int patas;
    private String som;
    private boolean vivo;
    private String saude;
    private char sexo;
    private String nome_do_tipo;
    private String porte;
    
    public int getPatas(){//pegar
        return patas;
        }
       
      public void setPatas(int patasX){
            this.patas= patasX;

        }
        //------
      
        public String getSom(){
        return som;
        }
        public void setSom(String somX){
            this.som= somX;
        }
        //----------
          public boolean getvivo(){
        return vivo;
        }
        public void setVivo(boolean vivoX){
            this.vivo= vivoX;
        }
        //-----------
         public String getSaude(){
        return saude;
        }
        public void setSaude(String saudeX){
            this.saude= saudeX;
        }
        //------------
        public char getSexo(){
           
            
            return sexo;      
       }
        public void setSexo(char sexoX){           
           this.sexo=sexoX;
        }
        //---------------
        public String getNome_do_tipo(){
        return nome_do_tipo;
        }
        public void setNome_do_tipo(String Nome_do_tipoX){
            this.nome_do_tipo= Nome_do_tipoX;
        }
        //----------
          public String getPorte(){
        return porte;
        }
        public void setPorte(String porteX){
            this.porte= porteX;
        }       
}


