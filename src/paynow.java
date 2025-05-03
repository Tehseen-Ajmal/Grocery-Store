/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author hp
 */
public class paynow extends javax.swing.JPanel {

    /**
     * Creates new form paynow
     */
    public paynow() {

        initComponents();

    }

    
    private void initComponents() {
        setOpaque(false);
        button1 = new resources.swing.Button();

        button1.setBackground(new java.awt.Color(0, 51, 51));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("PAY NOW");
        button1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(button1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>
    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {
        String url = Const.url;
        String user = Const.user;
        String pass = Const.pass;
        try (Connection con = DriverManager.getConnection(url, user, pass)) {
            String sql = "UPDATE Products SET [QuantityInstock] = [QuantityInstock] - ? WHERE ProductID = ?;";
            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int g = 0;
                for (String pid:User_Grocery.p_cart_id) {
                    pstmt.setString(2,pid);
                    pstmt.setInt(1,User_Grocery.p_qua.get(g));
                    g++;
                }
                // Execute the insert statement
                pstmt.executeUpdate();

            }
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database or executing the insert statement.", e);
        }

        User_Grocery.p_qua.clear();
        User_Grocery.p_cart_id.clear();
        User_Grocery.showForm(User_Grocery.main_actual);
    }
    // Variables declaration - do not modify
    private resources.swing.Button button1;
    // End of variables declaration
}
