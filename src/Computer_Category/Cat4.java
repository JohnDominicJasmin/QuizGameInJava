/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Computer_Category;

import QandA.front;
import javax.swing.JOptionPane;

/**
 *
 * @author micojasmin
 */ class hp3 extends hp2{
       
    }
public class Cat4 extends javax.swing.JFrame {

   
   
    hp3 h3 = new hp3();
    public Cat4() {
        initComponents();
        jButtonCheck.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jRadioButton1Basic = new javax.swing.JRadioButton();
        jRadioButtonPL = new javax.swing.JRadioButton();
        jRadioButton3Fortran = new javax.swing.JRadioButton();
        jRadioButtonPascal = new javax.swing.JRadioButton();
        jButtonCheck = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(null);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Which of the following languages is more \nsuited to a structured program?");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 40, 420, 90);

        jRadioButton1Basic.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jRadioButton1Basic.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton1Basic.setText("\tBASIC ");
        jRadioButton1Basic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton1Basic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1BasicActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1Basic);
        jRadioButton1Basic.setBounds(20, 190, 200, 40);

        jRadioButtonPL.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jRadioButtonPL.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonPL.setText("PL/1 ");
        jRadioButtonPL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonPL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPLActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButtonPL);
        jRadioButtonPL.setBounds(20, 140, 200, 40);

        jRadioButton3Fortran.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jRadioButton3Fortran.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton3Fortran.setText("FORTRAN ");
        jRadioButton3Fortran.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton3Fortran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3FortranActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3Fortran);
        jRadioButton3Fortran.setBounds(240, 140, 200, 40);

        jRadioButtonPascal.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jRadioButtonPascal.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonPascal.setText("PASCAL");
        jRadioButtonPascal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonPascal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPascalActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButtonPascal);
        jRadioButtonPascal.setBounds(240, 190, 200, 40);

        jButtonCheck.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jButtonCheck.setText("Check");
        jButtonCheck.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCheckActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCheck);
        jButtonCheck.setBounds(344, 250, 90, 35);

        jButton2.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jButton2.setText("Back");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(20, 250, 90, 35);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       new Cat3().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCheckActionPerformed
 if (jRadioButtonPascal.isSelected()) {

            JOptionPane.showMessageDialog(rootPane, "YOUR ANSWER IS CORRECT");
            new Cat5().setVisible(true);
            setVisible(false);
        } else if (!jRadioButtonPascal.isSelected()) {
            JOptionPane.showMessageDialog(rootPane, "YOUR ANSWER IS WRONG" + "\n" + --h3.life +" "+ "LIVES LEFT");
            if (h3.life == 0) {
                h3.life=3;
                JOptionPane.showMessageDialog(rootPane, "GAME OVER!");
                new front().setVisible(true);
                setVisible(false);
            }
        }        
    }//GEN-LAST:event_jButtonCheckActionPerformed

    private void jRadioButtonPLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPLActionPerformed
         if (jRadioButtonPL.isSelected()) {
            jButtonCheck.setVisible(true);
            jRadioButton1Basic.setEnabled(false);
            jRadioButton3Fortran.setEnabled(false);
            jRadioButtonPascal.setEnabled(false);

        } else if (!jRadioButtonPL.isSelected()) {
            jButtonCheck.setVisible(false);
            jRadioButton1Basic.setEnabled(true);
            jRadioButton3Fortran.setEnabled(true);
            jRadioButtonPascal.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButtonPLActionPerformed

    private void jRadioButton3FortranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3FortranActionPerformed
        if (jRadioButton3Fortran.isSelected()) {
            jButtonCheck.setVisible(true);
            jRadioButton1Basic.setEnabled(false);
            jRadioButtonPL.setEnabled(false);
            jRadioButtonPascal.setEnabled(false);

        } else if (!jRadioButton3Fortran.isSelected()) {
            jButtonCheck.setVisible(false);
            jRadioButton1Basic.setEnabled(true);
            jRadioButtonPL.setEnabled(true);
            jRadioButtonPascal.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButton3FortranActionPerformed

    private void jRadioButton1BasicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1BasicActionPerformed
        if (jRadioButton1Basic.isSelected()) {
            jButtonCheck.setVisible(true);
            jRadioButtonPL.setEnabled(false);
            jRadioButton3Fortran.setEnabled(false);
            jRadioButtonPascal.setEnabled(false);

        } else if (!jRadioButton1Basic.isSelected()) {
            jButtonCheck.setVisible(false);
            jRadioButtonPL.setEnabled(true);
            jRadioButton3Fortran.setEnabled(true);
            jRadioButtonPascal.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButton1BasicActionPerformed

    private void jRadioButtonPascalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPascalActionPerformed
        if (jRadioButtonPascal.isSelected()) {
            jButtonCheck.setVisible(true);
            jRadioButton1Basic.setEnabled(false);
            jRadioButton3Fortran.setEnabled(false);
            jRadioButtonPL.setEnabled(false);

        } else if (!jRadioButtonPascal.isSelected()) {
            jButtonCheck.setVisible(false);
            jRadioButton1Basic.setEnabled(true);
            jRadioButton3Fortran.setEnabled(true);
            jRadioButtonPL.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButtonPascalActionPerformed

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
            java.util.logging.Logger.getLogger(Cat4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cat4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cat4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cat4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cat4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonCheck;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1Basic;
    private javax.swing.JRadioButton jRadioButton3Fortran;
    private javax.swing.JRadioButton jRadioButtonPL;
    private javax.swing.JRadioButton jRadioButtonPascal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
