/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sandesh
 */
public class dbconnect {
    String URL = "jdbc:postgresql://";
    String host= "127.0.0.1";
    int port = 5432;
    String dbname="classroom";
    String password= "postgres";
    String username = "postgres";
    String driver ="org.postgresql.Driver";
    Connection conn= null;
    public dbconnect(){
       
    }
    
    public Connection connectdatabase(){
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(URL + host +":" + port +"/" + dbname, username, password);
        } catch (ClassNotFoundException ex) {
           System.out.println("driver error:" + ex.toString());
        } catch (SQLException ex) {
           System.out.println("connection error:" + ex.toString());
        }
        
        if(conn != null)
        {
            System.out.println("connected sucessfully");
        }
        return conn;
    }
    public Connection closeConnection(){
        if(conn != null)
            try {
                conn.close();
        } catch (SQLException ex) {
            System.out.println("connection error:" + ex.toString());
        }
        
        return conn;
    }
    
   /* public static void main(String[] args) {
        dbconnect d = new dbconnect();
        d.connectdatabase();
    }*/
 
}
