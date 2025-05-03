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

import static java.lang.Math.round;

/**
 *
 * @author hp
 */
public class Cart_element extends javax.swing.JPanel {
    String name;
    String des;
    String sup;

    String price;
    Image img21;
    int a = 0;
    int quan = 0;
    String id;
    Float total = 0f;
    /**
     * Creates new form Cart_element
     */

    public Cart_element(String Pid,String name1,String price1,int q,String de,String su,int ord) throws IOException {
        File file = new File(Const.basePath+"src\\resources\\icon\\"+name1+".jpeg");
        BufferedImage img2 = ImageIO.read(new File(Const.basePath+"src\\resources\\icon\\no_image.jpeg"));
        if(file.exists()){
            img2 = ImageIO.read(file);

        }
        img21 = img2.getScaledInstance(70, 80, BufferedImage.SCALE_SMOOTH);
        quan = q;
        des = de;
        sup = su;
        this.a = ord;
        this.id = Pid;


        name = name1;
        price=price1;
        total = Float.valueOf(this.quan)*Float.valueOf(this.price);
        initComponents();
    }

    
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        roundPanel1 = new resources.swing.RoundPanel();
        jLabel2 = new javax.swing.JLabel();
        buttonOutLine1 = new resources.swing.ButtonOutLine();
        jLabel1 = new javax.swing.JLabel();
        buttonMenu1 = new resources.swing.ButtonMenu();
        buttonMenu2 = new resources.swing.ButtonMenu();
        buttonMenu3 = new resources.swing.ButtonMenu();
        button1 = new resources.swing.Button();
        buttonOutLine2 = new resources.swing.ButtonOutLine();
        jSeparator2 = new javax.swing.JSeparator();

        setOpaque(false);

        roundPanel1.setBackground(new java.awt.Color(245, 240, 250));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
//        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/icons8-home-30.png"))); // NOI18N
        ImageIcon icon = new ImageIcon(img21);
        jLabel2.setIcon(icon); // NOI18N
        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
                roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                .addContainerGap())
        );
        roundPanel1Layout.setVerticalGroup(
                roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        buttonOutLine1.setBackground(new java.awt.Color(67, 79, 79));
        buttonOutLine1.setText(this.name);
        buttonOutLine1.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(this.des);

        buttonMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/icons8-delete-15.png"))); // NOI18N
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

        buttonMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/minus.png"))); // NOI18N
        buttonMenu2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMenu2ActionPerformed(evt);
            }
        });

        buttonMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/plus.png"))); // NOI18N
        buttonMenu3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMenu3ActionPerformed(evt);
            }
        });

        button1.setBackground(new java.awt.Color(230, 230, 230));
        button1.setForeground(new java.awt.Color(45, 45, 45));
        button1.setText(String.valueOf(User_Grocery.decimalFormat.format(Float.valueOf(this.price)*this.a)));
        button1.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N

        buttonOutLine2.setBackground(new java.awt.Color(67, 79, 79));
        buttonOutLine2.setText(String.valueOf(this.a));
        buttonOutLine2.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        buttonOutLine2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOutLine2ActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(67, 79, 79));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(buttonMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(buttonMenu3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(buttonMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(3, 3, 3)
                                                                .addComponent(buttonOutLine1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(3, 3, 3)
                                                                .addComponent(buttonOutLine2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(1, 1, 1))))
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(buttonOutLine2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(buttonOutLine1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(buttonMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(buttonMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(buttonMenu3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>

    private void buttonOutLine2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void buttonMenu3ActionPerformed(java.awt.event.ActionEvent evt) {
        if(a>=quan){
            buttonMenu3.setEnabled(false);}
        else {
            this.a++;
            total =Float.valueOf(this.price)*this.a;
            button1.setText(String.valueOf(total));
            buttonOutLine2.setText(String.valueOf(this.a));
            buttonMenu2.setEnabled(true);
            int i = 0;
            for (String g:User_Grocery.p_cart_id) {
                System.out.println("Value: "+User_Grocery.p_qua.get(i));
                if(g.equals(this.id)){
                    User_Grocery.p_qua.set(i,this.a);

                    System.out.println("Quantity: "+this.a);
                    System.out.println(User_Grocery.p_qua.get(i));
                    break;
                }
                i++;
            }
        }
    }

    private void buttonMenu2ActionPerformed(java.awt.event.ActionEvent evt) {
        if(a<=1){

            buttonMenu2.setEnabled(false);}
        else{this.a--;
            buttonMenu3.setEnabled(true);
            button1.setText(String.valueOf(Float.valueOf(this.price)*this.a));
            buttonOutLine2.setText(String.valueOf(this.a));
            int i = 0;
            for (String g:User_Grocery.p_cart_id) {
                if(g.equals(this.id)){
                    User_Grocery.p_qua.set(i,this.a);
                    System.out.println("Quantity: "+this.a);
                    System.out.println(User_Grocery.p_qua.get(i));
                    break;
                }
                i++;
            }}
    }

    private void buttonMenu1ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        int i = 0;
        for (String a:User_Grocery.p_cart_id) {
            if(a.equals(this.id)){
                User_Grocery.p_cart_id.remove(i);
                User_Grocery.p_qua.remove(i);
                break;
            }
            i++;
        }
        User_Grocery.showForm(new Cart(User_Grocery.a_pro));
    }


    // Variables declaration - do not modify
    private resources.swing.Button button1;
    private resources.swing.ButtonMenu buttonMenu1;
    private resources.swing.ButtonMenu buttonMenu2;
    private resources.swing.ButtonMenu buttonMenu3;
    private resources.swing.ButtonOutLine buttonOutLine1;
    private resources.swing.ButtonOutLine buttonOutLine2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private resources.swing.RoundPanel roundPanel1;
    // End of variables declaration
}
