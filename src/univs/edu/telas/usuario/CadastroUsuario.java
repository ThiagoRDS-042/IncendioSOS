/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package univs.edu.telas.usuario;

import java.awt.event.KeyEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import univs.edu.util.Criptografia;
import univs.edu.dao.GenericDAO;
import univs.edu.telas.bombeiro.DetalhesNotificacao;
import univs.edu.telas.login.GenericLogin;
import univs.edu.usuario.Usuario;

/**
 *
 * @author GGrio
 */
public class CadastroUsuario extends javax.swing.JFrame {

    Usuario usuario = new Usuario();
    GenericDAO dao = new GenericDAO();
    DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy-HH:mm:ss");
    LocalDateTime data = LocalDateTime.now();

    /**
     * Creates new form CadastroUsuario
     */
    public CadastroUsuario() {
        initComponents();
        verificar();
    }

    public void verificar() {
        if (HomePageUsuario.editar == true) {
            lTitulo.setText("Editar Usuário");
            btnCadastrar.setText("Editar");

            usuario = Usuario.usuario;
            tfNome.setText(usuario.getNomeUsuario());
            tfCpf.setText(usuario.getCpfUsuario());
            tfEmail.setText(usuario.getEmailUsuario());
            tfEstado.setText(usuario.getEstadoUsuario());
            tfCidade.setText(usuario.getCidadeUsuario());
            tfRua.setText(usuario.getRuaUsuario());
            tfTelefone.setText(usuario.getTelefoneUsuario());
        }

    }

