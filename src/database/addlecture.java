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
import javax.swing.JOptionPane;

/**
 *
 * @author sandesh
 */
public class addlecture {
    public void saveDatalectureTable(ArrayList data) throws ParseException{
        dbconnect dbcon = new dbconnect();
        Connection conn = dbcon.connectdatabase();
        
        String SQL = "INSERT into add_lecture(lecture , faculty , class_section ,semester, startdate , lastdate ,"
                + "startime , lastime , days) values(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(SQL);
            
            ps.setString(1, data.get(0).toString());
            ps.setString(2, data.get(1).toString());
            
            ps.setString(3, data.get(2).toString());
            ps.setString(4, data.get(3).toString());
            
            
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date s =sdf.parse(data.get(4).toString());
            ps.setDate(5, new java.sql.Date(s.getTime()));
            
            java.util.Date l =sdf.parse(data.get(5).toString());
            ps.setDate(6, new java.sql.Date(l.getTime()));
            
            ps.setString(7, data.get(6).toString());
            ps.setString(8, data.get(7).toString());
            
            ps.setString(9, data.get(8).toString());
            
            
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Lecture Added");
            
            
        } catch (SQLException ex) {
           System.out.println("error:  " + ex.toString());// Logger.getLogger(dboperation.class.getName()).log(Level.SEVERE, null, ex);
        }
       dbcon.closeConnection();
       
        
    }
    public ResultSet updatelecture(){
           dbconnect dbcon = new dbconnect();
           Statement stmt = null;
           ResultSet rs = null;
           Connection conn = dbcon.connectdatabase();
           String SQL ="select * from add_lecture";
        try {
            stmt = conn.createStatement();
            rs=stmt.executeQuery(SQL);
            
            
            
        } catch (SQLException ex) {
          System.out.println("error at koi" + ex.toString()); // Logger.getLogger(dboperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
       }
    
    public ResultSet lectureinfo(ArrayList info){
           dbconnect dbcon = new dbconnect();
           Statement stmt = null;
           ResultSet rs = null;
           Connection conn = dbcon.connectdatabase();
           String SQL ="select * from add_lecture where faculty = '"+info.get(0).toString()+"' and"
                   + " class_section = '"+info.get(1).toString()+"' and semester = '"+ info.get(2).toString()+"'";
 
           
             try {
            stmt = conn.createStatement();
            rs=stmt.executeQuery(SQL);
            
            
            
        } catch (SQLException ex) {
          System.out.println("error at syntax" + ex.toString()); // Logger.getLogger(dboperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
       }
    
    public ResultSet getdataforcombo()
    {
        dbconnect dbcon = new dbconnect();
        ResultSet rs = null;
        Statement stmt = null;
        
        Connection conn = dbcon.connectdatabase();
           String SQL ="select lecture  from add_lecture";
        try {
            stmt = conn.createStatement();
            rs=stmt.executeQuery(SQL);
            
            
            
        } catch (SQLException ex) {
          System.out.println("error at koi" + ex.toString()); // Logger.getLogger(dboperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }
    
    public ResultSet combo(ArrayList info){
           dbconnect dbcon = new dbconnect();
           Statement stmt = null;
           ResultSet rs = null;
           Connection conn = dbcon.connectdatabase();
           String SQL ="select * from add_lecture where faculty = '"+info.get(0).toString()+"' and"
                   + " class_section = '"+info.get(1).toString()+"' and semester = '"+ info.get(2).toString()+"'";
 
           
             try {
            stmt = conn.createStatement();
            rs=stmt.executeQuery(SQL);
            
            
            
        } catch (SQLException ex) {
          System.out.println("error at syntax" + ex.toString()); // Logger.getLogger(dboperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
       }
    
}
