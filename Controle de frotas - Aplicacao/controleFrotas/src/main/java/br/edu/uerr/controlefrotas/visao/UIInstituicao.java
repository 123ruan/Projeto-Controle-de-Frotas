package br.edu.uerr.controlefrotas.visao;

import br.edu.uerr.controlefrotas.controle.InstituicaoJpaController;
import br.edu.uerr.controlefrotas.modelo.Instituicao;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;


public class UIInstituicao extends javax.swing.JFrame {

    
    public UIInstituicao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        vLogradouro = new javax.swing.JTextField();
        vNumero = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        vBairro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        vResponsavel = new javax.swing.JTextField();
        vFechar = new javax.swing.JButton();
        vCelular = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        vNome = new javax.swing.JTextField();
        vCep = new javax.swing.JFormattedTextField();
        voltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cadastro = new javax.swing.JLabel();
        vLocalidade = new javax.swing.JTextField();
        vSigla = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        vCnpj = new javax.swing.JFormattedTextField();
        vTelefone = new javax.swing.JFormattedTextField();
        vUf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Responsavel:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nome:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cep:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bairro:");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("UF:");

        vFechar.setText("Limpar");
        vFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vFecharActionPerformed(evt);
            }
        });

        try {
            vCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sigla:");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Celular:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cidade:");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Telefone:");

        try {
            vCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Logradouro:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CNPJ:");

        cadastro.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        cadastro.setForeground(new java.awt.Color(255, 255, 255));
        cadastro.setText("Cadastro de Instituiçao");

        vLocalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vLocalidadeActionPerformed(evt);
            }
        });

        vSigla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vSiglaActionPerformed(evt);
            }
        });

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("N.:");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Email:");

        try {
            vCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            vTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jDesktopPane1.setLayer(vLogradouro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(vNumero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(vBairro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(vResponsavel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(vFechar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(vCelular, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(vNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(vCep, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(voltar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(cadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(vLocalidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(vSigla, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(email, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(vCnpj, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(vTelefone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(vUf, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vCep, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vUf))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vNome, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vSigla))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vLocalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(vNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(vTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vCelular))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(cadastro)
                        .addGap(18, 18, 18)
                        .addComponent(voltar))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(vFechar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cadastro)
                    .addComponent(voltar))
                .addGap(16, 16, 16)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(vNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(vSigla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(vCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(vCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(12, 12, 12)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(vBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(vLocalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(vNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(vTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(vCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(vResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vFechar)
                    .addComponent(jButton1))
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

    private void vSiglaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vSiglaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vSiglaActionPerformed

    private void vLocalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vLocalidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vLocalidadeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("br.edu.uerr_controleFrotas_jar_1.0-SNAPSHOTPU");
        InstituicaoJpaController instituicaoJpaController = new InstituicaoJpaController(emf);
        Instituicao i = new Instituicao();

        int erro = 0;
        String msg = "";
        i.setCnpj(vCnpj.getText());
        i.setNome(vNome.getText());
        i.setBairro(vBairro.getText());
        i.setCelular(vCelular.getText());
        i.setTelefone(vTelefone.getText());
        i.setCep(vCep.getText());
        i.setLogradouro(vLogradouro.getText());
        i.setNumero(vNumero.getText());
        i.setLocalidade(vLocalidade.getText());
        i.setUf(vUf.getText());
        i.setResponsavel(vResponsavel.getText());
        i.setSigla(vSigla.getText());
        i.setEmail(email.getText());

        if (i.getNome().isEmpty()) {
            msg = msg + "\n Nome é obrigatorio";
            erro++;
        }
        if (i.getCnpj().isEmpty()) {
            msg = msg + "\n Cnpj é obrigatorio";
            erro++;
        }
        if (erro > 0) {
            JOptionPane.showMessageDialog(null, msg);
            System.out.println("Problemas ao tentar conectar ao banco de dados");
        } else {
            instituicaoJpaController.create(i);
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        new UITela().setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_voltarActionPerformed

    private void vFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vFecharActionPerformed
        vBairro.setText("");
        vCelular.setText("");
        vCep.setText("");
        vCnpj.setText("");
        vLocalidade.setText("");
        vUf.setText("");
        vTelefone.setText("");
        vSigla.setText("");
        vResponsavel.setText("");
        vNumero.setText("");
        vNome.setText("");
        vLogradouro.setText("");
        email.setText("");
    }//GEN-LAST:event_vFecharActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cadastro;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField vBairro;
    private javax.swing.JFormattedTextField vCelular;
    private javax.swing.JFormattedTextField vCep;
    private javax.swing.JFormattedTextField vCnpj;
    private javax.swing.JButton vFechar;
    private javax.swing.JTextField vLocalidade;
    private javax.swing.JTextField vLogradouro;
    private javax.swing.JTextField vNome;
    private javax.swing.JTextField vNumero;
    private javax.swing.JTextField vResponsavel;
    private javax.swing.JTextField vSigla;
    private javax.swing.JFormattedTextField vTelefone;
    private javax.swing.JTextField vUf;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
