package br.edu.uerr.controlefrotas.visao;

import br.edu.uerr.controlefrotas.controle.FuncionarioJpaController;
import br.edu.uerr.controlefrotas.controle.OrdemServicoJpaController;
import br.edu.uerr.controlefrotas.controle.PessoaJpaController;
import br.edu.uerr.controlefrotas.controle.VeiculoJpaController;
import br.edu.uerr.controlefrotas.modelo.OrdemServico;
import br.edu.uerr.controlefrotas.modelo.Pessoa;
import br.edu.uerr.controlefrotas.modelo.Solicitacoes;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

public class UIOrdemservico extends javax.swing.JFrame {

    public UIOrdemservico() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("br.edu.uerr_controleFrotas_jar_1.0-SNAPSHOTPU").createEntityManager();
        solicitacoesQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT s FROM Solicitacoes s");
        solicitacoesList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : solicitacoesQuery.getResultList();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel7 = new javax.swing.JLabel();
        quilometragemi = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        datas = new javax.swing.JFormattedTextField();
        quilometragem = new javax.swing.JLabel();
        horai = new javax.swing.JFormattedTextField();
        vquilometragemf = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        datae = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        quilometragem1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        horaf = new javax.swing.JFormattedTextField();
        func = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        s = new javax.swing.JTextField();
        tipocombustivel = new javax.swing.JLabel();
        si = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Data Entrada:");

        try {
            quilometragemi.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, solicitacoesList, tabela);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${data}"));
        columnBinding.setColumnName("Data");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${hora}"));
        columnBinding.setColumnName("Hora");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${localDestino}"));
        columnBinding.setColumnName("Local Destino");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        jScrollPane1.setViewportView(tabela);

        try {
            datas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        datas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datasActionPerformed(evt);
            }
        });

        quilometragem.setForeground(new java.awt.Color(255, 255, 255));
        quilometragem.setText("Quilometragem Inicial:");

        try {
            horai.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        horai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaiActionPerformed(evt);
            }
        });

        try {
            vquilometragemf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        try {
            datae.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        datae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataeActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hora Inicial:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hora Final:");

        quilometragem1.setForeground(new java.awt.Color(255, 255, 255));
        quilometragem1.setText("Quilometragem Final:");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Data saida:");

        try {
            horaf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        horaf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horafActionPerformed(evt);
            }
        });

        jButton2.setText("Verificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Funcionario:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Numero Solicitação ");

        tipocombustivel.setForeground(new java.awt.Color(255, 255, 255));
        tipocombustivel.setText("Situação da Ordem ");

        si.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Concluido", "Espera", "Andamento" }));
        si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ordem de Solicitações");

        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(quilometragemi, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(datas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(quilometragem, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(horai, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(vquilometragemf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(datae, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(quilometragem1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(horaf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(func, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(s, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tipocombustivel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(si, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(voltar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tipocombustivel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(si, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(quilometragem)
                                    .addComponent(quilometragem1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vquilometragemf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(datas, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(datae, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(horaf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(horai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(quilometragemi, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(75, 75, 75)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(s, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(func, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(voltar))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(s, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(horai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(func, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(horaf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(datae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(datas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quilometragem)
                    .addComponent(quilometragemi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quilometragem1)
                    .addComponent(vquilometragemf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tipocombustivel)
                        .addComponent(si, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(jDesktopPane1)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        javax.persistence.EntityManagerFactory emf = Persistence.createEntityManagerFactory("br.edu.uerr_controleFrotas_jar_1.0-SNAPSHOTPU");
        OrdemServicoJpaController ordemServicoJpaController = new OrdemServicoJpaController(emf);
        FuncionarioJpaController funcionarioJpaController = new FuncionarioJpaController((emf));
        VeiculoJpaController veiculopaController = new VeiculoJpaController((emf));
        PessoaJpaController pessoaJpaController = new PessoaJpaController((emf));
        OrdemServico o = new OrdemServico();

        int erro = 0;
        String msg = "";
        Date data = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dateFormatada = dateFormat.format(data);

        o.setHoraInicio(horai.getText());
        o.setHoraFinal(horaf.getText());
        o.setKmFinal(quilometragemi.getX());
        o.setKmFinal(vquilometragemf.getX());
        o.setSituacao((String) si.getSelectedItem());

        List<Pessoa> pessoa_id = new ArrayList<>();
        pessoa_id = pessoaJpaController.findPessoaEntities();
        Pessoa aux = new Pessoa();

        for (Pessoa p : pessoa_id) {
            if (String.valueOf(p.getId()).equals(s.getText())) {
                aux = p;
            }
        }
        if (erro > 0) {
            JOptionPane.showMessageDialog(null, msg);
        } else {
            try {
                if (!this.datae.getText().isEmpty()) {
                    o.setDataChegada((Date) dateFormat.parse(this.datae.getText()));
                    o.setDataSaida((Date) dateFormat.parse(this.datas.getText()));

                    ordemServicoJpaController.create(o);
                    JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Senhas não conferem!");
                }

            } catch (Exception e) {
                System.out.println("Problemas ao tentar conectar ao banco de dados");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void dataeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataeActionPerformed

    private void datasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datasActionPerformed

    private void horaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horaiActionPerformed

    private void horafActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horafActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horafActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        javax.persistence.EntityManagerFactory emf = Persistence.createEntityManagerFactory("br.edu.uerr_controleFrotas_jar_1.0-SNAPSHOTPU");
        PessoaJpaController pessoaJpaController = new PessoaJpaController((emf));

        List<Pessoa> pessoa_id = new ArrayList<>();
        pessoa_id = pessoaJpaController.findPessoaEntities();
        Pessoa aux = new Pessoa();
        Solicitacoes s = new Solicitacoes();

        for (Pessoa p : pessoa_id) {
            if ((p.getCpf()).equals(func.getText())) {
                aux = p;

                JOptionPane.showMessageDialog(null, "Nome: " + aux.getNome()
                        + "\nCPF: " + aux.getCpf()
                        + "\nE-mail: " + aux.getEmail());

            }
        }
        s.setPessoaId(aux);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void siActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        // TODO add your handling code here:
        new UITela().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField datae;
    private javax.swing.JFormattedTextField datas;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JTextField func;
    private javax.swing.JFormattedTextField horaf;
    private javax.swing.JFormattedTextField horai;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel quilometragem;
    private javax.swing.JLabel quilometragem1;
    private javax.swing.JFormattedTextField quilometragemi;
    private javax.swing.JTextField s;
    private javax.swing.JComboBox<String> si;
    private java.util.List<br.edu.uerr.controlefrotas.modelo.Solicitacoes> solicitacoesList;
    private javax.persistence.Query solicitacoesQuery;
    private javax.swing.JTable tabela;
    private javax.swing.JLabel tipocombustivel;
    private javax.swing.JButton voltar;
    private javax.swing.JFormattedTextField vquilometragemf;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
