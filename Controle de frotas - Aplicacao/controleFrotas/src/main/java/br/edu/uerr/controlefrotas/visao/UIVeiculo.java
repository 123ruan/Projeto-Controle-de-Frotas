package br.edu.uerr.controlefrotas.visao;

import br.edu.uerr.controlefrotas.controle.VeiculoJpaController;
import br.edu.uerr.controlefrotas.modelo.Veiculo;
import java.util.Date;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

public class UIVeiculo extends javax.swing.JFrame {

    public UIVeiculo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        vmodelo = new javax.swing.JTextField();
        vsalvar = new javax.swing.JButton();
        quilometragem = new javax.swing.JLabel();
        limpar = new javax.swing.JButton();
        placa = new javax.swing.JLabel();
        tipocombustivel = new javax.swing.JLabel();
        renavam = new javax.swing.JLabel();
        voltar = new javax.swing.JButton();
        cadastro = new javax.swing.JLabel();
        vplaca1 = new javax.swing.JTextField();
        vtipocombustivel = new javax.swing.JComboBox<>();
        modelo = new javax.swing.JLabel();
        vrenavam1 = new javax.swing.JTextField();
        vquilometragem = new javax.swing.JFormattedTextField();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        vmodelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vmodeloActionPerformed(evt);
            }
        });

        vsalvar.setText("Cadastrar");
        vsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vsalvarActionPerformed(evt);
            }
        });

        quilometragem.setForeground(new java.awt.Color(255, 255, 255));
        quilometragem.setText("Quilometragem:");

        limpar.setText("Limpar");
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });

        placa.setForeground(new java.awt.Color(255, 255, 255));
        placa.setText("Placa:");

        tipocombustivel.setForeground(new java.awt.Color(255, 255, 255));
        tipocombustivel.setText("Tipo de combustivel:");

        renavam.setForeground(new java.awt.Color(255, 255, 255));
        renavam.setText("Renavam:");

        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        cadastro.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        cadastro.setForeground(new java.awt.Color(255, 255, 255));
        cadastro.setText("Cadastro de Veiculo");

        vplaca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vplaca1ActionPerformed(evt);
            }
        });

        vtipocombustivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diesel", "Gasolina", "Diesel s10", "Etanol", "Aditivada" }));
        vtipocombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vtipocombustivelActionPerformed(evt);
            }
        });

        modelo.setForeground(new java.awt.Color(255, 255, 255));
        modelo.setText("Modelo:");

        vrenavam1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vrenavam1ActionPerformed(evt);
            }
        });

        try {
            vquilometragem.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        vquilometragem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vquilometragemActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(vmodelo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(vsalvar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(quilometragem, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(limpar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(placa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tipocombustivel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(renavam, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(voltar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(cadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(vplaca1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(vtipocombustivel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(modelo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(vrenavam1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(vquilometragem, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(modelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(0, 6, Short.MAX_VALUE)
                                .addComponent(cadastro)
                                .addGap(18, 18, 18)
                                .addComponent(voltar))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(vmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(placa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vplaca1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(renavam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vrenavam1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tipocombustivel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(vtipocombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(limpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(vsalvar))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(quilometragem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(vquilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cadastro)
                    .addComponent(voltar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modelo)
                    .addComponent(vmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(placa)
                    .addComponent(vplaca1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(renavam)
                    .addComponent(vtipocombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vrenavam1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipocombustivel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quilometragem)
                    .addComponent(vquilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vsalvar)
                    .addComponent(limpar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vtipocombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vtipocombustivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vtipocombustivelActionPerformed

    private void vmodeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vmodeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vmodeloActionPerformed

    private void vplaca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vplaca1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vplaca1ActionPerformed

    private void vsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vsalvarActionPerformed
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("br.edu.uerr_controleFrotas_jar_1.0-SNAPSHOTPU");
        VeiculoJpaController veiculoJpaController = new VeiculoJpaController(emf);
        Veiculo veiculo = new Veiculo();

        int erro = 0;
        String msg = "";

        veiculo.setModelo(vmodelo.getText());
        veiculo.setPlaca(vplaca1.getText());
        veiculo.setRenavam(vrenavam1.getText());
        veiculo.setTipoCombustivel((String) vtipocombustivel.getSelectedItem());
        veiculo.setQuilometragem(vquilometragem.getFocusLostBehavior());

        if (veiculo.getRenavam().isEmpty()) {
            msg = msg + "\n Renavam é Obrigatório!";
            erro++;

        } else {
            try {
                veiculoJpaController.create(veiculo);
                JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!");
            } catch (Exception e) {
                System.out.println("Problemas ao tentar conectar ao banco de dados");
            }
        }
    }//GEN-LAST:event_vsalvarActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        this.dispose();
        new UITela().setVisible(true);
    }//GEN-LAST:event_voltarActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
        vmodelo.setText("");
        vrenavam1.setText("");
        vquilometragem.setText("");
        vplaca1.setText("");
        
    }//GEN-LAST:event_limparActionPerformed

    private void vrenavam1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vrenavam1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vrenavam1ActionPerformed

    private void vquilometragemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vquilometragemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vquilometragemActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cadastro;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpar;
    private javax.swing.JLabel modelo;
    private javax.swing.JLabel placa;
    private javax.swing.JLabel quilometragem;
    private javax.swing.JLabel renavam;
    private javax.swing.JLabel tipocombustivel;
    private javax.swing.JTextField vmodelo;
    private javax.swing.JButton voltar;
    private javax.swing.JTextField vplaca1;
    private javax.swing.JFormattedTextField vquilometragem;
    private javax.swing.JTextField vrenavam1;
    private javax.swing.JButton vsalvar;
    private javax.swing.JComboBox<String> vtipocombustivel;
    // End of variables declaration//GEN-END:variables

}
