
import net.miginfocom.swing.MigLayout;

import java.awt.*;
import java.io.IOException;
import java.sql.*;


public class Cart extends javax.swing.JPanel {
    Component comp;
    String lis="";
    /**
     * Creates new form Cart
     */
    public Cart(Component com) throws IOException {
//        int k = 0;
//        for (String a:User_Grocery.p_cart_id) {
//            lis+=a+"','";
//            k++;
//            System.out.println("in......."+k);
//        }
//        System.out.println("next......."+k);
//        lis+="'";
        System.out.println(lis);
        initComponents();
        trans3.setLayout(new MigLayout("wrap, fillx, inset 3", "[fill]", "[]0[]"));
        roundPanel5.round = 30;
        comp = com;
        // Assuming you have a list of product IDs in p_cart_id

// Construct the SQL query with a placeholder for the product ID
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
                        String price = Float.toString(rs.getFloat("UnitPrice"));
                        int quan = rs.getInt("QuantityInstock");
                        String id = rs.getString("ProductID");
                        String des = rs.getString("ProdDescription");
                        trans3.add(new Cart_element(id, name, price, quan, des, "SP", User_Grocery.p_qua.get(g)));
                        g++;
                    }

                }
            }
            if(g>0) {
                trans3.add(new check_out_button(new CheckOut(this))); // Add checkout button after fetching products
            }else{
            trans3.add(new Out_stock("Nothing in Cart!"));
        }
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database or executing the query.", e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        if(k>0){
//        String sql = "SELECT ProdName,UnitPrice,QuantityInstock,ProductID,ProdDescription FROM Products where ProductID in('"+lis+");";
//        String url = Const.url;
//        String user = Const.user;
//        String pass = Const.pass;
//
//
//        try (Connection con = DriverManager.getConnection(url, user, pass);
//              Statement st = con.createStatement();
//              ResultSet rs = st.executeQuery(sql)) {
//            ResultSetMetaData rsmd = rs.getMetaData();
//            int columnsNumber = rsmd.getColumnCount();
//            int g = 0;
//            while (rs.next()) {
//                String name = rs.getString(1);
//                String price = Float.toString(rs.getFloat(2));
//                int quan = rs.getInt(3);
//                String id = rs.getString(4);
//                String des = rs.getString(5);
//                trans3.add(new Cart_element(id,name,price,quan,des,"SP",User_Grocery.p_qua.get(g)));
//                g++;
//            }
//            trans3.add(new check_out_button());
//        } catch (SQLException e) {
//            throw new RuntimeException("Error connecting to the database or executing the query.", e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//       }else{
//            trans3.add(new Out_stock("Nothing in Cart!"));
//        }
    }

    
    private void initComponents() {

        roundPanel5 = new resources.swing.RoundPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        trans3 = new javax.swing.JPanel();
        buttonMenu4 = new resources.swing.ButtonMenu();
        buttonOutLine1 = new resources.swing.ButtonOutLine();

        setOpaque(false);

        roundPanel5.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel5.setMaximumSize(new java.awt.Dimension(32767, 542));

        jLabel6.setBackground(new java.awt.Color(10, 10, 0));
        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(10, 10, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Cart");

        jScrollPane5.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setBorder(null);
        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane5.setOpaque(false);

        trans3.setBackground(new java.awt.Color(255, 255, 255));
        trans3.setLayout(new java.awt.BorderLayout());
        jScrollPane5.setViewportView(trans3);

        buttonMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/icons8-back-15.png"))); // NOI18N
        buttonMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMenu4ActionPerformed(evt);
            }
        });

        buttonOutLine1.setBackground(new java.awt.Color(0, 0, 0));
        buttonOutLine1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOutLine1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundPanel5Layout = new javax.swing.GroupLayout(roundPanel5);
        roundPanel5.setLayout(roundPanel5Layout);
        roundPanel5Layout.setHorizontalGroup(
                roundPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(roundPanel5Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(roundPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(roundPanel5Layout.createSequentialGroup()
                                                .addGap(44, 44, 44)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(roundPanel5Layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(buttonMenu4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(buttonOutLine1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        roundPanel5Layout.setVerticalGroup(
                roundPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(roundPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(roundPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonMenu4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonOutLine1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 280, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(roundPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 541, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(roundPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>

    private void buttonMenu4ActionPerformed(java.awt.event.ActionEvent evt) {
        User_Grocery.showForm(comp);
    }

    private void buttonOutLine1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    public Component create_me() throws IOException {
        return new Cart(User_Grocery.main_actual);
    }


    // Variables declaration - do not modify
    private resources.swing.ButtonMenu buttonMenu4;
    private resources.swing.ButtonOutLine buttonOutLine1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane5;
    private resources.swing.RoundPanel roundPanel5;
    private javax.swing.JPanel trans3;
    // End of variables declaration
}
