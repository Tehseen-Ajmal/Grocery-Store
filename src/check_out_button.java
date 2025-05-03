/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

import java.awt.*;

/**
 *
 * @author hp
 */
public class check_out_button extends javax.swing.JPanel {

    /**
     * Creates new form check_out_button
     */
    Component comp;
    public check_out_button(Component c) {
        comp = c;
        initComponents();
    }

    
    private void initComponents() {

        button1 = new resources.swing.Button();

        setOpaque(false);

        button1.setBackground(new java.awt.Color(0, 51, 51));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("CHECK OUT");
        button1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(button1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );
    }// </editor-fold>

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {
        User_Grocery.showForm(comp);
    }



    // Variables declaration - do not modify
    private resources.swing.Button button1;
        // End of variables declaration
}
