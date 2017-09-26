
package insercao;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
 
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
 
//import sistema.bin.ClienteBin;
import conexao.Conexao;
import principal.pedidos.Pedido_Class;

//INSERÇÃO
public class Control {
 Pedido_Class venda = new Pedido_Class();
    public static void insereDados(String nome, String endereco, String telefone, String tipo_pag,String hora, String data) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
     Conexao video_aula = new Conexao();
  String retorno = "erro";
  try {
    
   Connection ExConn = (Connection) video_aula.abrirBDConn();
   Statement stmt = (Statement) ExConn.createStatement();
   String sSQL = "INSERT INTO projetopizza.vendas VALUES (null,'"+nome+"','"+endereco+"','"+telefone+"','"+tipo_pag+"','"+hora+"'" +
     ",'"+data+"');";
   System.out.println(sSQL);
  
   boolean res = stmt.execute(sSQL);
    
   JOptionPane.showMessageDialog(null,(!res)?"Dados inseridos com sucesso!!!":"" +
    "Os dados não puderam ser inseridos!!!");
   stmt.close();
   video_aula.fecharBDConn();
  }catch(Exception e){
    JOptionPane.showMessageDialog(null,"Os dados não puderam ser inseridos!!!");
  }
    }
    
    
    
     
    
  
   public static void InsereUsuario(String nome, String login, String senha) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
     Conexao conexaoPizza = new Conexao();
  String retorno = "erro";
     try {
    
   int x = 0;
    x = (int)Math.round (Math.random()*10);
   
    Connection ExConn = (Connection) conexaoPizza.abrirBDConn();
   Statement stmt = (Statement) ExConn.createStatement();
   String sSQL = "INSERT INTO projetopizza.usuario VALUES ("+x+",'"+nome+"','"+login+"','"+senha+"');";
   System.out.println(sSQL);
  
   boolean res = stmt.execute(sSQL);
    
   JOptionPane.showMessageDialog(null,(!res)?"INCLUINDO O USUARIO AO BANCO DE DADOS!!!":"" +
    "Os dados não puderam ser inseridos!!!");
   
   stmt.close();
   conexaoPizza.fecharBDConn();
  
  }catch(Exception e){
    
      JOptionPane.showMessageDialog(null,"Os dados não puderam ser inseridos!!!");
  }

    }

 
    
    }



  /*
 public void ExcluirCliente(int codigo){
  Conexao video_aula = new Conexao();
   
  try {
    
   Connection ExConn = (Connection) video_aula.abrirBDConn();
    Statement stmt = (Statement) ExConn.createStatement();
    String sSQL = "DELETE FROM video_aula.cliente WHERE idCliente = "+codigo+";";
    boolean rs = stmt.execute(sSQL);
    JOptionPane.showMessageDialog(null,(!rs)? "Dados do cliente excluidos com sucesso.":"Dados do cliente não foram excluidos com sucesso.");   
     
    stmt.close();
   video_aula.fecharBDConn();
  }catch(Exception e){
    JOptionPane.showMessageDialog(null,"Os dados não foram encontrado!!!");
  }
 }
  
 public String AtualizarDados(String nome,String email,String endereco,String telefone,String cidade,String estado,
   ClienteBin CliBin){
  Conexao video_aula = new Conexao();
  String retorno = "erro";
  int res;
  try {
    
   Connection ExConn = (Connection) video_aula.abrirBDConn();
   Statement stmt = (Statement) ExConn.createStatement();
              
   res = stmt.executeUpdate("UPDATE video_aula.cliente SET nome = '"+nome+"', endereco = '"+endereco+
     "',estado = '"+estado+"',cidade = '"+cidade+"', telefone = '"+telefone+
     "',email = '"+email+"' WHERE idCliente = "+CliBin.getCodigo());
   
   if(res==1)JOptionPane.showMessageDialog(null,"Os dados  foram atualizados com sucesso!!!");
   stmt.close();
   video_aula.fecharBDConn();
   
  
  }catch(Exception e){
    JOptionPane.showMessageDialog(null,"Os dados não puderam ser atualizados!!!");
  }
  return retorno;
 }*/

