/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXCEL;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author luisg
 */
public class DesarrolloRequisitos extends javax.swing.JFrame {

    /**
     * Creates new form gRequisitos
     */
    
    Evaluacion ev = new Evaluacion();
    String[] preguntas = new String[22];
    int[] respuestas = new int[22];
    int index = 0;
    int resultado = 0;
    public DesarrolloRequisitos() {
        initComponents();
        jbTerminar.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jbNunca = new javax.swing.JButton();
        jbCasiNunca = new javax.swing.JButton();
        jbAVeces = new javax.swing.JButton();
        jbCasiSimepre = new javax.swing.JButton();
        jbSiempre = new javax.swing.JButton();
        jbTerminar = new javax.swing.JButton();
        jbSiguientePregunta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        jLabel1.setText("jLabel1");

        jbNunca.setText("Nunca");
        jbNunca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbNuncaMouseClicked(evt);
            }
        });
        jbNunca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuncaActionPerformed(evt);
            }
        });

        jbCasiNunca.setText("Casi nunca");
        jbCasiNunca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbCasiNuncaMouseClicked(evt);
            }
        });
        jbCasiNunca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCasiNuncaActionPerformed(evt);
            }
        });

        jbAVeces.setText("A Veces");
        jbAVeces.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbAVecesMouseClicked(evt);
            }
        });
        jbAVeces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAVecesActionPerformed(evt);
            }
        });

        jbCasiSimepre.setText("Casi Siempre");
        jbCasiSimepre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbCasiSimepreMouseClicked(evt);
            }
        });
        jbCasiSimepre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCasiSimepreActionPerformed(evt);
            }
        });

        jbSiempre.setText("Siempre");
        jbSiempre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbSiempreMouseClicked(evt);
            }
        });
        jbSiempre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSiempreActionPerformed(evt);
            }
        });

        jbTerminar.setText("Terminar");
        jbTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTerminarActionPerformed(evt);
            }
        });

        jbSiguientePregunta.setText("Siguiente Pregunta");
        jbSiguientePregunta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbSiguientePreguntaMouseClicked(evt);
            }
        });
        jbSiguientePregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSiguientePreguntaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jbNunca)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jbCasiNunca)
                                .addGap(42, 42, 42)
                                .addComponent(jbAVeces)
                                .addGap(34, 34, 34)
                                .addComponent(jbCasiSimepre)
                                .addGap(29, 29, 29)
                                .addComponent(jbSiempre))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(jbTerminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbSiguientePregunta)
                                .addGap(11, 11, 11)))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNunca)
                    .addComponent(jbCasiNunca)
                    .addComponent(jbAVeces)
                    .addComponent(jbCasiSimepre)
                    .addComponent(jbSiempre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbTerminar)
                    .addComponent(jbSiguientePregunta))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        preguntas = LeerExcel.leerPreguntasDesarrolloDeRequisitos();
        jLabel1.setText("<html>"+(index+1)+" .- "+preguntas[index]+"<htlm>");
        index++;
    }//GEN-LAST:event_formWindowOpened

    private void jbSiguientePreguntaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSiguientePreguntaMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jbSiguientePreguntaMouseClicked

    private void jbTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTerminarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        
        
    }//GEN-LAST:event_jbTerminarActionPerformed

    private void jbNuncaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbNuncaMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jbNuncaMouseClicked

    private void jbCasiNuncaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCasiNuncaMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jbCasiNuncaMouseClicked

    private void jbAVecesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbAVecesMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jbAVecesMouseClicked

    private void jbCasiSimepreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCasiSimepreMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jbCasiSimepreMouseClicked

    private void jbSiempreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSiempreMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jbSiempreMouseClicked

    private void jbNuncaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuncaActionPerformed
        // TODO add your handling code here:
        jbNunca.setBackground(Color.GREEN);
        jbCasiNunca.setBackground(null);
        jbAVeces.setBackground(null);
        jbCasiSimepre.setBackground(null);
        jbSiempre.setBackground(null);
        respuestas[index-1] = 1;
    }//GEN-LAST:event_jbNuncaActionPerformed

    private void jbCasiNuncaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCasiNuncaActionPerformed
        // TODO add your handling code here:
        jbCasiNunca.setBackground(Color.GREEN);
        jbNunca.setBackground(null);
        jbAVeces.setBackground(null);
        jbCasiSimepre.setBackground(null);
        jbSiempre.setBackground(null);
        respuestas[index-1] = 2;
    }//GEN-LAST:event_jbCasiNuncaActionPerformed

    private void jbAVecesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAVecesActionPerformed
        // TODO add your handling code here:
        jbAVeces.setBackground(Color.GREEN);
        jbNunca.setBackground(null);
        jbCasiNunca.setBackground(null);
        jbCasiSimepre.setBackground(null);
        jbSiempre.setBackground(null);
        respuestas[index-1] = 3;
    }//GEN-LAST:event_jbAVecesActionPerformed

    private void jbCasiSimepreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCasiSimepreActionPerformed
        // TODO add your handling code here:
        jbCasiSimepre.setBackground(Color.GREEN);
        jbNunca.setBackground(null);
        jbCasiNunca.setBackground(null);
        jbAVeces.setBackground(null);
        jbSiempre.setBackground(null);
        respuestas[index-1] = 4;
    }//GEN-LAST:event_jbCasiSimepreActionPerformed

    private void jbSiempreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSiempreActionPerformed
        // TODO add your handling code here:
        jbSiempre.setBackground(Color.GREEN);
        jbNunca.setBackground(null);
        jbCasiNunca.setBackground(null);
        jbAVeces.setBackground(null);
        jbCasiSimepre.setBackground(null);
        respuestas[index-1] = 5;
    }//GEN-LAST:event_jbSiempreActionPerformed

    private void jbSiguientePreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSiguientePreguntaActionPerformed
        // TODO add your handling code here:
        if (index < preguntas.length) {
            jLabel1.setText("<html>"+(index+1)+" .- "+preguntas[index]+"<htlm>");
            index++;
            jbNunca.setBackground(null);
            jbCasiNunca.setBackground(null);
            jbCasiSimepre.setBackground(null);
            jbAVeces.setBackground(null);
            jbSiempre.setBackground(null);
            
        }
        else{
            jbSiguientePregunta.setVisible(false);
            jbTerminar.setVisible(true);
        }
    }//GEN-LAST:event_jbSiguientePreguntaActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        for (int i = 0; i < respuestas.length; i++) {
            resultado = resultado + respuestas[i];
        }
        ev.desReq = resultado;
        ev.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(DesarrolloRequisitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DesarrolloRequisitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DesarrolloRequisitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DesarrolloRequisitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DesarrolloRequisitos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbAVeces;
    private javax.swing.JButton jbCasiNunca;
    private javax.swing.JButton jbCasiSimepre;
    private javax.swing.JButton jbNunca;
    private javax.swing.JButton jbSiempre;
    private javax.swing.JButton jbSiguientePregunta;
    private javax.swing.JButton jbTerminar;
    // End of variables declaration//GEN-END:variables
}
