//////
import net.miginfocom.swing.MigLayout;

import java.io.IOException;
import java.sql.*;

/**
 *
 * @author hp
 */
public class top_sell extends javax.swing.JPanel {
    String catego="TOP Selling";

    String cat = "Top";
    /**
     * Creates new form All_Products
     */
    public top_sell() throws IOException {
        String sql = "SELECT p.ProdName, p.UnitPrice, p.QuantityInstock, p.ProdDescription, s.SupplierName,p.ProductID\n" +
                "FROM (\n" +
                "    SELECT TOP 10 od.ProductID\n" +
                "    FROM Products p\n" +
                "    JOIN [Order Details] od ON p.ProductID = od.ProductID\n" +
                "    GROUP BY od.ProductID\n" +
                "    ORDER BY SUM(od.OrderQuantity) DESC\n" +
                ") top_products\n" +
                "JOIN Products p ON top_products.ProductID = p.ProductID\n" +
                "JOIN Supplier s ON p.SupplierID = s.SupplierID;\n";
        String url = Const.url;

        String user = Const.user;
        String pass = Const.pass;
        initComponents();

        trans3.setLayout(new MigLayout("wrap, fillx, inset 3", "[fill]", "[]0[]"));
        roundPanel5.round = 35;
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
                p++;
            }
            if(p==0){
                trans3.add(new Out_stock("No, Products"));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database or executing the query.", e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        roundPanel5 = new resources.swing.RoundPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        trans3 = new javax.swing.JPanel();
        buttonMenu1 = new resources.swing.ButtonMenu();
        buttonMenu2 = new resources.swing.ButtonMenu();

        setOpaque(false);

        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(280, 542));

        roundPanel5.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel5.setMaximumSize(new java.awt.Dimension(32767, 542));

        jLabel4.setBackground(new java.awt.Color(10, 10, 0));
        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(10, 10, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText(catego);

        jScrollPane5.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setBorder(null);
        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane5.setOpaque(false);

        trans3.setBackground(new java.awt.Color(255, 255, 255));
        trans3.setMaximumSize(new java.awt.Dimension(277, 2147483647));
        trans3.setLayout(new java.awt.BorderLayout());
        jScrollPane5.setViewportView(trans3);

        buttonMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/icons8-back-15.png"))); // NOI18N
        buttonMenu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    buttonMenu1ActionPerformed(evt);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        buttonMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/icons8-cart-15.png"))); // NOI18N
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

        javax.swing.GroupLayout roundPanel5Layout = new javax.swing.GroupLayout(roundPanel5);
        roundPanel5.setLayout(roundPanel5Layout);
        roundPanel5Layout.setHorizontalGroup(
                roundPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(roundPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(roundPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                                        .addGroup(roundPanel5Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(buttonMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(buttonMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)))
                                .addContainerGap())
        );
        roundPanel5Layout.setVerticalGroup(
                roundPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(roundPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(roundPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 280, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(roundPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 542, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(roundPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 280, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 542, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
    }
    // </editor-fold>

    private void buttonMenu1ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        User_Grocery.showForm(new Actaul_Main());
    }

    private void buttonMenu2ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        User_Grocery.showForm(new Cart(this));
    }



    // Variables declaration - do not modify
    private resources.swing.ButtonMenu buttonMenu1;
    private resources.swing.ButtonMenu buttonMenu2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane5;
    private resources.swing.RoundPanel roundPanel5;
    private javax.swing.JPanel trans3;
    // End of variables declaration
}
