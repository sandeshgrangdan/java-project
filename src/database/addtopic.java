/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import gui.ADDTOPIC;
import gui.updatedata;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author sandesh
 */
public class addtopic {
    public void saveDataaddtopicTable(ArrayList data) throws ParseException{
        dbconnect dbcon = new dbconnect();
        Connection conn = dbcon.connectdatabase();
        
        String SQL = "INSERT into add_topic( faculty , class_section , lecture , semester , topic) "
                + " values(?,?,?,?,?) ";
        try {
            PreparedStatement ps = conn.prepareStatement(SQL);
            
            ps.setString(1, data.get(0).toString());
            ps.setString(2, data.get(1).toString());          
            ps.setString(3, data.get(2).toString());  
            ps.setString(4, data.get(3).toString());
            ps.setString(5, data.get(4).toString());
            
            
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Topic Added");
            dbcon.closeConnection();
            
        } catch (SQLException ex) {
           System.out.println("error in Sql:  " + ex.toString());
           dbcon.closeConnection();// Logger.getLogger(dboperation.class.getName()).log(Level.SEVERE, null, ex);
        }
       dbcon.closeConnection();
       
        
    }
    public ResultSet viewtopic(ArrayList info){
           dbconnect dbcon = new dbconnect();
           ResultSet rs = null;
           Connection conn = dbcon.connectdatabase();
           Statement stmt = null;
           
           String SQL ="select * from add_topic where faculty = '"+info.get(0).toString()+"'and"
                  + " class_section = '"+info.get(1).toString()+"' and lecture = '"+ info.get(2).toString() +"' and"
                     + " semester = '"+info.get(3).toString()+"'";;
        try {
      
            
        
            
                    stmt = conn.createStatement();
                    rs=stmt.executeQuery(SQL);
            
            
            
        } catch (SQLException ex) {
          System.out.println("error at koi" + ex.toString()); // Logger.getLogger(dboperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
       }
    
    public void updatetopic(ArrayList info ,int t)
    {
        dbconnect dbcon = new dbconnect();
        Connection conn = dbcon.connectdatabase();
        
        String SQL =  "update add_topic set faculty = ?,class_section = ?,lecture = ?, semester = ?,"
                + "topic =? where id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(SQL);
            
            ps.setString(1, info.get(0).toString());
            ps.setString(2, info.get(1).toString());
            
            ps.setString(3, info.get(2).toString());
            
            ps.setString(4, info.get(3).toString());
            
            ps.setString(5, info.get(4).toString());
            
            
            ps.setInt(6, t);
            
            
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Topic Updated");
            dbcon.closeConnection();
            
        } catch (SQLException ex) {
           System.out.println("error: SQL Statement " + ex.toString());// Logger.getLogger(dboperation.class.getName()).log(Level.SEVERE, null, ex);
           dbcon.closeConnection();
        }
       dbcon.closeConnection();
    }
}
