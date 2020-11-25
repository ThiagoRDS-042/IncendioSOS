/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package univs.edu.telas.login;

import java.awt.event.KeyEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import univs.edu.adm.Adm;
import univs.edu.bombeiro.CorpoDeBombeiros;
import univs.edu.util.Criptografia;
import univs.edu.dao.GenericDAO;
import univs.edu.ibama.Ibama;
import univs.edu.telas.adm.CadastroBombeiro;
import univs.edu.telas.adm.CadastroIbama;
import univs.edu.telas.adm.HomePageAdm;
import univs.edu.telas.bombeiro.ConfigsBombeiro;
import univs.edu.telas.bombeiro.DetalhesNotificacao;
import univs.edu.telas.bombeiro.HomePageBombeiro;
import univs.edu.telas.ibama.ConfigsIbama;
import univs.edu.telas.ibama.HomePageIbama;
import univs.edu.telas.usuario.CadastroUsuario;
import univs.edu.telas.usuario.HomePageUsuario;
import univs.edu.usuario.Usuario;

/**
 *
 * @author GGrio
 */
public class GenericLogin extends javax.swing.JFrame {

    Usuario usuario = new Usuario();
    CorpoDeBombeiros bombeiro = new CorpoDeBombeiros();
    Ibama ibama = new Ibama();
    Adm adm = new Adm();
    GenericDAO dao = new GenericDAO();
    DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy-HH:mm:ss");
    LocalDateTime data = LocalDateTime.now();

    public static boolean login;

    /**
     * Creates new form GenericLogin
     */
    public GenericLogin() {
        initComponents();
    }

    public void limparCampos() {
        tfEmailLogin.setText("");
        tfSenhaLogin.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfEmailLogin = new javax.swing.JTextField();
        tfSenhaLogin = new javax.swing.JPasswordField();
        btnCadastrese = new javax.swing.JButton();
        btnEntrar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel4.setBackground(new java.awt.Color(0, 153, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/univs/edu/imagens/iconUsuario.png"))); // NOI18N
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        jPanel2.add(jLabel4);
        jLabel4.setBounds(120, 180, 40, 35);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/univs/edu/imagens/iconSenha.png"))); // NOI18N
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        jPanel2.add(jLabel5);
        jLabel5.setBounds(120, 240, 40, 35);

        tfEmailLogin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tfEmailLogin.setToolTipText("Digite seu E-mail");
        tfEmailLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null
            , java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
    tfEmailLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    jPanel2.add(tfEmailLogin);
    tfEmailLogin.setBounds(160, 180, 190, 35);
    tfEmailLogin.getAccessibleContext().setAccessibleName("");

    tfSenhaLogin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
    tfSenhaLogin.setToolTipText("Digite Sua Senha");
    tfSenhaLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
    jPanel2.add(tfSenhaLogin);
    tfSenhaLogin.setBounds(160, 240, 190, 35);

    btnCadastrese.setBackground(new java.awt.Color(255, 51, 153));
    btnCadastrese.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
    btnCadastrese.setForeground(new java.awt.Color(255, 255, 255));
    btnCadastrese.setText("Cadastre-se");
    btnCadastrese.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnCadastreseActionPerformed(evt);
        }
    });
    jPanel2.add(btnCadastrese);
    btnCadastrese.setBounds(290, 400, 100, 35);

