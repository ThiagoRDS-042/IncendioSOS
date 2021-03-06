/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package univs.edu.telas.menuPrincipal;

import univs.edu.telas.login.GenericLogin;

/**
 *
 * @author GGrio
 */
public class MenuPrincipal extends javax.swing.JFrame {

    public static boolean prevencao;
    public static boolean ajuda;

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        carregarInfo();
    }

    public void carregarInfo() {
        if (prevencao == true) {
            jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            lbTitulo1.setLocation(110, 10);
            lbTitulo1.setFont(new java.awt.Font("Times New Roman", 0, 20));
            lbTitulo1.setText("Dicas de Prenvenção");
            
            lbLogo.setIcon(null);

            lbTexto.setText("<html><ul><li>Em hipóteses alguma, armazene líquidos inflamáveis próximos a fontes de calor;<li>Manter fósforos e isqueiros fora do alcance das crianças;<li>Ao abandonar uma fogueira, apagar com água ou terra;<li>Sempre capinar em volta e tirar o mato do local onde for fazer uma fogueira ou colocar velas;<li>O Ibama alerta: provocar incêndios sem autorização é crime ambiental! A pena prevista é de reclusão, de dois a quatro anos, e multa (Lei nº 9.605/98 e Decreto nº 6.514/08);<li>Em caso de incêndios dolosos, em áreas urbanas, ligue para a polícia: 190.</ul>");
            jLabel2.setIcon(null);

            lbVoltar.setText("Voltar");
            lbVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/univs/edu/imagens/iconSetaVoltar.png")));
            lbVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            lbVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    if (prevencao == true) {
                        prevencao = false;
                        ajuda = false;
                    } else if (ajuda == true) {
                        prevencao = true;
                        ajuda = false;
                    }
                    new MenuPrincipal().setVisible(true);
                    dispose();
                }
            });

        } else if (ajuda == true) {
            jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            lbTitulo1.setLocation(110, 30);
            lbTitulo1.setFont(new java.awt.Font("Times New Roman", 0, 20));
            lbTitulo1.setText("  Sobre o Sistema");
            
            lbLogo.setIcon(null);

            lbTexto.setText("<html><ul>O Incêndio S.O.S é um sistema de dicas de prevenção e denuncia, utilizado por órgãos do governo para combater e prevenir incêndios. O aplicativo permitir que o usuário (Delator), cadastrado, denuncie incêndios e queimadas para as entidades responsáveis (Corpo de Bombeiros ou IBAMA). Além disso, as entidades cadastradas, obtêm as informações das queixas para tomar as devidas providencias.");
            jLabel2.setIcon(null);

            lbVoltar.setText("Voltar");
            lbVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/univs/edu/imagens/iconSetaVoltar.png")));
            lbVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            lbVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    if (prevencao == true) {
                        prevencao = false;
                        ajuda = false;
                    } else if (ajuda == true) {
                        prevencao = true;
                        ajuda = false;
                    }
                    new MenuPrincipal().setVisible(true);
                    dispose();
                }
            });
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
        lbAvancar = new javax.swing.JLabel();
        lbTitulo1 = new javax.swing.JLabel();
        lbVoltar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbLogo = new javax.swing.JLabel();
        lbTexto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu = new javax.swing.JMenu();
        mnSobre = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbAvancar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbAvancar.setForeground(new java.awt.Color(255, 255, 255));
        lbAvancar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAvancar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/univs/edu/imagens/iconSetaAvancar.png"))); // NOI18N
        lbAvancar.setText("Avançar");
        lbAvancar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbAvancar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbAvancar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAvancarMouseClicked(evt);
            }
        });
        jPanel1.add(lbAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 100, 30));

        lbTitulo1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo1.setText("  Bem Vindo!");
        jPanel1.add(lbTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 180, 30));

        lbVoltar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbVoltar.setForeground(new java.awt.Color(255, 255, 255));
        lbVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lbVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 100, 30));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 200, 60));

        lbLogo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbLogo.setForeground(new java.awt.Color(255, 255, 255));
        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/univs/edu/imagens/logo.png"))); // NOI18N
        jPanel1.add(lbLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 200, 162));

        lbTexto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbTexto.setForeground(new java.awt.Color(255, 255, 255));
        lbTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 330, 260));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/univs/edu/imagens/backgroundMenu.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 370, 370));

        jMenu1.setBackground(new java.awt.Color(0, 0, 0, 0));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/univs/edu/imagens/iconLogo.png"))); // NOI18N
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu3.setBackground(new java.awt.Color(0, 0, 0, 0));
        jMenu3.setMargin(new java.awt.Insets(0, 140, 0, 0));
        jMenuBar1.add(jMenu3);

        jMenu.setText("Dicas de prevenção");
        jMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu);

        mnSobre.setText("Sobre");
        mnSobre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnSobre.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        mnSobre.setMargin(new java.awt.Insets(5, 10, 5, 0));
        mnSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnSobreMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnSobre);

        jMenu4.setText("Login");
        jMenu4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jMenu4.setMargin(new java.awt.Insets(0, 10, 0, 0));
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbAvancarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAvancarMouseClicked
        if (prevencao == false && ajuda == false) {
            prevencao = true;
            ajuda = false;
            new MenuPrincipal().setVisible(true);
            dispose();
        } else if (prevencao == true) {
            prevencao = false;
            ajuda = true;
            new MenuPrincipal().setVisible(true);
            dispose();
        } else if (ajuda == true) {
            new GenericLogin().setVisible(true);
            dispose();
        }

    }//GEN-LAST:event_lbAvancarMouseClicked

    private void jMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuMouseClicked
        prevencao = true;
        ajuda = false;
        new MenuPrincipal().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuMouseClicked

    private void mnSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnSobreMouseClicked
        ajuda = true;
        prevencao = false;
        new MenuPrincipal().setVisible(true);
        dispose();
    }//GEN-LAST:event_mnSobreMouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        new GenericLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        ajuda = false;
        prevencao = false;
        new MenuPrincipal().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbAvancar;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbTexto;
    private javax.swing.JLabel lbTitulo1;
    private javax.swing.JLabel lbVoltar;
    private javax.swing.JMenu mnSobre;
    // End of variables declaration//GEN-END:variables
}
