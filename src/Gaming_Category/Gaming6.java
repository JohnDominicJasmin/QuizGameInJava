/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gaming_Category;
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
class lifebar6 extends  lifebar5{
 
}
 public class Gaming6 extends javax.swing.JFrame{
 lifebar6 lf6  = new lifebar6();

 
       
    public Gaming6() {
        
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
        jbttnWarthog = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jbttnCPROGRAMMING = new javax.swing.JRadioButton();
        jbttnMYSQL = new javax.swing.JRadioButton();
        jbtnNumberOfKills = new javax.swing.JRadioButton();
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

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        jbttnWarthog.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jbttnWarthog.setForeground(new java.awt.Color(51, 51, 51));
        jbttnWarthog.setText("B. Warthog");
        jbttnWarthog.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbttnWarthog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttnWarthogActionPerformed(evt);
            }
        });
        jPanel2.add(jbttnWarthog);
        jbttnWarthog.setBounds(240, 120, 200, 40);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("What is the armoured vehicle in Halo called?");
        jTextArea1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTextArea1ComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(20, 30, 418, 78);

        jbttnCPROGRAMMING.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jbttnCPROGRAMMING.setForeground(new java.awt.Color(51, 51, 51));
        jbttnCPROGRAMMING.setText("C. Bashor");
        jbttnCPROGRAMMING.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbttnCPROGRAMMING.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttnCPROGRAMMINGActionPerformed(evt);
            }
        });
        jPanel2.add(jbttnCPROGRAMMING);
        jbttnCPROGRAMMING.setBounds(20, 180, 200, 40);

        jbttnMYSQL.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jbttnMYSQL.setForeground(new java.awt.Color(51, 51, 51));
        jbttnMYSQL.setText("D. Rocksteady");
        jbttnMYSQL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbttnMYSQL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttnMYSQLActionPerformed(evt);
            }
        });
        jPanel2.add(jbttnMYSQL);
        jbttnMYSQL.setBounds(240, 180, 200, 40);

        jbtnNumberOfKills.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jbtnNumberOfKills.setForeground(new java.awt.Color(51, 51, 51));
        jbtnNumberOfKills.setText("A. Sir Killalot ");
        jbtnNumberOfKills.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnNumberOfKills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNumberOfKillsActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnNumberOfKills);
        jbtnNumberOfKills.setBounds(20, 120, 200, 40);

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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 
    private void jButtonCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCheckActionPerformed
         
   
        if (jbttnWarthog.isSelected()) {
            

            JOptionPane.showMessageDialog(rootPane, "YOUR ANSWER IS CORRECT");
            new Gaming7().setVisible(true);
            setVisible(false);
            
        }  else if (!jbttnWarthog.isSelected()) {
            JOptionPane.showMessageDialog(rootPane, "YOUR ANSWER IS WRONG" + "\n" + --lf6.life+" "+ " LIVES LEFT");
            if (lf6.life <=0) {
                lf6.life=3;
                JOptionPane.showMessageDialog(rootPane, "GAME OVER! YOU NOOB!");
                new front().setVisible(true);
                setVisible(false);
                
                
          
            }
        }
      
   
    
    }//GEN-LAST:event_jButtonCheckActionPerformed
 
    private void jbtnNumberOfKillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNumberOfKillsActionPerformed
        if (jbtnNumberOfKills.isSelected()) {
           
                jButtonCheck.setVisible(true);
                
            jbttnCPROGRAMMING.setEnabled(false);
            jbttnWarthog.setEnabled(false);
            jbttnMYSQL.setEnabled(false);

        } else if (!jbtnNumberOfKills.isSelected()) {
            jButtonCheck.setVisible(false);
            jbttnCPROGRAMMING.setEnabled(true);
            jbttnWarthog.setEnabled(true);
            jbttnMYSQL.setEnabled(true);
        }
    }//GEN-LAST:event_jbtnNumberOfKillsActionPerformed

    private void jbttnWarthogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttnWarthogActionPerformed

        if (jbttnWarthog.isSelected()) {
            jButtonCheck.setVisible(true);
            jbtnNumberOfKills.setEnabled(false);
            jbttnCPROGRAMMING.setEnabled(false);
            jbttnMYSQL.setEnabled(false);

        } else if (!jbttnWarthog.isSelected()) {
            jButtonCheck.setVisible(false);
            jbttnCPROGRAMMING.setEnabled(true);
            jbtnNumberOfKills.setEnabled(true);
            jbttnMYSQL.setEnabled(true);
        }
    }//GEN-LAST:event_jbttnWarthogActionPerformed

    private void jbttnCPROGRAMMINGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttnCPROGRAMMINGActionPerformed

        if (jbttnCPROGRAMMING.isSelected()) {
            jButtonCheck.setVisible(true);
            jbtnNumberOfKills.setEnabled(false);
            jbttnWarthog.setEnabled(false);
            jbttnMYSQL.setEnabled(false);

        } else if (!jbttnCPROGRAMMING.isSelected()) {
            jButtonCheck.setVisible(false);
            jbtnNumberOfKills.setEnabled(true);
            jbttnWarthog.setEnabled(true);
            jbttnMYSQL.setEnabled(true);
        }
    }//GEN-LAST:event_jbttnCPROGRAMMINGActionPerformed

    private void jbttnMYSQLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttnMYSQLActionPerformed
        if (jbttnMYSQL.isSelected()) {
            jButtonCheck.setVisible(true);
            jbttnCPROGRAMMING.setEnabled(false);
            jbttnWarthog.setEnabled(false);
            jbtnNumberOfKills.setEnabled(false);

        } else if (!jbttnMYSQL.isSelected()) {
            jButtonCheck.setVisible(false);
            jbttnCPROGRAMMING.setEnabled(true);
            jbttnWarthog.setEnabled(true);
            jbtnNumberOfKills.setEnabled(true);
        }
    }//GEN-LAST:event_jbttnMYSQLActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Gaming5().setVisible(true);
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
            java.util.logging.Logger.getLogger(Gaming6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gaming6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gaming6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gaming6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Gaming6().setVisible(true);
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
    private javax.swing.JRadioButton jbtnNumberOfKills;
    private javax.swing.JRadioButton jbttnCPROGRAMMING;
    private javax.swing.JRadioButton jbttnMYSQL;
    private javax.swing.JRadioButton jbttnWarthog;
    // End of variables declaration//GEN-END:variables
 

 }

 


