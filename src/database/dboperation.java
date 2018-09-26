/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

/**
 *
 * @author sandesh
 */
public class dboperation {
    public void saveDatatologinTable(ArrayList data) throws ParseException{
        dbconnect dbcon = new dbconnect();
        Connection conn = dbcon.connectdatabase();
        
        String SQL = "INSERT into login(user_name , email , password) values(?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(SQL);
            
            ps.setString(1, data.get(0).toString());
            ps.setString(2, data.get(1).toString());
            ps.setString(3, data.get(2).toString());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Saved");
            
            
        } catch (SQLException ex) {
           System.out.println("error:  " + ex.toString());// Logger.getLogger(dboperation.class.getName()).log(Level.SEVERE, null, ex);
        }
       dbcon.closeConnection();
       
        
    }
    public ResultSet viewdata(){
           dbconnect dbcon = new dbconnect();
           Statement stmt = null;
           ResultSet rs = null;
           Connection conn = dbcon.connectdatabase();
           String SQL ="select * from login";
        try {
            stmt = conn.createStatement();
            rs=stmt.executeQuery(SQL);
            
            
            
        } catch (SQLException ex) {
          System.out.println("error at koi" + ex.toString()); // Logger.getLogger(dboperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
       }
    
}
