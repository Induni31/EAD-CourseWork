
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
        btn_report = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBookingRegister.setBackground(new java.awt.Color(255, 204, 204));
        btnBookingRegister.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBookingRegister.setText("Booking Registration");
        btnBookingRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookingRegisterActionPerformed(evt);
            }
        });

        btnWeddingHallPackages.setBackground(new java.awt.Color(255, 204, 204));
        btnWeddingHallPackages.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnWeddingHallPackages.setText("Wedding Hall Package Details");
        btnWeddingHallPackages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWeddingHallPackagesActionPerformed(evt);
            }
        });

        btn_report.setBackground(new java.awt.Color(255, 204, 204));
        btn_report.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_report.setText("Reports");
        btn_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 0, 51));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DreamDay Venue");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("The best choice to make your day special....");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(490, 490, 490)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 424, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_report, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBookingRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnWeddingHallPackages))
                .addGap(352, 352, 352))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnBookingRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnWeddingHallPackages, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_report, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
  }

