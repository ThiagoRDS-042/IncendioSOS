/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package univs.edu.telas.adm;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import univs.edu.bombeiro.CorpoDeBombeiros;
import univs.edu.bombeiro.CorpoDeBombeirosTableModel;
import univs.edu.dao.GenericDAO;
import univs.edu.ibama.Ibama;
import univs.edu.ibama.IbamaTableModel;
import univs.edu.telas.bombeiro.HomePageBombeiro;
import univs.edu.telas.ibama.HomePageIbama;

/**
 *
 * @author GGrio
 */
public class ListaIbamasEBombeiros <T> extends javax.swing.JFrame {

    Ibama ibama = new Ibama();
    GenericDAO dao = new GenericDAO();

    public static boolean pesquisar;

    /**
     * Creates new form ListaIbamas
     */
    public ListaIbamasEBombeiros() {
        initComponents();
        if (HomePageAdm.listaIbamas == true) {
            lTitulo1.setText("           IBAMAs Cadastrados no Sistema");
        }
        atualizarTabela();
    }

    public void atualizarTabela() {

        if (HomePageAdm.listaIbamas == true) {

            if (pesquisar == true) {
                if (!tfPesquisar.getText().contains("@gmail.com")) {
                    if (!dao.listarObjetos("IBAMA", tfPesquisar.getText()).isEmpty()) {
                        IbamaTableModel tabela = new IbamaTableModel(dao.listarObjetos("Ibama", tfPesquisar.getText()));
                        Tabela.setModel(tabela);
                    } else if (tfPesquisar.getText().isEmpty()) {
                        IbamaTableModel tabela = new IbamaTableModel(dao.listarObjetos("Ibama", "Undefined"));
                        Tabela.setModel(tabela);
                    } else {
                        JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado para a cidade: " + tfPesquisar.getText(), "Erro", 2);
                        IbamaTableModel tabela = new IbamaTableModel(dao.listarObjetos("Ibama", tfPesquisar.getText()));
                        Tabela.setModel(tabela);
                    }
                } else {
                    if (dao.pesquisarEmail(tfPesquisar.getText()) != null) {
                        List<Ibama> ibamas = new ArrayList<>();
                        ibamas.add((Ibama) dao.pesquisarEmail(tfPesquisar.getText()));
                        IbamaTableModel tabela = new IbamaTableModel(ibamas);
                        Tabela.setModel(tabela);
                    } else {
                        JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado para o e-mail: " + tfPesquisar.getText(), "Erro", 2);
                        List<Ibama> ibamas = new ArrayList<>();
                        IbamaTableModel tabela = new IbamaTableModel(ibamas);
                        Tabela.setModel(tabela);
                    }
                }
            } else {
                IbamaTableModel tabela = new IbamaTableModel(dao.listarObjetos("IBAMA", "Undefined"));
                Tabela.setModel(tabela);
            }

        } else {

            if (pesquisar == true) {
                if (!tfPesquisar.getText().contains("@gmail.com")) {
                    if (!dao.listarObjetos("Bombeiro", tfPesquisar.getText()).isEmpty()) {
                        CorpoDeBombeirosTableModel tabela = new CorpoDeBombeirosTableModel(dao.listarObjetos("Bombeiro", tfPesquisar.getText()));
                        Tabela.setModel(tabela);
                    } else if (tfPesquisar.getText().isEmpty()) {
                        CorpoDeBombeirosTableModel tabela = new CorpoDeBombeirosTableModel(dao.listarObjetos("Bombeiro", "Undefined"));
                        Tabela.setModel(tabela);
                    } else {
                        JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado para a cidade: " + tfPesquisar.getText(), "Erro", 2);
                        CorpoDeBombeirosTableModel tabela = new CorpoDeBombeirosTableModel(dao.listarObjetos("Bombeiro", tfPesquisar.getText()));
                        Tabela.setModel(tabela);
                    }
                } else {
                    if (dao.pesquisarEmail(tfPesquisar.getText()) != null) {
                        List<CorpoDeBombeiros> bombeiros = new ArrayList<>();
                        bombeiros.add((CorpoDeBombeiros) dao.pesquisarEmail(tfPesquisar.getText()));
                        CorpoDeBombeirosTableModel tabela = new CorpoDeBombeirosTableModel(bombeiros);
                        Tabela.setModel(tabela);
                    } else {
                        JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado para o e-mail: " + tfPesquisar.getText(), "Erro", 2);
                        List<CorpoDeBombeiros> bombeiros = new ArrayList<>();
                        CorpoDeBombeirosTableModel tabela = new CorpoDeBombeirosTableModel(bombeiros);
                        Tabela.setModel(tabela);
                    }
                }
            } else {
                CorpoDeBombeirosTableModel tabela = new CorpoDeBombeirosTableModel(dao.listarObjetos("Bombeiro", "Undefined"));
                Tabela.setModel(tabela);
            }

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
        lTitulo1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        tfPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lTitulo1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        lTitulo1.setText("Corpos de Bombeiros Cadastrados no Sistema");
        jPanel1.add(lTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/univs/edu/imagens/cabecalhoDetalhes.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 550, 100));

        Tabela.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Tabela.setModel(new javax.swing.table.DefaultTableModel(
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
        Tabela.setRowHeight(20);
        jScrollPane1.setViewportView(Tabela);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 512, 110));

        tfPesquisar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tfPesquisar.setToolTipText("Pesquise pela cidade ou e-mail do orgão");
        tfPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(tfPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 270, 35));

