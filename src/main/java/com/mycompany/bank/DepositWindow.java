/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bank;

import javax.swing.JOptionPane;

/**
 *
 * @author Atish
 */
public class DepositWindow extends javax.swing.JInternalFrame {
    BankControllerInterface bc;

    /**
     * Creates new form DepositWindow
     */
    public DepositWindow(BankControllerInterface bc) {
        this.bc = bc;
        initComponents();
    }
    
    public DepositWindow(BankControllerInterface bc, int accNo)
    {
        this.bc = bc;
        initComponents();
        txtAccNo.setText(String.valueOf(accNo));
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAccNo = new javax.swing.JTextField();
        txtAmount = new javax.swing.JTextField();
        btnCancle = new javax.swing.JButton();
        btnDeposit = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnAccountDetails = new javax.swing.JButton();

        jButton3.setText("jButton3");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Deposit Amount");
        setMinimumSize(new java.awt.Dimension(127, 40));
        setPreferredSize(new java.awt.Dimension(372, 208));

        jLabel1.setText("Enter details for deposit money in an account.");

        jLabel2.setText("Account Number:");

        jLabel3.setText("Ammount to Deposit:");

        btnCancle.setBackground(new java.awt.Color(255, 51, 51));
        btnCancle.setText("Cancle");
        btnCancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancleActionPerformed(evt);
            }
        });

        btnDeposit.setBackground(new java.awt.Color(0, 153, 0));
        btnDeposit.setText("Deposit");
        btnDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAccNo, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                    .addComponent(txtAmount)))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCancle)
                                .addGap(18, 18, 18)
                                .addComponent(btnAccountDetails)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeposit)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancle)
                    .addComponent(btnDeposit)
                    .addComponent(btnAccountDetails))
                .addContainerGap(20, Short.MAX_VALUE))
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

    private void btnDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositActionPerformed
        // TODO add your handling code here:
        int res = JOptionPane.showOptionDialog(this, "Do you want to Deposit?", "Deposit Amount",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,new Object[] { "Yes", "No" }, JOptionPane.YES_OPTION);
        if (res == JOptionPane.YES_OPTION) 
        {
            if(bc.deposit(Integer.parseInt(txtAccNo.getText()), Integer.parseInt(txtAmount.getText())))
            {
                this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Deposit failed!!", "Deposit Amount", JOptionPane.ERROR_MESSAGE);
                txtAccNo.setText("");
                txtAccNo.grabFocus();
            }
        } 
    }//GEN-LAST:event_btnDepositActionPerformed

    private void btnAccountDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountDetailsActionPerformed
        // TODO add your handling code here:
        int res = JOptionPane.showOptionDialog(this, "Do you want View Account Details?", "View Account Details",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,new Object[] { "Yes", "No" }, JOptionPane.YES_OPTION);
        if (res == JOptionPane.YES_OPTION) 
        {
            Account a = bc.findAccount(Integer.parseInt(txtAccNo.getText()));
            AccountDetailsWindow adw = new AccountDetailsWindow(a, this);
            this.getParent().add(adw);
            adw.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnAccountDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccountDetails;
    private javax.swing.JButton btnCancle;
    private javax.swing.JButton btnDeposit;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtAccNo;
    private javax.swing.JTextField txtAmount;
    // End of variables declaration//GEN-END:variables
}
