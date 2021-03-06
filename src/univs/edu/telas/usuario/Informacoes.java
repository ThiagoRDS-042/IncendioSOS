/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package univs.edu.telas.usuario;

import java.awt.event.KeyEvent;
import java.util.List;
import univs.edu.bombeiro.CorpoDeBombeiros;
import univs.edu.dao.GenericDAO;
import univs.edu.ibama.Ibama;

/**
 *
 * @author GGrio
 */
public class Informacoes extends javax.swing.JFrame {

    GenericDAO dao = new GenericDAO();

    /**
     * Creates new form Informacoes
     */
    public Informacoes() {
        initComponents();
        addItem();
    }

    public void addItem() {
        if (!rbBombeiro.isSelected() && !rbIbama.isSelected()) {
            cbOrgaos.removeAllItems();
            cbOrgaos.addItem("Sem nada!");
        } else if (rbBombeiro.isSelected()) {

            cbOrgaos.removeAllItems();
            List<CorpoDeBombeiros> bombeiros = dao.listarObjetos("Bombeiro", "Undefined");
            for (CorpoDeBombeiros bombeiro : bombeiros) {
                cbOrgaos.addItem(bombeiro.getCompanhiaBatalhao() + "-" + bombeiro.getCidadeBombeiro() + "/" + bombeiro.getEstadoBombeiro());
            }

        } else if (rbIbama.isSelected()) {

            cbOrgaos.removeAllItems();
            List<Ibama> ibamas = dao.listarObjetos("Ibama", "Undefined");
            for (Ibama ibama : ibamas) {
                cbOrgaos.addItem(ibama.getNomeIbama() + "-" + ibama.getCidadeIbama() + "/" + ibama.getEstadoIbama() + "-" + ibama.getEmailIbama());
            }
        }

    }

