/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.station;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo ideapad
 */
public class Profile extends javax.swing.JFrame {

    /**
     * Creates new form Profile
     */
    
    String userName; 
    String way;
    String Breaks; 
    
    int alex_cairo = 20;
    int cairo_alex = 20;
    int cairo_sokhna = 30;
    int giza_dahab = 30;
    int alex_matrouh = 20; 
    int total; 
    
    int BusSeats = 10 ; 
    int MiniSeats = 5;
    int LemoSeats = 2;
    int BusCount=0;
    int Mini_BusCount=0;
    int LemoCount=0;
    
    public Profile() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tripdest = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        vehicle = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        twoWay = new javax.swing.JRadioButton();
        oneWay = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        R2 = new javax.swing.JRadioButton();
        R3 = new javax.swing.JRadioButton();
        Day = new javax.swing.JComboBox<>();
        timing = new javax.swing.JComboBox<>();
        month = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        days = new javax.swing.JComboBox<>();
        Price = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Script MT Bold", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome");

        jLabel2.setText("trips");

        tripdest.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alex-cairo", "Cairo-alex", "cairo-sokhna", "Giza-dahab", "alex-matrooh" }));
        tripdest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tripdestActionPerformed(evt);
            }
        });

        jLabel3.setText("transport");

        vehicle.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        vehicle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lemo", "Bus", "Mini-Bus" }));

        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Breaks :");

        twoWay.setText("Two_way");
        twoWay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoWayActionPerformed(evt);
            }
        });

        oneWay.setText("One_way");
        oneWay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneWayActionPerformed(evt);
            }
        });

        jLabel10.setText("destination");

        jRadioButton4.setText("1");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        R2.setText("2");
        R2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2ActionPerformed(evt);
            }
        });

        R3.setText("3");
        R3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3ActionPerformed(evt);
            }
        });

        Day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        timing.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12:00am", "6:00am", "12:00pm", "6:00pm" }));

        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("choose the date ");

        days.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" }));

        Price.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Price.setText("Price: LE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel10)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tripdest, 0, 140, Short.MAX_VALUE)
                        .addComponent(vehicle, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addGap(102, 102, 102))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton4)
                                .addGap(18, 18, 18)
                                .addComponent(R2)
                                .addGap(18, 18, 18)
                                .addComponent(R3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(oneWay)
                                .addGap(47, 47, 47)
                                .addComponent(twoWay)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Day, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(timing, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(month, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(days, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tripdest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vehicle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(days, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(timing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(twoWay)
                        .addComponent(oneWay)
                        .addComponent(jLabel10))
                    .addComponent(Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jRadioButton4)
                    .addComponent(R2)
                    .addComponent(R3)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tripdestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tripdestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tripdestActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         
        String tripDest = (String) tripdest.getSelectedItem();
        String vehicleString = (String) vehicle.getSelectedItem(); 
        String day = (String) Day.getSelectedItem(); 
        String times = (String) timing.getSelectedItem(); 
        String months = (String) month.getSelectedItem(); 
        String Days = (String) days.getSelectedItem(); 
        
        
       //3ayzin ne3ml method fi class aw ay 7aga tgib el way
          File file = new File(userName+".txt");
              
        if (vehicleString == "Bus" && BusCount < BusSeats)
            
      {  
          try { 
          FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
          
            bw.write("\n"+tripDest+","+vehicleString+","+way+","+Breaks+","+Days+","+times+","+day+","+months+"\n");
            bw.flush();
            bw.close();
            fw.close(); 
           
            JOptionPane.showMessageDialog(this, "Succesful booking"); 
      
        
         switch (tripDest) {
           case "Alex-cairo": 
               total = alex_cairo;
               break;
           case "cairo-sokhna":   
               total = cairo_sokhna;
               break;
           case "Giza-dahab": 
               total = giza_dahab;
               break;
           case "alex-matrooh":   
               total = alex_matrouh;
               break;
               
       }  
        
     
        if(twoWay.isSelected())
       {
           total= (int)(total + total*0.8);
       }
       Price.setText("Price :LE "+total);
       ++BusCount;  
       dispose();
        UserProf2 up = new UserProf2();
        
       up.setVisible(true);
      
    }  catch (IOException ex) {
            Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
        } 
} 
       if (vehicleString == "Lemo" && LemoCount < LemoSeats)
            
      {  
          try { 
          FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
           
            bw.write("\n"+tripDest+","+vehicleString+","+way+","+Breaks+","+Days+","+times+","+day+","+months+"\n");
            bw.flush();
            bw.close();
            fw.close(); 
           
            JOptionPane.showMessageDialog(this, "Succesful booking"); 
      
        
         switch (tripDest) {
           case "Alex-cairo": 
               total = alex_cairo;
               break;
           case "cairo-sokhna":   
               total = cairo_sokhna;
               break;
           case "Giza-dahab": 
               total = giza_dahab;
               break;
           case "alex-matrooh":   
               total = alex_matrouh;
               break;
               
       }  
        
     
        if(twoWay.isSelected())
       {
           total= (int)(total + total*0.8);
           
       } 
         total+=50; 
       Price.setText("Price :LE "+total);
       ++LemoCount;  
       dispose();
        UserProf2 up = new UserProf2();
        
       up.setVisible(true);
      
    }  catch (IOException ex) {
            Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
        } 
} 
       if (vehicleString == "Mini-Bus" && Mini_BusCount < MiniSeats)
            
      {  
          try { 
          FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
          
            bw.write("\n"+tripDest+","+vehicleString+","+way+","+Breaks+","+Days+","+times+","+day+","+months+"\n");
            bw.flush();
            bw.close();
            fw.close(); 
           
            JOptionPane.showMessageDialog(this, "Succesful booking"); 
      
        
         switch (tripDest) {
           case "Alex-cairo": 
               total = alex_cairo;
               break;
           case "cairo-sokhna":   
               total = cairo_sokhna;
               break;
           case "Giza-dahab": 
               total = giza_dahab;
               break;
           case "alex-matrooh":   
               total = alex_matrouh;
               break;
               
       }  
        
     
        if(twoWay.isSelected())
       {
           total= (int)(total + total*0.8);
       }
       Price.setText("Price :LE "+total);
       ++Mini_BusCount;  
       dispose();
        UserProf2 up = new UserProf2();
        
       up.setVisible(true);
      
    }  catch (IOException ex) {
            Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
        } 
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void twoWayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoWayActionPerformed
        if (twoWay.isSelected()) 
        {
           oneWay.setSelected(false); 
           way ="Two way";
           
}
        
    }//GEN-LAST:event_twoWayActionPerformed

    private void R2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2ActionPerformed
          if (R2.isSelected()) 
        {
           R3.setSelected(false); 
          jRadioButton4.setSelected(false); 
           Breaks= "2";
           
        }
    }//GEN-LAST:event_R2ActionPerformed

    private void oneWayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneWayActionPerformed
         if (oneWay.isSelected()) 
        {
           twoWay.setSelected(false); 
           way ="One way";
           
        }
    }//GEN-LAST:event_oneWayActionPerformed

    private void R3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3ActionPerformed
        if (R3.isSelected()) 
        {
           R2.setSelected(false); 
          jRadioButton4.setSelected(false); 
           Breaks= "3";
           
        }
    }//GEN-LAST:event_R3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        if ( jRadioButton4.isSelected()) 
        {
           R3.setSelected(false); 
          R2.setSelected(false); 
           Breaks= "1";
           
        }
    }//GEN-LAST:event_jRadioButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Day;
    private javax.swing.JLabel Price;
    private javax.swing.JRadioButton R2;
    private javax.swing.JRadioButton R3;
    private javax.swing.JComboBox<String> days;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JRadioButton oneWay;
    private javax.swing.JComboBox<String> timing;
    private javax.swing.JComboBox<String> tripdest;
    private javax.swing.JRadioButton twoWay;
    private javax.swing.JComboBox<String> vehicle;
    // End of variables declaration//GEN-END:variables

    void setUserName(String username) {
        this.userName = username;
    }

     String getUserName() {
        return userName;
        
    }

    
}
