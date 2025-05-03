
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class productfetcher extends javax.swing.JPanel {
    
    String name;
    String des;
    String sup;

    String price;
    Image img21;
    int a = 0;
    int quan = 0;
    String p_id;
    String cost;
    public productfetcher(String name1,String price1,int q,String de,String su,String id,String co) throws IOException {
        quan = q;
        des = de;
        sup = su;
        p_id = id;
        cost = co;

        File file = new File(Const.basePath+"src\\resources\\icon\\"+name1+".jpeg");
        BufferedImage img2 = ImageIO.read(new File(Const.basePath+"src\\resources\\icon\\no_image.jpeg"));
        if(file.exists()){
            img2 = ImageIO.read(file);
        }
        img21 = img2.getScaledInstance(185, 105, BufferedImage.SCALE_SMOOTH);

        name = name1;
        price=price1;
        initComponents();
        image_g.col1 = new Color(255, 255, 255); // Start color (bright yellow)
        image_g.col2 = new Color(235, 240, 240);
        back_g.col1 = new Color(240, 240, 240);
        back_g.col2 = new Color(255, 255, 255);
    }

    
    private void initComponents() {

        back_g = new resources.swing.Gradient();
        image_g = new resources.swing.Gradient();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(278, 32767));
        setOpaque(false);

        back_g.setMaximumSize(new java.awt.Dimension(277, 32767));

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 1, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2.setText(cost+" $");

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

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 1, 16)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(price+"$");

        jLabel7.setFont(new java.awt.Font("Juice ITC", 1, 16)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText(name);

        javax.swing.GroupLayout image_gLayout = new javax.swing.GroupLayout(image_g);
        image_g.setLayout(image_gLayout);
        image_gLayout.setHorizontalGroup(
                image_gLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(image_gLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(image_gLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(image_gLayout.createSequentialGroup()
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(image_gLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(image_gLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(image_gLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(28, Short.MAX_VALUE)))
        );
        image_gLayout.setVerticalGroup(
                image_gLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(image_gLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4)
                                .addGap(37, 37, 37)
                                .addGroup(image_gLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                        .addGroup(image_gLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, image_gLayout.createSequentialGroup()
                                        .addContainerGap(159, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)))
        );

        javax.swing.GroupLayout back_gLayout = new javax.swing.GroupLayout(back_g);
        back_g.setLayout(back_gLayout);
        back_gLayout.setHorizontalGroup(
                back_gLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, back_gLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(image_g, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        back_gLayout.setVerticalGroup(
                back_gLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(back_gLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(image_g, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(back_g, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(back_g, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
    }// </editor-fold>


    // Variables declaration - do not modify
    private resources.swing.Gradient back_g;
    private resources.swing.Gradient image_g;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration
}
