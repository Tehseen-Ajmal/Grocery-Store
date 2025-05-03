
import java.awt.*;
import java.io.IOException;

import net.miginfocom.swing.MigLayout;

public class Actaul_Main extends javax.swing.JPanel {

    /**
     * Creates new form Actaul_Main
     */

    public Actaul_Main() throws IOException {
        initComponents();
        gradient2.col1 = new Color(0, 174, 95);
        gradient2.col2 = new Color(61, 205, 128);
        trans3.setLayout(new MigLayout("wrap 2, fillx, inset 3", "[fill]", "[]0[]"));







            trans3.add(new top_selections("Bakery","bread.png",User_Grocery.bakr));
            trans3.add(new top_selections("Dairy & Eggs","milk.png",User_Grocery.dair));
            trans3.add(new top_selections("Fruits","fruiti.png",User_Grocery.frui));
            trans3.add(new top_selections("Vegetables","fresh_veg.png",User_Grocery.veg));
            trans3.add(new top_selections("All Categories","see_all.png",User_Grocery.a_pro));
            trans3.add(new top_selections("Top Selling","topsel.png",User_Grocery.topi));
            trans3.add(new top_selections("CART","icons8-cart-100.png",new Cart(this)));
        roundPanel1.round=35;
        gradient2.round = 30;
        myTextField1.col = "FFFFFF";
        myTextField1.col1 = new Color(255,255,255,100);
//        gradient2.col1 = new Color(34, 167, 240);
//        gradient2.col2 = new Color(255, 108, 85);
//        gradient2.col1 = new Color(0, 0, 0);
//        gradient2.col2 = new Color(50, 50, 50);
    }

    //GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        roundPanel1 = new resources.swing.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        trans3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        gradient2 = new resources.swing.Gradient();
        buttonMenu1 = new resources.swing.ButtonMenu();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        buttonMenu2 = new resources.swing.ButtonMenu();
        myTextField1 = new resources.swing.MyTextField();
        buttonOutLine1 = new resources.swing.ButtonOutLine();

        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Poor Richard", 0, 10)); // NOI18N
        jLabel2.setForeground(new Color(255, 255, 255));
        jLabel2.setText("Tehseen");

        setOpaque(false);

        roundPanel1.setBackground(new Color(255, 255, 255));

        jScrollPane1.setBackground(new Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setToolTipText("");
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setOpaque(false);

        trans3.setBackground(new Color(255, 255, 255));
        trans3.setForeground(new Color(255, 255, 255));
        trans3.setMaximumSize(new java.awt.Dimension(277, 2147483647));
        trans3.setLayout(new java.awt.BorderLayout());
        jScrollPane1.setViewportView(trans3);

        jPanel1.setOpaque(false);

        gradient2.setLayout(null);

        buttonMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/3.png"))); // NOI18N
        buttonMenu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gradient2.add(buttonMenu1);
        buttonMenu1.setBounds(10, 0, 31, 28);

        jLabel3.setFont(new java.awt.Font("Poor Richard", 0, 10)); // NOI18N
        jLabel3.setForeground(new Color(255, 255, 255));
        jLabel3.setText("Ajmal");
        gradient2.add(jLabel3);
        jLabel3.setBounds(10, 30, 60, 30);

        jLabel4.setFont(new java.awt.Font("Bauhaus 93", 1, 24)); // NOI18N
        jLabel4.setForeground(new Color(255, 255, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("APNA STORE");
        gradient2.add(jLabel4);
        jLabel4.setBounds(70, 20, 160, 30);

        jLabel5.setFont(new java.awt.Font("Forte", 0, 9)); // NOI18N
        jLabel5.setForeground(new Color(255, 255, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Freshness Delivered, Customers Always First!");
        gradient2.add(jLabel5);
        jLabel5.setBounds(50, 40, 210, 20);

        jLabel6.setFont(new java.awt.Font("Poor Richard", 0, 10)); // NOI18N
        jLabel6.setForeground(new Color(255, 255, 255));
        jLabel6.setText("Tehseen");
        gradient2.add(jLabel6);
        jLabel6.setBounds(10, 20, 60, 20);

        javax.swing.GroupLayout gradient2Layout = new javax.swing.GroupLayout(gradient2);
        gradient2.setLayout(gradient2Layout);
        gradient2Layout.setHorizontalGroup(
                gradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(gradient2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(buttonMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(gradient2Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(gradient2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(gradient2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(gradient2Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        gradient2Layout.setVerticalGroup(
                gradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(gradient2Layout.createSequentialGroup()
                                .addGroup(gradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(buttonMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(gradient2Layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(gradient2Layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(gradient2Layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(gradient2Layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(gradient2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(gradient2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3))
        );

        jPanel2.setOpaque(false);

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
        buttonMenu2.setBounds(240, 0, 30, 30);

        myTextField1.setForeground(new Color(0, 51, 51));
        myTextField1.setDisabledTextColor(new Color(255, 255, 255));
        myTextField1.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        myTextField1.setHint("Search");
        jPanel2.add(myTextField1);
        myTextField1.setBounds(10, 0, 230, 32);

        buttonOutLine1.setBackground(new Color(0, 0, 0));
        buttonOutLine1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel2.add(buttonOutLine1);
        buttonOutLine1.setBounds(0, 0, 280, 35);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addComponent(buttonMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(myTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(buttonOutLine1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(buttonMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(myTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonOutLine1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
                roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundPanel1Layout.setVerticalGroup(
                roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMenu2ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event_buttonMenu2ActionPerformed
        User_Grocery.showForm(new Serching_product(myTextField1.getText()));
    }//GEN-LAST:event_buttonMenu2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private resources.swing.ButtonMenu buttonMenu1;
    private resources.swing.ButtonMenu buttonMenu2;
    private resources.swing.ButtonOutLine buttonOutLine1;
    private resources.swing.Gradient gradient2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private resources.swing.MyTextField myTextField1;
    private resources.swing.RoundPanel roundPanel1;
    private javax.swing.JPanel trans3;
    // End of variables declaration//GEN-END:variables
}
