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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author sandeshtoevent
 */
public class addevent {
    public void saveDatatoevent(ArrayList data) throws ParseException{
        dbconnect dbcon = new dbconnect();
        Connection conn = dbcon.connectdatabase();
        
        String SQL = "INSERT into add_event( event_name , event_description , event_date ) "
                + " values(?,?,?) ";
        try {
            PreparedStatement ps = conn.prepareStatement(SQL);
            
            ps.setString(1, data.get(0).toString());
            ps.setString(2, data.get(1).toString()); 
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date s =sdf.parse(data.get(2).toString());
            ps.setDate(3, new java.sql.Date(s.getTime()));
            
            
            
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Topic Added");
            dbcon.closeConnection();
            
        } catch (SQLException ex) {
           System.out.println("error in Sql:  " + ex.toString());
           dbcon.closeConnection();// Logger.getLogger(dboperation.class.getName()).log(Level.SEVERE, null, ex);
        }
       dbcon.closeConnection();
       
        
    }
    public ResultSet getevent()
    {
        dbconnect dbcon = new dbconnect();
           Statement stmt = null;
           ResultSet rs = null;
           Connection conn = dbcon.connectdatabase();
           String SQL ="select * from add_event";
        try {
            stmt = conn.createStatement();
            rs=stmt.executeQuery(SQL);
            
            
            
        } catch (SQLException ex) {
          System.out.println("error at koi" + ex.toString()); // Logger.getLogger(dboperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }
    public void updateevent(ArrayList info)
    {
       dbconnect dbcon = new dbconnect();
        Connection conn = dbcon.connectdatabase();
        
     String SQL="update add_event set event_name = ?,event_description = ?,event_date = ? where id = 1";
        try {
            PreparedStatement ps = conn.prepareStatement(SQL);
            
            ps.setString(1, info.get(0).toString());
            ps.setString(2, info.get(1).toString());
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date s;
            try {
                s = sdf.parse(info.get(2).toString());
                ps.setDate(3, new java.sql.Date(s.getTime()));
            } catch (ParseException ex) {
                Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
            }
            
           
            
            
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Event Updated");
            dbcon.closeConnection();
            
        } catch (SQLException ex) {
           System.out.println("error: SQL Statement " + ex.toString());// Logger.getLogger(dboperation.class.getName()).log(Level.SEVERE, null, ex);
           dbcon.closeConnection();
        }
       dbcon.closeConnection();
    
    }
    
}
