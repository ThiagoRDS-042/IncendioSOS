/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package univs.edu.telas.ibama;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import univs.edu.dao.GenericDAO;
import univs.edu.denuncia.Denuncia;
import univs.edu.denuncia.DenunciaTableModel;
import univs.edu.ibama.Ibama;
import univs.edu.telas.adm.CadastroIbama;
import univs.edu.telas.login.GenericLogin;

/**
 *
 * @author GGrio
 */
public class HomePageIbama extends javax.swing.JFrame {

    GenericDAO dao = new GenericDAO();

    public static boolean editar;
    public static boolean pesquisar;

    /**
     * Creates new form HomePageIbama
     */
    public HomePageIbama() {
        initComponents();
        atualizarTabela();
    }

    public void atualizarTabela() {

        if (pesquisar == true) {

            if (!dao.listarNotDen(Ibama.ibama, "Denuncia", tfPesquisar.getText()).isEmpty()) {
                DenunciaTableModel tabela = new DenunciaTableModel(dao.listarNotDen(Ibama.ibama, "Denuncia", tfPesquisar.getText()));
                TabelaDenuncia.setModel(tabela);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado para a data: " + tfPesquisar.getText());
                DenunciaTableModel tabela = new DenunciaTableModel(dao.listarNotDen(Ibama.ibama, "Denuncia", tfPesquisar.getText()));
                TabelaDenuncia.setModel(tabela);
            }

        } else {
            DenunciaTableModel tabela = new DenunciaTableModel(dao.listarNotDen(Ibama.ibama, "Denuncia", tfPesquisar.getText()));
            TabelaDenuncia.setModel(tabela);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaDenuncia = new javax.swing.JTable();
        btnAbrir = new javax.swing.JButton();
        jErro = new javax.swing.JLabel();
        tfPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        configs = new javax.swing.JMenu();
        mnEditar = new javax.swing.JMenuItem();
        mnExcluir = new javax.swing.JMenuItem();
        mnSair = new javax.swing.JMenu();
        mnsair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Denúncias");

        TabelaDenuncia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TabelaDenuncia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(TabelaDenuncia);

        btnAbrir.setText("Abrir Denúncia");
        btnAbrir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });
        btnAbrir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAbrirKeyPressed(evt);
            }
        });

        tfPesquisar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tfPesquisar.setToolTipText("Pesuise por data");

        btnPesquisar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnPesquisarFocusLost(evt);
            }
        });
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        btnPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnPesquisarKeyPressed(evt);
            }
        });

        jMenuBar1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jMenu5.setMargin(new java.awt.Insets(0, 400, 0, 0));
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenu5MouseEntered(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        configs.setText("Configurações");
        configs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        configs.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        configs.setMargin(new java.awt.Insets(5, 0, 5, 10));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jErro)
                .addGap(329, 329, 329))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(btnAbrir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jErro)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        int linha = TabelaDenuncia.getSelectedRow();
        if (linha == -1) {
            JOptionPane.showMessageDialog(null, "Selecione uma Denuncia!");
        } else {
            Denuncia.denuncia = (Denuncia) dao.pesquisarId((int) TabelaDenuncia.getValueAt(linha, 0), "Denuncia");
            new DetalhesDenuncia().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void mnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEditarActionPerformed
        editar = true;

        new CadastroIbama().setVisible(true);
        dispose();
    }//GEN-LAST:event_mnEditarActionPerformed

    private void mnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Deseja realmente excluir sua conta?", "Excluir", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            dao.excluir(Ibama.ibama);
            new GenericLogin().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_mnExcluirActionPerformed

    private void mnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnsairActionPerformed
        new GenericLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_mnsairActionPerformed

    private void mnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSairActionPerformed

    }//GEN-LAST:event_mnSairActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        pesquisar = true;
        atualizarTabela();
        tfPesquisar.setText("");
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnPesquisarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnPesquisarFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarFocusLost

    private void btnPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnPesquisarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            pesquisar = true;
            atualizarTabela();
            tfPesquisar.setText("");

        }
    }//GEN-LAST:event_btnPesquisarKeyPressed

    private void jMenu5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseEntered

    }//GEN-LAST:event_jMenu5MouseEntered

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked

    }//GEN-LAST:event_jMenu5MouseClicked

    private void btnAbrirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAbrirKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            int linha = TabelaDenuncia.getSelectedRow();
            if (linha == -1) {
                JOptionPane.showMessageDialog(null, "Selecione uma Denuncia!");
            } else {
                Denuncia.denuncia = (Denuncia) dao.pesquisarId((int) TabelaDenuncia.getValueAt(linha, 0), "Denuncia");
                new DetalhesDenuncia().setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_btnAbrirKeyPressed

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
            java.util.logging.Logger.getLogger(HomePageIbama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePageIbama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePageIbama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePageIbama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePageIbama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaDenuncia;
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JMenu configs;
    private javax.swing.JLabel jErro;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mnEditar;
    private javax.swing.JMenuItem mnExcluir;
    private javax.swing.JMenu mnSair;
    private javax.swing.JMenuItem mnsair;
    private javax.swing.JTextField tfPesquisar;
    // End of variables declaration//GEN-END:variables
}
