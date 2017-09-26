/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancooracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sun.applet.Main;

/**
 *
 * @author TRISTAO
 */
public class ContaCrud {

    public void tranferir(Connection con, Conta origem, Conta destino, double valor) throws SQLException{
        if(origem.saldo>=valor){
           try{
                con.setAutoCommit(false);
            /*saque*/
            origem.saldo -=valor;
            alterar(con, origem);
            
          
            
            /*deposito*/
            destino.saldo+=valor;
            alterar(con,destino);
            con.commit();
           }catch( Exception e){
               con.rollback();//desfazer
           }
        }
        
        
        
    }
    
    public void criar(Connection con, Conta conta) throws SQLException {
        String sql = "insert into conta values(?,?,?)";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setInt(1, conta.numero);
            stm.setString(2, conta.cliente);
            stm.setDouble(3, conta.saldo);
            stm.executeUpdate();
        }
    }

    public void alterar(Connection con, Conta conta) throws SQLException {
        String sql = "update conta set cliente=?, saldo=? where numero=?";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
             stm.setString(1, conta.cliente);
            stm.setDouble(2, conta.saldo);
             stm.setInt(3, conta.numero);
          
           
            stm.executeUpdate();
        }
    }

    public void excluir(Connection con, Conta conta) throws SQLException {
        String sql = "delete conta where     numero=?";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setInt(1, conta.numero);
            stm.executeUpdate();
        }
    }

    public List<Conta> ler(Connection con) throws SQLException {
        List<Conta> lista = new ArrayList<>();
        String sql = "select numero, cliente, saldo from conta";
        try (PreparedStatement stm = con.prepareStatement(sql);
                ResultSet rs = stm.executeQuery()) {
            while (rs.next()) {
                lista.add(new Conta(rs.getInt(1), rs.getString(2), rs.getDouble(3)));
            }
        }
        return lista;
    }

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        try (Connection con = DriverManager.getConnection(url, "filipe", "filipe123")) {
           ContaCrud crud = new ContaCrud();
           /*  Conta conta1 = new Conta(1, "ricardo", 1000.10);
            conta1.saldo = 11000.30;
            crud.alterar(con, conta1);
            Conta conta2 = new Conta(2, "ricardo", 1000.10);
            crud.excluir(con, conta2);
            /* Conta conta1 = new Conta(2, "ricardo", 1000.10);
            Conta conta2 = new Conta(3, "lawnrence", 2000.10);
            Conta conta3 = new Conta(4, "Beatriz", 3000.30);
            crud.criar(con, conta1);
            crud.criar(con, conta2);
            crud.criar(con, conta3);
             */
           
           



            List<Conta> contas = crud.ler(con);
            for (Conta conta : contas) {
                System.out.println(conta);

            }
            
            Conta origem = contas.get(0);
            Conta destino = contas.get(1);
            crud.tranferir(con, origem, destino, 100);
            System.out.println("depois");
         contas = crud.ler(con);
            for (Conta conta : contas) {
                System.out.println(conta);

            }
        }

    }
}
