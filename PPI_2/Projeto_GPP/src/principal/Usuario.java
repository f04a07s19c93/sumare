/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import insercao.BD_tratamentos;
import insercao.Control;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Filipe
 */
public class Usuario {



  //NAO USEI A CLASSE AINDA;
   String nome ;
   String login;
   String senha;
  static   String usuario;

   
   public  void buscaNome(String login) throws SQLException {
  String nomerecebe = BD_tratamentos.recebeNome(login);
   usuario= nomerecebe;
    }
   
   public String danome() {
   return usuario;
    }
    
  /* private void cadastroBanco(String nome, String login,String senha){
        
           Control.InsereUsuario(nome, login, senha);
        
        
    }*/
   
 
    
  
    
    
}
