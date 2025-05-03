
import net.miginfocom.swing.MigLayout;

import java.awt.*;
import java.io.IOException;
import java.sql.*;


public class CheckOut extends javax.swing.JPanel {

    /**
     * Creates new form CheckOut
     */
    Component com;
    float total = 0f;
    public CheckOut(Component co) {
        com = co;
        initComponents();
        trans3.setLayout(new MigLayout("wrap, fillx, inset 3", "[fill]", "[]0[]"));
        roundPanel5.round = 30;
        Cart_address c = new Cart_address();
        trans3.add(c);
        trans3.add(new items_cart());
        String sql = "SELECT ProdName, UnitPrice, QuantityInstock, ProductID, ProdDescription FROM Products WHERE ProductID = ?;";
        String url = Const.url;
        String user = Const.user;
        String pass = Const.pass;

        try (Connection con = DriverManager.getConnection(url, user, pass);
             PreparedStatement pstmt = con.prepareStatement(sql)) {

            // Loop through each product ID and fetch the corresponding product
            int g = 0;

            for (String productId : User_Grocery.p_cart_id) {

                // Set the product ID as a parameter in the prepared statement
                pstmt.setString(1, productId);

                // Execute the query for each product ID
                try (ResultSet rs = pstmt.executeQuery()) {
                    if (rs.next()) {
                        String name = rs.getString("ProdName");
                        float price = rs.getFloat("UnitPrice");
                        int a = User_Grocery.p_qua.get(g);
                        System.out.println(a);
                        trans3.add(new iterms_summary(name,a,price));
                        g++;
                        float b =  (a*price);
                        total+=b;
                    }

                }
            }

        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database or executing the query.", e);
        }
        c.price = total;
        c.initComponents();
        trans3.add(new total_price_del(total));
        System.out.println(total);
        trans3.add(new paynow()); // Add checkout button after fetching products
    }

    //GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel5 = new resources.swing.RoundPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        trans3 = new javax.swing.JPanel();
        buttonOutLine1 = new resources.swing.ButtonOutLine();
        buttonMenu5 = new resources.swing.ButtonMenu();
        buttonMenu6 = new resources.swing.ButtonMenu();

        setOpaque(false);

        roundPanel5.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel5.setMaximumSize(new java.awt.Dimension(32767, 542));

        jLabel6.setBackground(new java.awt.Color(10, 10, 0));
        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(10, 10, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CHECK OUT");

        jScrollPane5.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setBorder(null);
        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane5.setOpaque(false);

        trans3.setBackground(new java.awt.Color(255, 255, 255));
        trans3.setLayout(new java.awt.BorderLayout());
        jScrollPane5.setViewportView(trans3);

        buttonOutLine1.setBackground(new java.awt.Color(0, 0, 0));
        buttonOutLine1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOutLine1ActionPerformed(evt);
            }
        });

        buttonMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/icons8-back-15.png"))); // NOI18N
        buttonMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMenu5ActionPerformed(evt);
            }
        });

        buttonMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/icons8-back-15.png"))); // NOI18N
        buttonMenu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMenu6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundPanel5Layout = new javax.swing.GroupLayout(roundPanel5);
        roundPanel5.setLayout(roundPanel5Layout);
        roundPanel5Layout.setHorizontalGroup(
            roundPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(roundPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(roundPanel5Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(roundPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonMenu5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonMenu6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(buttonOutLine1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                    .addGroup(roundPanel5Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundPanel5Layout.setVerticalGroup(
            roundPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel5Layout.createSequentialGroup()
                .addGroup(roundPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonMenu5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonMenu6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonOutLine1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(roundPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(roundPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonOutLine1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOutLine1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonOutLine1ActionPerformed

    private void buttonMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMenu5ActionPerformed
        User_Grocery.showForm(com);
    }//GEN-LAST:event_buttonMenu5ActionPerformed

    private void buttonMenu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMenu6ActionPerformed
        User_Grocery.showForm(com);
    }//GEN-LAST:event_buttonMenu6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private resources.swing.ButtonMenu buttonMenu5;
    private resources.swing.ButtonMenu buttonMenu6;
    private resources.swing.ButtonOutLine buttonOutLine1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane5;
    private resources.swing.RoundPanel roundPanel5;
    private javax.swing.JPanel trans3;
    // End of variables declaration//GEN-END:variables
}
