import java.awt.Component;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Time;
import java.text.DecimalFormat;
import java.time.Clock;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author hp
 */
public class User_Grocery extends javax.swing.JFrame {
        BufferedImage img2 = ImageIO.read(new File(Const.basePath+"src\\resources\\icon\\back_blur.jpg"));
//      Image img21 = img2.getScaledInstance(454,539,BufferedImage.SCALE_DEFAULT);

        Image img21 = img2.getScaledInstance(900,600,BufferedImage.SCALE_DEFAULT);
        public static products a_pro;
        public static DecimalFormat decimalFormat = new DecimalFormat("#.##");
    public static top_sell ts_pro;
    public static ArrayList<String> p_cart_id;
    public static ArrayList<Integer> p_qua;
    public static Actaul_Main main_actual;
    public static Component bakr;

    static {
        try {
            bakr = new All_Products("CT4","Bakery");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Component dair;

    static {
        try {
            dair = new All_Products("CT3","Dairy & Eggs");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Component frui;

    static {
        try {
            frui = new All_Products("CT1","Fruits");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Component veg;

    static {
        try {
            veg = new All_Products("CT2","Vegetables");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Component topi;

    static {
        try {
            topi = new top_sell();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {

            p_cart_id = new ArrayList<>();
            p_qua = new ArrayList<>();
            a_pro = new products();
            ts_pro = new top_sell();
            main_actual = new Actaul_Main();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    /**
     * Creates new form User_Grocery
     */
    public static void showForm(Component com) {
        System.out.print("\n333333333331111");
        user_backpanel.removeAll();
        user_backpanel.add(com);
        user_backpanel.revalidate();
        user_backpanel.repaint();
    }
    public User_Grocery() throws IOException {
//        try {
//            String keyword = "orange";
//                URL imageUrl = new URL("https://source.unsplash.com/400,300/?" + keyword);
//                BufferedImage image = ImageIO.read(imageUrl);
//                img21 = image.getScaledInstance(900,600,Image.SCALE_DEFAULT);
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        initComponents();
        jLabel1.setIcon(new javax.swing.ImageIcon(img21));
        showForm(new Actaul_Main());
    }

    //GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        user_backpanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 600));
        setPreferredSize(new java.awt.Dimension(900, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 600));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        user_backpanel.setOpaque(false);
        user_backpanel.setLayout(new java.awt.BorderLayout());
        jPanel1.add(user_backpanel);
        user_backpanel.setBounds(290, 20, 283, 543);

        jLabel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 900, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(User_Grocery.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(User_Grocery.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(User_Grocery.class.getName()).log(Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            Logger.getLogger(User_Grocery.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new User_Grocery().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(User_Grocery.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel user_backpanel;
    // End of variables declaration//GEN-END:variables
}
