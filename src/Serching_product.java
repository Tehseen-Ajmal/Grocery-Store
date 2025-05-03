
import net.miginfocom.swing.MigLayout;

import java.awt.*;
import java.io.IOException;
import java.sql.*;


public class Serching_product extends javax.swing.JPanel {
    String seru;
    /**
     * Creates new form Serching_product
     */
    public Serching_product(String sir) throws IOException {
        String sql = "SELECT p.ProdName, p.UnitPrice, p.QuantityInstock, p.ProdDescription, s.SupplierName,p.ProductID\n" +
                "FROM Products p\n" +
                "JOIN Supplier s ON p.SupplierID = s.SupplierID WHERE p.ProdName LIKE '%"+sir+"%'";

        String url = Const.url;

        String user = Const.user;
        String pass = Const.pass;
        seru = sir;
        initComponents();
        roundPanel1.round=35;
        trans3.setLayout(new MigLayout("wrap, fillx, inset 3", "[fill]", "[]0[]"));
        myTextField1.col = "FFFFFF";roundPanel1.round = 35;
        myTextField1.col1 = new Color(255,255,255,100);
        try (Connection con = DriverManager.getConnection(url, user, pass);
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnsNumber = rsmd.getColumnCount();
            int p = 0;
            while (rs.next()) {
                p++;
                String name = rs.getString(1);
                String price = Float.toString(rs.getFloat(2));
                int quan = rs.getInt(3);
                String des =rs.getString(4);
                String sup =rs.getString(5);
                String id =rs.getString(6);
                trans3.add(new fetch_product(name,price,quan,des,sup,id));
            }
            if(p==0){
                trans3.add(new Out_stock("No Product Found"));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database or executing the query.", e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new resources.swing.RoundPanel();
        jPanel2 = new javax.swing.JPanel();
        buttonMenu2 = new resources.swing.ButtonMenu();
        myTextField1 = new resources.swing.MyTextField();
        buttonOutLine1 = new resources.swing.ButtonOutLine();
        buttonMenu3 = new resources.swing.ButtonMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        trans3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();

        setOpaque(false);

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        buttonMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/icons8-search-15.png"))); // NOI18N
        buttonMenu2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    buttonMenu2ActionPerformed(evt);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        jPanel2.add(buttonMenu2);
        buttonMenu2.setBounds(200, 0, 40, 30);

        myTextField1.setForeground(new java.awt.Color(0, 51, 51));
        myTextField1.setText(seru);
        myTextField1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        myTextField1.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        myTextField1.setHint("Search");
        jPanel2.add(myTextField1);
        myTextField1.setBounds(10, 0, 190, 32);

        buttonOutLine1.setBackground(new java.awt.Color(0, 0, 0));
        buttonOutLine1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel2.add(buttonOutLine1);
        buttonOutLine1.setBounds(0, 0, 240, 35);

        buttonMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/icons8-back-15.png"))); // NOI18N
        buttonMenu3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMenu3ActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setToolTipText("");
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setOpaque(false);

        trans3.setBackground(new java.awt.Color(255, 255, 255));
        trans3.setForeground(new java.awt.Color(255, 255, 255));
        trans3.setMaximumSize(new java.awt.Dimension(277, 2147483647));
        trans3.setLayout(new java.awt.BorderLayout());
        jScrollPane1.setViewportView(trans3);

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                        .addComponent(buttonMenu3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)))
                .addContainerGap())
            .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(roundPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonMenu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(474, Short.MAX_VALUE))
            .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(roundPanel1Layout.createSequentialGroup()
                    .addGap(59, 59, 59)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMenu2ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event_buttonMenu2ActionPerformed
        User_Grocery.showForm(new Serching_product((myTextField1.getText())));
    }//GEN-LAST:event_buttonMenu2ActionPerformed

    private void buttonMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMenu3ActionPerformed
        User_Grocery.showForm(User_Grocery.main_actual);
    }//GEN-LAST:event_buttonMenu3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private resources.swing.ButtonMenu buttonMenu2;
    private resources.swing.ButtonMenu buttonMenu3;
    private resources.swing.ButtonOutLine buttonOutLine1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private resources.swing.MyTextField myTextField1;
    private resources.swing.RoundPanel roundPanel1;
    private javax.swing.JPanel trans3;
    // End of variables declaration//GEN-END:variables
}
