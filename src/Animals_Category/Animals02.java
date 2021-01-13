/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animals_Category;


import Computer_Category.*;
import QandA.front;
import javax.swing.JOptionPane;

/**
 *
 * @author micojasmin
 */
class Anims2 extends Anims1{
    
}
public class Animals02 extends javax.swing.JFrame {

       
    
    public Animals02() {
        
        initComponents();
    jButtonCheck.setVisible(false);
    }

   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jRadioButtonDir = new javax.swing.JRadioButton();
        jRadioButtonDotNEt = new javax.swing.JRadioButton();
        jbuttonSheep = new javax.swing.JRadioButton();
        jRadioButtonC_lang = new javax.swing.JRadioButton();
        jButtonCheck = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 113, 138));
        jPanel1.setLayout(null);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("What type of animals is not nocturnal?");
        jTextArea1.setOpaque(true);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(24, 29, 422, 70);

        jRadioButtonDir.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jRadioButtonDir.setText("C. Leopard");
        jRadioButtonDir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonDirActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButtonDir);
        jRadioButtonDir.setBounds(30, 190, 200, 40);

        jRadioButtonDotNEt.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jRadioButtonDotNEt.setText("B. Tigers");
        jRadioButtonDotNEt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonDotNEt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonDotNEtActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButtonDotNEt);
        jRadioButtonDotNEt.setBounds(250, 130, 200, 40);

        jbuttonSheep.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jbuttonSheep.setText("D. Sheep");
        jbuttonSheep.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbuttonSheep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonSheepActionPerformed(evt);
            }
        });
        jPanel1.add(jbuttonSheep);
        jbuttonSheep.setBounds(250, 190, 200, 40);

        jRadioButtonC_lang.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jRadioButtonC_lang.setText("A. Skunks");
        jRadioButtonC_lang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonC_lang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonC_langActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButtonC_lang);
        jRadioButtonC_lang.setBounds(30, 130, 200, 40);

        jButtonCheck.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jButtonCheck.setText("Check");
        jButtonCheck.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCheckActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCheck);
        jButtonCheck.setBounds(352, 250, 90, 35);

        jButton2.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jButton2.setText("Back");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(24, 250, 90, 35);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbuttonSheepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonSheepActionPerformed
        // TODO add your handling code here:
         if (jbuttonSheep.isSelected()) {
             jButtonCheck.setVisible(true);
            jRadioButtonC_lang.setEnabled(false);
            jRadioButtonDir.setEnabled(false);
            jRadioButtonDotNEt.setEnabled(false);

        } else if (!jbuttonSheep.isSelected()) {
            jButtonCheck.setVisible(false);
            jRadioButtonC_lang.setEnabled(true);
            jRadioButtonDotNEt.setEnabled(true);
            jRadioButtonDir.setEnabled(true);
        }
    }//GEN-LAST:event_jbuttonSheepActionPerformed

    private void jRadioButtonC_langActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonC_langActionPerformed
         if (jRadioButtonC_lang.isSelected()) {
             jButtonCheck.setVisible(true);
            jbuttonSheep.setEnabled(false);
            jRadioButtonDir.setEnabled(false);
            jRadioButtonDotNEt.setEnabled(false);

        } else if (!jRadioButtonC_lang.isSelected()) {
            jButtonCheck.setVisible(false);
            jbuttonSheep.setEnabled(true);
            jRadioButtonDotNEt.setEnabled(true);
            jRadioButtonDir.setEnabled(true);
        }
        
    }//GEN-LAST:event_jRadioButtonC_langActionPerformed

    private void jRadioButtonDotNEtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonDotNEtActionPerformed
        if (jRadioButtonDotNEt.isSelected()) {
            jButtonCheck.setVisible(true);
            jRadioButtonC_lang.setEnabled(false);
            jRadioButtonDir.setEnabled(false);
            jbuttonSheep.setEnabled(false);

        } else if (!jRadioButtonDotNEt.isSelected()) {
            jButtonCheck.setVisible(false);
            jRadioButtonC_lang.setEnabled(true);
            jbuttonSheep.setEnabled(true);
            jRadioButtonDir.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButtonDotNEtActionPerformed

    private void jRadioButtonDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonDirActionPerformed
        if (jRadioButtonDir.isSelected()) {
            jButtonCheck.setVisible(true);
            jRadioButtonC_lang.setEnabled(false);
            jbuttonSheep.setEnabled(false);
            jRadioButtonDotNEt.setEnabled(false);

        } else if (!jRadioButtonDir.isSelected()) {
            jButtonCheck.setVisible(false);
            jRadioButtonC_lang.setEnabled(true);
            jRadioButtonDotNEt.setEnabled(true);
            jbuttonSheep.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButtonDirActionPerformed

    private void jButtonCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCheckActionPerformed
    
            
            
        if (jbuttonSheep.isSelected()) {

            JOptionPane.showMessageDialog(rootPane, "YOUR ANSWER IS CORRECT");
            new Animals03().setVisible(true);
            setVisible(false);
        } else if (!jbuttonSheep.isSelected()) {
            JOptionPane.showMessageDialog(rootPane, "YOUR ANSWER IS WRONG" + "\n" + --Anims2.life +" "+ "LIVES LEFT");
            if (Anims2.life == 0) {
                Anims2.life=3;
                JOptionPane.showMessageDialog(rootPane, "GAME OVER!");
                new front().setVisible(true);
                setVisible(false);
            }
        }
    
    }//GEN-LAST:event_jButtonCheckActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Animals01().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Animals02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Animals02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Animals02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Animals02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Animals02().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonCheck;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonC_lang;
    private javax.swing.JRadioButton jRadioButtonDir;
    private javax.swing.JRadioButton jRadioButtonDotNEt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JRadioButton jbuttonSheep;
    // End of variables declaration//GEN-END:variables

    


}
