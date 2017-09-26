/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author TRISTAO
 */
public class ConexaoBanco {
    
     static Connection conexao; 
    
 public static void conecta() {//metodo para conectar
        String driver = "com.mysql.jdbc.Driver";//
        String url = "jdbc:mysql://localhost:3306/cadastro";//caminho do banco
        String login = "root";
        String senha = "";
        
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,login,senha);//GERENCIADOR DO DRIVE SOLICITA A CONEXAO NOS PARAMETROS  
            System.out.println("conexao bem sucedida");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e); e.printStackTrace();
        }
        
    }
 
   public static void executa(String sql)throws Exception{//vai executar o comando sql
        
        Statement at = null;
        at = conexao.createStatement();
        at.executeUpdate(sql);
    }
   
    public static void desconecta()throws Exception{
        conexao.close();
        }
    
     public static void cadastroCliente(String nome, String endereco, String email,String sexo,String telefone, String idade) throws Exception{
        conecta();
        executa("INSERT INTO  cliente VALUES ( '"+nome+"','"+endereco+"','"+email+"','"+sexo+"','"+telefone+"','"+idade
               +"');");
          desconecta();
      }
   
     
     
    
}
