
public class Employee_option extends javax.swing.JPanel {

    /**
     * Creates new form Customer_options
     */
    public Employee_option() {
        initComponents();
    }

    
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        roundPanel3 = new resources.swing.RoundPanel();
        roundPanel13 = new resources.swing.RoundPanel();
        buttonMenu24 = new resources.swing.ButtonMenu();
        roundPanel7 = new resources.swing.RoundPanel();
        roundPanel4 = new resources.swing.RoundPanel();
        jLabel2 = new javax.swing.JLabel();
        roundPanel10 = new resources.swing.RoundPanel();
        buttonMenu16 = new resources.swing.ButtonMenu();
        roundPanel14 = new resources.swing.RoundPanel();
        buttonMenu17 = new resources.swing.ButtonMenu();
        roundPanel17 = new resources.swing.RoundPanel();
        buttonMenu19 = new resources.swing.ButtonMenu();
        roundPanel18 = new resources.swing.RoundPanel();
        buttonMenu20 = new resources.swing.ButtonMenu();
        roundPanel19 = new resources.swing.RoundPanel();
        buttonMenu18 = new resources.swing.ButtonMenu();
        roundPanel15 = new resources.swing.RoundPanel();
        exit = new resources.swing.ButtonMenu();

        setOpaque(false);

