
public class top_bar extends javax.swing.JPanel {
    String top;
    /**
     * Creates new form top_bar
     */
    public top_bar(String t) {
        top = t;
        initComponents();
    }

    //GEN-BEGIN:initComponents
    private void initComponents() {

        buttonOutLine1 = new resources.swing.ButtonOutLine();

        setOpaque(false);

        buttonOutLine1.setText(top);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonOutLine1, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonOutLine1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private resources.swing.ButtonOutLine buttonOutLine1;
    // End of variables declaration//GEN-END:variables
}
