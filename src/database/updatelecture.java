/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import gui.updatedata;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author sandesh
 */
public class updatelecture {
    public void updateDatalectureTable(ArrayList data) throws ParseException{
        dbconnect dbcon = new dbconnect();
        Connection conn = dbcon.connectdatabase();
        
        String SQL =  "update add_lecture set lecture = ?,faculty = ?,class_section = ?, semester =?,"
                + "startdate =?,lastdate = ?,startime = ?, lastime =?, days = ? where id = ?";;
        try {
            PreparedStatement ps = conn.prepareStatement(SQL);
            
            ps.setString(1, data.get(1).toString());
            ps.setString(2, data.get(2).toString());
            
            ps.setString(3, data.get(3).toString());
            
            ps.setString(4, data.get(4).toString());
            
            
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date s =sdf.parse(data.get(5).toString());
            ps.setDate(5, new java.sql.Date(s.getTime()));
            
            java.util.Date l =sdf.parse(data.get(6).toString());
            ps.setDate(6, new java.sql.Date(l.getTime()));
            
            ps.setString(7, data.get(7).toString());
            ps.setString(8, data.get(8).toString());
            
            ps.setString(9, data.get(9).toString());
            
           
	    int id = Integer.parseInt(data.get(0).toString());
            ps.setInt(10, id);
            
            
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Lecture Updated");
            updatedata hh =  new updatedata(null, true);
            hh.setVisible(false);
            dbcon.closeConnection();
            
        } catch (SQLException ex) {
           System.out.println("error: SQL Statement " + ex.toString());// Logger.getLogger(dboperation.class.getName()).log(Level.SEVERE, null, ex);
           dbcon.closeConnection();
        }
       dbcon.closeConnection();
       
        
    }
    
}
