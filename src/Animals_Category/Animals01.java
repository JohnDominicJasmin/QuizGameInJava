/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animals_Category;
import Gaming_Category.*;
import Computer_Category.*;
import QandA.Categories;
import QandA.front;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author micojasmin
 */
class Anims1{
    static int life= 3;
}

 public class Animals01 extends javax.swing.JFrame{
 

 
       
    public Animals01() {
        
        initComponents();
      jButtonCheck.setVisible(false);
              
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jbttnHTML = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jbttnApe = new javax.swing.JRadioButton();
        jbttnMYSQL = new javax.swing.JRadioButton();
        jbtnPong = new javax.swing.JRadioButton();
        jButtonCheck = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabelTIme = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(null);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(20, 30, 420, 80);
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(20, 200, 190, 40);
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(240, 130, 200, 40);
        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(240, 200, 200, 40);
        jPanel1.add(jRadioButton4);
        jRadioButton4.setBounds(20, 130, 190, 40);

        jScrollPane2.setViewportView(jTree1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        jbttnHTML.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jbttnHTML.setForeground(new java.awt.Color(51, 51, 51));
        jbttnHTML.setText("B. Cave Man");
        jbttnHTML.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbttnHTML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttnHTMLActionPerformed(evt);
            }
        });
        jPanel2.add(jbttnHTML);
        jbttnHTML.setBounds(240, 120, 200, 40);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Existing as recently as 100,000 years ago, \nGigantopithecus blacki is an extinct species\nwhat animal?");
        jTextArea1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTextArea1ComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(20, 30, 418, 78);

        jbttnApe.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jbttnApe.setForeground(new java.awt.Color(51, 51, 51));
        jbttnApe.setText("C. Ape");
        jbttnApe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbttnApe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttnApeActionPerformed(evt);
            }
        });
        jPanel2.add(jbttnApe);
        jbttnApe.setBounds(20, 180, 200, 40);

        jbttnMYSQL.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jbttnMYSQL.setForeground(new java.awt.Color(51, 51, 51));
        jbttnMYSQL.setText("D. Orangutan");
        jbttnMYSQL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbttnMYSQL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttnMYSQLActionPerformed(evt);
            }
        });
        jPanel2.add(jbttnMYSQL);
        jbttnMYSQL.setBounds(240, 180, 200, 40);

        jbtnPong.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jbtnPong.setForeground(new java.awt.Color(51, 51, 51));
        jbtnPong.setText("A. Mammoth");
        jbtnPong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnPong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPongActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnPong);
        jbtnPong.setBounds(20, 120, 200, 40);

        jButtonCheck.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jButtonCheck.setText("Check");
        jButtonCheck.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCheck.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jButtonCheckStateChanged(evt);
            }
        });
        jButtonCheck.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButtonCheckComponentShown(evt);
            }
        });
        jButtonCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCheckActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCheck);
        jButtonCheck.setBounds(350, 240, 90, 35);

        jButton2.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jButton2.setText("Back");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(20, 240, 90, 35);
        jPanel2.add(jLabelTIme);
        jLabelTIme.setBounds(360, 10, 70, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 
    private void jButtonCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCheckActionPerformed
         
   
        if (jbttnApe.isSelected()) {
            

            JOptionPane.showMessageDialog(rootPane, "YOUR ANSWER IS CORRECT");
            new Animals02().setVisible(true);
            setVisible(false);
            
        }  else if (!jbttnApe.isSelected()) {
            JOptionPane.showMessageDialog(rootPane, "YOUR ANSWER IS WRONG" + "\n" + --Anims1.life+" "+ " LIVES LEFT");
            if (Anims1.life <=0) {
                Anims1.life=3;
                JOptionPane.showMessageDialog(rootPane, "GAME OVER! YOU NOOB!");
                new front().setVisible(true);
                setVisible(false);
                
                
          
            }
        }
      
   
    
    }//GEN-LAST:event_jButtonCheckActionPerformed
 
    private void jbtnPongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPongActionPerformed
        if (jbtnPong.isSelected()) {
           
                jButtonCheck.setVisible(true);
                
            jbttnApe.setEnabled(false);
            jbttnHTML.setEnabled(false);
            jbttnMYSQL.setEnabled(false);

        } else if (!jbtnPong.isSelected()) {
            jButtonCheck.setVisible(false);
            jbttnApe.setEnabled(true);
            jbttnHTML.setEnabled(true);
            jbttnMYSQL.setEnabled(true);
        }
    }//GEN-LAST:event_jbtnPongActionPerformed

    private void jbttnHTMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttnHTMLActionPerformed

        if (jbttnHTML.isSelected()) {
            jButtonCheck.setVisible(true);
            jbtnPong.setEnabled(false);
            jbttnApe.setEnabled(false);
            jbttnMYSQL.setEnabled(false);

        } else if (!jbttnHTML.isSelected()) {
            jButtonCheck.setVisible(false);
            jbttnApe.setEnabled(true);
            jbtnPong.setEnabled(true);
            jbttnMYSQL.setEnabled(true);
        }
    }//GEN-LAST:event_jbttnHTMLActionPerformed

    private void jbttnApeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttnApeActionPerformed

        if (jbttnApe.isSelected()) {
            jButtonCheck.setVisible(true);
            jbtnPong.setEnabled(false);
            jbttnHTML.setEnabled(false);
            jbttnMYSQL.setEnabled(false);

        } else if (!jbttnApe.isSelected()) {
            jButtonCheck.setVisible(false);
            jbtnPong.setEnabled(true);
            jbttnHTML.setEnabled(true);
            jbttnMYSQL.setEnabled(true);
        }
    }//GEN-LAST:event_jbttnApeActionPerformed

    private void jbttnMYSQLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttnMYSQLActionPerformed
        if (jbttnMYSQL.isSelected()) {
            jButtonCheck.setVisible(true);
            jbttnApe.setEnabled(false);
            jbttnHTML.setEnabled(false);
            jbtnPong.setEnabled(false);

        } else if (!jbttnMYSQL.isSelected()) {
            jButtonCheck.setVisible(false);
            jbttnApe.setEnabled(true);
            jbttnHTML.setEnabled(true);
            jbtnPong.setEnabled(true);
        }
    }//GEN-LAST:event_jbttnMYSQLActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Categories().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextArea1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTextArea1ComponentShown
       
    }//GEN-LAST:event_jTextArea1ComponentShown

    private void jButtonCheckComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButtonCheckComponentShown
       
    }//GEN-LAST:event_jButtonCheckComponentShown

    private void jButtonCheckStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jButtonCheckStateChanged

    }//GEN-LAST:event_jButtonCheckStateChanged

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
            java.util.logging.Logger.getLogger(Animals01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Animals01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Animals01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Animals01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Animals01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonCheck;
    private javax.swing.JLabel jLabelTIme;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTree jTree1;
    private javax.swing.JRadioButton jbtnPong;
    private javax.swing.JRadioButton jbttnApe;
    private javax.swing.JRadioButton jbttnHTML;
    private javax.swing.JRadioButton jbttnMYSQL;
    // End of variables declaration//GEN-END:variables
 

 }

 