    btnEntrar.setBackground(new java.awt.Color(255, 51, 153));
    btnEntrar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
    btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
    btnEntrar.setText("Login");
    btnEntrar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnEntrarActionPerformed(evt);
        }
    });
    btnEntrar.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            btnEntrarKeyPressed(evt);
        }
    });
    jPanel2.add(btnEntrar);
    btnEntrar.setBounds(120, 310, 230, 35);

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
    jPanel2.add(btnVoltar);
    btnVoltar.setBounds(70, 400, 100, 35);

    jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/univs/edu/imagens/backgroundLogin.jpg"))); // NOI18N
    jLabel2.setText("Cast");
    jPanel2.add(jLabel2);
    jLabel2.setBounds(0, 0, 470, 470);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
    );

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        if (tfEmailLogin.getText().isEmpty() || tfSenhaLogin.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os Campos", "Campos", 2);
        } else {
            login = true;
            if (dao.login(tfEmailLogin.getText(), Criptografia.criptografar(tfSenhaLogin.getText())) instanceof Usuario) {
                usuario = (Usuario) dao.login(tfEmailLogin.getText(), Criptografia.criptografar(tfSenhaLogin.getText()));
                usuario.setUtimoLogin(formatoData.format(data));
                dao.salvar(usuario);
                Usuario.usuario = usuario;

                if (dao.listarNotDen(usuario, "Notificação").size() > 1 || dao.listarNotDen(usuario, "Denuncia").size() > 1 || (dao.listarNotDen(usuario, "Notificação").size() == 1 && dao.listarNotDen(usuario, "Denuncia").size() == 1)) {
                    JOptionPane.showMessageDialog(null, "Trotes excessivos detectados, sua conta será excluída!");
                    limparCampos();
                } else if (dao.listarNotDen(usuario, "Notificação").size() == 1 && usuario.isVerificaCondutaTrote() || (dao.listarNotDen(usuario, "Denuncia").size() == 1 && usuario.isVerificaCondutaTrote())) {
                    if (JOptionPane.showConfirmDialog(null, "Trote detectado, caso isto ocorra novamente sua conta será excluída, você se compromete a não passar trotes navamente?", "Aviso", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                        DetalhesNotificacao.trote = true;
                        usuario.setVerificaCondutaTrote(false);
                        dao.salvar(usuario);
                        new HomePageUsuario().setVisible(true);
                        dispose();
                    } else {
                        limparCampos();
                    }
                } else if (dao.listarNotDen(usuario, "Notificação").isEmpty() && dao.listarNotDen(usuario, "Denuncia").isEmpty()) {
                    new HomePageUsuario().setVisible(true);
                    dispose();
                } else if ((dao.listarNotDen(usuario, "Notificação").size() == 1 || dao.listarNotDen(usuario, "Denuncia").size() == 1) && !usuario.isVerificaCondutaTrote()) {
                    new HomePageUsuario().setVisible(true);
                    dispose();
                }

            } else if (dao.login(tfEmailLogin.getText(), Criptografia.criptografar(tfSenhaLogin.getText())) instanceof CorpoDeBombeiros) {
                bombeiro = (CorpoDeBombeiros) dao.login(tfEmailLogin.getText(), Criptografia.criptografar(tfSenhaLogin.getText()));
                CorpoDeBombeiros.bombeiro = bombeiro;

                if (!CorpoDeBombeiros.bombeiro.isVerificaConta() && JOptionPane.showConfirmDialog(null, "Edite sua conta agora, caso não queira voçê pode ter acesso a edição pelo painel configurações", "Excluir", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    ConfigsBombeiro.editar = true;

                    new CadastroBombeiro().setVisible(true);
                    dispose();
                } else {
                    new HomePageBombeiro().setVisible(true);
                    dispose();
                }

            } else if (dao.login(tfEmailLogin.getText(), Criptografia.criptografar(tfSenhaLogin.getText())) instanceof Ibama) {
                ibama = (Ibama) dao.login(tfEmailLogin.getText(), Criptografia.criptografar(tfSenhaLogin.getText()));
                Ibama.ibama = ibama;

                if (!Ibama.ibama.isVerificaConta() && JOptionPane.showConfirmDialog(null, "Edite sua conta agora, caso não queira voçê pode ter acesso a edição pelo painel configurações", "Excluir", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    ConfigsIbama.editar = true;

                    new CadastroIbama().setVisible(true);
                    dispose();
                } else {
                    new HomePageIbama().setVisible(true);
                    dispose();
                }

            } else if (dao.login(tfEmailLogin.getText(), Criptografia.criptografar(tfSenhaLogin.getText())) instanceof Adm) {
                adm = (Adm) dao.login(tfEmailLogin.getText(), Criptografia.criptografar(tfSenhaLogin.getText()));
                Adm.adm = adm;
                new HomePageAdm().setVisible(true);
                dispose();

            } else {
                JOptionPane.showMessageDialog(null, "Dados Invalidos!", "Dados", 2);
                limparCampos();
            }

        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnEntrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEntrarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (tfEmailLogin.getText().isEmpty() || tfSenhaLogin.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os Campos", "Campos", 2);
            } else {
                login = true;
                if (dao.login(tfEmailLogin.getText(), Criptografia.criptografar(tfSenhaLogin.getText())) instanceof Usuario) {
                    usuario = (Usuario) dao.login(tfEmailLogin.getText(), Criptografia.criptografar(tfSenhaLogin.getText()));
                    usuario.setUtimoLogin(formatoData.format(data));
                    dao.salvar(usuario);
                    Usuario.usuario = usuario;

                    if (dao.listarNotDen(usuario, "Notificação").size() > 1 || dao.listarNotDen(usuario, "Denuncia").size() > 1 || (dao.listarNotDen(usuario, "Notificação").size() == 1 && dao.listarNotDen(usuario, "Denuncia").size() == 1)) {
                        JOptionPane.showMessageDialog(null, "Trotes excessivos detectados, sua conta será excluída!");
                        limparCampos();
                    } else if (dao.listarNotDen(usuario, "Notificação").size() == 1 && usuario.isVerificaCondutaTrote() || (dao.listarNotDen(usuario, "Denuncia").size() == 1 && usuario.isVerificaCondutaTrote())) {
                        if (JOptionPane.showConfirmDialog(null, "Trote detectado, caso isto ocorra novamente sua conta será excluída, você se compromete a não passar trotes navamente?", "Aviso", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                            DetalhesNotificacao.trote = true;
                            usuario.setVerificaCondutaTrote(false);
                            dao.salvar(usuario);
                            new HomePageUsuario().setVisible(true);
                            dispose();
                        } else {
                            limparCampos();
                        }
                    } else if (dao.listarNotDen(usuario, "Notificação").isEmpty() && dao.listarNotDen(usuario, "Denuncia").isEmpty()) {
                        new HomePageUsuario().setVisible(true);
                        dispose();
                    } else if ((dao.listarNotDen(usuario, "Notificação").size() == 1 || dao.listarNotDen(usuario, "Denuncia").size() == 1) && !usuario.isVerificaCondutaTrote()) {
                        new HomePageUsuario().setVisible(true);
                        dispose();
                    }

                } else if (dao.login(tfEmailLogin.getText(), Criptografia.criptografar(tfSenhaLogin.getText())) instanceof CorpoDeBombeiros) {
                    bombeiro = (CorpoDeBombeiros) dao.login(tfEmailLogin.getText(), Criptografia.criptografar(tfSenhaLogin.getText()));
                    CorpoDeBombeiros.bombeiro = bombeiro;

                    if (!CorpoDeBombeiros.bombeiro.isVerificaConta() && JOptionPane.showConfirmDialog(null, "Edite sua conta agora, caso não queira voçê pode ter acesso a edição pelo painel configurações", "Excluir", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                        ConfigsBombeiro.editar = true;

                        new CadastroBombeiro().setVisible(true);
                        dispose();
                    } else {
                        new HomePageBombeiro().setVisible(true);
                        dispose();
                    }

                } else if (dao.login(tfEmailLogin.getText(), Criptografia.criptografar(tfSenhaLogin.getText())) instanceof Ibama) {
                    ibama = (Ibama) dao.login(tfEmailLogin.getText(), Criptografia.criptografar(tfSenhaLogin.getText()));
                    Ibama.ibama = ibama;

                    if (!Ibama.ibama.isVerificaConta() && JOptionPane.showConfirmDialog(null, "Edite sua conta agora, caso não queira voçê pode ter acesso a edição pelo painel configurações", "Excluir", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                        ConfigsIbama.editar = true;

                        new CadastroIbama().setVisible(true);
                        dispose();
                    } else {
                        new HomePageIbama().setVisible(true);
                        dispose();
                    }

                } else if (dao.login(tfEmailLogin.getText(), Criptografia.criptografar(tfSenhaLogin.getText())) instanceof Adm) {
                    adm = (Adm) dao.login(tfEmailLogin.getText(), Criptografia.criptografar(tfSenhaLogin.getText()));
                    Adm.adm = adm;
                    new HomePageAdm().setVisible(true);
                    dispose();

                } else {
                    JOptionPane.showMessageDialog(null, "Dados Invalidos!", "Dados", 2);
                    limparCampos();
                }

            }

        }
    }//GEN-LAST:event_btnEntrarKeyPressed

    private void btnCadastreseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastreseActionPerformed
        HomePageUsuario.editar = false;

        new CadastroUsuario().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCadastreseActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(GenericLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenericLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenericLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenericLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenericLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrese;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tfEmailLogin;
    private javax.swing.JPasswordField tfSenhaLogin;
    // End of variables declaration//GEN-END:variables
}
