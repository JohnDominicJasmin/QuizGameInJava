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
class Anims3 extends Anims2{
    
}
public class Animals03 extends javax.swing.JFrame {

       
    
    public Animals03() {
        
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
        jRadioButtonKit = new javax.swing.JRadioButton();
        jbuttonSheep = new javax.swing.JRadioButton();
        jRadioButtonC_lang = new javax.swing.JRadioButton();
        jButtonCheck = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.setLayout(null);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("What is a baby rabbit called?");
        jTextArea1.setOpaque(true);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 30, 430, 70);

        jRadioButtonDir.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jRadioButtonDir.setText("C. Buck");
        jRadioButtonDir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonDirActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButtonDir);
        jRadioButtonDir.setBounds(20, 190, 200, 40);

        jRadioButtonKit.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jRadioButtonKit.setText("B. Kit");
        jRadioButtonKit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonKit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonKitActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButtonKit);
        jRadioButtonKit.setBounds(250, 130, 200, 40);

        jbuttonSheep.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jbuttonSheep.setText("D. Hare");
        jbuttonSheep.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbuttonSheep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonSheepActionPerformed(evt);
            }
        });
        jPanel1.add(jbuttonSheep);
        jbuttonSheep.setBounds(250, 190, 200, 40);

        jRadioButtonC_lang.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jRadioButtonC_lang.setText("A. Doe");
        jRadioButtonC_lang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonC_lang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonC_langActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButtonC_lang);
        jRadioButtonC_lang.setBounds(20, 130, 200, 40);

        jButtonCheck.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jButtonCheck.setText("Check");
        jButtonCheck.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCheckActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCheck);
        jButtonCheck.setBounds(352, 250, 100, 35);

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbuttonSheepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonSheepActionPerformed
        // TODO add your handling code here:
         if (jbuttonSheep.isSelected()) {
             jButtonCheck.setVisible(true);
            jRadioButtonC_lang.setEnabled(false);
            jRadioButtonDir.setEnabled(false);
            jRadioButtonKit.setEnabled(false);

        } else if (!jbuttonSheep.isSelected()) {
            jButtonCheck.setVisible(false);
            jRadioButtonC_lang.setEnabled(true);
            jRadioButtonKit.setEnabled(true);
            jRadioButtonDir.setEnabled(true);
        }
    }//GEN-LAST:event_jbuttonSheepActionPerformed

    private void jRadioButtonC_langActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonC_langActionPerformed
         if (jRadioButtonC_lang.isSelected()) {
             jButtonCheck.setVisible(true);
            jbuttonSheep.setEnabled(false);
            jRadioButtonDir.setEnabled(false);
            jRadioButtonKit.setEnabled(false);

        } else if (!jRadioButtonC_lang.isSelected()) {
            jButtonCheck.setVisible(false);
            jbuttonSheep.setEnabled(true);
            jRadioButtonKit.setEnabled(true);
            jRadioButtonDir.setEnabled(true);
        }
        
    }//GEN-LAST:event_jRadioButtonC_langActionPerformed

    private void jRadioButtonKitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonKitActionPerformed
        if (jRadioButtonKit.isSelected()) {
            jButtonCheck.setVisible(true);
            jRadioButtonC_lang.setEnabled(false);
            jRadioButtonDir.setEnabled(false);
            jbuttonSheep.setEnabled(false);

        } else if (!jRadioButtonKit.isSelected()) {
            jButtonCheck.setVisible(false);
            jRadioButtonC_lang.setEnabled(true);
            jbuttonSheep.setEnabled(true);
            jRadioButtonDir.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButtonKitActionPerformed

    private void jRadioButtonDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonDirActionPerformed
        if (jRadioButtonDir.isSelected()) {
            jButtonCheck.setVisible(true);
            jRadioButtonC_lang.setEnabled(false);
            jbuttonSheep.setEnabled(false);
            jRadioButtonKit.setEnabled(false);

        } else if (!jRadioButtonDir.isSelected()) {
            jButtonCheck.setVisible(false);
            jRadioButtonC_lang.setEnabled(true);
            jRadioButtonKit.setEnabled(true);
            jbuttonSheep.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButtonDirActionPerformed

    private void jButtonCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCheckActionPerformed
    
            
            
        if (jRadioButtonKit.isSelected()) {

            JOptionPane.showMessageDialog(rootPane, "YOUR ANSWER IS CORRECT");
            new Animals04().setVisible(true);
            setVisible(false);
        } else if (!jRadioButtonKit.isSelected()) {
            JOptionPane.showMessageDialog(rootPane, "YOUR ANSWER IS WRONG" + "\n" + --Anims3.life +" "+ "LIVES LEFT");
            if (Anims3.life == 0) {
                Anims3.life=3;
                JOptionPane.showMessageDialog(rootPane, "GAME OVER!");
                new front().setVisible(true);
                setVisible(false);
            }
        }
    
    }//GEN-LAST:event_jButtonCheckActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Animals02().setVisible(true);
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
            java.util.logging.Logger.getLogger(Animals03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Animals03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Animals03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Animals03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Animals03().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonCheck;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonC_lang;
    private javax.swing.JRadioButton jRadioButtonDir;
    private javax.swing.JRadioButton jRadioButtonKit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JRadioButton jbuttonSheep;
    // End of variables declaration//GEN-END:variables

    


}