    public void limparCampos() {
        usuario = new Usuario();
        tfNome.setText("");
        tfCpf.setText("");
        tfEmail.setText("");
        tfSenha.setText("");
        tfEstado.setText("");
        tfCidade.setText("");
        tfRua.setText("");
        tfTelefone.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfTeste = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        tfNome = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfCpf = new javax.swing.JFormattedTextField();
        tfSenha = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        lTitulo = new javax.swing.JLabel();
        tfEstado = new javax.swing.JTextField();
        tfCidade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfRua = new javax.swing.JTextField();
        tfTelefone = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfNome.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });
        jPanel1.add(tfNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 320, 35));

        tfEmail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tfEmail.setToolTipText("Exemplo: User@gmail.com");
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
        jPanel1.add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 320, 35));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nome*:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("E-mail*:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        try {
            tfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCpf.setToolTipText("Exemplo: 123.456.789-10");
        tfCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCpfFocusLost(evt);
            }
        });
        jPanel1.add(tfCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 320, 35));

        tfSenha.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSenhaActionPerformed(evt);
            }
        });
        jPanel1.add(tfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 320, 35));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CPF*:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Senha*:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 40, 20));

        btnVoltar.setBackground(new java.awt.Color(255, 51, 153));
        btnVoltar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jPanel1.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 100, 35));

        btnCadastrar.setBackground(new java.awt.Color(255, 51, 153));
        btnCadastrar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jPanel1.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, 100, 35));

        lTitulo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lTitulo.setText("Cadastro de Usuário");
        jPanel1.add(lTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

        tfEstado.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(tfEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 320, 35));

        tfCidade.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(tfCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 320, 35));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cidade*:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Estado*:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        tfRua.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(tfRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 320, 35));

        try {
            tfTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfTelefone.setToolTipText("Exemplo: (88) 4002-8922");
        jPanel1.add(tfTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 320, 35));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Telefone*:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Rua*:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Preencha todos os campos obrigatorios(*)");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/univs/edu/imagens/cadastroUsuario.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(tfTeste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tfTeste, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSenhaActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if (tfNome.getText().isEmpty() || tfCpf.getText().isEmpty() || tfEmail.getText().isEmpty() || tfSenha.getText().isEmpty() || tfEstado.getText().isEmpty() || tfCidade.getText().isEmpty() || tfRua.getText().isEmpty() || tfTelefone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os Campos !");
        } else {
            GenericLogin.login = false;
            DetalhesNotificacao.trote = false;

            usuario.setNomeUsuario(tfNome.getText());
            usuario.setCpfUsuario(tfCpf.getText());
            usuario.setEmailUsuario(tfEmail.getText());
            usuario.setSenhaUsuario(Criptografia.criptografar(tfSenha.getText()));
            usuario.setEstadoUsuario(tfEstado.getText());
            usuario.setCidadeUsuario(tfCidade.getText());
            usuario.setRuaUsuario(tfRua.getText());
            usuario.setTelefoneUsuario(tfTelefone.getText());
            usuario.setVerificaCondutaTrote(false);

            if (HomePageUsuario.editar == true) {
                dao.salvar(usuario);
                new HomePageUsuario().setVisible(true);
                dispose();
            } else {
                dao.salvar(usuario);
            }
            limparCampos();
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void tfEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfEmailFocusLost

        if (!tfEmail.getText().isEmpty()) {
            if (!tfEmail.getText().matches("(.*)@gmail.com(.*)")) {
                JOptionPane.showMessageDialog(null, "Necessaria a inclusão do dominio '@gmail.com'!");
                tfEmail.setText("");
                tfEmail.grabFocus();
            }
        }

        if (dao.pesquisarEmail(tfEmail.getText()) instanceof Usuario) {
            usuario = (Usuario) dao.pesquisarEmail(tfEmail.getText());
            if (HomePageUsuario.editar == true && (Usuario.usuario.getIdUsuario() == usuario.getIdUsuario())) {

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

    private void btnCadastrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCadastrarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (tfNome.getText().isEmpty() || tfCpf.getText().isEmpty() || tfEmail.getText().isEmpty() || tfSenha.getText().isEmpty() || tfEstado.getText().isEmpty() || tfCidade.getText().isEmpty() || tfRua.getText().isEmpty() || tfTelefone.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os Campos !");
            } else {
                GenericLogin.login = false;
                DetalhesNotificacao.trote = false;

                usuario.setNomeUsuario(tfNome.getText());
                usuario.setCpfUsuario(tfCpf.getText());
                usuario.setEmailUsuario(tfEmail.getText());
                usuario.setSenhaUsuario(Criptografia.criptografar(tfSenha.getText()));
                usuario.setEstadoUsuario(tfEstado.getText());
                usuario.setCidadeUsuario(tfCidade.getText());
                usuario.setRuaUsuario(tfRua.getText());
                usuario.setTelefoneUsuario(tfTelefone.getText());
                usuario.setVerificaCondutaTrote(false);

                if (HomePageUsuario.editar == true) {
                    dao.salvar(usuario);
                    new HomePageUsuario().setVisible(true);
                    dispose();
                } else {
                    dao.salvar(usuario);
                }
                limparCampos();
            }

        }
    }//GEN-LAST:event_btnCadastrarKeyPressed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        if (HomePageUsuario.editar == true) {
            new HomePageUsuario().setVisible(true);
            dispose();
        } else {
            new GenericLogin().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnVoltarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnVoltarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (HomePageUsuario.editar == true) {
                new HomePageUsuario().setVisible(true);
                dispose();
            } else {
                new GenericLogin().setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_btnVoltarKeyPressed

    private void tfCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCpfFocusLost
        if (dao.pesquisarIdentificacao(tfCpf.getText()) instanceof Usuario) {
            usuario = (Usuario) dao.pesquisarIdentificacao(tfCpf.getText());
            if (HomePageUsuario.editar == true && (Usuario.usuario.getIdUsuario() == usuario.getIdUsuario())) {

            } else {
                JOptionPane.showMessageDialog(null, "CPF já cadastrado!");
                tfCpf.setText("");
                tfCpf.grabFocus();
            }
        } else if (dao.pesquisarEmail(tfCpf.getText()) != null) {
            JOptionPane.showMessageDialog(null, "CPF já cadastrado!");
            tfCpf.setText("");
            tfCpf.grabFocus();
        }
    }//GEN-LAST:event_tfCpfFocusLost

    private void tfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmailActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnVoltar;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JFormattedTextField tfCpf;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfEstado;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfRua;
    private javax.swing.JPasswordField tfSenha;
    private javax.swing.JFormattedTextField tfTelefone;
    private javax.swing.JTextField tfTeste;
    // End of variables declaration//GEN-END:variables
}
