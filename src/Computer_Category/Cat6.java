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
 */
class hp5 extends hp4{
    
}
public class Cat6 extends javax.swing.JFrame {
hp5 h5 = new hp5();
    /**
     * Creates new form Cat6
     */
    public Cat6() {
        initComponents();
        jButtonCheck.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jRadioButtonTechAdvancement = new javax.swing.JRadioButton();
        jRadioButtonScientific_Code = new javax.swing.JRadioButton();
        jRadioButtonAllOfTheAbove = new javax.swing.JRadioButton();
        jRadioButtonOOP = new javax.swing.JRadioButton();
        jButtonCheck = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(null);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(102, 102, 102));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(204, 204, 204));
        jTextArea1.setRows(5);
        jTextArea1.setText("\nWhat difference does the 5th generation computer \nhave from other generation computers?");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 10, 450, 131);

        jRadioButtonTechAdvancement.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jRadioButtonTechAdvancement.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonTechAdvancement.setText("Technological Advancement");
        jRadioButtonTechAdvancement.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonTechAdvancement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTechAdvancementActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButtonTechAdvancement);
        jRadioButtonTechAdvancement.setBounds(30, 150, 226, 40);

        jRadioButtonScientific_Code.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jRadioButtonScientific_Code.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonScientific_Code.setText("Scientific Code");
        jRadioButtonScientific_Code.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonScientific_Code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonScientific_CodeActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButtonScientific_Code);
        jRadioButtonScientific_Code.setBounds(300, 150, 170, 40);

        jRadioButtonAllOfTheAbove.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jRadioButtonAllOfTheAbove.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonAllOfTheAbove.setText("All of the Above");
        jRadioButtonAllOfTheAbove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonAllOfTheAbove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAllOfTheAboveActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButtonAllOfTheAbove);
        jRadioButtonAllOfTheAbove.setBounds(300, 200, 170, 40);

        jRadioButtonOOP.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jRadioButtonOOP.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonOOP.setText("Object Oriented Programming");
        jRadioButtonOOP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonOOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonOOPActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButtonOOP);
        jRadioButtonOOP.setBounds(30, 200, 230, 40);

        jButtonCheck.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jButtonCheck.setText("Check");
        jButtonCheck.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCheckActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCheck);
        jButtonCheck.setBounds(370, 260, 90, 35);

        jButton1.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jButton1.setText("Back");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 260, 90, 35);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonTechAdvancementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTechAdvancementActionPerformed
 if (jRadioButtonTechAdvancement.isSelected()) {
     jButtonCheck.setVisible(true);
            jRadioButtonAllOfTheAbove.setEnabled(false);
            jRadioButtonOOP.setEnabled(false);
            jRadioButtonScientific_Code.setEnabled(false);

        } else if (!jRadioButtonTechAdvancement.isSelected()) {
            jButtonCheck.setVisible(false);
            jRadioButtonOOP.setEnabled(true);
            jRadioButtonAllOfTheAbove.setEnabled(true);
            jRadioButtonScientific_Code.setEnabled(true);
        }        
    }//GEN-LAST:event_jRadioButtonTechAdvancementActionPerformed

    private void jRadioButtonScientific_CodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonScientific_CodeActionPerformed
        if (jRadioButtonScientific_Code.isSelected()) {
            jButtonCheck.setVisible(true);
            jRadioButtonTechAdvancement.setEnabled(false);
            jRadioButtonOOP.setEnabled(false);
            jRadioButtonAllOfTheAbove.setEnabled(false);

        } else if (!jRadioButtonScientific_Code.isSelected()) {
            jButtonCheck.setVisible(false);
            jRadioButtonOOP.setEnabled(true);
            jRadioButtonScientific_Code.setEnabled(true);
            jRadioButtonAllOfTheAbove.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButtonScientific_CodeActionPerformed

    private void jRadioButtonOOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOOPActionPerformed
         if (jRadioButtonOOP.isSelected()) {
             jButtonCheck.setVisible(true);
            jRadioButtonTechAdvancement.setEnabled(false);
            jRadioButtonScientific_Code.setEnabled(false);
            jRadioButtonAllOfTheAbove.setEnabled(false);

        } else if (!jRadioButtonOOP.isSelected()) {
            jButtonCheck.setVisible(false);
            jRadioButtonTechAdvancement.setEnabled(true);
            jRadioButtonScientific_Code.setEnabled(true);
            jRadioButtonAllOfTheAbove.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButtonOOPActionPerformed

    private void jRadioButtonAllOfTheAboveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAllOfTheAboveActionPerformed
         if (jRadioButtonAllOfTheAbove.isSelected()) {
             jButtonCheck.setVisible(true);
            jRadioButtonTechAdvancement.setEnabled(false);
            jRadioButtonOOP.setEnabled(false);
            jRadioButtonScientific_Code.setEnabled(false);

        } else if (!jRadioButtonAllOfTheAbove.isSelected()) {
            jButtonCheck.setVisible(false);
            jRadioButtonOOP.setEnabled(true);
            jRadioButtonScientific_Code.setEnabled(true);
            jRadioButtonTechAdvancement.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButtonAllOfTheAboveActionPerformed

    private void jButtonCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCheckActionPerformed
         if (jRadioButtonTechAdvancement.isSelected()) {

            JOptionPane.showMessageDialog(rootPane, "YOUR ANSWER IS CORRECT");
            new Cat7().setVisible(true);
            setVisible(false);
        } else if (!jRadioButtonTechAdvancement.isSelected()) {
            JOptionPane.showMessageDialog(rootPane, "YOUR ANSWER IS WRONG" + "\n" + --h5.life +" "+ "LIVES LEFT");
            if (h5.life == 0) {
                h5.life=3;
                JOptionPane.showMessageDialog(rootPane, "GAME OVER!");
                new front().setVisible(true);
                setVisible(false);
            }
        }        
    }//GEN-LAST:event_jButtonCheckActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Cat5().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Cat6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cat6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cat6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cat6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cat6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCheck;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonAllOfTheAbove;
    private javax.swing.JRadioButton jRadioButtonOOP;
    private javax.swing.JRadioButton jRadioButtonScientific_Code;
    private javax.swing.JRadioButton jRadioButtonTechAdvancement;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
