package UI;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;
import UI.DBconnectionpackages;


public class WeddingHallPackages extends javax.swing.JFrame {
     Connection conn = null;
     PreparedStatement pstmt = null;
     ResultSet rs = null;

    
    public WeddingHallPackages() {
        initComponents();
        setTitle(" Adding wedding hall details");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        conn = DBconnectionpackages.connect();
        tableload();
    }
     public void tableload(){
                try{
                        String url = "jdbc:mysql://localhost:3306/registration"; 
                        String user = "root";
                        String password = "0131";
                        String sql = "SELECT  hall_name, capacity, price_range FROM hallpackages ";
                        pstmt = conn.prepareStatement(sql);
                        rs = pstmt.executeQuery();
                        pkgTable.setModel(DbUtils.resultSetToTableModel(rs));
                }catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmb_hallName = new javax.swing.JComboBox<>();
        txt_capacity = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_Capacity = new javax.swing.JTextField();
        txt_hallPrice = new javax.swing.JTextField();
        btn_add = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pkgTable = new javax.swing.JTable();
        btn_delete = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 0, 51));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Wedding hall Packages");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(711, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1040, 60);

        jLabel2.setText("Wedding hall name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(26, 85, 128, 16);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(220, 85, 115, 0);

        jLabel4.setText("Capacity");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(26, 174, 164, 16);

        jLabel5.setText("Price per day");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(26, 268, 120, 16);

        cmb_hallName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "The Grand Ballroom", "The Ivy Garden", "The Diamond Hall" }));
        getContentPane().add(cmb_hallName);
        cmb_hallName.setBounds(26, 107, 140, 22);
        getContentPane().add(txt_capacity);
        txt_capacity.setBounds(26, 222, 37, 0);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(103, 228, 37, 0);

        txt_Capacity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CapacityActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Capacity);
        txt_Capacity.setBounds(26, 194, 140, 22);
        getContentPane().add(txt_hallPrice);
        txt_hallPrice.setBounds(26, 290, 140, 22);

        btn_add.setBackground(new java.awt.Color(196, 69, 105));
        btn_add.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        getContentPane().add(btn_add);
        btn_add.setBounds(890, 320, 72, 24);

        pkgTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Wedding Hall name", "Capacity", "Price per day"
            }
        ));
        jScrollPane1.setViewportView(pkgTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(550, 80, 421, 179);

        btn_delete.setBackground(new java.awt.Color(196, 69, 105));
        btn_delete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_delete);
        btn_delete.setBounds(780, 320, 72, 24);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\^  Induni Perera\\EAD\\CourseWork\\Black Minimalist Galaxy Space Desktop Wallpaper (1).png")); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 60, 1040, 330);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        
        String url = "jdbc:mysql://localhost:3306/registration"; 
        String user = "root";
        String password = "0131";
        String sql = "INSERT INTO hallpackages(hall_name, capacity, price_range) VALUES (?, ?, ?)";
        
        try(Connection conn = DriverManager.getConnection(url, user, password);
                PreparedStatement pstmt = conn.prepareStatement(sql)){ 
           
            String hall_name = (String) cmb_hallName.getSelectedItem(); 
             if (hall_name == null || hall_name.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please select a hall name.");
            return;
            }
             if (txt_Capacity.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a capacity.");
            return;
        }
             
        int capacity = Integer.parseInt(txt_Capacity.getText().trim());

        // Ensure price_range is correctly fetched
        String price_range = txt_hallPrice.getText().trim();
         if (price_range.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a price range.");
            return;
        }
             pstmt.setString(1,hall_name);
             pstmt.setInt(2, capacity);
             pstmt.setString(3, price_range);
             
             int rows = pstmt.executeUpdate();
             
             if(rows > 0){
                    JOptionPane.showMessageDialog(null, " Added successfully"); 
                      
                      cmb_hallName.setSelectedIndex(0);
                      txt_Capacity.setText("");
                      txt_hallPrice.setText("");
                      
                      loadAllData();
                    
                
    }//GEN-LAST:event_btn_addActionPerformed
}catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Database Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Invalid number format for capacity.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    
    
   private void loadAllData() {
    try {
        String sql = "SELECT hall_name, capacity, price_range FROM hallpackages";
        pstmt = conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
        
      
        pkgTable.setModel(DbUtils.resultSetToTableModel(rs));
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error loading data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
} 
    private void txt_CapacityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CapacityActionPerformed


       
    }//GEN-LAST:event_txt_CapacityActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        
         int check = JOptionPane.showConfirmDialog(null, "Do you want to delete?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
                
           if (check == JOptionPane.YES_OPTION) {
                 int selectedRow = pkgTable.getSelectedRow();
                 
                   if (selectedRow == -1) {
                        JOptionPane.showMessageDialog(null, "Please select a row to delete.");
            return;
        }
                 String HallName = pkgTable.getValueAt(selectedRow, 0).toString();
                 
                     try{
                         String sql = "DELETE FROM hallpackages WHERE hall_name = ?";
                         pstmt = conn.prepareStatement(sql);
                         pstmt.setString(1, HallName);
                        int rows = pstmt.executeUpdate();
                         
                         if (rows > 0) {
                JOptionPane.showMessageDialog(null, "Deleted successfully.");
                loadAllData(); // Refresh the table
            }
}catch (Exception e){
    JOptionPane.showMessageDialog(null, "Deleted Successfully");
              }
            }
    }//GEN-LAST:event_btn_deleteActionPerformed

public static void main(String args[]){
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WeddingHallPackages().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_delete;
    private javax.swing.JComboBox<String> cmb_hallName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable pkgTable;
    private javax.swing.JTextField txt_Capacity;
    private javax.swing.JLabel txt_capacity;
    private javax.swing.JTextField txt_hallPrice;
    // End of variables declaration//GEN-END:variables
}