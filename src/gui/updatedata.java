/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import database.addlecture;
import database.dbconnect;
import database.updatelecture;
import static gui.adminhome.time;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author sandesh
 */
public class updatedata extends javax.swing.JDialog {

    public updatedata(java.awt.Frame parent, boolean modal ) {
        super(parent, modal);
        initComponents();
    }
    public updatedata(ArrayList data ) {
       // super(parent, modal);
        initComponents();
        
        id = data.get(0).toString();
        ulecture.setText(data.get(1).toString());
        ufaculty.setSelectedItem(data.get(2).toString());
        usection.setSelectedItem(data.get(3).toString());
        usem.setSelectedItem(data.get(4).toString());
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date s,d;
        try {
            s = sdf.parse(data.get(5).toString());
            ustartdate.setDate(s);
            d = sdf.parse(data.get(6).toString());
            ulastadate.setDate(d);
            
        } catch (ParseException ex) {
            Logger.getLogger(updatedata.class.getName()).log(Level.SEVERE, null, ex);
        }
        ustarttime.setText(data.get(7).toString());
        uendtime.setText(data.get(8).toString());
        
        sdays.setText(data.get(9).toString());
    
        
         
        
    }

   
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ulecture = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ufaculty = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        usection = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ulastadate = new org.jdesktop.swingx.JXDatePicker();
        ustartdate = new org.jdesktop.swingx.JXDatePicker();
        jLabel7 = new javax.swing.JLabel();
        uendtime = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ustarttime = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        usun = new javax.swing.JCheckBox();
        umon = new javax.swing.JCheckBox();
        utue = new javax.swing.JCheckBox();
        uwed = new javax.swing.JCheckBox();
        uthu = new javax.swing.JCheckBox();
        ufri = new javax.swing.JCheckBox();
        usat = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        sdays = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        usem = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Update Lecture");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Lecture :");

        ulecture.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Faculty :");

        ufaculty.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BIM", "BSW", "BSc.CSIT" }));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Section :");

        usection.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B" }));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Lastdate :");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Startdate :");

        ulastadate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ulastadateActionPerformed(evt);
            }
        });

        ustartdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ustartdateActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("End Time :");

        uendtime.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        uendtime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uendtimeActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Start Time :");

        ustarttime.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ustarttime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ustarttimeActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Days :");

        usun.setText("Sun");
        usun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usunActionPerformed(evt);
            }
        });

        umon.setText("Mon");

        utue.setText("Tue");
        utue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utueActionPerformed(evt);
            }
        });

        uwed.setText("Wed");
        uwed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uwedActionPerformed(evt);
            }
        });

        uthu.setText("Thu");

        ufri.setText("Fri");
        ufri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ufriActionPerformed(evt);
            }
        });

        usat.setText("Sat");
        usat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usatActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Selected Days :");

        sdays.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Select Days To Update");

        jLabel39.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel39.setText("Semester or Year:");

        usem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ulecture, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ufaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(usection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel39)
                                .addGap(18, 18, 18)
                                .addComponent(usem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sdays, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ustarttime, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ustartdate, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel7)
                                        .addGap(23, 23, 23)
                                        .addComponent(uendtime))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ulastadate, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap(155, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(usun)
                                .addGap(0, 0, 0)
                                .addComponent(umon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(utue)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(uwed)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uthu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ufri)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(usat)))
                        .addGap(208, 208, 208))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(285, 285, 285))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ulecture, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ufaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(usection, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usem, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ustartdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(ulastadate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uendtime, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(ustarttime, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(sdays, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(umon)
                    .addComponent(utue)
                    .addComponent(uwed)
                    .addComponent(uthu)
                    .addComponent(ufri)
                    .addComponent(usat)
                    .addComponent(usun))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ulastadateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ulastadateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ulastadateActionPerformed

    private void ustartdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ustartdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ustartdateActionPerformed

    private void uendtimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uendtimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uendtimeActionPerformed

    private void ustarttimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ustarttimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ustarttimeActionPerformed

    private void usunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usunActionPerformed

    private void utueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_utueActionPerformed

    private void uwedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uwedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uwedActionPerformed

    private void ufriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ufriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ufriActionPerformed

    private void usatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usatActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       DateFormat df = new SimpleDateFormat("YYYY-MM-dd");
        if (!"".equals(this.ulecture.getText())) {
            if (this.ustartdate.getDate() != null && this.ulastadate.getDate() != null) {
                 
                    if (this.ustarttime.getText() != "" && this.uendtime.getText() != "") {
                        if (time(this.ustarttime.getText()) && time(this.uendtime.getText())) {
                            if (usun.isSelected() || umon.isSelected() || utue.isSelected()
                                    || uwed.isSelected() || uthu.isSelected() || ufri.isSelected() || usat.isSelected()) {
                                ArrayList datatosend = new ArrayList();

                                datatosend = getDataToSave();
                                //System.out.println("size" + datatosend.size());
                                updatelecture dbopt = new updatelecture();
                                try {
                                    dbopt.updateDatalectureTable(datatosend);
                                    
                                    new adminhome().setVisible(true);
                                } catch (ParseException ex) {
                                    System.out.println("operaion error:");// Logger.getLogger(addnewstudent.class.getName()).log(Level.SEVERE, null, ex);

                                }
                            } else {
                                JOptionPane.showMessageDialog(this,
                                        "Select a Days ",
                                        "Message", JOptionPane.INFORMATION_MESSAGE);
                            }

                        } else {
                            JOptionPane.showMessageDialog(this,
                                    "Time Formate is Invalid ",
                                    "Message", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else {
                        if (this.ustarttime.getText() == "" && this.uendtime.getText() == "") {
                            JOptionPane.showMessageDialog(this,
                                    "Time is Empty ",
                                    "Message", JOptionPane.INFORMATION_MESSAGE);
                        } else if (this.ustarttime.getText() == "") {
                            JOptionPane.showMessageDialog(this,
                                    "Start Time is Empty ",
                                    "Message", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(this,
                                    "End Time Is Empty ",
                                    "Message", JOptionPane.INFORMATION_MESSAGE);
                        }

                    }
                
            } else {
                if (this.ustartdate.getDate() == null && this.ulastadate.getDate() == null) {
                    JOptionPane.showMessageDialog(this,
                            "Select a Date ",
                            "Message", JOptionPane.INFORMATION_MESSAGE);
                } else if (this.ustartdate.getDate() == null) {
                    JOptionPane.showMessageDialog(this,
                            "Start date is Empty ",
                            "Message", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Lastdate is Empty",
                            "Message", JOptionPane.INFORMATION_MESSAGE);
                }

            }
        } else {
            JOptionPane.showMessageDialog(this,
                    "Lecture is Empty ",
                    "Message", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_jButton1ActionPerformed

   
    public boolean validdate(String pass) {

        Date BOD = null;

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        long s = Long.parseLong(pass.substring(0, 4));
        Date today = Calendar.getInstance().getTime();
        long d = Long.parseLong(df.format(today).substring(0, 4));

        long startmonth = Long.parseLong(pass.substring(5, 7));
        long startday = Long.parseLong(pass.substring(8, 10));

        long month = Long.parseLong(df.format(today).substring(5, 7));
        long day = Long.parseLong(df.format(today).substring(8, 10));
        long n = 32;

        if (s >= d && s <= d + 1) {
            if ((startmonth >= month && startday >= day)
                    || (startmonth > month && startday <= n)) {

                df.setLenient(false);
                try {
                    BOD = df.parse(pass);
                    return true;
                } catch (Exception e) {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

    public static boolean time(String time) {

        StringTokenizer st = new StringTokenizer(time, ":");
        if (st.countTokens() == 3) {

            SimpleDateFormat sdf1 = new SimpleDateFormat("h:mm:ss a");
            sdf1.setLenient(false);
            try {

                Date d2 = sdf1.parse(time);
                return true;
            } catch (Exception e) {
                return false;
            }
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("h:mm a");
            sdf.setLenient(false);
            try {
                Date d1 = sdf.parse(time);

                return true;
            } catch (Exception e) {
                return false;
            }
        }
    }
    
    public ArrayList getDataToSave() {
        ArrayList data = new ArrayList();
        data.add(this.id);
        data.add(this.ulecture.getText());
        data.add(this.ufaculty.getSelectedItem().toString());

        data.add(this.usection.getSelectedItem().toString());
        
        data.add(this.usem.getSelectedItem().toString());

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date s = this.ustartdate.getDate();
        String formattedDates = df.format(s);
        data.add(formattedDates);

        Date l = this.ulastadate.getDate();
        String formattedDatel = df.format(l);
        data.add(formattedDatel);

        data.add(this.ustarttime.getText());
        data.add(this.uendtime.getText());

        String days = "";
        if (usun.isSelected()) {
            days += usun.getText() + " ";
        }
        if (umon.isSelected()) {
            days += umon.getText() + " ";
        }
        if (utue.isSelected()) {
            days += utue.getText() + " ";
        }
        if (uwed.isSelected()) {
            days += uwed.getText() + " ";
        }
        if (uthu.isSelected()) {
            days += uthu.getText() + " ";
        }
        if (ufri.isSelected()) {
            days += ufri.getText() + " ";
        }
        if (usat.isSelected()) {
            days += usat.getText() + " ";
        }
        data.add(days);

        return data;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(updatedata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updatedata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updatedata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updatedata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                updatedata dialog = new updatedata(new javax.swing.JFrame(), true );
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
     public  String id = "";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField sdays;
    private javax.swing.JTextField uendtime;
    private javax.swing.JComboBox ufaculty;
    private javax.swing.JCheckBox ufri;
    private org.jdesktop.swingx.JXDatePicker ulastadate;
    private javax.swing.JTextField ulecture;
    private javax.swing.JCheckBox umon;
    private javax.swing.JCheckBox usat;
    private javax.swing.JComboBox usection;
    private javax.swing.JComboBox usem;
    private org.jdesktop.swingx.JXDatePicker ustartdate;
    private javax.swing.JTextField ustarttime;
    private javax.swing.JCheckBox usun;
    private javax.swing.JCheckBox uthu;
    private javax.swing.JCheckBox utue;
    private javax.swing.JCheckBox uwed;
    // End of variables declaration//GEN-END:variables
}
