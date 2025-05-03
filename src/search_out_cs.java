

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

import java.sql.*;

/**
 *
 * @author hp
 */
public class search_out_cs extends javax.swing.JPanel {

    /**
     * Creates new form Search_person
     */
    String c_id;
    public search_out_cs(String pk) {
        c_id = pk;
        initComponents();
        String sql = "select CustName, CustContact, CustAddress, CustomerType, CustomerSegment, CustRegion, PostalCode, CustCountry\n" +
                "from Customer where CustomerID = '"+c_id+"';";
        String url = Const.url;
        String user = Const.user;
        String pass = Const.pass;

        try (Connection con = DriverManager.getConnection(url, user, pass);
             PreparedStatement pstmt = con.prepareStatement(sql)) {

            // Loop through each product ID and fetch the corresponding product
            int g = 0;
            // Execute the query for each product ID
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    name_per.setText(rs.getString(1));
                    father_per.setText(rs.getString(2));
                    cnic_person.setText(rs.getString(3));
                    age_person.setText(rs.getString(4));
                    email_person.setText(rs.getString(5));
                    email_person1.setText(rs.getString(6));
                    email_person2.setText(rs.getString(7));
                    email_person3.setText(rs.getString(8));
                    g++;

                }

            }if(g==0){
                Main_frame.showForm(new no_found());
            }
        }

        catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database or executing the query.", e);
        }


    }

    
    private void initComponents() {

        roundPanel3 = new resources.swing.RoundPanel();
        jLabel2 = new javax.swing.JLabel();
        roundPanel1 = new resources.swing.RoundPanel();
        name_per = new resources.swing.MyTextField();
        father_per = new resources.swing.MyTextField();
        cnic_person = new resources.swing.MyTextField();
        age_person = new resources.swing.MyTextField();
        email_person = new resources.swing.MyTextField();
        email_person1 = new resources.swing.MyTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        email_person2 = new resources.swing.MyTextField();
        jLabel10 = new javax.swing.JLabel();
        email_person3 = new resources.swing.MyTextField();

        roundPanel3.setBackground(new java.awt.Color(3, 98, 139));
        setOpaque(false);
        jLabel2.setBackground(new java.awt.Color(46, 159, 240));
        jLabel2.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 247, 255));
        jLabel2.setText("Customer");

        javax.swing.GroupLayout roundPanel3Layout = new javax.swing.GroupLayout(roundPanel3);
        roundPanel3.setLayout(roundPanel3Layout);
        roundPanel3Layout.setHorizontalGroup(
                roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel3Layout.createSequentialGroup()
                                .addContainerGap(291, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addContainerGap(290, Short.MAX_VALUE))
        );
        roundPanel3Layout.setVerticalGroup(
                roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        roundPanel1.setBackground(new java.awt.Color(15, 127, 189));
        roundPanel1.setLayout(null);

        name_per.setEditable(false);
        name_per.setForeground(new java.awt.Color(200, 200, 200));
        name_per.setHint("Nam");
        name_per.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/3.png"))); // NOI18N
        roundPanel1.add(name_per);
        name_per.setBounds(170, 10, 403, 38);

        father_per.setEditable(false);
        father_per.setForeground(new java.awt.Color(200, 200, 200));
        father_per.setHint("Contact");
        father_per.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/custom.png"))); // NOI18N
        roundPanel1.add(father_per);
        father_per.setBounds(170, 70, 403, 38);

        cnic_person.setEditable(false);
        cnic_person.setForeground(new java.awt.Color(200, 200, 200));
        cnic_person.setHint("CNIC (XXXXX-XXXXXXX-X)");
        cnic_person.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/4.png"))); // NOI18N
        roundPanel1.add(cnic_person);
        cnic_person.setBounds(170, 120, 403, 38);

        age_person.setEditable(false);
        age_person.setForeground(new java.awt.Color(200, 200, 200));
        age_person.setHint("Age...");
        age_person.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/5.png"))); // NOI18N
        roundPanel1.add(age_person);
        age_person.setBounds(170, 180, 403, 38);

        email_person.setEditable(false);
        email_person.setForeground(new java.awt.Color(200, 200, 200));
        email_person.setHint("Email...");
        email_person.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/mail.png"))); // NOI18N
        email_person.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_personActionPerformed(evt);
            }
        });
        roundPanel1.add(email_person);
        email_person.setBounds(170, 230, 403, 38);

        email_person1.setEditable(false);
        email_person1.setForeground(new java.awt.Color(200, 200, 200));
        email_person1.setHint("Email...");
        email_person1.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/6.png"))); // NOI18N
        roundPanel1.add(email_person1);
        email_person1.setBounds(170, 290, 403, 38);

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Name:");
        roundPanel1.add(jLabel3);
        jLabel3.setBounds(90, 10, 69, 30);

        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Address");
        roundPanel1.add(jLabel4);
        jLabel4.setBounds(90, 120, 69, 30);

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Type:");
        roundPanel1.add(jLabel5);
        jLabel5.setBounds(90, 180, 69, 30);

        jLabel6.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Segment:");
        roundPanel1.add(jLabel6);
        jLabel6.setBounds(90, 240, 69, 30);

        jLabel7.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Region:");
        roundPanel1.add(jLabel7);
        jLabel7.setBounds(90, 290, 69, 30);

        jLabel8.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Contact:");
        roundPanel1.add(jLabel8);
        jLabel8.setBounds(90, 70, 69, 30);

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
        roundPanel1.add(jButton2);
        jButton2.setBounds(10, 430, 54, 31);

        jLabel9.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Postal:");
        roundPanel1.add(jLabel9);
        jLabel9.setBounds(90, 350, 69, 30);

        email_person2.setEditable(false);
        email_person2.setForeground(new java.awt.Color(200, 200, 200));
        email_person2.setHint("Email...");
        email_person2.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/6.png"))); // NOI18N
        roundPanel1.add(email_person2);
        email_person2.setBounds(170, 350, 403, 38);

        jLabel10.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("Country:");
        roundPanel1.add(jLabel10);
        jLabel10.setBounds(90, 410, 69, 30);

        email_person3.setEditable(false);
        email_person3.setForeground(new java.awt.Color(200, 200, 200));
        email_person3.setHint("Email...");
        email_person3.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/6.png"))); // NOI18N
        roundPanel1.add(email_person3);
        email_person3.setBounds(170, 410, 403, 38);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(roundPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(roundPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE))
        );
    }// </editor-fold>

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        Main_frame.showForm(new Customer_options());
    }

    private void email_personActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    // Variables declaration - do not modify
    private resources.swing.MyTextField age_person;
    private resources.swing.MyTextField cnic_person;
    private resources.swing.MyTextField email_person;
    private resources.swing.MyTextField email_person1;
    private resources.swing.MyTextField email_person2;
    private resources.swing.MyTextField email_person3;
    private resources.swing.MyTextField father_per;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private resources.swing.MyTextField name_per;
    private resources.swing.RoundPanel roundPanel1;
    private resources.swing.RoundPanel roundPanel3;
    // End of variables declaration
}