        btnPesquisar.setBackground(new java.awt.Color(255, 51, 153));
        btnPesquisar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setText("Pesquisar");
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
        jPanel1.add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 90, 35));

        btnExcluir.setBackground(new java.awt.Color(255, 51, 153));
        btnExcluir.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        btnExcluir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnExcluirKeyPressed(evt);
            }
        });
        jPanel1.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 90, 35));

        btnNovo.setBackground(new java.awt.Color(255, 51, 153));
        btnNovo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(255, 255, 255));
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        btnNovo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnNovoKeyPressed(evt);
            }
        });
        jPanel1.add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 90, 35));

        btnVoltar.setBackground(new java.awt.Color(255, 51, 153));
        btnVoltar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        btnVoltar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnVoltarKeyPressed(evt);
            }
        });
        jPanel1.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 90, 35));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/univs/edu/imagens/backgroundDetalhes.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 550, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linha = Tabela.getSelectedRow();
        if (linha == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um Orgão!", "Erro", 2);
        } else if (JOptionPane.showConfirmDialog(null, "Deseja realmente excluir este Orgão?", "Excluir", 0, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            T generico = (T) dao.pesquisarEmail((String) Tabela.getValueAt(linha, 1));
            dao.excluir(generico);
            atualizarTabela();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        if (HomePageAdm.listaIbamas == true) {
            HomePageIbama.editar = false;

            new CadastroIbama().setVisible(true);
            dispose();
        } else {
            HomePageBombeiro.editar = false;

            new CadastroBombeiro().setVisible(true);
            dispose();
        }

    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new HomePageAdm().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnVoltarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnVoltarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            new HomePageAdm().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnVoltarKeyPressed

    private void btnNovoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnNovoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            HomePageIbama.editar = false;

            new CadastroIbama().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnNovoKeyPressed

    private void btnExcluirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnExcluirKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            int linha = Tabela.getSelectedRow();
            if (linha == -1) {
                JOptionPane.showMessageDialog(null, "Selecione um Orgão!", "Erro", 2);
            } else if (JOptionPane.showConfirmDialog(null, "Deseja realmente excluir este Orgão?", "Excluir", 0, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                ibama = (Ibama) dao.pesquisarEmail((String) Tabela.getValueAt(linha, 1));
                dao.excluir(ibama);
                atualizarTabela();
            }
        }
    }//GEN-LAST:event_btnExcluirKeyPressed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        pesquisar = true;
        atualizarTabela();
        tfPesquisar.setText("");
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void tfPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPesquisarActionPerformed

    private void btnPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnPesquisarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            pesquisar = true;
            atualizarTabela();
            tfPesquisar.setText("");

        }
    }//GEN-LAST:event_btnPesquisarKeyPressed

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
            java.util.logging.Logger.getLogger(ListaIbamasEBombeiros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaIbamasEBombeiros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaIbamasEBombeiros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaIbamasEBombeiros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaIbamasEBombeiros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lTitulo1;
    private javax.swing.JTextField tfPesquisar;
    // End of variables declaration//GEN-END:variables
}
