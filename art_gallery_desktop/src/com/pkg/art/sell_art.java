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
import net.proteanit.sql.DbUtils;


/**
 *
 * @author DOKEPATIL
 */
public class sell_art extends javax.swing.JPanel {

    /**
     * Creates new form sell_art
     */
    public sell_art() {
        initComponents();
    }
    private void Update_table3() 
    {
        PreparedStatement ps;
        ResultSet rs;
        try
        {
                String sql ="select * from cart";
                ps=DB_CON.getConnection().prepareStatement(sql);
                rs=ps.executeQuery();
                tbl_3.setModel(DbUtils.resultSetToTableModel(rs)); 

    }
    catch(SQLException e){
    JOptionPane.showMessageDialog(null, e);
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        jPanel_title1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        btn_add = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_3 = new javax.swing.JTable();
        bill = new javax.swing.JButton();

        jPanel_title1.setBackground(new java.awt.Color(102, 255, 102));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Add Products to Cart");

        javax.swing.GroupLayout jPanel_title1Layout = new javax.swing.GroupLayout(jPanel_title1);
        jPanel_title1.setLayout(jPanel_title1Layout);
        jPanel_title1Layout.setHorizontalGroup(
            jPanel_title1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_title1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel_title1Layout.setVerticalGroup(
            jPanel_title1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_title1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Art Id:");

        txt_id.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_idKeyReleased(evt);
            }
        });

        btn_add.setBackground(new java.awt.Color(0, 84, 140));
        btn_add.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_add.setText("Add to Cart");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        tbl_3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tbl_3);

        bill.setBackground(new java.awt.Color(0, 84, 140));
        bill.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bill.setText("Generate Bill");
        bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jLabel1)
                                .addGap(28, 28, 28)
                                .addComponent(txt_id, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                .addGap(62, 62, 62)
                                .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(248, 248, 248)
                                .addComponent(jPanel_title1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 124, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(bill, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_title1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_id)
                    .addComponent(jLabel1)
                    .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(bill, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_idKeyReleased

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        PreparedStatement ps;
            ResultSet rs;
            String artid=txt_id.getText();
            String artname="";
            String artistid="";
            String cate="";
            String price="";
            String query = "select * from art where id=?";
            
            try {
                ps = DB_CON.getConnection().prepareStatement(query);
                ps.setString(1, artid);
                rs=ps.executeQuery();
                while(rs.next())
                {
                    artname=rs.getString("art_name");
                    artistid=rs.getString("artist_id_fc");
                    cate=rs.getString("category");
                    price=rs.getString("price");
                }
             String query1;
             query1="INSERT INTO `cart`(`id`, `art_name`, `artist_id`, `category`, `price`) VALUES (?,?,?,?,?)";
             ps=DB_CON.getConnection().prepareStatement(query1);
             ps.setString(1, artid);
             ps.setString(2, artname);
             ps.setString(3, artistid);
             ps.setString(4, cate);
             ps.setString(5, price);
             if(ps.executeUpdate() !=0)
                {
                    JOptionPane.showMessageDialog(null, "Record Inserted");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Error while Inserting!!");
                }
             Update_table3();
             //String query3="delete from art where id=?";
             //ps=DB_CON.getConnection().prepareStatement(query3);
            // ps.setString(1, artid);
            // ps.execute();
            } 
            catch (SQLException ex) {
                Logger.getLogger(add_new_cust.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_btn_addActionPerformed

    private void billActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billActionPerformed
        // TODO add your handling code here:
                bill_form form = new bill_form();
                form.setVisible(true);
                form.pack();
                form.setLocationRelativeTo(null);
    }//GEN-LAST:event_billActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bill;
    private javax.swing.JButton btn_add;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel_title1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tbl_3;
    private javax.swing.JTextField txt_id;
    // End of variables declaration//GEN-END:variables
}
