/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package univs.edu.telas.usuario;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import univs.edu.bombeiro.CorpoDeBombeiros;
import univs.edu.dao.GenericDAO;
import univs.edu.telas.login.GenericLogin;
import univs.edu.usuario.Usuario;

/**
 *
 * @author GGrio
 */
public class HomePageUsuario extends javax.swing.JFrame {

    GenericDAO dao = new GenericDAO();
    Usuario usuario = new Usuario();
    CorpoDeBombeiros bombeiro = new CorpoDeBombeiros();
    DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDateTime data = LocalDateTime.now();
    
    public static boolean editar;

    /**
     * Creates new form HomePageUsuario
     */
    public HomePageUsuario() {
        initComponents();
        //jlTeste.setText("Bem Vindo " + Usuario.usuario.getNomeUsuario() + "!");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlTeste = new javax.swing.JLabel();
        bntNotificar = new javax.swing.JButton();
        btnDenunciar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        mnInfo = new javax.swing.JMenu();
        mnInfoIbama = new javax.swing.JMenuItem();
        mnBombeiro = new javax.swing.JMenuItem();
        configs = new javax.swing.JMenu();
        mnEditar = new javax.swing.JMenuItem();
        mnExcluir = new javax.swing.JMenuItem();
        mnSair = new javax.swing.JMenu();
        mnsair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(450, 450));

        jlTeste.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        bntNotificar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bntNotificar.setText("Notificar");
        bntNotificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntNotificarActionPerformed(evt);
            }
        });

        btnDenunciar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnDenunciar.setText("Denunciar");
        btnDenunciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDenunciarActionPerformed(evt);
            }
        });

        jMenuBar1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jMenu5.setMargin(new java.awt.Insets(0, 210, 0, 0));
        jMenuBar1.add(jMenu5);

        mnInfo.setText("Informações");
        mnInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnInfo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        mnInfo.setMargin(new java.awt.Insets(5, 10, 5, 10));
        mnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnInfoActionPerformed(evt);
            }
        });

        mnInfoIbama.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        mnInfoIbama.setText("IBAMA");
        mnInfoIbama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnInfoIbamaActionPerformed(evt);
            }
        });
        mnInfo.add(mnInfoIbama);

        mnBombeiro.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        mnBombeiro.setText("Corpo de Bombeiros");
        mnBombeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnBombeiroActionPerformed(evt);
            }
        });
        mnInfo.add(mnBombeiro);

        jMenuBar1.add(mnInfo);

        configs.setText("Configurações");
        configs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        configs.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        configs.setMargin(new java.awt.Insets(0, 0, 0, 10));

        mnEditar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        mnEditar.setText("Editar");
        mnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnEditarActionPerformed(evt);
            }
        });
        configs.add(mnEditar);

        mnExcluir.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        mnExcluir.setText("Excluir");
        mnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnExcluirActionPerformed(evt);
            }
        });
        configs.add(mnExcluir);

        jMenuBar1.add(configs);

        mnSair.setText("Sair");
        mnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnSair.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        mnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSairActionPerformed(evt);
            }
        });

        mnsair.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        mnsair.setText("Sair");
        mnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnsairActionPerformed(evt);
            }
        });
        mnSair.add(mnsair);

        jMenuBar1.add(mnSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(bntNotificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDenunciar)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jlTeste, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntNotificar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDenunciar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(jlTeste, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bntNotificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntNotificarActionPerformed
        if (dao.pesquisarNotDen(Usuario.usuario, formatoData.format(data), "Notificação").size() == 3) {
            JOptionPane.showMessageDialog(null, "Limite de Notificações Diarias Atingido!");
        } else {
            new Notificar().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_bntNotificarActionPerformed

    private void btnDenunciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDenunciarActionPerformed
        if (dao.pesquisarNotDen(Usuario.usuario, formatoData.format(data), "Denuncia").size() == 3) {
            JOptionPane.showMessageDialog(null, "Limite de Denuncias Diarias Atingido!");
        } else {
            new Denunciar().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnDenunciarActionPerformed

    private void mnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEditarActionPerformed
        editar = true;

        new CadastroUsuario().setVisible(true);
        dispose();
    }//GEN-LAST:event_mnEditarActionPerformed

    private void mnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Deseja realmente excluir sua conta?", "Excluir", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            dao.excluir(Usuario.usuario);
            new GenericLogin().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_mnExcluirActionPerformed

    private void mnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnInfoActionPerformed

    }//GEN-LAST:event_mnInfoActionPerformed

    private void mnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSairActionPerformed
        
    }//GEN-LAST:event_mnSairActionPerformed

    private void mnBombeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnBombeiroActionPerformed
        new Informacoes().setVisible(true);
        dispose();
    }//GEN-LAST:event_mnBombeiroActionPerformed

    private void mnInfoIbamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnInfoIbamaActionPerformed
        new Informacoes().setVisible(true);
        dispose();
    }//GEN-LAST:event_mnInfoIbamaActionPerformed

    private void mnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnsairActionPerformed
        new GenericLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_mnsairActionPerformed

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
            java.util.logging.Logger.getLogger(HomePageUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePageUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePageUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePageUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePageUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntNotificar;
    private javax.swing.JButton btnDenunciar;
    private javax.swing.JMenu configs;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel jlTeste;
    private javax.swing.JMenuItem mnBombeiro;
    private javax.swing.JMenuItem mnEditar;
    private javax.swing.JMenuItem mnExcluir;
    private javax.swing.JMenu mnInfo;
    private javax.swing.JMenuItem mnInfoIbama;
    private javax.swing.JMenu mnSair;
    private javax.swing.JMenuItem mnsair;
    // End of variables declaration//GEN-END:variables
}
