package br.edu.uerr.controlefrotas.visao;

public class UITela extends javax.swing.JFrame {

    public UITela() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        voltar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        pessoa = new javax.swing.JButton();
        vcadastrarveiculo = new javax.swing.JButton();
        vcadastrarempresa = new javax.swing.JButton();
        vcadastrarfuncionario = new javax.swing.JButton();
        transporte = new javax.swing.JButton();
        ordem = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jButton5.setText("Pesquisar Pessoa");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setAutoscrolls(true);

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        jLayeredPane1.add(voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, -1));

        jButton3.setText("Nova Instituição");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Novo Setor");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        pessoa.setText("Novo e Pesquisa de Pessoa");
        pessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pessoaActionPerformed(evt);
            }
        });

        vcadastrarveiculo.setText("Novo Veiculo");
        vcadastrarveiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vcadastrarveiculoActionPerformed(evt);
            }
        });

        vcadastrarempresa.setText("Nova Empresa");
        vcadastrarempresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vcadastrarempresaActionPerformed(evt);
            }
        });

        vcadastrarfuncionario.setText("Novo Funcionario");
        vcadastrarfuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vcadastrarfuncionarioActionPerformed(evt);
            }
        });

        transporte.setText("Solicitação de Transporte");
        transporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transporteActionPerformed(evt);
            }
        });

        ordem.setText("Ordem de Solicitação");
        ordem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordemActionPerformed(evt);
            }
        });

        jDesktopPane2.setLayer(jLayeredPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(pessoa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(vcadastrarveiculo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(vcadastrarempresa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(vcadastrarfuncionario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(transporte, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(ordem, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ordem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pessoa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vcadastrarveiculo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vcadastrarempresa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vcadastrarfuncionario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(transporte, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pessoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vcadastrarveiculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vcadastrarempresa))
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vcadastrarfuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transporte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ordem)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
        getContentPane().add(filler1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new UIPessoa().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new UIInstituicao().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new UISetor().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void vcadastrarempresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vcadastrarempresaActionPerformed
        new UIEmpresa().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_vcadastrarempresaActionPerformed

    private void vcadastrarveiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vcadastrarveiculoActionPerformed
        new UIVeiculo().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_vcadastrarveiculoActionPerformed

    private void pessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pessoaActionPerformed
        new UIPessoa().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pessoaActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        // TODO add your handling code here:
        new UILogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void vcadastrarfuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vcadastrarfuncionarioActionPerformed
        // TODO add your handling code here:
        new UIFuncionario().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_vcadastrarfuncionarioActionPerformed

    private void transporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transporteActionPerformed
        // TODO add your handling code here:
        new UIsolicitacao().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_transporteActionPerformed

    private void ordemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordemActionPerformed
        // TODO add your handling code here:
        new UIOrdemservico().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ordemActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JButton ordem;
    private javax.swing.JButton pessoa;
    private javax.swing.JButton transporte;
    private javax.swing.JButton vcadastrarempresa;
    private javax.swing.JButton vcadastrarfuncionario;
    private javax.swing.JButton vcadastrarveiculo;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
