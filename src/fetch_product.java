import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Color;


public class fetch_product extends javax.swing.JPanel {
    String name;
    String des;
    String sup;

    String price;
    Image img21;
    int a = 0;
    int quan = 0;
    String p_id;
    
    public fetch_product(String name1,String price1,int q,String de,String su,String id) throws IOException {

        quan = q;
        des = de;
        sup = su;
        p_id = id;

        File file = new File(Const.basePath+"src\\resources\\icon\\"+name1+".jpeg");
        BufferedImage img2 = ImageIO.read(new File(Const.basePath+"src\\resources\\icon\\no_image.jpeg"));
        if(file.exists()){
            img2 = ImageIO.read(file);
        }
        img21 = img2.getScaledInstance(240, 160, BufferedImage.SCALE_SMOOTH);

        name = name1;
        price=price1;
        initComponents();
        image_g.col1 = new Color(255, 255, 255); // Start color (bright yellow)
        image_g.col2 = new Color(235, 240, 240);
        back_g.col1 = new Color(240, 240, 240);
        back_g.col2 = new Color(255, 255, 255);
        button_g.col1 = new Color(0, 176, 155);
        button_g.col2 = new Color(0, 204, 153);
    }

    
    private void initComponents() {

        back_g = new resources.swing.Gradient();
        button_g = new resources.swing.Gradient();
        buttonMenu1 = new resources.swing.ButtonMenu();
        image_g = new resources.swing.Gradient();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buttonOutLine1 = new resources.swing.ButtonOutLine();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        buttonMenu2 = new resources.swing.ButtonMenu();
        buttonMenu3 = new resources.swing.ButtonMenu();

        setMaximumSize(new java.awt.Dimension(278, 32767));
        setOpaque(false);

        back_g.setMaximumSize(new java.awt.Dimension(277, 32767));

        buttonMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/7.png"))); // NOI18N
        buttonMenu1.setText("Add to Cart");
        buttonMenu1.setToolTipText("add to cart");
        buttonMenu1.setFont(new java.awt.Font("Cascadia Mono", 0, 18)); // NOI18N
        buttonMenu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMenu1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout button_gLayout = new javax.swing.GroupLayout(button_g);
        button_g.setLayout(button_gLayout);
        button_gLayout.setHorizontalGroup(
                button_gLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(button_gLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        button_gLayout.setVerticalGroup(
                button_gLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(button_gLayout.createSequentialGroup()
                                .addComponent(buttonMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Juice ITC", 1, 16)); // NOI18N
        jLabel2.setText(name);

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 1, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText(price+"$");

        buttonOutLine1.setText("0");
        buttonOutLine1.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
//        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/icons8-home-96.png"))); // NOI18N
        ImageIcon icon = new ImageIcon(img21);
        jLabel1.setIcon(icon); // NOI18N
        jLabel4.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText(des);

        jLabel5.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText(sup);

        javax.swing.GroupLayout image_gLayout = new javax.swing.GroupLayout(image_g);
        image_g.setLayout(image_gLayout);
        image_gLayout.setHorizontalGroup(
                image_gLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(image_gLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(image_gLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(image_gLayout.createSequentialGroup()
                                                .addGroup(image_gLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(image_gLayout.createSequentialGroup()
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(buttonOutLine1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        image_gLayout.setVerticalGroup(
                image_gLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(image_gLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(0, 0, 0)
                                .addGroup(image_gLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonOutLine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        buttonMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/minus.png"))); // NOI18N
        buttonMenu2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMenu2ActionPerformed(evt);
            }
        });

        buttonMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/plus.png"))); // NOI18N
        buttonMenu3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMenu3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout back_gLayout = new javax.swing.GroupLayout(back_g);
        back_g.setLayout(back_gLayout);
        back_gLayout.setHorizontalGroup(
                back_gLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(back_gLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(back_gLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(image_g, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(back_gLayout.createSequentialGroup()
                                                .addComponent(buttonMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(button_g, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(buttonMenu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        back_gLayout.setVerticalGroup(
                back_gLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, back_gLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(image_g, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(back_gLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(button_g, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonMenu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(back_g, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(back_g, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
    }// </editor-fold>

    private void buttonMenu3ActionPerformed(java.awt.event.ActionEvent evt) {
        if(a>=quan){
            buttonMenu3.setEnabled(false);}
        else{
            this.a++;
            buttonMenu2.setEnabled(true);
            buttonOutLine1.setText(Integer.toString(this.a));}
    }

    private void buttonMenu2ActionPerformed(java.awt.event.ActionEvent evt) {
        if(a<=0){

            buttonMenu2.setEnabled(false);}
        else{this.a--;
            buttonMenu3.setEnabled(true);
            buttonOutLine1.setText(Integer.toString(this.a));}
    }
    private void buttonMenu1ActionPerformed(java.awt.event.ActionEvent evt) {
        if (this.a > 0) {
            int i = 0;
            int inner = 0;
            for (String a : User_Grocery.p_cart_id) {
                if (a.equals(this.p_id)) {
                    User_Grocery.p_qua.set(i, this.a + User_Grocery.p_qua.get(i));
                    inner = 1;
                    break;
                }
                i++;
            }
            if (inner == 0) {
                User_Grocery.p_qua.add(this.a);
                User_Grocery.p_cart_id.add(this.p_id);
            }
        }
        this.a = 0;
        buttonOutLine1.setText(Integer.toString(a));

        // Show a message dialog indicating successful addition
//        JOptionPane.showMessageDialog(this, " added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
    }



    // Variables declaration - do not modify
    private resources.swing.Gradient back_g;
    private resources.swing.ButtonMenu buttonMenu1;
    private resources.swing.ButtonMenu buttonMenu2;
    private resources.swing.ButtonMenu buttonMenu3;
    private resources.swing.ButtonOutLine buttonOutLine1;
    private resources.swing.Gradient button_g;
    private resources.swing.Gradient image_g;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration
}
