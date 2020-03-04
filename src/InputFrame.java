import java.util.Scanner;
import javax.swing.JOptionPane;

public class InputFrame extends javax.swing.JFrame {
    public InputFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        header1 = new javax.swing.JLabel();
        inputField = new javax.swing.JTextField();
        bubbleSortButton = new javax.swing.JButton();
        selectionSortButton = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Aldrich's Number Sorter - Input Numbers");
        setBounds(new java.awt.Rectangle(0, 0, 700, 400));
        setMinimumSize(new java.awt.Dimension(700, 400));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        header1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        header1.setForeground(new java.awt.Color(26, 78, 89));
        header1.setText("E n t e r   y o u r   n u m b e r s :");
        jPanel1.add(header1);
        header1.setBounds(80, 60, 516, 49);

        inputField.setBackground(new java.awt.Color(26, 78, 89));
        inputField.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        inputField.setForeground(new java.awt.Color(255, 255, 255));
        inputField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(inputField);
        inputField.setBounds(80, 140, 530, 54);

        bubbleSortButton.setBackground(new java.awt.Color(255, 255, 255));
        bubbleSortButton.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        bubbleSortButton.setForeground(new java.awt.Color(26, 78, 89));
        bubbleSortButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bubble_sort.png"))); // NOI18N
        bubbleSortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bubbleSortButtonActionPerformed(evt);
            }
        });
        jPanel1.add(bubbleSortButton);
        bubbleSortButton.setBounds(140, 240, 150, 130);

        selectionSortButton.setBackground(new java.awt.Color(255, 255, 255));
        selectionSortButton.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        selectionSortButton.setForeground(new java.awt.Color(26, 78, 89));
        selectionSortButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/selection_sort.png"))); // NOI18N
        selectionSortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionSortButtonActionPerformed(evt);
            }
        });
        jPanel1.add(selectionSortButton);
        selectionSortButton.setBounds(400, 240, 150, 130);

        jPanel7.setBackground(new java.awt.Color(26, 78, 89));
        jPanel7.setLayout(null);

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

        jPanel1.add(jPanel7);
        jPanel7.setBounds(-10, 0, 720, 40);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg1.png"))); // NOI18N
        background.setText("jLabel3");
        jPanel1.add(background);
        background.setBounds(0, 0, 712, 400);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 700, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bubbleSortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bubbleSortButtonActionPerformed
        boolean valid = true;

        // read the user's input from text field and store it in to the elements string
        String elements = inputField.getText();
        
        // initialize a scanner for the elements
        Scanner input = new Scanner(elements);
        Scanner store = new Scanner(elements);

        // initialize a counter variable for counting the number of elements input by the user
        int n = 0;
        
        // increment the counter variable as long as it could read a next token
        while (input.hasNext()) {
            if(input.nextInt() < 0) {
                JOptionPane.showMessageDialog(rootPane, "Input must be positive integers only.", "ERROR", JOptionPane.ERROR_MESSAGE);
                n = 0;
                valid = false;
            }
            n++;
        }
        
        if(valid) {
            // initialize an array for the elements
            int arr[] = new int[n];

            // store each element in the array
            for(int i = 0; i < n; i++) arr[i] = store.nextInt();

            // initialize BubbleSortFrame
            BubbleSortFrame bubbleSortFrame = new BubbleSortFrame(arr, n, elements);
            Thread thread = new Thread(bubbleSortFrame);
            thread.start();
            bubbleSortFrame.setVisible(true);
            bubbleSortFrame.setSize(700,400);
            bubbleSortFrame.setLocationRelativeTo(null);
            bubbleSortFrame.passResult.setText("Original elements: " + elements);
            this.dispose();
        }
    }//GEN-LAST:event_bubbleSortButtonActionPerformed

    private void selectionSortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionSortButtonActionPerformed
        boolean valid = true;
        
        // read the user's input from text field and store it in to the elements string
        String elements = inputField.getText();
        
        // initialize a scanner for the elements
        Scanner input = new Scanner(elements);
        Scanner store = new Scanner(elements);

        // initialize a counter variable for counting the number of elements input by the user
        int n = 0;
        
        // increment the counter variable as long as it could read a next token
        while (input.hasNext()) {
            if(input.nextInt() < 0) {
                JOptionPane.showMessageDialog(rootPane, "Input must be positive integers only.", "ERROR", JOptionPane.ERROR_MESSAGE);
                n = 0;
            }
            n++;
        }
        
        if(valid) {
            // initialize an array for the elements
            int arr[] = new int[n];

            // store each element in the array
            for(int i = 0; i < n; i++) arr[i] = store.nextInt();

            // initialize BubbleSortFrame
            SelectionSortFrame selectionSortFrame = new SelectionSortFrame(arr, n, elements);
            Thread thread = new Thread(selectionSortFrame);
            thread.start();
            selectionSortFrame.setVisible(true);
            selectionSortFrame.setSize(700,400);
            selectionSortFrame.setLocationRelativeTo(null);
            selectionSortFrame.passResult.setText("Original elements: " + elements);

            this.dispose();
        }
    }//GEN-LAST:event_selectionSortButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();      
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton bubbleSortButton;
    private javax.swing.JLabel header1;
    private javax.swing.JTextField inputField;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton selectionSortButton;
    // End of variables declaration//GEN-END:variables
}
