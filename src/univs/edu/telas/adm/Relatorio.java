/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package univs.edu.telas.adm;

import java.awt.event.KeyEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;
import univs.edu.dao.GenericDAO;
import univs.edu.denuncia.Denuncia;
import univs.edu.notificacao.Notificacao;
import univs.edu.usuario.Usuario;

/**
 *
 * @author GGrio
 */
public class Relatorio extends javax.swing.JFrame {

    GenericDAO dao = new GenericDAO();

    /**
     * Creates new form Relatorio
     */
    public Relatorio() {
        initComponents();
        relatorio();
    }

    public void limparPesquisa() {
        tfPesquisa.setText("");
    }

    public void limparTexto() {
        lbData.setText("");
        lbOcorrencia.setText("");
        lbTrote.setText("");
        lbUsuarios.setText("");
    }

    public void relatorio() {

        DateTimeFormatter formatoDataMes = DateTimeFormatter.ofPattern("MM");
        DateTimeFormatter formatoDataAno = DateTimeFormatter.ofPattern("yyyy");
        LocalDateTime data = LocalDateTime.now();

        List<Notificacao> nots;
        List<Denuncia> dens;

        if (tfPesquisa.getText().isEmpty()) {
            nots = (List<Notificacao>) dao.relatorio(formatoDataMes.format(data), "Notificação", false, "");
            dens = (List<Denuncia>) dao.relatorio(formatoDataMes.format(data), "Denuncia", false, "");
        } else {
            nots = (List<Notificacao>) dao.relatorio(formatoDataMes.format(data), "Notificação", true, tfPesquisa.getText());
            dens = (List<Denuncia>) dao.relatorio(formatoDataMes.format(data), "Denuncia", true, tfPesquisa.getText());
        }

        if (nots.isEmpty() && dens.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Sem registros de ocorrêcia para a cidade : " + tfPesquisa.getText(), "Erro", 2);
            jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Relatório de Ocerrências", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 255, 255)));
            limparTexto();
        } else {

            if (tfPesquisa.getText().isEmpty()) {
                jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Relatório de Ocerrências", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 255, 255)));
            } else {
                jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), tfPesquisa.getText(), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 255, 255)));
            }

            int qtdNotsDens = nots.size();
            qtdNotsDens += dens.size();

            int qtdTrote = 0;
            String idUsuarios = "";
            Usuario usuario;

            for (Denuncia den : dens) {
                if (den.isTrote()) {
                    qtdTrote += 1;
                    usuario = den.getUsuario();
                    idUsuarios += usuario.getIdUsuario() + ", ";
                }
            }

            for (Notificacao not : nots) {
                if (not.isTrote()) {
                    qtdTrote += 1;
                    usuario = not.getUsuario();
                    idUsuarios += usuario.getIdUsuario() + ", ";
                }
            }

            lbOcorrencia.setText(Integer.toString(qtdNotsDens));
            lbTrote.setText(Integer.toString(qtdTrote));

            if (qtdTrote == 0) {
                lbUsuarios.setText("Não Existe!");
            } else {
                lbUsuarios.setText(idUsuarios.replaceAll("(, $)", "."));
            }
            switch (formatoDataMes.format(data)) {
                case "1":
                    lbData.setText("Janeiro de " + formatoDataAno.format(data));
                    break;
                case "2":
                    lbData.setText("Fevereiro de " + formatoDataAno.format(data));
                    break;
                case "3":
                    lbData.setText("Março de " + formatoDataAno.format(data));
                    break;
                case "4":
                    lbData.setText("Abril de " + formatoDataAno.format(data));
                    break;
                case "5":
                    lbData.setText("Maio de " + formatoDataAno.format(data));
                    break;
                case "6":
                    lbData.setText("Junho de " + formatoDataAno.format(data));
                    break;
                case "7":
                    lbData.setText("Julho de " + formatoDataAno.format(data));
                    break;
                case "8":
                    lbData.setText("Agosto de " + formatoDataAno.format(data));
                    break;
                case "9":
                    lbData.setText("Setembro de " + formatoDataAno.format(data));
                    break;
                case "10":
                    lbData.setText("Outubro de " + formatoDataAno.format(data));
                    break;
                case "11":
                    lbData.setText("Novenbro de " + formatoDataAno.format(data));
                    break;
                case "12":
                    lbData.setText("Dezembro de " + formatoDataAno.format(data));
                    break;
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

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfPesquisa = new javax.swing.JTextField();
        btnPesquisa = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbOcorrencia = new javax.swing.JLabel();
        lbUsuario = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbUsuarios = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lbTrote = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lbData = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Relatório");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/univs/edu/imagens/cabecalho.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 430, 84));

        tfPesquisa.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tfPesquisa.setToolTipText("Pesquise Pela Cidade");
        jPanel2.add(tfPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 280, 35));

        btnPesquisa.setBackground(new java.awt.Color(255, 51, 153));
        btnPesquisa.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnPesquisa.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisa.setText("Pesquisar");
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });
        btnPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnPesquisaKeyPressed(evt);
            }
        });
        jPanel2.add(btnPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 96, 35));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(51, 0, 153));

        lbOcorrencia.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbOcorrencia.setForeground(new java.awt.Color(204, 204, 204));

        lbUsuario.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lbUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lbUsuario.setText("Usuários Responsaveis(id):");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ocorrêcia(s):");

        lbUsuarios.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbUsuarios.setForeground(new java.awt.Color(204, 204, 204));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Trote(s):");

        lbTrote.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbTrote.setForeground(new java.awt.Color(204, 204, 204));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Mês/Ano:");

        lbData.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbData.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8)
                    .addComponent(jLabel17)
                    .addComponent(lbTrote, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(lbOcorrencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(lbData, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbUsuario)
                    .addComponent(lbUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel18))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbOcorrencia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbData, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(lbUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTrote, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

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
        jPanel2.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 80, 35));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/univs/edu/imagens/backgroundInfoDenunciaNotificacao.jpg"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 430, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new HomePageAdm().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        relatorio();
        limparPesquisa();
    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void btnPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnPesquisaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            relatorio();
            limparPesquisa();

        }
    }//GEN-LAST:event_btnPesquisaKeyPressed

    private void btnVoltarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnVoltarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            new HomePageAdm().setVisible(true);
            dispose();
        }
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
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbOcorrencia;
    private javax.swing.JLabel lbTrote;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JLabel lbUsuarios;
    private javax.swing.JTextField tfPesquisa;
    // End of variables declaration//GEN-END:variables
}
