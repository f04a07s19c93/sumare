/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insercao;

import com.sun.glass.ui.Cursor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

import principal.Inicio;
import principal.Menuinicio;

/**
 *
 * @author Filipe
 */
public class BD_tratamentos {
  
     static Connection conexao;
     private String nome;//aux alguns metodos
     private String endereco;

  public static String recebeNome(String login) throws SQLException, SQLException, SQLException {
    
          String nome ="";
        Statement at;//Statement é uma interface utilizada para executar instruções SQL.
        at = conexao.createStatement();
        ResultSet rs = at.executeQuery("SELECT nm_usuario FROM USUARIO WHERE login  ='"+login+"'");
        while(rs.next()){            
            nome =rs.getString(1);
        }
        return nome;

    }

     
      public static void insere(String nome, String usuario, String senha) throws Exception {
       conecta();
     
       executa("INSERT INTO  usuario VALUES (default,'"+nome+"','"+usuario+"','"+senha+"')");
       desconecta();
     }
               
      public static void cadastroCliente(String nome, String endereco, String bairro,String cep,String telefone, String celular,String obs) throws Exception{
        conecta();
        executa("INSERT INTO  clientes VALUES (default,'"+nome+"','"+endereco+"','"+bairro+"','"+cep+"','"+telefone+"','"+celular
               +"','"+obs+"')");
          desconecta();
      }
           
     
      
      public static void recebeVenda(String id_usuario, String data,String hora ,double total, String obs) throws Exception{
     
          conecta();
          try{
   //insert into c_venda values (default,1,1,'04/07/2016','20:13:22',1,20.0,0.0,20.0,'cliente intolerante a lactose');
             //executa("INSERT INTO c_venda values (default,1,1,'"+data+"','"+hora+"',1 ,20.0, 0.0,20,'cliente intolerante a lactose')");
               executa("INSERT INTO c_venda values (default,"+id_usuario+","+1+",'"+data+"','"+hora+"',1 ,"+total+","+0.0+","+total+",'"+obs+"')");
   //executa("INSERT INTO  c_venda VALUES (default,"+Integer.parseInt(id_usuario)+","+1+",'"+data+"','"+hora+"',1 ,"+total+","+0.0+","+total+",'"+obs+"')");
  
           }catch(Exception e){
    JOptionPane.showMessageDialog(null,"Os dados não puderam ser inseridos!!!");
           }
   desconecta();
      }
      
      public static void produtoVendido(String id_venda, String id_produto,String tamanho,String quant, String valor) throws Exception{
          conecta();
          
            try{
  
         // executa("INSERT INTO d_venda values ("+id_venda+","+1+",'"+tamanho+"',"+quant+","+valor+"')");
  executa("INSERT INTO d_venda values (default,"+id_produto+" ,"+quant+" ,"+valor+",'"+tamanho+"')");
           }catch(Exception e){
    JOptionPane.showMessageDialog(null,"Os dados não puderam ser inseridos!!! erro "+e);
           }
               
          desconecta();
      }
       
   /*  public static void produtoVendido(int codVenda, int codProduto,String tmnho,String quant,String valor) throws Exception{
            
            conecta();
   executa("INSERT INTO  d_vendas VALUES ('"+codVenda+"','"+codProduto+"','"+tmnho+"','"+quant+"','"+valor+"')");
            desconecta();
        }*/
                 
      public static void deleteusuario(String login) throws Exception {//exemplo
        conecta();
        executa("DELETE FROM usuario WHERE login = '"+login+"'");
        JOptionPane.showMessageDialog(null, "USUARIO DELETADO COM SUCESSO");
       desconecta();
      }
      
      public static void alteraSenha (String login, String senha,String novaSenha) throws Exception {//exemplo
        conecta();
        //update Aluno set Nome='Guilherme Birckan' where ID=1; 
        executa("UPDATE usuario set senha ='"+novaSenha+"' where login = '"+login+"' and senha = '"+senha+"'");
        JOptionPane.showMessageDialog(null, "<html><h2>SENHA ALTERADA COM SUCESSO");
       desconecta();
      }
      //para o pedido   
      public static boolean confirmaLogin(String login, String senha)throws Exception{//verificar se o usuario existe
        boolean retornoconfirma = false;
        Statement at;//Statement é uma interface utilizada para executar instruções SQL.
        at = conexao.createStatement();
        ResultSet rs = at.executeQuery("SELECT login,senha FROM USUARIO WHERE id_usuario  =1");
        while(rs.next()){            
            retornoconfirma =(rs.getString(1).equals(login) && rs.getString(2).equals(senha));
        }
        return retornoconfirma;
    }
       
