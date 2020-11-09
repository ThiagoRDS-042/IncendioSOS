/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package univs.edu.telas.ibama;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import univs.edu.bombeiro.CorpoDeBombeiros;
import univs.edu.criptografia.Criptografia;
import univs.edu.dao.GenericDAO;
import univs.edu.ibama.Ibama;

/**
 *
 * @author GGrio
 */
public class CadastroIbama extends javax.swing.JFrame {

    Ibama ibama = new Ibama();
    GenericDAO dao = new GenericDAO();

    /**
     * Creates new form CadastroIbama
     */
    public CadastroIbama() {
        initComponents();
    }

    public void limparCampos() {
        ibama = new Ibama();
        tfNome.setText("");
        tfResponsavel.setText("");
        tfCnpj.setText("");
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
        tfResponsavel = new javax.swing.JTextField();
        tfSenha = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfCnpj = new javax.swing.JTextField();
        tfEstado = new javax.swing.JTextField();
        tfCidade = new javax.swing.JTextField();
        tfRua = new javax.swing.JTextField();
        tfTelefone = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(25, 100));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Cadastro de IBAMA");

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

        tfResponsavel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfResponsavelFocusLost(evt);
            }
        });
        tfResponsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfResponsavelActionPerformed(evt);
            }
        });

        tfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSenhaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("Responsável:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setText("CNPJ:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setText("Estado:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setText("Cidade:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel8.setText("Rua:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel9.setText("Telefone:");

        tfCnpj.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCnpjFocusLost(evt);
            }
        });

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

        tfTelefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfTelefoneFocusLost(evt);
            }
        });

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

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel10.setText("Nome:");

        tfNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNomeFocusLost(evt);
            }
        });
        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(tfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(tfRua, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(tfTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addComponent(tfCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(tfCnpj, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addComponent(tfSenha))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadastrar)
                .addGap(309, 309, 309))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfRua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSenhaActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if (tfNome.getText().isEmpty() || tfResponsavel.getText().isEmpty() || tfCnpj.getText().isEmpty() || tfEstado.getText().isEmpty() || tfCidade.getText().isEmpty() || tfRua.getText().isEmpty() || tfTelefone.getText().isEmpty() || tfEmail.getText().isEmpty() || tfSenha.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os Campos !");
        } else {
            ibama.setNomeIbama(tfNome.getText());
            ibama.setResponsavelIbama(tfResponsavel.getText());
            ibama.setCnpj(tfCnpj.getText());
            ibama.setEstadoIbama(tfEstado.getText());
            ibama.setCidadeIbama(tfCidade.getText());
            ibama.setRuaIbama(tfRua.getText());
            ibama.setTelefoneIbama(tfTelefone.getText());
            ibama.setEmailIbama(tfEmail.getText());
            ibama.setSenhaIbama(Criptografia.criptografar(tfSenha.getText()));
            dao.salvar(ibama);
            limparCampos();
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void tfResponsavelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfResponsavelFocusLost

    }//GEN-LAST:event_tfResponsavelFocusLost

    private void tfCnpjFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCnpjFocusLost
        if (dao.pesquisarIdentificacao(tfCnpj.getText()) instanceof Ibama) {
            JOptionPane.showMessageDialog(null, "CNPJ já Cadastrado!");
            tfCnpj.setText("");
            tfCnpj.grabFocus();
        }
    }//GEN-LAST:event_tfCnpjFocusLost

    private void tfEstadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfEstadoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEstadoFocusLost

    private void tfCidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCidadeFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCidadeFocusLost

    private void tfRuaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfRuaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tfRuaFocusLost

    private void tfTelefoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfTelefoneFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTelefoneFocusLost

    private void tfEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfEmailFocusLost
        if (dao.pesquisarEmail(tfEmail.getText()) != null) {
            JOptionPane.showMessageDialog(null, "Email ja cadastrado!");
            tfEmail.setText("");
            tfEmail.grabFocus();
        }
    }//GEN-LAST:event_tfEmailFocusLost

    private void tfResponsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfResponsavelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfResponsavelActionPerformed

    private void tfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmailActionPerformed

    private void btnCadastrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCadastrarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (tfNome.getText().isEmpty() || tfResponsavel.getText().isEmpty() || tfCnpj.getText().isEmpty() || tfEstado.getText().isEmpty() || tfCidade.getText().isEmpty() || tfRua.getText().isEmpty() || tfTelefone.getText().isEmpty() || tfEmail.getText().isEmpty() || tfSenha.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os Campos !");
            } else {
                ibama.setNomeIbama(tfNome.getText());
                ibama.setResponsavelIbama(tfResponsavel.getText());
                ibama.setCnpj(tfCnpj.getText());
                ibama.setEstadoIbama(tfEstado.getText());
                ibama.setCidadeIbama(tfCidade.getText());
                ibama.setRuaIbama(tfRua.getText());
                ibama.setTelefoneIbama(tfTelefone.getText());
                ibama.setEmailIbama(tfEmail.getText());
                ibama.setSenhaIbama(Criptografia.criptografar(tfSenha.getText()));
                dao.salvar(ibama);
                limparCampos();
            }

        }
    }//GEN-LAST:event_btnCadastrarKeyPressed

    private void tfNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNomeFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeFocusLost

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroIbama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroIbama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroIbama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroIbama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroIbama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfCnpj;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfEstado;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfResponsavel;
    private javax.swing.JTextField tfRua;
    private javax.swing.JPasswordField tfSenha;
    private javax.swing.JTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
}
