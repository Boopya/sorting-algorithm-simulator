public class SelectionSortFrame extends javax.swing.JFrame implements Runnable{
    private final int[] arr;
    private final int n;
    private final String elements;
    
    public SelectionSortFrame(int[] arr, int n, String elements){
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
        passResult = new javax.swing.JLabel();
        swapLabel = new javax.swing.JLabel();
        comparisonLabel = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        minStatus = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        currentPosition = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        comparisonStatus = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        swapStatus = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        comparisonResult = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aldrich's Number Sorter - Selection Sort");
        setMinimumSize(new java.awt.Dimension(700, 400));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        passResult.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 48)); // NOI18N
        passResult.setForeground(new java.awt.Color(78, 89, 26));
        passResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passResult.setText("// Results //");
        jPanel1.add(passResult);
        passResult.setBounds(60, 50, 580, 60);

        swapLabel.setFont(new java.awt.Font("Microsoft JhengHei UI", 3, 18)); // NOI18N
        swapLabel.setForeground(new java.awt.Color(78, 89, 26));
        swapLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(swapLabel);
        swapLabel.setBounds(480, 250, 190, 50);

        comparisonLabel.setFont(new java.awt.Font("Microsoft JhengHei UI", 3, 18)); // NOI18N
        comparisonLabel.setForeground(new java.awt.Color(78, 89, 26));
        comparisonLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(comparisonLabel);
        comparisonLabel.setBounds(40, 250, 200, 50);

        statusLabel.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        statusLabel.setForeground(new java.awt.Color(26, 78, 89));
        statusLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statusLabel.setText("Status:");
        jPanel1.add(statusLabel);
        statusLabel.setBounds(100, 110, 500, 50);

        jPanel6.setBackground(new java.awt.Color(26, 78, 89));
        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        minStatus.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        minStatus.setForeground(new java.awt.Color(240, 240, 240));
        minStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minStatus.setText("// Minimum Value // ");
        jPanel6.add(minStatus);

        jPanel1.add(jPanel6);
        jPanel6.setBounds(400, 300, 150, 30);

        jPanel5.setBackground(new java.awt.Color(26, 78, 89));
        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        currentPosition.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        currentPosition.setForeground(new java.awt.Color(240, 240, 240));
        currentPosition.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        currentPosition.setText("// Current Positon //");
        jPanel5.add(currentPosition);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(160, 300, 160, 30);

        jPanel4.setBackground(new java.awt.Color(26, 78, 89));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        comparisonStatus.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        comparisonStatus.setForeground(new java.awt.Color(240, 240, 240));
        comparisonStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        comparisonStatus.setText("// Current Comparison //");
        jPanel4.add(comparisonStatus);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(240, 160, 240, 40);

        jPanel3.setBackground(new java.awt.Color(26, 78, 89));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        swapStatus.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        swapStatus.setForeground(new java.awt.Color(240, 240, 240));
        swapStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        swapStatus.setText("// Swap Status //");
        jPanel3.add(swapStatus);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(480, 210, 190, 40);

        jPanel2.setBackground(new java.awt.Color(26, 78, 89));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        comparisonResult.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        comparisonResult.setForeground(new java.awt.Color(240, 240, 240));
        comparisonResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        comparisonResult.setText("// Comparison Result //");
        jPanel2.add(comparisonResult);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 210, 220, 40);

        jPanel7.setBackground(new java.awt.Color(26, 78, 89));
        jPanel7.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SELECTION SORT");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel7.add(jLabel1);
        jLabel1.setBounds(190, -10, 360, 60);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cancel.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton2);
        jButton2.setBounds(670, 0, 40, 40);

        backButton.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back (1).png"))); // NOI18N
        backButton.setBorderPainted(false);
        backButton.setContentAreaFilled(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel7.add(backButton);
        backButton.setBounds(10, 0, 50, 40);

        jPanel1.add(jPanel7);
        jPanel7.setBounds(-10, 0, 720, 40);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg1.png"))); // NOI18N
        background.setText("jLabel1");
        jPanel1.add(background);
        background.setBounds(0, 0, 700, 400);

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
        this.dispose();       
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel background;
    private javax.swing.JLabel comparisonLabel;
    private javax.swing.JLabel comparisonResult;
    private javax.swing.JLabel comparisonStatus;
    private javax.swing.JLabel currentPosition;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel minStatus;
    protected javax.swing.JLabel passResult;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel swapLabel;
    private javax.swing.JLabel swapStatus;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        // variables declaration //
       String result, compStatus, swapVal, currentPos;
       int compareCount, swapCount;
       // end of variables declaration //
       
       // initialize variables
       compareCount = swapCount = 0;
       result = elements;
       
       // do for n-1 passes
       for (int i = 0; i < this.n-1; i++) {
           // assign i to current minimum value
            int min = i;
            
            // add 1-second delay before each pass
            try { Thread.sleep(1000); } catch (InterruptedException ex) {}
            passResult.setText("Pass " + (i+1) + ": " + result);
            statusLabel.setText("Status: Pass " + (i+1) + " is processing...");
            minStatus.setText("Minimum Value: " + arr[min]);
            currentPosition.setText("Current Position: " + arr[i]);
            comparisonResult.setText("Status: ");
            swapStatus.setText("Swap: ");
            
            // do for n-i-1 passes
            for (int j = i+1; j < n; j++) { 
                // display elements at current comparison
                comparisonStatus.setText("Current Comparison: " + arr[j] + " < " + arr[min]);
                
                // add 2-second delay
                try { Thread.sleep(2000); } catch (InterruptedException ex) {}
               
                // check if element at jth index is less than at min index 
                if (arr[j] < arr[min]) {
                    // assign jth index as the current minimum (element) index
                    min = j;
                    // set comparison status to true
                    compStatus = "True";
                    
                    // update the comparison status display
                    comparisonResult.setText("Status: " + compStatus);
                    // add a 2-second delay
                    try { Thread.sleep(2000); } catch (InterruptedException ex) {}
                    
                    // update the current minimum value
                    minStatus.setText("Minimum Value: " + arr[min] ); 
                }
                
                else {
                    // set comparison status to false
                    compStatus = "False";
                    
                    // update the comparison status display
                    comparisonResult.setText("Status: " + compStatus);
                    // add a 2-second delay
                    try { Thread.sleep(2000); } catch (InterruptedException ex) {}
                    
                    // no change in current minimum value
                    minStatus.setText("Minimum Value: " + arr[min] );
                    try { Thread.sleep(2000); } catch (InterruptedException ex) {} 
                }
                // increment number of comparisons
                compareCount++;
                // reset comparison status
                compStatus = "";
                // add a 2-second delay
                try { Thread.sleep(2000); } catch (InterruptedException ex) {} 
                // update the comparison status display
                comparisonResult.setText("Status: " + compStatus); 
            }
            
            // check if the minimum value has changed
            if(min != i){
                // swap the elements
                int temp = arr[min]; 
                arr[min] = arr[i]; 
                arr[i] = temp;
                // increment swap counter
                swapCount++;
                // update the swap status display
                swapStatus.setText("Swap: " + arr[i] + " and " + arr[min]); 
            }
            
            else{
                // set swap status to no swapping
                swapVal = "No swapping";    
                // update the swap status display
                swapStatus.setText("Swap: " + swapVal);
                
            }
            // empty the result
            result = "";
            // store the updated array after each pass
            for(int b = 0; b < n; b++) result += arr[b]+" ";
            // add a 2-second delay
            try { Thread.sleep(2000); } catch (InterruptedException ex) {}
            // display the updated array
            passResult.setText("Pass " + (i+1) + ": " + result);
            // add a 2-second delay
            try { Thread.sleep(2000); } catch (InterruptedException ex) {}
            // update the pass status display
            statusLabel.setText("Status: Pass " + (i+1) + " is done.");
            // add a 2-second delay
            try { Thread.sleep(2000); } catch (InterruptedException ex) {}
        }
       // display total number of swaps
        swapLabel.setText("No. of swaps: " + swapCount);
        // display total number of comparisons
        comparisonLabel.setText("No. of comparisons: " + compareCount);
    }
}
