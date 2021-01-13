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
class Anims6 extends Anims5{
    
}
public class Animals06 extends javax.swing.JFrame {

       
    
    public Animals06() {
        
        initComponents();
    jButtonCheck.setVisible(false);
    }

   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jbttnEggshell = new javax.swing.JRadioButton();
        jRadioButtonKit = new javax.swing.JRadioButton();
        jbttnOozing = new javax.swing.JRadioButton();
        jbttnWaterland = new javax.swing.JRadioButton();
        jButtonCheck = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1.setLayout(null);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Which of the following is not a type of penguin?");
        jTextArea1.setOpaque(true);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 30, 430, 70);

        jbttnEggshell.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jbttnEggshell.setText("C. Chinstrap");
        jbttnEggshell.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbttnEggshell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttnEggshellActionPerformed(evt);
            }
        });
        jPanel1.add(jbttnEggshell);
        jbttnEggshell.setBounds(20, 190, 200, 40);

        jRadioButtonKit.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jRadioButtonKit.setText("B. Emperor");
        jRadioButtonKit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonKit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonKitActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButtonKit);
        jRadioButtonKit.setBounds(250, 130, 200, 40);

        jbttnOozing.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jbttnOozing.setText("D. Macaroni");
        jbttnOozing.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbttnOozing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttnOozingActionPerformed(evt);
            }
        });
        jPanel1.add(jbttnOozing);
        jbttnOozing.setBounds(250, 190, 200, 40);

        jbttnWaterland.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jbttnWaterland.setText("A. Waterland");
        jbttnWaterland.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbttnWaterland.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttnWaterlandActionPerformed(evt);
            }
        });
        jPanel1.add(jbttnWaterland);
        jbttnWaterland.setBounds(20, 130, 200, 40);

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

    private void jbttnOozingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttnOozingActionPerformed
        // TODO add your handling code here:
         if (jbttnOozing.isSelected()) {
             jButtonCheck.setVisible(true);
            jbttnWaterland.setEnabled(false);
            jbttnEggshell.setEnabled(false);
            jRadioButtonKit.setEnabled(false);

        } else if (!jbttnOozing.isSelected()) {
            jButtonCheck.setVisible(false);
            jbttnWaterland.setEnabled(true);
            jRadioButtonKit.setEnabled(true);
            jbttnEggshell.setEnabled(true);
        }
    }//GEN-LAST:event_jbttnOozingActionPerformed

    private void jbttnWaterlandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttnWaterlandActionPerformed
         if (jbttnWaterland.isSelected()) {
             jButtonCheck.setVisible(true);
            jbttnOozing.setEnabled(false);
            jbttnEggshell.setEnabled(false);
            jRadioButtonKit.setEnabled(false);

        } else if (!jbttnWaterland.isSelected()) {
            jButtonCheck.setVisible(false);
            jbttnOozing.setEnabled(true);
            jRadioButtonKit.setEnabled(true);
            jbttnEggshell.setEnabled(true);
        }
        
    }//GEN-LAST:event_jbttnWaterlandActionPerformed

    private void jRadioButtonKitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonKitActionPerformed
        if (jRadioButtonKit.isSelected()) {
            jButtonCheck.setVisible(true);
            jbttnWaterland.setEnabled(false);
            jbttnEggshell.setEnabled(false);
            jbttnOozing.setEnabled(false);

        } else if (!jRadioButtonKit.isSelected()) {
            jButtonCheck.setVisible(false);
            jbttnWaterland.setEnabled(true);
            jbttnOozing.setEnabled(true);
            jbttnEggshell.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButtonKitActionPerformed

    private void jbttnEggshellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttnEggshellActionPerformed
        if (jbttnEggshell.isSelected()) {
            jButtonCheck.setVisible(true);
            jbttnWaterland.setEnabled(false);
            jbttnOozing.setEnabled(false);
            jRadioButtonKit.setEnabled(false);

        } else if (!jbttnEggshell.isSelected()) {
            jButtonCheck.setVisible(false);
            jbttnWaterland.setEnabled(true);
            jRadioButtonKit.setEnabled(true);
            jbttnOozing.setEnabled(true);
        }
    }//GEN-LAST:event_jbttnEggshellActionPerformed

    private void jButtonCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCheckActionPerformed
    
            
            
        if (jbttnWaterland.isSelected()) {

            JOptionPane.showMessageDialog(rootPane, "YOUR ANSWER IS CORRECT");
            new Animals07().setVisible(true);
            setVisible(false);
            
        } else if (!jbttnWaterland.isSelected()) {
            JOptionPane.showMessageDialog(rootPane, "YOUR ANSWER IS WRONG" + "\n" + --Anims6.life +" "+ "LIVES LEFT");
            if (Anims6.life == 0) {
                Anims6.life=3;
                JOptionPane.showMessageDialog(rootPane, "GAME OVER!");
                new front().setVisible(true);
                setVisible(false);
            }
        }
    
    }//GEN-LAST:event_jButtonCheckActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Animals05().setVisible(true);
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
            java.util.logging.Logger.getLogger(Animals06.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Animals06.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Animals06.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Animals06.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Animals06().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonCheck;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonKit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JRadioButton jbttnEggshell;
    private javax.swing.JRadioButton jbttnOozing;
    private javax.swing.JRadioButton jbttnWaterland;
    // End of variables declaration//GEN-END:variables

    


}
