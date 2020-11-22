/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package univs.edu.telas.adm;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import univs.edu.bombeiro.CorpoDeBombeiros;
import univs.edu.util.Criptografia;
import univs.edu.dao.GenericDAO;
import univs.edu.telas.bombeiro.ConfigsBombeiro;
import univs.edu.telas.bombeiro.HomePageBombeiro;

/**
 *
 * @author GGrio
 */
public class CadastroBombeiro extends javax.swing.JFrame {

    CorpoDeBombeiros bombeiro = new CorpoDeBombeiros();
    GenericDAO dao = new GenericDAO();

    /**
     * Creates new form CadastroIbama
     */
    public CadastroBombeiro() {
        initComponents();
        verificar();
    }

    public void verificar() {
        if (ConfigsBombeiro.editar == true) {
            jLabel1.setText("Editar Corpo de Bombeiros");
            btnCadastrar.setText("Editar");

            bombeiro = CorpoDeBombeiros.bombeiro;
            tfCidade.setText(bombeiro.getCidadeBombeiro());
            tfEstado.setText(bombeiro.getEstadoBombeiro());
            tfIdentificacao.setText(bombeiro.getCompanhiaBatalhao());
            tfNomeDeComandante.setText(bombeiro.getNomeDoComandante());
            tfRua.setText(bombeiro.getRuaBombeiro());
            tfTelefone.setText(bombeiro.getTelefoneBombeiro());
            tfEmail.setText(bombeiro.getEmailBombeiro());
        }
    }

