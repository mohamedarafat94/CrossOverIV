/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
   
/**
 *
 * @author marafat
 */
public class TestMySQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
           PreparedStatement pst = con.prepareStatement("Select * from testtable");
           ResultSet rs = pst.executeQuery();                        
            if(rs.next())            
                System.out.println(rs.getInt(1)); 
            else
                System.out.println("Fail");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
