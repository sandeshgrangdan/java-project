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
 * @author sandesh
 */
public class database {
        public void saveDatatoattendence(ArrayList data) throws ParseException{
        dbconnect dbcon = new dbconnect();
        Connection conn = dbcon.connectdatabase();
        
        String SQL = "INSERT into add_attendence( student_name , faculty , semester , attendence  ) "
                + " values(?,?,?,?) ";
        try {
            PreparedStatement ps = conn.prepareStatement(SQL);
            
                ps.setString(1, data.get(0).toString());
                ps.setString(2, data.get(1).toString());
                ps.setString(3, data.get(2).toString());
                ps.setString(4, data.get(3).toString());

                
            
            
            
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfullly Added Attendence for" + data.get(0).toString());
            dbcon.closeConnection();
            
        } catch (SQLException ex) {
           System.out.println("error in Sql:  " + ex.toString());
           dbcon.closeConnection();// Logger.getLogger(dboperation.class.getName()).log(Level.SEVERE, null, ex);
        }
       dbcon.closeConnection();
       
        
    }
        
        public ResultSet getattendence(ArrayList info)
        {
            dbconnect dbcon = new dbconnect();
             Statement stmt = null;
             ResultSet rs = null;
             Connection conn = dbcon.connectdatabase();
             
             String SQL ="select * from add_attendence where faculty = '"+info.get(1).toString()+"'and"
                  + " semester = '"+info.get(2).toString()+"' and student_name = '"+ info.get(0).toString()+"'";


               try {
                    stmt = conn.createStatement();
                    rs=stmt.executeQuery(SQL);


          } catch (SQLException ex) {
            System.out.println("error at syntax" + ex.toString()); // Logger.getLogger(dboperation.class.getName()).log(Level.SEVERE, null, ex);
          }

          return rs;
        }
        
        public void saveDatatonote(ArrayList data) throws ParseException{
        dbconnect dbcon = new dbconnect();
        Connection conn = dbcon.connectdatabase();
        
        String SQL = "INSERT into add_note( lecture , bookname , sem , author , url  ) "
                + " values(?,?,?,?,?) ";
        try {
            PreparedStatement ps = conn.prepareStatement(SQL);
            
                ps.setString(1, data.get(0).toString());
                ps.setString(2, data.get(1).toString());
                ps.setString(3, data.get(2).toString());
                ps.setString(4, data.get(3).toString());
                ps.setString(5, data.get(4).toString());
            
            
            
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Note Details is Added " + data.get(0).toString());
            dbcon.closeConnection();
            
        } catch (SQLException ex) {
           System.out.println("error in Sql:  " + ex.toString());
           dbcon.closeConnection();// Logger.getLogger(dboperation.class.getName()).log(Level.SEVERE, null, ex);
        }
       dbcon.closeConnection();
       
        
    }
        
        public ResultSet getnote(ArrayList info)
        {
            dbconnect dbcon = new dbconnect();
             Statement stmt = null;
             ResultSet rs = null;
             Connection conn = dbcon.connectdatabase();
             
             String SQL ="select * from add_note where lecture = '"+info.get(0).toString()+"'and"
                  + " sem = '"+info.get(1).toString()+"'";


               try {
                    stmt = conn.createStatement();
                    rs=stmt.executeQuery(SQL);


          } catch (SQLException ex) {
            System.out.println("error at syntax" + ex.toString()); // Logger.getLogger(dboperation.class.getName()).log(Level.SEVERE, null, ex);
          }

          return rs;
        }
        
        public void saveDatatoassign(ArrayList data) throws ParseException{
        dbconnect dbcon = new dbconnect();
        Connection conn = dbcon.connectdatabase();
        
        String SQL = "INSERT into assign( faculty , sec , sem , lecture , deadline ,question ) "
                + " values(?,?,?,?,?,?) ";
        try {
            PreparedStatement ps = conn.prepareStatement(SQL);
            
                ps.setString(1, data.get(0).toString());
                ps.setString(2, data.get(1).toString());
                ps.setString(3, data.get(2).toString());
                ps.setString(4, data.get(3).toString());
                
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                java.util.Date s =sdf.parse(data.get(4).toString());
                ps.setDate(5, new java.sql.Date(s.getTime()));
                
                ps.setString(6, data.get(5).toString());
                
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Sucessfully Assing ");
            dbcon.closeConnection();
            
        } catch (SQLException ex) {
           System.out.println("error in Sql:  " + ex.toString());
           dbcon.closeConnection();// Logger.getLogger(dboperation.class.getName()).log(Level.SEVERE, null, ex);
        }
       dbcon.closeConnection();
       
        
    }
        
        public ResultSet getquestion(ArrayList info)
        {
            dbconnect dbcon = new dbconnect();
             Statement stmt = null;
             ResultSet rs = null;
             Connection conn = dbcon.connectdatabase();
             for(int i = 0 ; i < info.size() ; i++)
                 System.out.println(info.get(i).toString()+"");
             String SQL ="select * from assign where faculty = '"+info.get(0).toString()+"'and"
                  + " sec = '"+info.get(1).toString()+"' and sem = '"+ info.get(2).toString()+"' and"
                     + " lecture = '"+info.get(3).toString()+"'";


               try {
                    stmt = conn.createStatement();
                    rs=stmt.executeQuery(SQL);


          } catch (SQLException ex) {
            System.out.println("error at syntax" + ex.toString()); // Logger.getLogger(dboperation.class.getName()).log(Level.SEVERE, null, ex);
          }

          return rs;
        }
      public void updatequestion(ArrayList info , int t)
      {
        dbconnect dbcon = new dbconnect();
        Connection conn = dbcon.connectdatabase();
        
        String SQL =  "update assign set faculty = ?,sec = ?,sem = ?, lecture = ?, deadline = ?"
                + ",question =? where id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(SQL);
            
            ps.setString(1, info.get(0).toString());
            ps.setString(2, info.get(1).toString());
            
            ps.setString(3, info.get(2).toString());
            
            ps.setString(4, info.get(3).toString());
            
            
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date s;
            try {
                s = sdf.parse(info.get(4).toString());
                ps.setDate(5, new java.sql.Date(s.getTime()));
            } catch (ParseException ex) {
                Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            ps.setString(6, info.get(5).toString());
            
            ps.setInt(7, t);
            
            
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Question Updated");
            dbcon.closeConnection();
            
        } catch (SQLException ex) {
           System.out.println("error: SQL Statement " + ex.toString());// Logger.getLogger(dboperation.class.getName()).log(Level.SEVERE, null, ex);
           dbcon.closeConnection();
        }
       dbcon.closeConnection();
      }
        
}
