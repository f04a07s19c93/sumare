/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareacademia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author TRISTAO
 */
public class Conexao_BD {
    
    
      static Connection conexao; 
    
 public static void conecta() {//metodo para conectar
        String driver = "com.mysql.jdbc.Driver";//
        String url = "jdbc:mysql://localhost:3306/academia";//caminho do banco
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
    
    public static void cadastroCliente(String nome, String nasc,String cpf ,String cep, String sexo ,String email,
            String telefone, String estado,String rua, String profissao, int pacote,String data_inicio,String data_final,
            String numero_rua) throws Exception{
        conecta();
        executa("INSERT INTO  usuario VALUES ( default,'"+nome+"','"+nasc+"','"+cpf+"','"+cep+"','"+sexo+"','"+email
                +"','"+telefone+"','"+estado+"','"+rua+"','"+profissao+"','"+pacote+"','"+data_inicio
                +"','"+data_final+"','"+numero_rua+"');");
          desconecta();
      } 
}
