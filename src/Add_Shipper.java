/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

import javax.swing.*;
import java.sql.*;

/**
 *
 * @author hp
 */
public class Add_Shipper extends javax.swing.JPanel {

    /**
     * Creates new form ADD_CAT
     */
    public Add_Shipper() {
        initComponents();
    }

    
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        roundPanel6 = new resources.swing.RoundPanel();
        jLabel5 = new javax.swing.JLabel();
        roundPanel1 = new resources.swing.RoundPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        button1 = new resources.swing.Button();
        cost = new resources.swing.MyTextField();
        cost1 = new resources.swing.MyTextField();

        jPanel4.setOpaque(false);

        roundPanel6.setBackground(new java.awt.Color(3, 98, 139));

        jLabel5.setBackground(new java.awt.Color(46, 159, 240));
        jLabel5.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(242, 247, 255));
        jLabel5.setText("Add Shipper");

        javax.swing.GroupLayout roundPanel6Layout = new javax.swing.GroupLayout(roundPanel6);
        roundPanel6.setLayout(roundPanel6Layout);
        roundPanel6Layout.setHorizontalGroup(
                roundPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel6Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundPanel6Layout.setVerticalGroup(
                roundPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
        );

        roundPanel1.setBackground(new java.awt.Color(15, 127, 189));

        jButton2.setBackground(new java.awt.Color(0, 67, 89));
        jButton2.setForeground(new java.awt.Color(240, 240, 240));
        jButton2.setText("Back");
        jButton2.setToolTipText("Go to Person");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setRolloverEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        button1.setBackground(new java.awt.Color(0, 67, 89));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("Add");
        button1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        cost.setForeground(new java.awt.Color(200, 200, 200));
        cost.setHint("Shipper Name");
        cost.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/6.png"))); // NOI18N
        cost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costActionPerformed(evt);
            }
        });

        cost1.setForeground(new java.awt.Color(200, 200, 200));
        cost1.setHint("Contact");
        cost1.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/6.png"))); // NOI18N
        cost1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cost1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
                roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(roundPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(38, 38, 38)
                                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(roundPanel1Layout.createSequentialGroup()
                                                .addGap(253, 253, 253)
                                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(105, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cost1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(129, 129, 129))
        );
        roundPanel1Layout.setVerticalGroup(
                roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(roundPanel1Layout.createSequentialGroup()
                                                .addGap(100, 100, 100)
                                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(17, 17, 17)
                                                .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cost1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(41, 41, 41)
                                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 188, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(roundPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(roundPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0))
        );
    }// </editor-fold>

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        Main_frame.showForm(new Customer_options());
    }
    private static int getNextPrimaryKey(Connection connection) throws SQLException {
        int nextPrimaryKey = 1; // Default starting value
        String maxPrimaryKeyQuery = "SELECT MAX(CAST(SUBSTRING(ShipperID, 3, LEN(ShipperID) - 1) AS INT)) AS MaxID FROM Shippers";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(maxPrimaryKeyQuery)) {
            if (resultSet.next()) {
                int maxPrimaryKey = resultSet.getInt(1);
                nextPrimaryKey = maxPrimaryKey + 1;
            }
        }
        return nextPrimaryKey;
    }

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {
            String url = Const.url;
            String user = Const.user;
            String pass = Const.pass;
            try (Connection con = DriverManager.getConnection(url, user, pass)) {
                int nextPrimaryKey = getNextPrimaryKey(con);
                String sql = "INSERT INTO [Shippers] ([ShipperID],[ServiceProviderName], [ShipperContact]) VALUES (?,?, ?);";
                try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                    pstmt.setString(1,"SH"+nextPrimaryKey);
                    pstmt.setString(2,cost.getText());
                    pstmt.setString(3,cost1.getText());
                    // Execute the insert statement
                    int rowsInserted = pstmt.executeUpdate();

                    if (rowsInserted > 0) {
                        System.out.println("Data inserted successfully.");
                        JOptionPane.showMessageDialog(jPanel4, "Shipper Added...\nSHID : SH"+nextPrimaryKey, "Success", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        System.out.println("No data inserted.");
                    }
                }
            } catch (SQLException e) {
                throw new RuntimeException("Error connecting to the database or executing the insert statement.", e);
            }
            Main_frame.showForm(new Add_prod());
        }

    private void costActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void cost1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    // Variables declaration - do not modify
    private resources.swing.Button button1;
    private resources.swing.MyTextField cost;
    private resources.swing.MyTextField cost1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private resources.swing.RoundPanel roundPanel1;
    private resources.swing.RoundPanel roundPanel6;
    // End of variables declaration
}
