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
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado para a data: " + tfPesquisar.getText(), "Erro", 2);
                DenunciaTableModel tabela = new DenunciaTableModel(dao.listarNotDen(Ibama.ibama, "Denuncia", tfPesquisar.getText()));
                TabelaDenuncia.setModel(tabela);
            }
        } else {
            DenunciaTableModel tabela = new DenunciaTableModel(dao.listarNotDen(Ibama.ibama, "Denuncia", "Undefined"));
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaDenuncia = new javax.swing.JTable();
        btnAbrir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        configs = new javax.swing.JMenu();
        mnEditar = new javax.swing.JMenuItem();
        mnExcluir = new javax.swing.JMenuItem();
        mnSair = new javax.swing.JMenu();
        mnsair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tabela de Denúncias");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/univs/edu/imagens/cabecalhoDetalhes.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 537, 90));

        tfPesquisar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tfPesquisar.setToolTipText("Pesuise pela data");
        tfPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(tfPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 280, 35));

        btnPesquisar.setBackground(new java.awt.Color(255, 51, 153));
        btnPesquisar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(255, 255, 255));
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
        jPanel1.add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 90, 35));

        TabelaDenuncia.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
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
        TabelaDenuncia.setRowHeight(20);
        jScrollPane1.setViewportView(TabelaDenuncia);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 516, 110));

        btnAbrir.setBackground(new java.awt.Color(255, 51, 153));
        btnAbrir.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAbrir.setForeground(new java.awt.Color(255, 255, 255));
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
        jPanel1.add(btnAbrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, 35));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/univs/edu/imagens/backgroundDetalhes.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 537, 260));

        jMenuBar1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jMenu5.setBackground(new java.awt.Color(0, 0, 0, 0));
        jMenu5.setMargin(new java.awt.Insets(0, 420, 0, 0));
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenu5MouseEntered(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        configs.setBackground(new java.awt.Color(51, 0, 153));
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

        mnSair.setBackground(new java.awt.Color(51, 0, 153));
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        int linha = TabelaDenuncia.getSelectedRow();
        if (linha == -1) {
            JOptionPane.showMessageDialog(null, "Selecione uma Denuncia!", "Erro", 2);
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
        if (JOptionPane.showConfirmDialog(null, "Deseja realmente excluir sua conta?", "Excluir", 0, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
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
                JOptionPane.showMessageDialog(null, "Selecione uma Denuncia!", "Erro", 2);
            } else {
                Denuncia.denuncia = (Denuncia) dao.pesquisarId((int) TabelaDenuncia.getValueAt(linha, 0), "Denuncia");
                new DetalhesDenuncia().setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_btnAbrirKeyPressed

    private void tfPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPesquisarActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mnEditar;
    private javax.swing.JMenuItem mnExcluir;
    private javax.swing.JMenu mnSair;
    private javax.swing.JMenuItem mnsair;
    private javax.swing.JTextField tfPesquisar;
    // End of variables declaration//GEN-END:variables
}
