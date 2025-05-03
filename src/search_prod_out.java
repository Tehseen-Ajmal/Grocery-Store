/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class search_prod_out extends javax.swing.JPanel {

    /**
     * Creates new form Add_prod
     */
    ArrayList<String> supid;
    ArrayList<String> categoryIDs;
    public search_prod_out(String p_id) {
        initComponents();
        String sql = "select CategoryID from category;";
        String sql1 = "select SupplierID from Supplier;";
        String url = Const.url;

        String user = Const.user;
        String pass = Const.pass;
        initComponents();

        try (Connection con = DriverManager.getConnection(url, user, pass);
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnsNumber = rsmd.getColumnCount();
            int p = 0;
            categoryIDs = new ArrayList<>();
            while (rs.next()) {
                String id = rs.getString("Categoryid");
                categoryIDs.add(id);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database or executing the query.", e);
        }
        try (Connection con1 = DriverManager.getConnection(url, user, pass);
             Statement st1 = con1.createStatement();
             ResultSet rs1 = st1.executeQuery(sql1)) {
            ResultSetMetaData rsmd = rs1.getMetaData();
            int columnsNumber = rsmd.getColumnCount();
            int p = 0;
            supid = new ArrayList<>();
            while (rs1.next()) {
                String id = rs1.getString("SupplierID");
                supid.add(id);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database or executing the query.", e);
        }
        String[] cat_id_arr = new String[categoryIDs.size()];
        categoryIDs.toArray(cat_id_arr);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(cat_id_arr));
        String[] sup_arr = new String[supid.size()];
        supid.toArray(sup_arr);
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(sup_arr));

    }

    
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        roundPanel6 = new resources.swing.RoundPanel();
        jLabel5 = new javax.swing.JLabel();
        roundPanel1 = new resources.swing.RoundPanel();
        jSeparator1 = new javax.swing.JSeparator();
        email_person1 = new resources.swing.MyTextField();
        jButton2 = new javax.swing.JButton();
        button1 = new resources.swing.Button();
        desc = new resources.swing.MyTextField();
        price = new resources.swing.MyTextField();
        cost = new resources.swing.MyTextField();
        quantity = new resources.swing.MyTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();

        jPanel4.setOpaque(false);

        roundPanel6.setBackground(new java.awt.Color(3, 98, 139));

        jLabel5.setBackground(new java.awt.Color(46, 159, 240));
        jLabel5.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(242, 247, 255));
        jLabel5.setText("Search Product");

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
        email_person1.setHint("Enter Product name");
        email_person1.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/6.png"))); // NOI18N
        email_person1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_person1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 67, 89));
        jButton2.setForeground(new java.awt.Color(240, 240, 240));
        jButton2.setText("Back");
        jButton2.setToolTipText("Go to Products");
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
        button1.setText("Search Product");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        desc.setForeground(new java.awt.Color(200, 200, 200));
        desc.setHint("Enter Description");
        desc.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/6.png"))); // NOI18N
        desc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descActionPerformed(evt);
            }
        });

        price.setForeground(new java.awt.Color(200, 200, 200));
        price.setHint("Enter Unit Price");
        price.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/6.png"))); // NOI18N
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });

        cost.setForeground(new java.awt.Color(200, 200, 200));
        cost.setHint("Enter Cost");
        cost.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/6.png"))); // NOI18N
        cost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costActionPerformed(evt);
            }
        });

        quantity.setForeground(new java.awt.Color(200, 200, 200));
        quantity.setHint("Enter Quantity  of Product");
        quantity.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/6.png"))); // NOI18N
        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N


        jComboBox2.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N


        jComboBox3.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes","No" }));

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
                roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(roundPanel1Layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(email_person1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(roundPanel1Layout.createSequentialGroup()
                                                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 1, Short.MAX_VALUE))
                                                        .addComponent(desc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(quantity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(139, 139, 139))
                                        .addGroup(roundPanel1Layout.createSequentialGroup()
                                                .addGap(198, 198, 198)
                                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        roundPanel1Layout.setVerticalGroup(
                roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(roundPanel1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(14, 14, 14)
                                                .addComponent(email_person1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(desc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(32, 32, 32)
                                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 16, Short.MAX_VALUE))
                                        .addGroup(roundPanel1Layout.createSequentialGroup()
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
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

    private void email_person1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        Main_frame.showForm(new Customer_options());
    }

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {
//        String url = Const.url;
//        String user = Const.user;
//        String pass = Const.pass;
//        try (Connection con = DriverManager.getConnection(url, user, pass)) {
//            int nextPrimaryKey = getNextPrimaryKey(con);
//            String sql = "INSERT INTO [dbo].[Sales Representative] " +
//                    "([SalesRepID], [SalesRepName], [Title], [Birthdate], [HireDate], [SalesRepContactInfo], " +
//                    "[SalesRepRegionId], [SalesRepCountry], [SalesRepCity], [SalesRepAddress], [ReportsTo]) " +
//                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
//            LocalDate currentDate = LocalDate.now();
//            DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//            String formattedDate = currentDate.format(dateFormat);
//            System.out.println((String) jComboBox1.getSelectedItem());
//            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
//                // Set the parameter values for the PreparedStatement
//                pstmt.setString(1, "P"+nextPrimaryKey);
//                pstmt.setString(2, email_person1.getText());
//                pstmt.setString(3, (String) jComboBox1.getSelectedItem());
//                pstmt.setString(4, email_person2.getText());
//                pstmt.setString(5, formattedDate);
//                pstmt.setString(6, email_person3.getText());
//                pstmt.setString(7, (String) jComboBox4.getSelectedItem());
//                pstmt.setString(8,"USA");
//                pstmt.setString(9, (String) jComboBox3.getSelectedItem());
//                pstmt.setString(10, email_person4.getText());
//                pstmt.setString(11, (String) jComboBox2.getSelectedItem());
//                // Execute the insert statement
//                int rowsInserted = pstmt.executeUpdate();
//
//                if (rowsInserted > 0) {
//                    System.out.println("Data inserted successfully.");
//                    email_person1.setText("");
//                    desc.setText("");
//                    price.setText("");
//                    cost.setText("");
//                    quantity.setText("");
//
//                    JOptionPane.showMessageDialog(jPanel4, "Employee Added...\nSRID : "+nextPrimaryKey, "Success", JOptionPane.INFORMATION_MESSAGE);
//                } else {
//                    System.out.println("No data inserted.");
//                }
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException("Error connecting to the database or executing the insert statement.", e);
//        }
    }

    private void descActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void costActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    // Variables declaration - do not modify
    private resources.swing.Button button1;
    private resources.swing.MyTextField cost;
    private resources.swing.MyTextField desc;
    private resources.swing.MyTextField email_person1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private resources.swing.MyTextField price;
    private resources.swing.MyTextField quantity;
    private resources.swing.RoundPanel roundPanel1;
    private resources.swing.RoundPanel roundPanel6;
    // End of variables declaration
}
