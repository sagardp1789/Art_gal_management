/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pkg.art;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DOKEPATIL
 */
public class add_new_artist extends javax.swing.JPanel {

    /**
     * Creates new form add_new_artist
     */
    public add_new_artist() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel_title = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_mobile = new javax.swing.JTextField();
        txt_artist = new javax.swing.JTextField();
        txt_bank_name = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_address = new javax.swing.JTextArea();
        btn_add_art = new javax.swing.JButton();
        txt_account_no = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_ifsc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(228, 226, 226));

        jPanel1.setBackground(new java.awt.Color(228, 226, 226));

        jPanel2.setBackground(new java.awt.Color(228, 226, 226));

        jPanel_title.setBackground(new java.awt.Color(102, 255, 102));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Add New Artist");

        javax.swing.GroupLayout jPanel_titleLayout = new javax.swing.GroupLayout(jPanel_title);
        jPanel_title.setLayout(jPanel_titleLayout);
        jPanel_titleLayout.setHorizontalGroup(
            jPanel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_titleLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel3)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel_titleLayout.setVerticalGroup(
            jPanel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_titleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Artist Name:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Mobile No:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Account No:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Address:");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Bank Name:");

        txt_mobile.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_mobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_mobileKeyTyped(evt);
            }
        });

        txt_artist.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_bank_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_bank_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bank_nameActionPerformed(evt);
            }
        });
        txt_bank_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_bank_nameKeyTyped(evt);
            }
        });

        txt_address.setColumns(20);
        txt_address.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_address.setRows(5);
        jScrollPane1.setViewportView(txt_address);

        btn_add_art.setBackground(new java.awt.Color(0, 84, 140));
        btn_add_art.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_add_art.setText("ADD");
        btn_add_art.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_artActionPerformed(evt);
            }
        });

        txt_account_no.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_account_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_account_noKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("Bank Details");

        txt_ifsc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_ifsc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ifscKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("IFSC Code:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addGap(118, 118, 118)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_artist, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_bank_name, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_account_no, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ifsc, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(btn_add_art, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jPanel_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(205, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_artist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(63, 63, 63))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_bank_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_account_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ifsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(41, 41, 41)
                .addComponent(btn_add_art, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 822, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_mobileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_mobileKeyTyped
        // Accept only no

    }//GEN-LAST:event_txt_mobileKeyTyped

    private void txt_bank_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bank_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bank_nameActionPerformed

    private void txt_bank_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_bank_nameKeyTyped
        // Accept only no

    }//GEN-LAST:event_txt_bank_nameKeyTyped

    private void btn_add_artActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_artActionPerformed
        String name=txt_artist.getText();
        String mobile_no=txt_mobile.getText();
        String address=txt_address.getText();
        String bank_name=txt_bank_name.getText();
        String account_no=txt_account_no.getText();
        String ifsc_code=txt_ifsc.getText();
        PreparedStatement ps;
        ResultSet rs;
        String new_cust_query = "INSERT INTO `artist`(`name`, `mobile_no`, `address`, `bank_name`, `account_no`,`ifsc_code`) VALUES (?,?,?,?,?,?)";
            
            try {
                ps = DB_CON.getConnection().prepareStatement(new_cust_query);
                ps.setString(1, name);
                ps.setString(2, mobile_no);
                ps.setString(3, address);
                ps.setString(4, bank_name);
                ps.setString(5, account_no);
                ps.setString(6, ifsc_code);
               
                if(ps.executeUpdate() !=0)
                {
                    JOptionPane.showMessageDialog(null, "Record Inserted");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Error while Inserting!!");
                }
                
            } 
            catch (SQLException ex) {
                Logger.getLogger(add_new_cust.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_btn_add_artActionPerformed

    private void txt_account_noKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_account_noKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_account_noKeyTyped

    private void txt_ifscKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ifscKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ifscKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add_art;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_title;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_account_no;
    private javax.swing.JTextArea txt_address;
    private javax.swing.JTextField txt_artist;
    private javax.swing.JTextField txt_bank_name;
    private javax.swing.JTextField txt_ifsc;
    private javax.swing.JTextField txt_mobile;
    // End of variables declaration//GEN-END:variables
}