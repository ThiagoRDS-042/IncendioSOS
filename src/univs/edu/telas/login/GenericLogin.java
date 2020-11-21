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
import univs.edu.telas.usuario.ConfigsUsuario;
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

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfEmailLogin = new javax.swing.JTextField();
        tfSenhaLogin = new javax.swing.JPasswordField();
        btnCadastrese = new javax.swing.JButton();
        btnEntrar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setLayout(null);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/univs/edu/imagens/UsuarioLogin.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 90, 180, 140);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Faça seu Login");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 230, 120, 30);
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 90, 180, 140);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel4.setBackground(new java.awt.Color(0, 153, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 255));
        jLabel4.setText("Email");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 110, 35, 17);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 255));
        jLabel5.setText("Senha");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 170, 38, 17);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 255));
        jLabel8.setText("Login");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(110, 50, 46, 22);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 255));
        jLabel9.setText("Novo por aqui?");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(170, 320, 80, 14);

        tfEmailLogin.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tfEmailLogin.setToolTipText("Digite seu E-mail");
        jPanel2.add(tfEmailLogin);
        tfEmailLogin.setBounds(20, 130, 234, 30);

        tfSenhaLogin.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tfSenhaLogin.setToolTipText("Digite Sua Senha");
        jPanel2.add(tfSenhaLogin);
        tfSenhaLogin.setBounds(20, 190, 234, 30);

        btnCadastrese.setBackground(new java.awt.Color(0, 153, 255));
        btnCadastrese.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnCadastrese.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrese.setText("Cadastre-se");
        btnCadastrese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastreseActionPerformed(evt);
            }
        });
        jPanel2.add(btnCadastrese);
        btnCadastrese.setBounds(160, 340, 89, 30);

        btnEntrar.setBackground(new java.awt.Color(0, 153, 255));
        btnEntrar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("Entrar");
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
        btnEntrar.setBounds(100, 250, 63, 30);

        btnVoltar.setBackground(new java.awt.Color(0, 153, 255));
        btnVoltar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
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
        btnVoltar.setBounds(20, 340, 80, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
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
        ConfigsUsuario.editar = false;

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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tfEmailLogin;
    private javax.swing.JPasswordField tfSenhaLogin;
    // End of variables declaration//GEN-END:variables
}