    public void exibirInfo() {

        if (cbOrgaos.getSelectedItem() != null) {
            String[] identificacao = cbOrgaos.getSelectedItem().toString().split("-");

            if (identificacao[0].matches("(.*)Cia/(.*)")) {
                CorpoDeBombeiros bombeiro = (CorpoDeBombeiros) dao.pesquisarIdentificacao(identificacao[0]);

                lbCidade.setText(bombeiro.getCidadeBombeiro());
                lbCompanhiaNome.setText(bombeiro.getCompanhiaBatalhao());
                lbEmail.setText(bombeiro.getEmailBombeiro());
                lbEstado.setText(bombeiro.getEstadoBombeiro());
                lbNomeResponsavel.setText(bombeiro.getNomeDoComandante());
                lbRua.setText(bombeiro.getRuaBombeiro());
                lbTelefone.setText(bombeiro.getTelefoneBombeiro());

                lbCnpjTitulo.setText("");
                lbCnpj.setText("");
                lbCompanhia.setText("Companhia/Batalhão:");
                lbComandante.setText("Nome do Comandante:");

            } else if (identificacao.length > 1 && identificacao[2].matches("(.*)@gmail.com(.*)")) {
                Ibama ibama = (Ibama) dao.pesquisarEmail(identificacao[2]);

                lbCompanhia.setText("Nome:");
                lbComandante.setText("Responsável:");
                lbCnpjTitulo.setText("CNPJ:");

                lbCidade.setText(ibama.getCidadeIbama());
                lbCompanhiaNome.setText(ibama.getNomeIbama());
                lbEmail.setText(ibama.getEmailIbama());
                lbEstado.setText(ibama.getEstadoIbama());
                lbNomeResponsavel.setText(ibama.getResponsavelIbama());
                lbRua.setText(ibama.getRuaIbama());
                lbTelefone.setText(ibama.getTelefoneIbama());
                lbCnpj.setText(ibama.getCnpj());

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

        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        rbBombeiro = new javax.swing.JRadioButton();
        rbIbama = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        cbOrgaos = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lbCompanhiaNome = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbCompanhia = new javax.swing.JLabel();
        lbRua = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        lbCidade = new javax.swing.JLabel();
        lbTelefone = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lbEstado = new javax.swing.JLabel();
        lbComandante = new javax.swing.JLabel();
        lbNomeResponsavel = new javax.swing.JLabel();
        lbCnpjTitulo = new javax.swing.JLabel();
        lbCnpj = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Informações");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/univs/edu/imagens/cabecalho.jpg"))); // NOI18N
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(51, 0, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Selecione um Tipo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        rbBombeiro.setBackground(new java.awt.Color(51, 0, 153));
        rbBombeiro.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbBombeiro.setForeground(new java.awt.Color(255, 255, 255));
        rbBombeiro.setText("Corpo de Bombeiros");
        rbBombeiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbBombeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBombeiroActionPerformed(evt);
            }
        });

        rbIbama.setBackground(new java.awt.Color(51, 0, 153));
        rbIbama.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbIbama.setForeground(new java.awt.Color(255, 255, 255));
        rbIbama.setText("Ibama");
        rbIbama.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbIbama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbIbamaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(rbBombeiro)
                .addGap(57, 57, 57)
                .addComponent(rbIbama)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbBombeiro)
                    .addComponent(rbIbama))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        jPanel2.setBackground(new java.awt.Color(51, 0, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Selecione qual Orgão Deseja Obter Informações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        cbOrgaos.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cbOrgaos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbOrgaos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbOrgaos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOrgaosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(cbOrgaos, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbOrgaos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(51, 0, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Informações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        lbCompanhiaNome.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbCompanhiaNome.setForeground(new java.awt.Color(204, 204, 204));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefone:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Endereço(rua):");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cidade:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("E-mail:");

        lbCompanhia.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lbCompanhia.setForeground(new java.awt.Color(255, 255, 255));
        lbCompanhia.setText("Companhia/Batalhão:");

        lbRua.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbRua.setForeground(new java.awt.Color(204, 204, 204));

        lbEmail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbEmail.setForeground(new java.awt.Color(204, 204, 204));

        lbCidade.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbCidade.setForeground(new java.awt.Color(204, 204, 204));

        lbTelefone.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbTelefone.setForeground(new java.awt.Color(204, 204, 204));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Estado:");

        lbEstado.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbEstado.setForeground(new java.awt.Color(204, 204, 204));

        lbComandante.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lbComandante.setForeground(new java.awt.Color(255, 255, 255));
        lbComandante.setText("Nome do Comandante:");

        lbNomeResponsavel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbNomeResponsavel.setForeground(new java.awt.Color(204, 204, 204));

        lbCnpjTitulo.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lbCnpjTitulo.setForeground(new java.awt.Color(255, 255, 255));

        lbCnpj.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbCnpj.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lbEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                        .addComponent(lbCompanhiaNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel17))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(lbNomeResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbComandante)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(lbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(lbRua, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbCnpjTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(lbCompanhia)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCompanhia)
                    .addComponent(lbComandante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbCompanhiaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNomeResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbRua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbCnpjTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        btnVoltar.setBackground(new java.awt.Color(255, 51, 153));
        btnVoltar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
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
        jPanel4.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 620, 80, 35));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/univs/edu/imagens/backgroundInfoDenunciaNotificacao.jpg"))); // NOI18N
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 440, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rbBombeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBombeiroActionPerformed
        rbIbama.setSelected(false);
        addItem();
    }//GEN-LAST:event_rbBombeiroActionPerformed

    private void rbIbamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbIbamaActionPerformed
        rbBombeiro.setSelected(false);
        addItem();
    }//GEN-LAST:event_rbIbamaActionPerformed

    private void cbOrgaosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOrgaosActionPerformed
        exibirInfo();
    }//GEN-LAST:event_cbOrgaosActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new HomePageUsuario().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnVoltarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnVoltarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            new HomePageUsuario().setVisible(true);
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
            java.util.logging.Logger.getLogger(Informacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Informacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Informacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Informacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Informacoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbOrgaos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lbCidade;
    private javax.swing.JLabel lbCnpj;
    private javax.swing.JLabel lbCnpjTitulo;
    private javax.swing.JLabel lbComandante;
    private javax.swing.JLabel lbCompanhia;
    private javax.swing.JLabel lbCompanhiaNome;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbNomeResponsavel;
    private javax.swing.JLabel lbRua;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JRadioButton rbBombeiro;
    private javax.swing.JRadioButton rbIbama;
    // End of variables declaration//GEN-END:variables
}
