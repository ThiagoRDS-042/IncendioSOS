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
import univs.edu.criptografia.Criptografia;
import univs.edu.dao.GenericDAO;
import univs.edu.ibama.Ibama;
import univs.edu.telas.adm.HomePageAdm;
import univs.edu.telas.bombeiro.HomePageBombeiro;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfEmailLogin = new javax.swing.JTextField();
        tfSenhaLogin = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        btnCadastrese = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Login");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("E-mail:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Senha:");

        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        btnCadastrese.setText("Cadastre-se");
        btnCadastrese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastreseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel1)
                .addContainerGap(148, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCadastrese))
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(tfEmailLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                    .addComponent(tfSenhaLogin))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfEmailLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSenhaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrese, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (tfEmailLogin.getText().isEmpty() || tfSenhaLogin.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha Campos ", "Campos", 2);
        } else {
            login = true;
            if (dao.login(tfEmailLogin.getText(), Criptografia.criptografar(tfSenhaLogin.getText())) instanceof Usuario) {
                usuario = (Usuario) dao.login(tfEmailLogin.getText(), Criptografia.criptografar(tfSenhaLogin.getText()));
                usuario.setUtimoLogin(formatoData.format(data));
                dao.salvar(usuario);
                Usuario.usuario = usuario;
                HomePageUsuario tela = new HomePageUsuario();
                tela.setVisible(true);
                dispose();

            } else if (dao.login(tfEmailLogin.getText(), Criptografia.criptografar(tfSenhaLogin.getText())) instanceof CorpoDeBombeiros) {
                bombeiro = (CorpoDeBombeiros) dao.login(tfEmailLogin.getText(), Criptografia.criptografar(tfSenhaLogin.getText()));
                CorpoDeBombeiros.bombeiro = bombeiro;
                HomePageBombeiro tela = new HomePageBombeiro();
                tela.setVisible(true);
                dispose();

            } else if (dao.login(tfEmailLogin.getText(), Criptografia.criptografar(tfSenhaLogin.getText())) instanceof Ibama) {
                ibama = (Ibama) dao.login(tfEmailLogin.getText(), Criptografia.criptografar(tfSenhaLogin.getText()));
                Ibama.ibama = ibama;
                HomePageIbama tela = new HomePageIbama();
                tela.setVisible(true);
                dispose();

            } else if (dao.login(tfEmailLogin.getText(), tfSenhaLogin.getText()) instanceof Adm) {
                adm = (Adm) dao.login(tfEmailLogin.getText(), tfSenhaLogin.getText());
                Adm.adm = adm;
                HomePageAdm tela = new HomePageAdm();
                tela.setVisible(true);
                dispose();

            } else {
                JOptionPane.showMessageDialog(null, "Dados Invalidos!", "Dados", 2);
                limparCampos();
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (tfEmailLogin.getText().isEmpty() || tfSenhaLogin.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha Campos ", "Campos", 2);
            } else {
                login = true;
                if (dao.login(tfEmailLogin.getText(), Criptografia.criptografar(tfSenhaLogin.getText())) instanceof Usuario) {
                    usuario = (Usuario) dao.login(tfEmailLogin.getText(), Criptografia.criptografar(tfSenhaLogin.getText()));
                    usuario.setUtimoLogin(formatoData.format(data));
                    dao.salvar(usuario);
                    Usuario.usuario = usuario;
                    HomePageUsuario tela = new HomePageUsuario();
                    tela.setVisible(true);
                    dispose();

                } else if (dao.login(tfEmailLogin.getText(), Criptografia.criptografar(tfSenhaLogin.getText())) instanceof CorpoDeBombeiros) {
                    bombeiro = (CorpoDeBombeiros) dao.login(tfEmailLogin.getText(), Criptografia.criptografar(tfSenhaLogin.getText()));
                    CorpoDeBombeiros.bombeiro = bombeiro;
                    HomePageBombeiro tela = new HomePageBombeiro();
                    tela.setVisible(true);
                    dispose();

                } else if (dao.login(tfEmailLogin.getText(), Criptografia.criptografar(tfSenhaLogin.getText())) instanceof Ibama) {
                    ibama = (Ibama) dao.login(tfEmailLogin.getText(), Criptografia.criptografar(tfSenhaLogin.getText()));
                    Ibama.ibama = ibama;
                    HomePageIbama tela = new HomePageIbama();
                    tela.setVisible(true);
                    dispose();

                } else if (dao.login(tfEmailLogin.getText(), tfSenhaLogin.getText()) instanceof Adm) {
                    adm = (Adm) dao.login(tfEmailLogin.getText(), tfSenhaLogin.getText());
                    Adm.adm = adm;
                    HomePageAdm tela = new HomePageAdm();
                    tela.setVisible(true);
                    dispose();

                } else {
                    JOptionPane.showMessageDialog(null, "Dados Invalidos!", "Dados", 2);
                    limparCampos();
                }

            }

        }
    }//GEN-LAST:event_jButton1KeyPressed

    private void btnCadastreseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastreseActionPerformed
        ConfigsUsuario.editar = false;

        CadastroUsuario cadastro = new CadastroUsuario();
        cadastro.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCadastreseActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField tfEmailLogin;
    private javax.swing.JPasswordField tfSenhaLogin;
    // End of variables declaration//GEN-END:variables
}
