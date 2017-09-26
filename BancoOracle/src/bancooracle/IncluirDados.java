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

/**
 *
 * @author TRISTAO
 */
public class IncluirDados {

    public static void main(String[] args) throws SQLException {
        String sql = "insert   into pessoa values(?,?,?,?)";
        //  String sql = "insert   into pessoa values(5,'caio','M','caio@serverfilipe.com')";
        String[] pessoas = {"Sandra", "Tereza", "Fatima", "Juliana"};
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        try (Connection con = DriverManager.getConnection(url, "filipe", "filipe123")) {
            try (PreparedStatement stm = con.prepareStatement(sql)) {
                for (int i = 0; i < pessoas.length; i++) {
                    stm.setInt(1, i + 6);
                    stm.setString(2, pessoas[i]);
                    stm.setString(3, "F");
                    stm.setString(4, pessoas[i].toLowerCase() + "@xti.com.br");
                    stm.addBatch();
                }
                //stm.executeQuery();
                stm.executeBatch();
            } catch (SQLException e) {
            }
            sql = "select nome, email from pessoa";
            try (PreparedStatement stm2 = con.prepareStatement(sql);
                    ResultSet rs = stm2.executeQuery()) {
                    while(rs.next()){
                        System.out.println(rs.getString(1)+" : "+rs.getString(2));
                    }
            }
        }
    }

}
