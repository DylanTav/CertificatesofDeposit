/*
This program was made by Dylan T
It was created on April 4th, 2018
This program displays the number of years from an investment with the desired ending amount and annual rate
 */


public class CertificatesofDepositsForm extends javax.swing.JFrame {

    
    public CertificatesofDepositsForm() {
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelHeader = new javax.swing.JLabel();
        labelEnterInitialInvest = new javax.swing.JLabel();
        labelEnterInterestRate = new javax.swing.JLabel();
        labelEnterEndValue = new javax.swing.JLabel();
        labelOutputMessage = new javax.swing.JLabel();
        textInitialInvest = new javax.swing.JTextField();
        textInterestRate = new javax.swing.JTextField();
        textEndValue = new javax.swing.JTextField();
        buttonCalculate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelHeader.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelHeader.setText("CD Calculator");

        labelEnterInitialInvest.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelEnterInitialInvest.setText("Enter intial investment ($) :");

        labelEnterInterestRate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelEnterInterestRate.setText("Enter annual interest rate (%) :");

        labelEnterEndValue.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelEnterEndValue.setText("Enter ending value ($) :");

        labelOutputMessage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        textInitialInvest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textInitialInvestActionPerformed(evt);
            }
        });

        textInterestRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textInterestRateActionPerformed(evt);
            }
        });

        textEndValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEndValueActionPerformed(evt);
            }
        });

        buttonCalculate.setText("Calculate");
        buttonCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCalculateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addComponent(labelHeader)
                .addGap(87, 87, 87))
            .addComponent(labelOutputMessage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonCalculate)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEnterInitialInvest)
                            .addComponent(labelEnterInterestRate)
                            .addComponent(labelEnterEndValue))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textEndValue, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                            .addComponent(textInterestRate)
                            .addComponent(textInitialInvest))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelHeader)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEnterInitialInvest)
                    .addComponent(textInitialInvest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEnterInterestRate)
                    .addComponent(textInterestRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEnterEndValue)
                    .addComponent(textEndValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonCalculate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(labelOutputMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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
    }// </editor-fold>//GEN-END:initComponents

    private void textInterestRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textInterestRateActionPerformed

    }//GEN-LAST:event_textInterestRateActionPerformed

    private void textEndValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEndValueActionPerformed
        
    }//GEN-LAST:event_textEndValueActionPerformed

    private void textInitialInvestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textInitialInvestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textInitialInvestActionPerformed

    private void buttonCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalculateActionPerformed
            double cdValue, cdEndValue, interestRate, year; //Declaring double variables
       
       year = 0;// Intializing year and assigning it 0
       cdValue = Double.parseDouble(textInitialInvest.getText());//Initializing cdValue and assinging it the text in textInitialInvest
       cdEndValue = Double.parseDouble(textEndValue.getText());;//Initializing cdEndValue and assinging it the text in textEndValue       
       interestRate = Double.parseDouble(textInterestRate.getText());;//Initializing interestRate and assinging it the text in textInterestRate
       interestRate/=100;//interestRate = interestRate divided by 100
       while(cdValue <= cdEndValue){ // While cdValue less then or equal to cdEndValue then
           
           year += 1;//year = year plus one
           
           cdValue = cdValue + (cdValue * interestRate);//cdValue times interestRate + cdValue
                 
       }
       labelOutputMessage.setText("The number of years is " + year);//Set text to labelOutputMessage
       
    }//GEN-LAST:event_buttonCalculateActionPerformed

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
            java.util.logging.Logger.getLogger(CertificatesofDepositsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CertificatesofDepositsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CertificatesofDepositsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CertificatesofDepositsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CertificatesofDepositsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCalculate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelEnterEndValue;
    private javax.swing.JLabel labelEnterInitialInvest;
    private javax.swing.JLabel labelEnterInterestRate;
    private javax.swing.JLabel labelHeader;
    private javax.swing.JLabel labelOutputMessage;
    private javax.swing.JTextField textEndValue;
    private javax.swing.JTextField textInitialInvest;
    private javax.swing.JTextField textInterestRate;
    // End of variables declaration//GEN-END:variables
}
