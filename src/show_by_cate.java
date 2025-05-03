/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

import net.miginfocom.swing.MigLayout;

import java.io.IOException;
import java.sql.*;

/**
 *
 * @author hp
 */
public class show_by_cate extends javax.swing.JPanel {

    /**
     * Creates new form show_products
     */
    public show_by_cate (String category_id) {
        initComponents();
        String sql = "SELECT top(50)p.ProdName, p.UnitPrice, p.QuantityInstock, p.ProdDescription, s.SupplierName,p.ProductID,p.CostPrice\n" +
                "FROM Products p\n" +
                "JOIN Supplier s ON p.SupplierID = s.SupplierID where p.CategoryID='"+category_id+"';";
        String url = Const.url;

        String user = Const.user;
        String pass = Const.pass;
        initComponents();

        trans3.setLayout(new MigLayout("wrap 3, fillx, inset 3", "[fill][fill][fill]", "[]0[]"));
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
                String id = rs.getString(6);
                String co = Float.toString(rs.getFloat(7));
                trans3.add(new productfetcher(name,price,quan,des,sup,id,co));
            }
            if(p==0){
                trans3.add(new Out_stock("Stock Unavailable"));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database or executing the query.", e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    
    private void initComponents() {

        roundPanel3 = new resources.swing.RoundPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        trans3 = new javax.swing.JPanel();

        roundPanel3.setBackground(new java.awt.Color(3, 98, 139));

        jLabel2.setBackground(new java.awt.Color(46, 159, 240));
        jLabel2.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 247, 255));
        jLabel2.setText("Products");

        javax.swing.GroupLayout roundPanel3Layout = new javax.swing.GroupLayout(roundPanel3);
        roundPanel3.setLayout(roundPanel3Layout);
        roundPanel3Layout.setHorizontalGroup(
                roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel3Layout.createSequentialGroup()
                                .addGap(245, 245, 245)
                                .addComponent(jLabel2)
                                .addContainerGap(348, Short.MAX_VALUE))
        );
        roundPanel3Layout.setVerticalGroup(
                roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        jScrollPane5.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setBorder(null);
        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane5.setOpaque(false);

        trans3.setBackground(new java.awt.Color(255, 255, 255));
        trans3.setMaximumSize(new java.awt.Dimension(277, 2147483647));
        trans3.setLayout(new java.awt.BorderLayout());
        jScrollPane5.setViewportView(trans3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(roundPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                                        .addContainerGap()))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(roundPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 497, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(90, 90, 90)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                                        .addContainerGap()))
        );
    }// </editor-fold>


    // Variables declaration - do not modify
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane5;
    private resources.swing.RoundPanel roundPanel3;
    private javax.swing.JPanel trans3;
    // End of variables declaration
}
