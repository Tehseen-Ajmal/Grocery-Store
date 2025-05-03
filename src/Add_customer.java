
import javax.swing.*;
import java.sql.*;


public class Add_customer extends javax.swing.JPanel {

    /**
     * Creates new form Add_customer
     */
        
    public Add_customer() {
        initComponents();
    }

    //GEN-BEGIN:initComponents
    public static boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        roundPanel6 = new resources.swing.RoundPanel();
        jLabel5 = new javax.swing.JLabel();
        roundPanel1 = new resources.swing.RoundPanel();
        jSeparator1 = new javax.swing.JSeparator();
        email_person1 = new resources.swing.MyTextField();
        jButton2 = new javax.swing.JButton();
        email_person2 = new resources.swing.MyTextField();
        email_person3 = new resources.swing.MyTextField();
        email_person4 = new resources.swing.MyTextField();
        email_person5 = new resources.swing.MyTextField();
        email_person6 = new resources.swing.MyTextField();
        email_person7 = new resources.swing.MyTextField();
        email_person8 = new resources.swing.MyTextField();
        button1 = new resources.swing.Button();

        setOpaque(false);

        jPanel4.setOpaque(false);

        roundPanel6.setBackground(new java.awt.Color(3, 98, 139));

        jLabel5.setBackground(new java.awt.Color(46, 159, 240));
        jLabel5.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(242, 247, 255));
        jLabel5.setText("Add Customer");

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

        email_person1.setForeground(new java.awt.Color(200, 200, 200));
        email_person1.setHint("Enter Customer name");
        email_person1.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/6.png"))); // NOI18N
        email_person1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_person1ActionPerformed(evt);
            }
        });

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

        email_person2.setForeground(new java.awt.Color(200, 200, 200));
        email_person2.setHint("Customer Contact");
        email_person2.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/6.png"))); // NOI18N
        email_person2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_person2ActionPerformed(evt);
            }
        });

        email_person3.setForeground(new java.awt.Color(200, 200, 200));
        email_person3.setHint("Customer Address");
        email_person3.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/6.png"))); // NOI18N
        email_person3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_person3ActionPerformed(evt);
            }
        });

        email_person4.setForeground(new java.awt.Color(200, 200, 200));
        email_person4.setHint("Customer Type");
        email_person4.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/6.png"))); // NOI18N
        email_person4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_person4ActionPerformed(evt);
            }
        });

        email_person5.setForeground(new java.awt.Color(200, 200, 200));
        email_person5.setHint("Segment");
        email_person5.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/6.png"))); // NOI18N
        email_person5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_person5ActionPerformed(evt);
            }
        });

        email_person6.setForeground(new java.awt.Color(200, 200, 200));
        email_person6.setHint("Region");
        email_person6.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/6.png"))); // NOI18N
        email_person6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_person6ActionPerformed(evt);
            }
        });

        email_person7.setForeground(new java.awt.Color(200, 200, 200));
        email_person7.setHint("Country");
        email_person7.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/6.png"))); // NOI18N
        email_person7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_person7ActionPerformed(evt);
            }
        });

        email_person8.setForeground(new java.awt.Color(200, 200, 200));
        email_person8.setHint("Postal Code");
        email_person8.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/6.png"))); // NOI18N
        email_person8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_person8ActionPerformed(evt);
            }
        });

        button1.setBackground(new java.awt.Color(0,67,89));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("Add Customer");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 1, Short.MAX_VALUE))
                            .addComponent(email_person1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(email_person2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(email_person3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(email_person4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(email_person5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(email_person6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(email_person7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(email_person8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170)))
                .addGap(104, 104, 104))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addContainerGap(20, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(email_person1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(email_person2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(email_person3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(email_person4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(email_person5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(email_person6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(email_person8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(email_person7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 28, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
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
    }// </editor-fold>//GEN-END:initComponents
    private static int getNextPrimaryKey(Connection connection) throws SQLException {
        int nextPrimaryKey = 1; // Default starting value
        String maxPrimaryKeyQuery = "SELECT MAX(CAST(CASE WHEN ISNUMERIC(SUBSTRING(CustomerId, 2, LEN(CustomerId))) = 1 \n" +
                "                    THEN SUBSTRING(CustomerId, 2, LEN(CustomerId))\n" +
                "                    ELSE NULL\n" +
                "               END AS INT)) AS MaxCustomerId\n" +
                "FROM Customer;";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(maxPrimaryKeyQuery)) {
            if (resultSet.next()) {
                int maxPrimaryKey = resultSet.getInt(1);
                nextPrimaryKey = maxPrimaryKey + 1;
            }
        }
        return nextPrimaryKey;
    }

    private void email_person1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_person1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_person1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         Main_frame.showForm(new Customer_options());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void email_person2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_person2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_person2ActionPerformed

    private void email_person3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_person3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_person3ActionPerformed

    private void email_person4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_person4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_person4ActionPerformed

    private void email_person5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_person5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_person5ActionPerformed


    private void email_person6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_person6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_person6ActionPerformed

    private void email_person7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_person7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_person7ActionPerformed

    private void email_person8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_person8ActionPerformed

    }//GEN-LAST:event_email_person8ActionPerformed
    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        String url = Const.url;
        String user = Const.user;
        String pass = Const.pass;
        boolean isNumeric = isNumeric(email_person8.getText());
        System.out.println(isNumeric);
        if(email_person8.getText().length()>0 && !isNumeric){
                email_person8.setText("");
                JOptionPane.showMessageDialog(jPanel4, "Postal Code can only have digits.", "Error", JOptionPane.INFORMATION_MESSAGE);

        }else if(email_person8.getText().length()==0){
            JOptionPane.showMessageDialog(jPanel4, "Postal Can't be empty.", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(email_person1.getText().length()==0){
            JOptionPane.showMessageDialog(jPanel4, "Name section Can't be Null.", "Error", JOptionPane.INFORMATION_MESSAGE);
        }else if(email_person2.getText().length()==0){
            JOptionPane.showMessageDialog(jPanel4, "Name section Can't be Null.", "Error", JOptionPane.INFORMATION_MESSAGE);
        }else if(email_person3.getText().length()==0){
            JOptionPane.showMessageDialog(jPanel4, "Name section Can't be Null.", "Error", JOptionPane.INFORMATION_MESSAGE);
        }else if(email_person4.getText().length()==0){
            JOptionPane.showMessageDialog(jPanel4, "Name section Can't be Null.", "Error", JOptionPane.INFORMATION_MESSAGE);
        }else if(email_person5.getText().length()==0){
            JOptionPane.showMessageDialog(jPanel4, "Name section Can't be Null.", "Error", JOptionPane.INFORMATION_MESSAGE);
        }else if(email_person6.getText().length()==0){
            JOptionPane.showMessageDialog(jPanel4, "Name section Can't be Null.", "Error", JOptionPane.INFORMATION_MESSAGE);
        }else if(email_person7.getText().length()==0){
            JOptionPane.showMessageDialog(jPanel4, "Name section Can't be Null.", "Error", JOptionPane.INFORMATION_MESSAGE);
        }else if(isNumeric){

            System.out.println("pressed...");
        try (Connection con = DriverManager.getConnection(url, user, pass)) {
            int nextPrimaryKey = getNextPrimaryKey(con);
            String sql = "INSERT INTO Customer (CustomerID, CustName, CustContact, CustAddress, CustomerType, CustomerSegment, CustRegion, PostalCode, CustCountry) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                // Set the parameter values for the PreparedStatement
                pstmt.setString(1, "C"+nextPrimaryKey);
                pstmt.setString(2, email_person1.getText());
                pstmt.setString(3, email_person2.getText());
                pstmt.setString(4, email_person3.getText());
                pstmt.setString(5, email_person4.getText());
                pstmt.setString(6, email_person5.getText());
                pstmt.setString(7, email_person6.getText());
                pstmt.setString(8, email_person8.getText());
                pstmt.setString(9, email_person7.getText());

                // Execute the insert statement
                int rowsInserted = pstmt.executeUpdate();

                if (rowsInserted > 0) {
                    System.out.println("Data inserted successfully.");
                    email_person1.setText("");
                    email_person2.setText("");
                    email_person3.setText("");
                    email_person4.setText("");
                    email_person5.setText("");
                    email_person6.setText("");
                    email_person7.setText("");
                    email_person8.setText("");
                    JOptionPane.showMessageDialog(jPanel4, "Success", "Information", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    System.out.println("No data inserted.");
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database or executing the insert statement.", e);
        }}
    }//GEN-LAST:event_button1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private resources.swing.Button button1;
    private resources.swing.MyTextField email_person1;
    private resources.swing.MyTextField email_person2;
    private resources.swing.MyTextField email_person3;
    private resources.swing.MyTextField email_person4;
    private resources.swing.MyTextField email_person5;
    private resources.swing.MyTextField email_person6;
    private resources.swing.MyTextField email_person7;
    private resources.swing.MyTextField email_person8;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private resources.swing.RoundPanel roundPanel1;
    private resources.swing.RoundPanel roundPanel6;
    // End of variables declaration//GEN-END:variables
}
