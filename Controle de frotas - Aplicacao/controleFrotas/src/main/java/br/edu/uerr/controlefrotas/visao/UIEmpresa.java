package br.edu.uerr.controlefrotas.visao;

import br.edu.uerr.controlefrotas.controle.EmpresaJpaController;
import br.edu.uerr.controlefrotas.modelo.Empresa;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

public class UIEmpresa extends javax.swing.JFrame {

    public UIEmpresa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        vnumero = new javax.swing.JTextField();
        vcontato = new javax.swing.JTextField();
        placa1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        voltar = new javax.swing.JButton();
        vFechar = new javax.swing.JButton();
        quilometragem = new javax.swing.JLabel();
        placa = new javax.swing.JLabel();
        placa2 = new javax.swing.JLabel();
        placa3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cadastro = new javax.swing.JLabel();
        vsalvar = new javax.swing.JButton();
        vCep = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        vrazao = new javax.swing.JTextField();
        renavam = new javax.swing.JLabel();
        vcidade = new javax.swing.JTextField();
        vbairro = new javax.swing.JTextField();
        vendereco = new javax.swing.JTextField();
        vcnpj = new javax.swing.JFormattedTextField();
        vuf = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 0, 0));

        vnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vnumeroActionPerformed(evt);
            }
        });

        vcontato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vcontatoActionPerformed(evt);
            }
        });

        placa1.setBackground(new java.awt.Color(255, 255, 255));
        placa1.setForeground(new java.awt.Color(255, 255, 255));
        placa1.setText("Nome da empresa:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("UF:");

        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        vFechar.setText("Limpar");
        vFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vFecharActionPerformed(evt);
            }
        });

        quilometragem.setForeground(new java.awt.Color(255, 255, 255));
        quilometragem.setText("Contato:");

        placa.setForeground(new java.awt.Color(255, 255, 255));
        placa.setText("Cep:");

        placa2.setForeground(new java.awt.Color(255, 255, 255));
        placa2.setText("Endereço:");

        placa3.setForeground(new java.awt.Color(255, 255, 255));
        placa3.setText("Bairro:");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("N.:");

        cadastro.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        cadastro.setForeground(new java.awt.Color(255, 255, 255));
        cadastro.setText("Cadastro de Empresa");

        vsalvar.setText("Cadastrar");
        vsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vsalvarActionPerformed(evt);
            }
        });

        try {
            vCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cidade:");

        vrazao.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        renavam.setForeground(new java.awt.Color(255, 255, 255));
        renavam.setText("CNPJ:");

        vbairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vbairroActionPerformed(evt);
            }
        });

        try {
            vcnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jDesktopPane1.setLayer(vnumero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(vcontato, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(placa1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(voltar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(vFechar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(quilometragem, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(placa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(placa2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(placa3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(cadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(vsalvar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(vCep, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(vrazao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(renavam, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(vcidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(vbairro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(vendereco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(vcnpj, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(vuf, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(cadastro)
                        .addGap(123, 123, 123)
                        .addComponent(voltar))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(placa1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vrazao, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(placa2)
                        .addGap(4, 4, 4)
                        .addComponent(vendereco, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(quilometragem)
                        .addGap(4, 4, 4)
                        .addComponent(vcontato, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(placa3)
                        .addGap(6, 6, 6)
                        .addComponent(vbairro, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4)
                        .addComponent(vnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(renavam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(vFechar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(vsalvar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(4, 4, 4)
                                .addComponent(vcidade, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vuf, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(placa)
                                .addGap(12, 12, 12)
                                .addComponent(vCep, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltar)
                    .addComponent(cadastro))
                .addGap(11, 11, 11)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vrazao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(placa1)
                            .addComponent(placa2))))
                .addGap(6, 6, 6)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vcontato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quilometragem)
                            .addComponent(placa3)
                            .addComponent(jLabel1))))
                .addGap(9, 9, 9)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(renavam)
                    .addComponent(vcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(vcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(placa)
                    .addComponent(vCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vuf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vsalvar)
                    .addComponent(vFechar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vbairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vbairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vbairroActionPerformed

    private void vsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vsalvarActionPerformed
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("br.edu.uerr_controleFrotas_jar_1.0-SNAPSHOTPU");
        EmpresaJpaController empresaJpaController = new EmpresaJpaController(emf);
        Empresa empresa = new Empresa();

        int erro = 0;
        String msg = "";

        empresa.setBairro(vbairro.getText());
        empresa.setCep(vCep.getText());
        empresa.setRazaoSocial(vrazao.getText());
        empresa.setUf(vuf.getText());
        empresa.setEndereco(vendereco.getText());
        empresa.setContato(vcontato.getText());
        empresa.setCidade(vcidade.getText());
        empresa.setNumero(vnumero.getText());
        empresa.setCnpj(vcnpj.getText());

        if (empresa.getRazaoSocial().isEmpty()) {
            msg = msg + "\n Nome é Obrigatório!";
            erro++;
        }
        if (empresa.getCnpj().isEmpty()) {
            msg = msg + "\n Cnpj é obrigatorio";
            erro++;
        } else {
        }
        if (erro > 0) {
            JOptionPane.showMessageDialog(null, msg);
            System.out.println("Problemas ao tentar conectar ao banco de dados");
        } else {
            empresaJpaController.create(empresa);
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        }
    }//GEN-LAST:event_vsalvarActionPerformed

    private void vFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vFecharActionPerformed
        vbairro.setText("");
        vCep.setText("");
        vcidade.setText("");
        vcnpj.setText("");
        vcontato.setText("");
        vendereco.setText("");
        vnumero.setText("");
        vrazao.setText("");
        vuf.setText("");
    }//GEN-LAST:event_vFecharActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        new UITela().setVisible(true);
        this.dispose();
        //UIMenu menu = new UIMenu();
        //menu.setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void vcontatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vcontatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vcontatoActionPerformed

    private void vnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vnumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vnumeroActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cadastro;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel placa;
    private javax.swing.JLabel placa1;
    private javax.swing.JLabel placa2;
    private javax.swing.JLabel placa3;
    private javax.swing.JLabel quilometragem;
    private javax.swing.JLabel renavam;
    private javax.swing.JFormattedTextField vCep;
    private javax.swing.JButton vFechar;
    private javax.swing.JTextField vbairro;
    private javax.swing.JTextField vcidade;
    private javax.swing.JFormattedTextField vcnpj;
    private javax.swing.JTextField vcontato;
    private javax.swing.JTextField vendereco;
    private javax.swing.JTextField vnumero;
    private javax.swing.JButton voltar;
    private javax.swing.JTextField vrazao;
    private javax.swing.JButton vsalvar;
    private javax.swing.JTextField vuf;
    // End of variables declaration//GEN-END:variables

}
