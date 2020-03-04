public class HomeScreenFrame extends javax.swing.JFrame {
    public HomeScreenFrame() {
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        aldrichLabel = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Aldrich's Number Sorter");
        setBounds(new java.awt.Rectangle(0, 0, 600, 400));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setMinimumSize(new java.awt.Dimension(700, 400));
        setUndecorated(true);

        jPanel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 13)); // NOI18N
        jPanel1.setLayout(null);

        titleLabel.setFont(new java.awt.Font("Microsoft JhengHei", 1, 56)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(26, 78, 89));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setLabelFor(titleLabel);
        titleLabel.setText("N u m b e r  S o r t e r");
        titleLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(titleLabel);
        titleLabel.setBounds(-50, 140, 800, 130);

        aldrichLabel.setFont(new java.awt.Font("Microsoft JhengHei", 3, 32)); // NOI18N
        aldrichLabel.setForeground(new java.awt.Color(78, 89, 26));
        aldrichLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aldrichLabel.setLabelFor(aldrichLabel);
        aldrichLabel.setText("Aldrich's");
        aldrichLabel.setAlignmentX(0.2F);
        jPanel1.add(aldrichLabel);
        aldrichLabel.setBounds(90, 100, 180, 80);

        startButton.setBackground(new java.awt.Color(255, 255, 255));
        startButton.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        startButton.setForeground(new java.awt.Color(255, 255, 255));
        startButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/power3.png"))); // NOI18N
        startButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        startButton.setBorderPainted(false);
        startButton.setContentAreaFilled(false);
        startButton.setIconTextGap(50);
        startButton.setOpaque(false);
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        jPanel1.add(startButton);
        startButton.setBounds(310, 250, 70, 61);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg1.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 700, 390);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        InputFrame inputFrame = new InputFrame();
        inputFrame.setVisible(true);
        inputFrame.setSize(700,400);
        inputFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_startButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeScreenFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aldrichLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton startButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