    public void limparCampos() {
        bombeiro = new CorpoDeBombeiros();
        tfIdentificacao.setText("");
        tfNomeDeComandante.setText("");
        tfEstado.setText("");
        tfCidade.setText("");
        tfRua.setText("");
        tfTelefone.setText("");
        tfEmail.setText("");
        tfSenha.setText("");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        tfSenha = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfEstado = new javax.swing.JTextField();
        tfCidade = new javax.swing.JTextField();
        tfRua = new javax.swing.JTextField();
        tfNomeDeComandante = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfIdentificacao = new javax.swing.JFormattedTextField();
        tfTelefone = new javax.swing.JFormattedTextField();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Cadastro do Corpo de Bombeiros");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("E-mail:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("Senha:");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        btnCadastrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCadastrarKeyPressed(evt);
            }
        });

        tfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSenhaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("Identificação (Companhia/Batalhão):");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setText("Estado:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setText("Cidade:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setText("Rua:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel8.setText("Telefone:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel9.setText("Nome do Comandante:");

        tfEstado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfEstadoFocusLost(evt);
            }
        });

        tfCidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCidadeFocusLost(evt);
            }
        });

        tfRua.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfRuaFocusLost(evt);
            }
        });

        tfNomeDeComandante.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNomeDeComandanteFocusLost(evt);
            }
        });

        tfEmail.setToolTipText("Exemplo: Bombeiro@gmail.com");
        tfEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfEmailFocusLost(evt);
            }
        });
        tfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailActionPerformed(evt);
            }
        });

        try {
            tfIdentificacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#ªCia/#BMM")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfIdentificacao.setToolTipText("Exemplo: 1ªCia/3BMM.");
        tfIdentificacao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfIdentificacaoFocusLost(evt);
            }
        });

        try {
            tfTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfTelefone.setToolTipText("Exemplo: (88) 4002-8922");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                                    .addComponent(jLabel7)
                                    .addComponent(tfRua, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel3)
                                    .addComponent(tfSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                                    .addComponent(tfTelefone)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(179, 179, 179)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(354, 354, 354)
                                .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(tfIdentificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(tfNomeDeComandante, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnVoltar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCadastrar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jLabel1)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfNomeDeComandante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfRua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfIdentificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSenhaActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if (tfIdentificacao.getText().isEmpty() || tfNomeDeComandante.getText().isEmpty() || tfEstado.getText().isEmpty() || tfCidade.getText().isEmpty() || tfRua.getText().isEmpty() || tfTelefone.getText().isEmpty() || tfEmail.getText().isEmpty() || tfSenha.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os Campos !");
        } else {
            bombeiro.setCompanhiaBatalhao(tfIdentificacao.getText());
            bombeiro.setNomeDoComandante(tfNomeDeComandante.getText());
            bombeiro.setEstadoBombeiro(tfEstado.getText());
            bombeiro.setCidadeBombeiro(tfCidade.getText());
            bombeiro.setRuaBombeiro(tfRua.getText());
            bombeiro.setTelefoneBombeiro(tfTelefone.getText());
            bombeiro.setEmailBombeiro(tfEmail.getText());
            bombeiro.setSenhaBombeiro(Criptografia.criptografar(tfSenha.getText()));

            if (ConfigsBombeiro.editar == true) {
                bombeiro.setVerificaConta(true);
                dao.salvar(bombeiro);
                new HomePageBombeiro().setVisible(true);
                dispose();
            } else {
                bombeiro.setVerificaConta(false);
                dao.salvar(bombeiro);
            }
            limparCampos();
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void tfEstadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfEstadoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEstadoFocusLost

    private void tfCidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCidadeFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCidadeFocusLost

    private void tfRuaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfRuaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tfRuaFocusLost

    private void tfNomeDeComandanteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNomeDeComandanteFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeDeComandanteFocusLost

    private void tfEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfEmailFocusLost

        if (!tfEmail.getText().isEmpty()) {
            if (!tfEmail.getText().matches("(.*)@gmail.com(.*)")) {
                JOptionPane.showMessageDialog(null, "Necessaria a inclusão do dominio '@gmail.com'!");
                tfEmail.setText("");
                tfEmail.grabFocus();
            }
        }

        if (dao.pesquisarEmail(tfEmail.getText()) instanceof CorpoDeBombeiros) {
            bombeiro = (CorpoDeBombeiros) dao.pesquisarEmail(tfEmail.getText());
            if (ConfigsBombeiro.editar == true && (CorpoDeBombeiros.bombeiro.getIdBombeiro() == bombeiro.getIdBombeiro())) {

            } else {
                JOptionPane.showMessageDialog(null, "Email já cadastrado!");
                tfEmail.setText("");
                tfEmail.grabFocus();
            }
        } else if (dao.pesquisarEmail(tfEmail.getText()) != null) {
            JOptionPane.showMessageDialog(null, "Email já cadastrado!");
            tfEmail.setText("");
            tfEmail.grabFocus();
        }

    }//GEN-LAST:event_tfEmailFocusLost

    private void tfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmailActionPerformed

    private void btnCadastrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCadastrarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (tfIdentificacao.getText().isEmpty() || tfNomeDeComandante.getText().isEmpty() || tfEstado.getText().isEmpty() || tfCidade.getText().isEmpty() || tfRua.getText().isEmpty() || tfTelefone.getText().isEmpty() || tfEmail.getText().isEmpty() || tfSenha.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os Campos !");
            } else {
                bombeiro.setCompanhiaBatalhao(tfIdentificacao.getText());
                bombeiro.setNomeDoComandante(tfNomeDeComandante.getText());
                bombeiro.setEstadoBombeiro(tfEstado.getText());
                bombeiro.setCidadeBombeiro(tfCidade.getText());
                bombeiro.setRuaBombeiro(tfRua.getText());
                bombeiro.setTelefoneBombeiro(tfTelefone.getText());
                bombeiro.setEmailBombeiro(tfEmail.getText());
                bombeiro.setSenhaBombeiro(Criptografia.criptografar(tfSenha.getText()));

                if (ConfigsBombeiro.editar == true) {
                    dao.salvar(bombeiro);
                    new HomePageBombeiro().setVisible(true);
                    dispose();
                } else {
                    dao.salvar(bombeiro);
                }
                limparCampos();
            }

        }
    }//GEN-LAST:event_btnCadastrarKeyPressed

    private void tfIdentificacaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfIdentificacaoFocusLost
        if (dao.pesquisarIdentificacao(tfIdentificacao.getText()) instanceof CorpoDeBombeiros) {
            bombeiro = (CorpoDeBombeiros) dao.pesquisarIdentificacao(tfIdentificacao.getText());
            if (ConfigsBombeiro.editar == true && (CorpoDeBombeiros.bombeiro.getIdBombeiro() == bombeiro.getIdBombeiro())) {

            } else {
                JOptionPane.showMessageDialog(null, "Identificação já cadastrada!");
                tfIdentificacao.setText("");
                tfIdentificacao.grabFocus();
            }
        } else if (dao.pesquisarIdentificacao(tfIdentificacao.getText()) != null) {
            JOptionPane.showMessageDialog(null, "Identificação já cadastrada!");
            tfIdentificacao.setText("");
            tfIdentificacao.grabFocus();
        }
    }//GEN-LAST:event_tfIdentificacaoFocusLost

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        if (ConfigsBombeiro.editar == true) {
            new HomePageBombeiro().setVisible(true);
            dispose();
        } else {
            new ListaCorpoDeBombeiros().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnVoltarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnVoltarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVoltarKeyPressed

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
            java.util.logging.Logger.getLogger(CadastroBombeiro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroBombeiro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroBombeiro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroBombeiro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroBombeiro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfEstado;
    private javax.swing.JFormattedTextField tfIdentificacao;
    private javax.swing.JTextField tfNomeDeComandante;
    private javax.swing.JTextField tfRua;
    private javax.swing.JPasswordField tfSenha;
    private javax.swing.JFormattedTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
}
