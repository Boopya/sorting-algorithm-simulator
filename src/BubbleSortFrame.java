public class BubbleSortFrame extends javax.swing.JFrame implements Runnable {
    private final int[] arr;
    private final int n;
    private final String elements;
    
    public BubbleSortFrame(int[] arr, int n, String elements) {
        this.n = n;
        this.arr = new int[n];
        for(int i = 0; i < n; i++) this.arr[i] = arr[i];
        this.elements = elements;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        swapLabel = new javax.swing.JLabel();
        passResult = new javax.swing.JLabel();
        comparisonLabel = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        swapStatus = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        comparisonStatus = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        comparisonResult = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aldrich's Number Sorter - Bubble Sort");
        setMinimumSize(new java.awt.Dimension(700, 400));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        swapLabel.setFont(new java.awt.Font("Microsoft JhengHei UI", 3, 18)); // NOI18N
        swapLabel.setForeground(new java.awt.Color(78, 89, 26));
        swapLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(swapLabel);
        swapLabel.setBounds(490, 310, 200, 50);

        passResult.setFont(new java.awt.Font("Microsoft JhengHei", 1, 48)); // NOI18N
        passResult.setForeground(new java.awt.Color(78, 89, 26));
        passResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passResult.setText("// Results //");
        jPanel1.add(passResult);
        passResult.setBounds(140, 40, 450, 70);

        comparisonLabel.setFont(new java.awt.Font("Microsoft JhengHei UI", 3, 18)); // NOI18N
        comparisonLabel.setForeground(new java.awt.Color(78, 89, 26));
        comparisonLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(comparisonLabel);
        comparisonLabel.setBounds(40, 310, 200, 50);

        statusLabel.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        statusLabel.setForeground(new java.awt.Color(26, 78, 89));
        statusLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statusLabel.setText("Status:");
        jPanel1.add(statusLabel);
        statusLabel.setBounds(190, 130, 340, 50);

        jPanel3.setBackground(new java.awt.Color(26, 78, 89));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        swapStatus.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        swapStatus.setForeground(new java.awt.Color(240, 240, 240));
        swapStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        swapStatus.setText("// Swap Status //");
        jPanel3.add(swapStatus);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(480, 260, 210, 40);

        jPanel4.setBackground(new java.awt.Color(26, 78, 89));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        comparisonStatus.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        comparisonStatus.setForeground(new java.awt.Color(240, 240, 240));
        comparisonStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        comparisonStatus.setText("// Current Comparison //");
        jPanel4.add(comparisonStatus);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(230, 190, 280, 40);

        jPanel2.setBackground(new java.awt.Color(26, 78, 89));
        jPanel2.setForeground(new java.awt.Color(26, 78, 89));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        comparisonResult.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        comparisonResult.setForeground(new java.awt.Color(240, 240, 240));
        comparisonResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        comparisonResult.setText("// Comparison Result //");
        jPanel2.add(comparisonResult);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 260, 240, 40);

        jPanel5.setBackground(new java.awt.Color(26, 78, 89));
        jPanel5.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BUBBLE SORT");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel5.add(jLabel1);
        jLabel1.setBounds(200, -10, 360, 60);

        backButton.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back (1).png"))); // NOI18N
        backButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        backButton.setBorderPainted(false);
        backButton.setContentAreaFilled(false);
        backButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        backButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        backButton.setOpaque(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel5.add(backButton);
        backButton.setBounds(20, 0, 40, 40);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cancel.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2);
        jButton2.setBounds(670, 0, 40, 40);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(-10, 0, 720, 40);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg1.png"))); // NOI18N
        background.setToolTipText("");
        jPanel1.add(background);
        background.setBounds(0, 0, 730, 410);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 700, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        InputFrame inputFrame = new InputFrame();
        inputFrame.setVisible(true);
        inputFrame.setSize(700,400);
        inputFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel background;
    private javax.swing.JLabel comparisonLabel;
    private javax.swing.JLabel comparisonResult;
    private javax.swing.JLabel comparisonStatus;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    protected javax.swing.JLabel passResult;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel swapLabel;
    private javax.swing.JLabel swapStatus;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        // variables declaration
        String result, compStatus, swapVal;
        int comp, swap;
        // end of variables declaration
        
        // initialize comparison and swap counter to 0
        comp = swap = 0;
        result = elements;
        
        // do for n-1 passes
        for(int i = 0; i < this.n-1; i++) {
            // add 2-second delay before first pass process
            try { Thread.sleep(2000); } catch (InterruptedException ex) {}
            passResult.setText("Pass " + (i+1) + ": " + result);
            
            // set status label to "processing" for each starting pass
            statusLabel.setText("Status: Pass " + (i+1) + " is processing...");
            
            // do for n-i-1 passes
            for(int j = 0; j < n-i-1; j++) {
                
                // assign an empty string to result for each pass
                result = "";
                
                // reset comparisonResult and swapStatus to empty value after each pass
                comparisonResult.setText("Status: ");
                swapStatus.setText("Swap: ");
                
                // display the current comparison of elements
                comparisonStatus.setText("Current Comparison: " + arr[j] + " > " + arr[j+1]);
                
                // display the current comparison for 2 seconds
                try { Thread.sleep(1000); } catch (InterruptedException ex) {}
                
                // checks if the element at current index is greater than its adjacent element
                if (arr[j] > arr[j+1])
                {
                    compStatus = "True"; swapVal = "Yes";
                    
                    // display "Status: True"
                    comparisonResult.setText("Status: " + compStatus);
                    
                    // add 1-second delay before displaying swap status
                    try { Thread.sleep(1000); } catch (InterruptedException ex) {}
                    
                    // display "Swap? Yes"
                    swapStatus.setText("Swap: " + swapVal);
                   
                    // swap the position of two elements at comparison
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                    // increment swap counter
                    swap++;
                }
                
                else {
                    compStatus = "False"; swapVal = "No";
                    
                    // display "Status: False"
                    comparisonResult.setText("Status: " + compStatus);
                    
                    // add 1-second delay before displaying swap status
                    try { Thread.sleep(1000); } catch (InterruptedException ex) {}
                    
                    // display "Swap? No"
                    swapStatus.setText("Swap: " + swapVal);
                }
                
                // increment comparison counter
                comp++;
                
                // store the updated position of each element after comparison and swapping
                for(int k = 0; k < n; k++) result += arr[k] + " ";
                
                // display the updated position of each element
                for(int l = 0; l < n; l++) {
                    
                    // add 1-second delay before displaying the next updated position of each element
                    try { Thread.sleep(1000); } catch (InterruptedException ex) {}
                    passResult.setText("Pass " + (i+1) + ": " + result);
                }
                
            }
            
            // set status label to "done" after each pass
            statusLabel.setText("Status: Pass " + (i+1) + " is done.");
            
            // add 1-second delay before next pass
            try { Thread.sleep(1000); } catch (InterruptedException ex) {}
        }
        
        // display no. of swaps after all passes are done
        swapLabel.setText("No. of swaps: " + swap);
        
        // display no. of comparisons after all passes are done
        comparisonLabel.setText("No. of comparisons: " + comp);
    }
}
