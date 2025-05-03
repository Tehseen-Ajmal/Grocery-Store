/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author hp
 */
public class top_selections extends javax.swing.JPanel {
    public  static int colornum = 1;
    public static int printi = 0;
    String name;
    String ic;

    Image img21;
    Component com;
    /**
     * Creates new form top_selections
     */
    public top_selections(String bu,String ico,Component co) throws IOException {
        this.com=co;
        this.name = bu;
        this.ic = ico;
        File file = new File(Const.basePath+"src\\resources\\icon\\"+ico);
        BufferedImage img2 = ImageIO.read(new File(Const.basePath+"src\\resources\\icon\\no_image.jpeg"));
        if(file.exists()){
            img2 = ImageIO.read(file);
        }
        img21 = img2.getScaledInstance(118, 100, BufferedImage.SCALE_SMOOTH);

        initComponents();
        if(printi==0 || printi==1){
            gradient1.col2 = new Color(167, 203, 217);
            gradient1.col1 = new Color(0, 126, 167);
            printi+=1;

        }else if(printi==2 || printi==3){
            gradient1.col1 = new Color(0, 169, 224);
            gradient1.col2 = new Color(61, 205, 128);
            printi+=1;
        }
        if (printi == 4) {
            printi=0;
        }
    }

    //GEN-BEGIN:initComponents
    private void initComponents() {

        gradient1 = new resources.swing.Gradient();
        jLabel1 = new javax.swing.JLabel();
        buttonMenu1 = new resources.swing.ButtonMenu();
        buttonOutLine1 = new resources.swing.ButtonOutLine();

        setOpaque(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        ImageIcon icon = new ImageIcon(img21);
        jLabel1.setIcon(icon); // NOI18N
//        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/red_home.png"))); // NOI18N
        jLabel1.setToolTipText("");

        buttonOutLine1.setText(name);
        buttonMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMenu1ActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout gradient1Layout = new javax.swing.GroupLayout(gradient1);
        gradient1.setLayout(gradient1Layout);
        gradient1Layout.setHorizontalGroup(
            gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(gradient1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonOutLine1, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                .addContainerGap())
        );
        gradient1Layout.setVerticalGroup(
            gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradient1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(gradient1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(buttonOutLine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(buttonMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
        );


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradient1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(gradient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void buttonMenu1ActionPerformed(java.awt.event.ActionEvent evt) {
        User_Grocery.showForm(this.com);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private resources.swing.ButtonMenu buttonMenu1;
    private resources.swing.ButtonOutLine buttonOutLine1;
    private resources.swing.Gradient gradient1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
