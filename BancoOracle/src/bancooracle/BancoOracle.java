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
public class BancoOracle {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
       String sql = "select codigo, nome, sexo, email from pessoa";
        String url ="jdbc:oracle:thin:@localhost:1521:xe";
      
        try (Connection con = DriverManager.getConnection(url,"filipe","filipe123");                          
        PreparedStatement stm = con.prepareStatement(sql);
        ResultSet rs =    stm.executeQuery()){
      
           while(rs.next()){
               System.out.println(rs.getString("nome"));
           } 
            
        }
        
    }
    
}
