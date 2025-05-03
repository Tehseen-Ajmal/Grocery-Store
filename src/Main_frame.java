
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author hp
 */
public class Main_frame extends javax.swing.JFrame {
    private SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
    private SimpleDateFormat stf = new SimpleDateFormat("hh:mm a");
    private Customer_options customer_option;

    /**
     * Creates new form Main
     */
    public Main_frame() {
        initComponents();
        customer_option = new Customer_options();
        showForm(new Profile());
    }
    public static void showForm(Component com) {
        side_panel.removeAll();
        side_panel.add(com);
        side_panel.revalidate();
        side_panel.repaint();
    }

    //GEN-BEGIN:initComponents
    private void initComponents() {

        mainpanel = new resources.swing.RoundPanel();
        roundPanel1 = new resources.swing.RoundPanel();
        admin_label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        imageAvatar3 = new resources.swing.ImageAvatar();
        roundPanel2 = new resources.swing.RoundPanel();
        person_btn = new resources.swing.ButtonMenu();
        person_btn1 = new resources.swing.ButtonMenu();
        person_btn2 = new resources.swing.ButtonMenu();
        person_btn3 = new resources.swing.ButtonMenu();
        person_btn4 = new resources.swing.ButtonMenu();
        person_btn5 = new resources.swing.ButtonMenu();
        person_btn6 = new resources.swing.ButtonMenu();
        side_bg = new resources.swing.RoundPanel();
        side_panel = new JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(170, 20, 900, 600));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setName("Backgd"); // NOI18N
        setSize(new java.awt.Dimension(0, 0));

        mainpanel.setBackground(new java.awt.Color(194, 219, 255));

        roundPanel1.setBackground(new java.awt.Color(0, 67, 89));

        admin_label.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        admin_label.setForeground(new java.awt.Color(242, 247, 255));
        admin_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin_label.setText("Admin");
        admin_label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setBackground(new java.awt.Color(242, 247, 255));
        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 247, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("ID : Me Tehseen");