      public static String consultarNome(String telefone)throws Exception{//verificar se o usuario existe
       
        String nome = null;
          
        Statement at;//Statement é uma interface utilizada para executar instruções SQL.
        at = conexao.createStatement();
        
        ResultSet rs = at.executeQuery("SELECT nm_cliente FROM CLIENTES WHERE telefone='"+telefone+"' or "
        + "celular='"+telefone+"'");
        
        while(rs.next()){     
    
           nome =(rs.getString(1));
        }
        return nome;
    }
      
      
       public static String consultarID(String nome)throws Exception{//verificar se o usuario existe
       
        String idUsuario = "";
          
        Statement at;//Statement é uma interface utilizada para executar instruções SQL.
        at = conexao.createStatement();
        
        ResultSet rs = at.executeQuery("SELECT id_usuario FROM usuario WHERE nm_usuario='"+nome+"'");
        
        while(rs.next()){         
           idUsuario =rs.getString(1);
        }
        
        return idUsuario+"";
    }
      
      public static String consultarEndereco(String telefone)throws Exception{//verificar se o usuario existe
        
        String ende= null;
          
        Statement at;//Statement é uma interface utilizada para executar instruções SQL.
        at = conexao.createStatement();
        ResultSet rs = at.executeQuery("SELECT endereco FROM CLIENTES WHERE telefone='"+telefone+"' or "
                + "celular='"+telefone+"'");
        
        while(rs.next()){     
    
           ende =(rs.getString(1));
        }
        return ende;
    }
        
      public static boolean confirmaAcesso(String login, String senha)throws Exception{//verificar se o usuario existe
        boolean retornoconfirma = false;
        Statement at;//Statement é uma interface utilizada para executar instruções SQL.
        at = conexao.createStatement();
        ResultSet rs = at.executeQuery("SELECT login,senha FROM USUARIO WHERE LOGIN='"+login+"' and senha='"+senha+"'");
        while(rs.next()){            
            retornoconfirma =(rs.getString(1).equals(login) && rs.getString(2).equals(senha));
        }
        return retornoconfirma;
    }
    
      public static void conecta() {//metodo para conectar
        String driver = "com.mysql.jdbc.Driver";//
        String url = "jdbc:mysql://localhost:3306/projetopizza";//caminho do banco
        String login = "root";
        String senha = "";
        
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,login,senha);//GERENCIADOR DO DRIVE SOLICITA A CONEXAO NOS PARAMETROS  
            System.out.println("conexao bem sucedida");
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
      
      public static void executa(String sql)throws Exception{//vai executar o comando sql
        
        Statement at = null;
        at = conexao.createStatement();
        at.executeUpdate(sql);
    }
        
      public static void  listar_usuario()throws Exception{//mostrar a 

        Statement at;
        at = conexao.createStatement();
        ResultSet rs = at.executeQuery("SELECT id_usu, nome_usu, login_usu,FROM usuario");//pegando os 4 campos do aluno
        System.out.println("-----------------------------------");
        
        while(rs.next()){
            
            System.out.println("Codigo: "+rs.getString(1)+" Nome: "+rs.getString(2)+" login:"+rs.getString(3)+" Senha: "+rs.getString(4));
        
        }
      
      
}
       
      public static void desconecta()throws Exception{
        conexao.close();
        }
       
       
}
  /*   public static void insere(String nome, String usuario, String senha) throws Exception {//exemplo
        conecta();
        
        executa("INSERT INTO  usuario VALUES (default,'gugu','gugudomigao','banana')");
        executa("INSERT INTO  usuario VALUES (default,'Jossoares','programadojo','joglobo')");
        
     //   listar_usuario();
      //  executa("UPDATE usuario SET nome_usu = 'santos' WHERE id_usu = 2");
       // executa("DELETE FROM usuario WHERE id_usu = 1");
      //  executa("DELETE FROM usuario WHERE id_usu = 7");
        //        executa("DELETE FROM usuario WHERE id_usu = 6");
       // listar_usuario();
        desconecta();
    
    
}*/