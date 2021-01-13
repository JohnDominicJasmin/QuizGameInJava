/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QandA;

import java.awt.Color;


public class front extends javax.swing.JFrame {

  
    public front() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jButtonStart = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel21.setBackground(new java.awt.Color(102, 102, 102));
        jPanel21.setLayout(null);

        jButtonStart.setBackground(new java.awt.Color(51, 102, 255));
        jButtonStart.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jButtonStart.setForeground(new java.awt.Color(0, 0, 0));
        jButtonStart.setText("Start");
        jButtonStart.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.darkGray, null, null));
        jButtonStart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonStart.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonStartMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonStartMouseExited(evt);
            }
        });
        jButtonStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStartActionPerformed(evt);
            }
        });
        jPanel21.add(jButtonStart);
        jButtonStart.setBounds(130, 170, 130, 50);

        jButtonExit.setBackground(new java.awt.Color(255, 102, 102));
        jButtonExit.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jButtonExit.setForeground(new java.awt.Color(0, 0, 0));
        jButtonExit.setText("Exit");
        jButtonExit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.darkGray, null, java.awt.Color.darkGray));
        jButtonExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonExitMouseExited(evt);
            }
        });
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        jPanel21.add(jButtonExit);
        jButtonExit.setBounds(130, 230, 130, 50);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Front backgrounds/quiz-background-with-items-flat-design_23-2147599082.jpg"))); // NOI18N
        Background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, java.awt.Color.lightGray));
        jPanel21.add(Background);
        Background.setBounds(0, 0, 390, 300);

        getContentPane().add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStartActionPerformed
        new Categories().setVisible(true);
       
    }//GEN-LAST:event_jButtonStartActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed

        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonStartMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonStartMouseEntered
        jButtonStart.setBackground(new Color(204,204,204));
          
    }//GEN-LAST:event_jButtonStartMouseEntered

    private void jButtonStartMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonStartMouseExited
        jButtonStart.setBackground(new Color(51,102,205));
    }//GEN-LAST:event_jButtonStartMouseExited

    private void jButtonExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonExitMouseEntered
          jButtonExit.setBackground(new Color(204,204,204)); 
    }//GEN-LAST:event_jButtonExitMouseEntered

    private void jButtonExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonExitMouseExited
          jButtonExit.setBackground(new Color(255,102,102));
    }//GEN-LAST:event_jButtonExitMouseExited

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
            java.util.logging.Logger.getLogger(front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new front().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonStart;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel21;
    // End of variables declaration//GEN-END:variables
}
