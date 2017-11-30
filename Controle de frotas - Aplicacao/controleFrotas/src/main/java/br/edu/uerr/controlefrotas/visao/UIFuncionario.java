package br.edu.uerr.controlefrotas.visao;

import br.edu.uerr.controlefrotas.controle.FuncionarioJpaController;
import br.edu.uerr.controlefrotas.controle.PessoaJpaController;
import br.edu.uerr.controlefrotas.controle.TipoFuncionarioJpaController;
import br.edu.uerr.controlefrotas.modelo.Funcionario;
import br.edu.uerr.controlefrotas.modelo.Pessoa;
import br.edu.uerr.controlefrotas.modelo.TipoFuncionario;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

public class UIFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form UIFuncionario
     */
    public UIFuncionario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jLabel1 = new javax.swing.JLabel();
        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("br.edu.uerr_controleFrotas_jar_1.0-SNAPSHOTPU").createEntityManager();
        pessoaQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM Pessoa p");
        pessoaList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : pessoaQuery.getResultList();
        pessoaQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM Pessoa p");
        pessoaList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : pessoaQuery1.getResultList();
        pessoaQuery2 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM Pessoa p");
        pessoaList2 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : pessoaQuery2.getResultList();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel6 = new javax.swing.JLabel();
        satus = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        vFechar = new javax.swing.JButton();
        conta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        historico = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        cadastro = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        senha = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        data = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        cargo = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        pesquisarpessoa = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        vNome = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        senha1 = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Historico:");

        satus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Espera" }));
        satus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satusActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Conta:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Status:");

        vFechar.setText("Limpar");
        vFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vFecharActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(historico);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Matricula:");

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        cadastro.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        cadastro.setForeground(new java.awt.Color(255, 255, 255));
        cadastro.setText("Cadastro de Funcionário");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Senha:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Data Entrada:");

        try {
            data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cargo:");

        cargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Motorista", "Chefe de setor" }));
        cargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargoActionPerformed(evt);
            }
        });

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, pessoaList2, tabela);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cpf}"));
        columnBinding.setColumnName("Cpf");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        jScrollPane3.setViewportView(tabela);

        pesquisarpessoa.setText("Gerador de Matricula");
        pesquisarpessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarpessoaActionPerformed(evt);
            }
        });

        id.setText("Gerado Automaticamente");

        vNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vNomeActionPerformed(evt);
            }
        });

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Nome:");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Confirmar Senha:");

        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(satus, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(vFechar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(conta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(voltar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(cadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(senha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(data, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(cargo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(pesquisarpessoa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(id, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(vNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(senha1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(senha1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(conta, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(senha))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(satus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(20, 20, 20))
                            .addComponent(cadastro, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(vNome, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(pesquisarpessoa)))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(voltar)
                        .addContainerGap())))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(vFechar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cadastro)
                    .addComponent(voltar))
                .addGap(13, 13, 13)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(conta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(satus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)))
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(senha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(pesquisarpessoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vFechar)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vNomeActionPerformed

    private void pesquisarpessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarpessoaActionPerformed
        // TODO add your handling code here:
        String pesquisar = JOptionPane.showInputDialog("Digite o CPF da Pessoa:");
        if (pesquisar.length() > 0) {
            for (int i = 0; i < tabela.getRowCount(); i++) {
                if (pesquisar.equals(tabela.getValueAt(i, 2))) {
                    vNome.setText(tabela.getValueAt(i, 1).toString());
                    id.setText(tabela.getValueAt(i, 0).toString());
                }
            }
        }
    }//GEN-LAST:event_pesquisarpessoaActionPerformed

    private void cargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargoActionPerformed

    private void dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        new UITela().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        javax.persistence.EntityManagerFactory emf = Persistence.createEntityManagerFactory("br.edu.uerr_controleFrotas_jar_1.0-SNAPSHOTPU");
        FuncionarioJpaController funcionarioJpaController = new FuncionarioJpaController(emf);

        TipoFuncionarioJpaController tipoFuncionarioJpaController = new TipoFuncionarioJpaController((emf));
        PessoaJpaController pessoaJpaController = new PessoaJpaController((emf));
        Funcionario f = new Funcionario();

        int erro = 0;
        String msg = "";
        Date data = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dateFormatada = dateFormat.format(data);

        f.setConta(conta.getText());
        f.setMatricula(id.getText());
        f.setStatus((String) satus.getSelectedItem());
        f.setHistorico(historico.getText());

        List<Pessoa> pessoa_id = new ArrayList<>();
        pessoa_id = pessoaJpaController.findPessoaEntities();
        Pessoa aux = new Pessoa();

        for (Pessoa p : pessoa_id) {
            if (String.valueOf(p.getId()).equals(id.getText())) {
                aux = p;
            }
        }
        f.setPessoaId(aux.getId());

        List<TipoFuncionario> Tipolista = new ArrayList<>();
        Tipolista = tipoFuncionarioJpaController.findTipoFuncionarioEntities();
        TipoFuncionario t = new TipoFuncionario();
        t = Tipolista.get(cargo.getSelectedIndex());
        f.setTipoFuncionarioId(t);

        if (erro > 0) {
            JOptionPane.showMessageDialog(null, msg);
        } else {
            try {
                if (!this.data.getText().isEmpty()) {
                    f.setDataInfo((Date) dateFormat.parse(this.data.getText()));
                    f.setDataIn((Date) dateFormat.parse(this.data.getText()));
                    if (this.senha.getText().equals(this.senha1.getText())) {
                        f.setSenha(senha.getText());
                        funcionarioJpaController.create(f);
                        JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Senhas não conferem!");
                    }
                }
            } catch (Exception e) {
                System.out.println("Problemas ao tentar conectar ao banco de dados");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void vFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vFecharActionPerformed
        id.setText("");
        conta.setText("");
        historico.setText("");
        senha.setText("");
        data.setText("");
    }//GEN-LAST:event_vFecharActionPerformed

    private void satusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_satusActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cadastro;
    private javax.swing.JComboBox<String> cargo;
    private javax.swing.JTextField conta;
    private javax.swing.JFormattedTextField data;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JTextPane historico;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton pesquisarpessoa;
    private java.util.List<br.edu.uerr.controlefrotas.modelo.Pessoa> pessoaList;
    private java.util.List<br.edu.uerr.controlefrotas.modelo.Pessoa> pessoaList1;
    private java.util.List<br.edu.uerr.controlefrotas.modelo.Pessoa> pessoaList2;
    private javax.persistence.Query pessoaQuery;
    private javax.persistence.Query pessoaQuery1;
    private javax.persistence.Query pessoaQuery2;
    private javax.swing.JComboBox<String> satus;
    private javax.swing.JTextField senha;
    private javax.swing.JTextField senha1;
    private javax.swing.JTable tabela;
    private javax.swing.JButton vFechar;
    private javax.swing.JTextField vNome;
    private javax.swing.JButton voltar;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
