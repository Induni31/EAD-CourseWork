
package UI;
import UI.DatabaseConnection;



import java.sql.*;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;


import java.util.*;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JRException;




public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
        
    }

   
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnBookingRegister = new javax.swing.JButton();
        btnWeddingHallPackages = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_report = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBookingRegister.setBackground(new java.awt.Color(153, 0, 51));
        btnBookingRegister.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBookingRegister.setText("Booking Registration");
        btnBookingRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookingRegisterActionPerformed(evt);
            }
        });

        btnWeddingHallPackages.setBackground(new java.awt.Color(153, 0, 51));
        btnWeddingHallPackages.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnWeddingHallPackages.setText("Wedding Hall Package Details");
        btnWeddingHallPackages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWeddingHallPackagesActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("The best choice to make your day special....");

        btn_report.setBackground(new java.awt.Color(153, 0, 51));
        btn_report.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_report.setText("Reports");
        btn_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(420, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnWeddingHallPackages, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                    .addComponent(btn_report, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBookingRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBookingRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnWeddingHallPackages, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_report, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBookingRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookingRegisterActionPerformed

             openBookingRegister();
    }//GEN-LAST:event_btnBookingRegisterActionPerformed

    private void btnWeddingHallPackagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWeddingHallPackagesActionPerformed
       
             openWeddingHallPackages(); 
    }//GEN-LAST:event_btnWeddingHallPackagesActionPerformed

    private void btn_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportActionPerformed
        
        try {
            String reportPath = "C:\\^  Induni Perera\\DCSD23\\EAD_CW\\src\\UI\\report1.jrxml";
            
            JasperReport jr = JasperCompileManager.compileReport(reportPath);
            
            JasperPrint jp = JasperFillManager.fillReport(jr, null, DatabaseConnection.createDatabaseConnection());
            
            JasperViewer.viewReport(jp);
            
        } catch (Exception e) {
            e.printStackTrace();
       
        }
    }//GEN-LAST:event_btn_reportActionPerformed

        private void openBookingRegister() {
        // Create and show Booking Register form
        BookingRegister bookingRegister = new BookingRegister();
        bookingRegister.setVisible(true);
        this.setVisible(false);
    }
        
         private void openWeddingHallPackages() {
        // Create and show Wedding Hall Packages form
        WeddingHallPackages weddingHallPackages = new WeddingHallPackages();
        weddingHallPackages.setVisible(true);
        this.setVisible(false);
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookingRegister;
    private javax.swing.JButton btnWeddingHallPackages;
    private javax.swing.JButton btn_report;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
  }

