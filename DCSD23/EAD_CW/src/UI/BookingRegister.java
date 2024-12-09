
package UI;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils; // For DbUtils


public class BookingRegister extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    
    public BookingRegister() {
        initComponents();
        cmb_etime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Morning", "Afternoon", "Evening" }));
        setTitle("Booking Registeration");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        conn = DBconnection.connect();
        tableload();
        
    }
    public void tableload(){
                try{
                        String sql = "SELECT fullName, contactNumber, emailAddress, EventDate, SelectYourWeddingHall, EventTime, BookingDate, GuestCount FROM bookingRegistration";
                        pstmt = conn.prepareStatement(sql);
                        rs = pstmt.executeQuery();
                        table1.setModel(DbUtils.resultSetToTableModel(rs));
                }catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_bdate = new javax.swing.JTextField();
        txt_emailAddress = new javax.swing.JTextField();
        txt_guestCount = new javax.swing.JTextField();
        txt_fullName = new javax.swing.JTextField();
        cmb_etime = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txt_weddinghall = new javax.swing.JLabel();
        cmb_weddingHall = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_edate = new javax.swing.JTextField();
        txt_contactNo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        btn_delete = new javax.swing.JButton();
        btn_register1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Guest count");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 110, 20));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Full name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 75, 140, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Event time");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 120, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Event date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 120, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Contact number");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 160, -1));
        getContentPane().add(txt_bdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 250, -1));

        txt_emailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailAddressActionPerformed(evt);
            }
        });
        getContentPane().add(txt_emailAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 320, -1));
        getContentPane().add(txt_guestCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 90, -1));
        getContentPane().add(txt_fullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 390, -1));

        cmb_etime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Morning", "Afternoon", "Evening" }));
        cmb_etime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_etimeActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_etime, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 153, 30));

        jPanel1.setBackground(new java.awt.Color(153, 0, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Register Your Booking");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1225, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1490, 60));

        txt_weddinghall.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_weddinghall.setText("Select your wedding hall");
        getContentPane().add(txt_weddinghall, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 190, -1));

        cmb_weddingHall.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmb_weddingHall.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "The Grand Ballroom", "The Ivy Garden", "The Diamond Hall" }));
        cmb_weddingHall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_weddingHallActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_weddingHall, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, -1, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Email address");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 104, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Booking date");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 104, 50));
        getContentPane().add(txt_edate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 270, -1));
        getContentPane().add(txt_contactNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 320, -1));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(table1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 750, 160));

        btn_delete.setBackground(new java.awt.Color(196, 69, 105));
        btn_delete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 480, 90, 40));

        btn_register1.setBackground(new java.awt.Color(196, 69, 105));
        btn_register1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_register1.setText("Register");
        btn_register1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_register1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_register1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1096, 480, 90, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\^  Induni Perera\\EAD\\CourseWork\\Black Minimalist Galaxy Space Desktop Wallpaper (1).png")); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1490, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void cmb_etimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_etimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_etimeActionPerformed

    private void cmb_weddingHallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_weddingHallActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_weddingHallActionPerformed

    private void txt_emailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailAddressActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed

int check = JOptionPane.showConfirmDialog(null, "Do you want to delete?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
                
           if (check == JOptionPane.YES_OPTION) {
                 int selectedRow = table1.getSelectedRow();
                 
                   if (selectedRow == -1) {
                        JOptionPane.showMessageDialog(null, "Please select a row to delete.");
            return;
        }
                 String HallName = table1.getValueAt(selectedRow, 0).toString();
                 
                     try{
                         String sql = "DELETE FROM bookingRegistration WHERE fullName = ?";
                         pstmt = conn.prepareStatement(sql);
                         pstmt.setString(1, HallName);
                        int rows = pstmt.executeUpdate();
                         
                         if (rows > 0) {
                JOptionPane.showMessageDialog(null, "Deleted successfully.");
                tableload(); // Refresh the table
            }
}catch (Exception e){
    JOptionPane.showMessageDialog(null, "Deleted Successfully");
              }
            }            // TODO add your handling code here:
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_register1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_register1ActionPerformed
        
        String sql = "INSERT INTO bookingRegistration (fullName, contactNumber, emailAddress, EventDate, SelectYourWeddingHall, EventTime, BookingDate, GuestCount)" + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

         String url = "jdbc:mysql://localhost:3306/registration"; // Update with your database URL
    String username = "root";  // Update with your database username
    String password = "0131"; 
    
    try (Connection conn = DriverManager.getConnection(url, username, password);
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

       
        String fullName = txt_fullName.getText();
        String contactNumber = txt_contactNo.getText();
        String emailAddress = txt_emailAddress.getText();
        String EventDate = txt_edate.getText();
        String SelectYourWeddingHall= cmb_weddingHall.getSelectedItem().toString();
        String  EventTime= cmb_etime.getSelectedItem().toString();
        String BookingDate = txt_bdate.getText();
        String  GuestCount= txt_guestCount.getText();
        
        
       
        
        if ( fullName.isEmpty() || contactNumber.isEmpty() ||
            emailAddress.isEmpty() || EventDate.isEmpty() || SelectYourWeddingHall.isEmpty() || EventTime.isEmpty() || BookingDate.isEmpty() || GuestCount.isEmpty() ) {
            JOptionPane.showMessageDialog(null, "All fields are required!");
            return;
        }

        pstmt.setString(1,fullName);
        pstmt.setString(2,contactNumber);
        pstmt.setString(3,emailAddress );
        pstmt.setString(4, EventDate);
        pstmt.setString(5, SelectYourWeddingHall);
        pstmt.setString(6,EventTime);
        pstmt.setString(7,BookingDate);
        pstmt.setString(8,GuestCount);
        
        
        
        
        int rows = pstmt.executeUpdate();

        if (rows > 0) {
            JOptionPane.showMessageDialog(null, "Customer added successfully!");
            txt_fullName.setText("");
            txt_contactNo.setText("");
            txt_emailAddress.setText("");
            txt_edate.setText("");
            cmb_weddingHall.setSelectedItem(null);
            cmb_etime.setSelectedItem(null);
            txt_bdate.setText("");
            txt_guestCount.setText("");
            
            
        }
          pstmt.close();
          conn.close();
        } catch (NumberFormatException e) { 
            JOptionPane.showMessageDialog(null, "Invalid Customer ID. Please enter a numeric value.");
        } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Database Error: " + ex.getMessage());
    }//GEN-LAST:event_btn_register1ActionPerformed
tableload();
    }
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_register1;
    private javax.swing.JComboBox<String> cmb_etime;
    private javax.swing.JComboBox<String> cmb_weddingHall;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table1;
    private javax.swing.JTextField txt_bdate;
    private javax.swing.JTextField txt_contactNo;
    private javax.swing.JTextField txt_edate;
    private javax.swing.JTextField txt_emailAddress;
    private javax.swing.JTextField txt_fullName;
    private javax.swing.JTextField txt_guestCount;
    private javax.swing.JLabel txt_weddinghall;
    // End of variables declaration//GEN-END:variables
}
