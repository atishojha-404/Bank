/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bank;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Atish
 */
public class WithdrawWindow extends javax.swing.JInternalFrame {
    BankControllerInterface bc;

    /**
     * Creates new form WithdrawWindow
     */
    public WithdrawWindow(BankControllerInterface bc) {
        this.bc = bc;
        initComponents();
    }
    
    public WithdrawWindow(BankControllerInterface bc, int accNo)
    {
        this.bc = bc;
        initComponents();
        txtFieldAccNum.setText(String.valueOf(accNo));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFieldAccNum = new javax.swing.JTextField();
        txtFieldAmount = new javax.swing.JTextField();
        btnCancle = new javax.swing.JButton();
        btnWithdraw = new javax.swing.JButton();
        btnAccountDetails = new javax.swing.JButton();

        jButton3.setText("jButton3");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Withdraw Amount");

        jLabel1.setText("Enter details for withdraw money from an account.");

        jLabel2.setText("Account Number:");

        jLabel3.setText("Amount to Withdraw:");

        btnCancle.setBackground(new java.awt.Color(255, 0, 0));
        btnCancle.setText("Cancle");
        btnCancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancleActionPerformed(evt);
            }
        });

        btnWithdraw.setBackground(new java.awt.Color(0, 204, 0));
        btnWithdraw.setText("Withdraw");
        btnWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithdrawActionPerformed(evt);
            }
        });

        btnAccountDetails.setBackground(new java.awt.Color(204, 255, 102));
        btnAccountDetails.setText("Account Details");
        btnAccountDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccountDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFieldAccNum)
                                    .addComponent(txtFieldAmount)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCancle)
                                .addGap(18, 18, 18)
                                .addComponent(btnAccountDetails)
                                .addGap(18, 18, 18)
                                .addComponent(btnWithdraw)))
                        .addGap(0, 35, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFieldAccNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFieldAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancle)
                    .addComponent(btnWithdraw)
                    .addComponent(btnAccountDetails))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancleActionPerformed
        // TODO add your handling code here:
        int res = JOptionPane.showOptionDialog(this, "Do you want to cancle?", "Cancle",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,new Object[] { "Yes", "No" }, JOptionPane.YES_OPTION);
        if (res == JOptionPane.YES_OPTION) {
           this.dispose();
        }
        
    }//GEN-LAST:event_btnCancleActionPerformed

    private void btnWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdrawActionPerformed
        // TODO add your handling code here:
        int res = JOptionPane.showOptionDialog(this, "Do you want to Withdraw?", "Withdraw Amount",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,new Object[] { "Yes", "No" }, JOptionPane.YES_OPTION);
        if (res == JOptionPane.YES_OPTION) 
        {
            int status = bc.withdraw(Integer.parseInt(txtFieldAccNum.getText()), Integer.parseInt(txtFieldAmount.getText()));
            switch(status)
            {
                case 1:
                    JOptionPane.showMessageDialog(this, "Amount withdraw Successfully!!", "Withdraw Amount", JOptionPane.OK_OPTION);
                    this.dispose();
                    break;
                case -2:
                    JOptionPane.showMessageDialog(this, "Update function in database didn't go well..", "SQL Failuer", JOptionPane.OK_OPTION);
                    this.dispose();
                    break;
                case -1:
                    JOptionPane.showMessageDialog(this, "Insufficient balance.", "Withdraw Failuer", JOptionPane.OK_OPTION);                
                    txtFieldAmount.setText("");
                    txtFieldAmount.grabFocus();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(this, "Account not found", "Account Not Found", JOptionPane.OK_OPTION);
                    txtFieldAccNum.setText("");
                    txtFieldAccNum.grabFocus();
                    break;
            }
        }
    }//GEN-LAST:event_btnWithdrawActionPerformed

    private void btnAccountDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountDetailsActionPerformed
        // TODO add your handling code here:
        int res = JOptionPane.showOptionDialog(this, "Do you want View Account Details?", "View Account Details",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,new Object[] { "Yes", "No" }, JOptionPane.YES_OPTION);
        if (res == JOptionPane.YES_OPTION) 
        {
            Account a = bc.findAccount(Integer.parseInt(txtFieldAccNum.getText()));
            AccountDetailsWindow adw = new AccountDetailsWindow(a, this);
            this.getParent().add(adw);
            adw.setVisible(true);
            this.setVisible(false);
        }
        
    }//GEN-LAST:event_btnAccountDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccountDetails;
    private javax.swing.JButton btnCancle;
    private javax.swing.JButton btnWithdraw;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtFieldAccNum;
    private javax.swing.JTextField txtFieldAmount;
    // End of variables declaration//GEN-END:variables
}