        jPanel3.setAlignmentX(0.0F);
        jPanel3.setAlignmentY(0.0F);
        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(650, 481));
        jPanel3.setLayout(null);

        roundPanel3.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout roundPanel3Layout = new javax.swing.GroupLayout(roundPanel3);
        roundPanel3.setLayout(roundPanel3Layout);
        roundPanel3Layout.setHorizontalGroup(
                roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 205, Short.MAX_VALUE)
        );
        roundPanel3Layout.setVerticalGroup(
                roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.add(roundPanel3);
        roundPanel3.setBounds(106, 0, 205, 0);

        roundPanel13.setBackground(new java.awt.Color(46, 159, 240));

        buttonMenu24.setText("ADD EMPLOYEE");
        buttonMenu24.setAlignmentX(0.5F);
        buttonMenu24.setEffectColor(new java.awt.Color(242, 247, 255));
        buttonMenu24.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        buttonMenu24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonMenu24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMenu24buttonMenu14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundPanel13Layout = new javax.swing.GroupLayout(roundPanel13);
        roundPanel13.setLayout(roundPanel13Layout);
        roundPanel13Layout.setHorizontalGroup(
                roundPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 210, Short.MAX_VALUE)
                        .addGroup(roundPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(roundPanel13Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(buttonMenu24, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                        .addContainerGap()))
        );
        roundPanel13Layout.setVerticalGroup(
                roundPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 176, Short.MAX_VALUE)
                        .addGroup(roundPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(roundPanel13Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(buttonMenu24, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                        .addContainerGap()))
        );

        jPanel3.add(roundPanel13);
        roundPanel13.setBounds(0, 100, 210, 176);

        roundPanel7.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout roundPanel7Layout = new javax.swing.GroupLayout(roundPanel7);
        roundPanel7.setLayout(roundPanel7Layout);
        roundPanel7Layout.setHorizontalGroup(
                roundPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 128, Short.MAX_VALUE)
        );
        roundPanel7Layout.setVerticalGroup(
                roundPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.add(roundPanel7);
        roundPanel7.setBounds(534, 0, 128, 0);

        roundPanel4.setBackground(new java.awt.Color(3, 98, 139));

        jLabel2.setBackground(new java.awt.Color(46, 159, 240));
        jLabel2.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 247, 255));
        jLabel2.setText("Employee Management");

        javax.swing.GroupLayout roundPanel4Layout = new javax.swing.GroupLayout(roundPanel4);
        roundPanel4.setLayout(roundPanel4Layout);
        roundPanel4Layout.setHorizontalGroup(
                roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel4Layout.createSequentialGroup()
                                .addGap(245, 245, 245)
                                .addComponent(jLabel2)
                                .addGap(258, 258, 258))
        );
        roundPanel4Layout.setVerticalGroup(
                roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        jPanel3.add(roundPanel4);
        roundPanel4.setBounds(0, 0, 650, 80);

        roundPanel10.setBackground(new java.awt.Color(46, 159, 240));

        buttonMenu16.setText("CHOOSE BY POST");
        buttonMenu16.setAlignmentX(0.5F);
        buttonMenu16.setEffectColor(new java.awt.Color(242, 247, 255));
        buttonMenu16.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        buttonMenu16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonMenu16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMenu16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundPanel10Layout = new javax.swing.GroupLayout(roundPanel10);
        roundPanel10.setLayout(roundPanel10Layout);
        roundPanel10Layout.setHorizontalGroup(
                roundPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 210, Short.MAX_VALUE)
                        .addGroup(roundPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(roundPanel10Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(buttonMenu16, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                        .addContainerGap()))
        );
        roundPanel10Layout.setVerticalGroup(
                roundPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 176, Short.MAX_VALUE)
                        .addGroup(roundPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(roundPanel10Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(buttonMenu16, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                        .addContainerGap()))
        );

        jPanel3.add(roundPanel10);
        roundPanel10.setBounds(220, 100, 210, 176);

        roundPanel14.setBackground(new java.awt.Color(46, 159, 240));

        buttonMenu17.setText("SHOW ALL EMPLOYEE");
        buttonMenu17.setAlignmentX(0.5F);
        buttonMenu17.setEffectColor(new java.awt.Color(242, 247, 255));
        buttonMenu17.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        buttonMenu17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonMenu17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMenu17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundPanel14Layout = new javax.swing.GroupLayout(roundPanel14);
        roundPanel14.setLayout(roundPanel14Layout);
        roundPanel14Layout.setHorizontalGroup(
                roundPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 210, Short.MAX_VALUE)
                        .addGroup(roundPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(roundPanel14Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(buttonMenu17, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                        .addContainerGap()))
        );
        roundPanel14Layout.setVerticalGroup(
                roundPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 176, Short.MAX_VALUE)
                        .addGroup(roundPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(roundPanel14Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(buttonMenu17, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                        .addContainerGap()))
        );

        jPanel3.add(roundPanel14);
        roundPanel14.setBounds(440, 100, 210, 176);

        roundPanel17.setBackground(new java.awt.Color(46, 159, 240));

        buttonMenu19.setText("EDIT DETAILS");
        buttonMenu19.setAlignmentX(0.5F);
        buttonMenu19.setEffectColor(new java.awt.Color(242, 247, 255));
        buttonMenu19.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        buttonMenu19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonMenu19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMenu19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundPanel17Layout = new javax.swing.GroupLayout(roundPanel17);
        roundPanel17.setLayout(roundPanel17Layout);
        roundPanel17Layout.setHorizontalGroup(
                roundPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 210, Short.MAX_VALUE)
                        .addGroup(roundPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(roundPanel17Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(buttonMenu19, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                        .addContainerGap()))
        );
        roundPanel17Layout.setVerticalGroup(
                roundPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 176, Short.MAX_VALUE)
                        .addGroup(roundPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(roundPanel17Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(buttonMenu19, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                        .addContainerGap()))
        );

        jPanel3.add(roundPanel17);
        roundPanel17.setBounds(220, 300, 210, 176);

        roundPanel18.setBackground(new java.awt.Color(46, 159, 240));

        buttonMenu20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/icons8-admin-100.png"))); // NOI18N
        buttonMenu20.setAlignmentX(0.5F);
        buttonMenu20.setEffectColor(new java.awt.Color(242, 247, 255));
        buttonMenu20.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        buttonMenu20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout roundPanel18Layout = new javax.swing.GroupLayout(roundPanel18);
        roundPanel18.setLayout(roundPanel18Layout);
        roundPanel18Layout.setHorizontalGroup(
                roundPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 210, Short.MAX_VALUE)
                        .addGroup(roundPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(roundPanel18Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(buttonMenu20, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                        .addContainerGap()))
        );
        roundPanel18Layout.setVerticalGroup(
                roundPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 176, Short.MAX_VALUE)
                        .addGroup(roundPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(roundPanel18Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(buttonMenu20, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                        .addContainerGap()))
        );

        jPanel3.add(roundPanel18);
        roundPanel18.setBounds(440, 300, 210, 176);

        roundPanel19.setBackground(new java.awt.Color(46, 159, 240));

        buttonMenu18.setText("SEARCH EMPLOYEE");
        buttonMenu18.setAlignmentX(0.5F);
        buttonMenu18.setEffectColor(new java.awt.Color(242, 247, 255));
        buttonMenu18.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        buttonMenu18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonMenu18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMenu18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundPanel19Layout = new javax.swing.GroupLayout(roundPanel19);
        roundPanel19.setLayout(roundPanel19Layout);
        roundPanel19Layout.setHorizontalGroup(
                roundPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 210, Short.MAX_VALUE)
                        .addGroup(roundPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(roundPanel19Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(buttonMenu18, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                        .addContainerGap()))
        );
        roundPanel19Layout.setVerticalGroup(
                roundPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 176, Short.MAX_VALUE)
                        .addGroup(roundPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(roundPanel19Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(buttonMenu18, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                        .addContainerGap()))
        );

        jPanel3.add(roundPanel19);
        roundPanel19.setBounds(0, 300, 210, 176);

        roundPanel15.setBackground(new java.awt.Color(3, 98, 139));

        exit.setText("EXIT ");
        exit.setAlignmentX(0.5F);
        exit.setEffectColor(new java.awt.Color(242, 247, 255));
        exit.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitExit(evt);
            }
        });

        javax.swing.GroupLayout roundPanel15Layout = new javax.swing.GroupLayout(roundPanel15);
        roundPanel15.setLayout(roundPanel15Layout);
        roundPanel15Layout.setHorizontalGroup(
                roundPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel15Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
                                .addContainerGap())
        );
        roundPanel15Layout.setVerticalGroup(
                roundPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel15Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jPanel3.add(roundPanel15);
        roundPanel15.setBounds(0, 500, 650, 70);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 650, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 577, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>

    private void buttonMenu24buttonMenu14ActionPerformed(java.awt.event.ActionEvent evt) {
        Main_frame.showForm(new Add_Employee());
    }

    private void buttonMenu16ActionPerformed(java.awt.event.ActionEvent evt) {
        Main_frame.showForm(new by_post_emp());
    }

    private void buttonMenu17ActionPerformed(java.awt.event.ActionEvent evt) {
        Main_frame.showForm(new All_employs());
    }

    private void buttonMenu19ActionPerformed(java.awt.event.ActionEvent evt) {
        Main_frame.showForm(new SEARCH_EMPLOY(0,1));
    }

    private void buttonMenu18ActionPerformed(java.awt.event.ActionEvent evt) {
        Main_frame.showForm(new SEARCH_EMPLOY(1,0));
    }

    private void exitExit(java.awt.event.ActionEvent evt) {

    }


    // Variables declaration - do not modify
    private resources.swing.ButtonMenu buttonMenu16;
    private resources.swing.ButtonMenu buttonMenu17;
    private resources.swing.ButtonMenu buttonMenu18;
    private resources.swing.ButtonMenu buttonMenu19;
    private resources.swing.ButtonMenu buttonMenu20;
    private resources.swing.ButtonMenu buttonMenu24;
    private resources.swing.ButtonMenu exit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private resources.swing.RoundPanel roundPanel10;
    private resources.swing.RoundPanel roundPanel13;
    private resources.swing.RoundPanel roundPanel14;
    private resources.swing.RoundPanel roundPanel15;
    private resources.swing.RoundPanel roundPanel17;
    private resources.swing.RoundPanel roundPanel18;
    private resources.swing.RoundPanel roundPanel19;
    private resources.swing.RoundPanel roundPanel3;
    private resources.swing.RoundPanel roundPanel4;
    private resources.swing.RoundPanel roundPanel7;
    // End of variables declaration
}
