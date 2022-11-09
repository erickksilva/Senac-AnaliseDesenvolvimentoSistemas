/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exploradorfinal.img;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author mmart
 */
public class telasLoreDois extends javax.swing.JFrame {

    /**
     * Creates new form telasLoreDois
     */
    public telasLoreDois() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                int x = JOptionPane.showConfirmDialog(null, "Você realmente deseja sair?", "AVISO", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if(x == JOptionPane.YES_OPTION){
                    System.exit(0);
                }
            }
            
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        textoFeedback = new javax.swing.JTextArea();
        btnAvanti = new javax.swing.JButton();
        labelImag2 = new javax.swing.JLabel();
        labelFundilhos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setToolTipText("");
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        textoFeedback.setEditable(false);
        textoFeedback.setBackground(new java.awt.Color(0, 0, 0));
        textoFeedback.setColumns(20);
        textoFeedback.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        textoFeedback.setForeground(new java.awt.Color(255, 255, 255));
        textoFeedback.setRows(5);
        textoFeedback.setText("Ao ter certeza da resposta, você usa o dedo enluvado para\ncolher o sangue das paredes, apenas o suficiente para \nmanchar de forma permanente a placa.\nHesitante, mas firme, você desenha com o dedo sua resposta:\n\"1024\".\n\nComo que por mágica, a placa de madeira envelhecida treme\nsob seu dedo e você ouve um guincho estridente preencher a\nsala. Felizmente, você percebe que as armadilhas desativaram\ne o portão na outra extremidade começa a se abrir.\nOrgulhoso, você segue em frente.");
        jScrollPane2.setViewportView(textoFeedback);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 510, 250));

        btnAvanti.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btnAvanti.setForeground(new java.awt.Color(255, 255, 255));
        btnAvanti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgGame/forward-arrow_icon-icons.com_72749.png"))); // NOI18N
        btnAvanti.setContentAreaFilled(false);
        btnAvanti.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAvanti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvantiActionPerformed(evt);
            }
        });
        getContentPane().add(btnAvanti, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 90, 70));

        labelImag2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImag2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgGame/dungeonArtFinal.jpg"))); // NOI18N
        labelImag2.setText("jLabel2");
        getContentPane().add(labelImag2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 380, 230));

        labelFundilhos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgGame/fundoIndi.png"))); // NOI18N
        labelFundilhos.setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().add(labelFundilhos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAvantiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvantiActionPerformed
        new telasFeedbackPositivo().setVisible(true); // Ver comentários telasLoreUm, se aplicam aqui
        this.dispose();
    }//GEN-LAST:event_btnAvantiActionPerformed

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
            java.util.logging.Logger.getLogger(telasLoreDois.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telasLoreDois.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telasLoreDois.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telasLoreDois.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telasLoreDois().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvanti;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelFundilhos;
    private javax.swing.JLabel labelImag2;
    private javax.swing.JTextArea textoFeedback;
    // End of variables declaration//GEN-END:variables
}