        jLabel9.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Last login: "+sdf.format(new Date())+"   "+stf.format(new Date())
        );

        imageAvatar3.setBackground(new java.awt.Color(0, 67, 89));
        imageAvatar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/icons8-admin-100.png"))); // NOI18N
        imageAvatar3.setOpaque(true);

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imageAvatar3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(admin_label, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(admin_label, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel9)
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageAvatar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.getAccessibleContext().setAccessibleName("id");

        roundPanel2.setBackground(new java.awt.Color(0, 67, 89));

        person_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/person.png"))); // NOI18N
        person_btn.setText("Employee Management");
        person_btn.setEffectColor(new java.awt.Color(194, 219, 255));
        person_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                person_btnActionPerformed(evt);
            }
        });

        person_btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/custom.png"))); // NOI18N
        person_btn1.setText("Customer Control");
        person_btn1.setEffectColor(new java.awt.Color(194, 219, 255));
        person_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                person_btn1ActionPerformed(evt);
            }
        });

        person_btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/4.png"))); // NOI18N
        person_btn2.setText("Category Management");
        person_btn2.setEffectColor(new java.awt.Color(194, 219, 255));
        person_btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                person_btn2ActionPerformed(evt);
            }
        });

        person_btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/2.png"))); // NOI18N
        person_btn3.setText("Product Management");
        person_btn3.setEffectColor(new java.awt.Color(194, 219, 255));
        person_btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                person_btn3ActionPerformed(evt);
            }
        });

        person_btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/4.png"))); // NOI18N
        person_btn4.setText("Logout");
        person_btn4.setEffectColor(new java.awt.Color(194, 219, 255));
        person_btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                person_btn4ActionPerformed(evt);
            }
        });

        person_btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/8.png"))); // NOI18N
        person_btn5.setText("Supplier Management");
        person_btn5.setEffectColor(new java.awt.Color(194, 219, 255));
        person_btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                person_btn5ActionPerformed(evt);
            }
        });

        person_btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/user.png"))); // NOI18N
        person_btn6.setText("Shippers Control");
        person_btn6.setEffectColor(new java.awt.Color(194, 219, 255));
        person_btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                person_btn6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundPanel2Layout = new javax.swing.GroupLayout(roundPanel2);
        roundPanel2.setLayout(roundPanel2Layout);
        roundPanel2Layout.setHorizontalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(person_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(person_btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(person_btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(person_btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(person_btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(person_btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(person_btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        roundPanel2Layout.setVerticalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(person_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(person_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(person_btn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(person_btn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(person_btn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(person_btn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                .addComponent(person_btn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        side_bg.setBackground(new java.awt.Color(144, 195, 253));

        side_panel.setOpaque(false);
        side_panel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout side_bgLayout = new javax.swing.GroupLayout(side_bg);
        side_bg.setLayout(side_bgLayout);
        side_bgLayout.setHorizontalGroup(
            side_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(side_bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(side_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        side_bgLayout.setVerticalGroup(
            side_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, side_bgLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(side_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout mainpanelLayout = new javax.swing.GroupLayout(mainpanel);
        mainpanel.setLayout(mainpanelLayout);
        mainpanelLayout.setHorizontalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanelLayout.createSequentialGroup()
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addComponent(side_bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainpanelLayout.setVerticalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(side_bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void person_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_person_btnActionPerformed
        person_btn.setSelected(true);
        person_btn1.setSelected(false);
        person_btn2.setSelected(false);
        person_btn3.setSelected(false);
        person_btn5.setSelected(false);
        person_btn6.setSelected(false);
        person_btn4.setSelected(false);
        showForm(new Employee_option());
//        person_options.setVisible(true);

        
        
    }//GEN-LAST:event_person_btnActionPerformed

    private void person_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_person_btn1ActionPerformed
        person_btn.setSelected(false);
        person_btn1.setSelected(true);
        person_btn2.setSelected(false);
        person_btn3.setSelected(false);
        person_btn4.setSelected(false);
        person_btn6.setSelected(false);
        person_btn5.setSelected(false);
        showForm(customer_option);
//        person_options.setVisible(false);
    }//GEN-LAST:event_person_btn1ActionPerformed

    private void person_btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_person_btn2ActionPerformed
        person_btn.setSelected(false);
        person_btn1.setSelected(false);
        person_btn2.setSelected(true);
        person_btn3.setSelected(false);
        person_btn4.setSelected(false);
        person_btn5.setSelected(false);
        person_btn6.setSelected(false);
        showForm(new categoryoptions());
//        person_options.setVisible(false);
    }//GEN-LAST:event_person_btn2ActionPerformed

    private void person_btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_person_btn3ActionPerformed
        person_btn.setSelected(false);
        person_btn1.setSelected(false);
        person_btn2.setSelected(false);
        person_btn3.setSelected(true);
        person_btn4.setSelected(false);
        person_btn5.setSelected(false);
        person_btn6.setSelected(false);
        showForm(new Product_options());
//        person_options.setVisible(false);
    }//GEN-LAST:event_person_btn3ActionPerformed

    private void person_btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_person_btn4ActionPerformed
        person_btn.setSelected(false);
        person_btn1.setSelected(false);
        person_btn2.setSelected(false);
        person_btn3.setSelected(false);
        person_btn5.setSelected(false);
        person_btn6.setSelected(false);
        
        
    }//GEN-LAST:event_person_btn4ActionPerformed

    private void person_btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_person_btn5ActionPerformed
        person_btn.setSelected(false);
        person_btn1.setSelected(false);
        person_btn2.setSelected(false);
        person_btn3.setSelected(false);
        person_btn4.setSelected(false);
        person_btn5.setSelected(true);
        person_btn6.setSelected(false);

        showForm(new suplier_options());
    }//GEN-LAST:event_person_btn5ActionPerformed

    private void person_btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_person_btn6ActionPerformed
        person_btn.setSelected(false);
        person_btn1.setSelected(false);
        person_btn2.setSelected(false);
        person_btn3.setSelected(false);
        person_btn4.setSelected(false);
        person_btn5.setSelected(false);
        person_btn6.setSelected(true);
        showForm(new shippers());
    }//GEN-LAST:event_person_btn6ActionPerformed

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
            java.util.logging.Logger.getLogger(Main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admin_label;
    private resources.swing.ImageAvatar imageAvatar3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private resources.swing.RoundPanel mainpanel;
    private resources.swing.ButtonMenu person_btn;
    private resources.swing.ButtonMenu person_btn1;
    private resources.swing.ButtonMenu person_btn2;
    private resources.swing.ButtonMenu person_btn3;
    private resources.swing.ButtonMenu person_btn4;
    private resources.swing.ButtonMenu person_btn5;
    private resources.swing.ButtonMenu person_btn6;
    private resources.swing.RoundPanel roundPanel1;
    private resources.swing.RoundPanel roundPanel2;
    private resources.swing.RoundPanel side_bg;
    public static JPanel side_panel;
    // End of variables declaration//GEN-END:variables
}
