package br.edu.uerr.controlefrotas.visao;

import br.edu.uerr.controlefrotas.controle.PessoaJpaController;
import br.edu.uerr.controlefrotas.controle.SolicitacoesJpaController;
import br.edu.uerr.controlefrotas.modelo.Pessoa;
import br.edu.uerr.controlefrotas.modelo.Solicitacoes;
import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

public class UIsolicitacao extends javax.swing.JFrame {

    public UIsolicitacao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane3 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        local = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        data = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        cpf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cadastro = new javax.swing.JLabel();
        hora = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        vFechar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(local);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Data Prevista:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CPF do Solicitante:");

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

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Local Desejado:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hora:");

        cadastro.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        cadastro.setForeground(new java.awt.Color(255, 255, 255));
        cadastro.setText("Solicitação de Transporte");

        try {
            hora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaActionPerformed(evt);
            }
        });

        jButton1.setText("Enviar");
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

        vFechar.setText("Limpar");
        vFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vFecharActionPerformed(evt);
            }
        });

        jButton2.setText("Verificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jDesktopPane3.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(data, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(cpf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(cadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(hora, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(voltar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(vFechar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane3Layout = new javax.swing.GroupLayout(jDesktopPane3);
        jDesktopPane3.setLayout(jDesktopPane3Layout);
        jDesktopPane3Layout.setHorizontalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane3Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(cadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(voltar))
                    .addGroup(jDesktopPane3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(vFechar)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1))))
                    .addGroup(jDesktopPane3Layout.createSequentialGroup()
                        .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jDesktopPane3Layout.setVerticalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(voltar)
                    .addComponent(cadastro))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(7, 7, 7)
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel6))
                    .addGroup(jDesktopPane3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(vFechar))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane3)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataActionPerformed

    private void horaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        javax.persistence.EntityManagerFactory emf = Persistence.createEntityManagerFactory("br.edu.uerr_controleFrotas_jar_1.0-SNAPSHOTPU");
        SolicitacoesJpaController solicitacoesJpaController = new SolicitacoesJpaController((emf));
        PessoaJpaController pessoaJpaController = new PessoaJpaController((emf));
        Solicitacoes s = new Solicitacoes();

        int erro = 0;
        String msg = "";
        Date data = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dateFormatada = dateFormat.format(data);

        s.setLocalDestino(local.getText());
        s.setHora(hora.getText());

        if (erro > 0) {
            JOptionPane.showMessageDialog(null, msg);
        } else {
            try {
                if (!this.data.getText().isEmpty()) {
                    s.setData((Date) dateFormat.parse(this.data.getText()));
                }
                solicitacoesJpaController.create(s);
                JOptionPane.showMessageDialog(null, "Enviado para Lista de Espera!");
            } catch (HeadlessException | ParseException e) {
                System.out.println("Problemas ao tentar conectar ao banco de dados");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        new UITela().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void vFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vFecharActionPerformed
        local.setText("");
        hora.setText("");
        cpf.setText("");
        data.setText("");
    }//GEN-LAST:event_vFecharActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        javax.persistence.EntityManagerFactory emf = Persistence.createEntityManagerFactory("br.edu.uerr_controleFrotas_jar_1.0-SNAPSHOTPU");
        PessoaJpaController pessoaJpaController = new PessoaJpaController((emf));

        List<Pessoa> pessoa_id = new ArrayList<>();
        pessoa_id = pessoaJpaController.findPessoaEntities();
        Pessoa aux = new Pessoa();
        Solicitacoes s = new Solicitacoes();

        for (Pessoa p : pessoa_id) {
            if ((p.getCpf()).equals(cpf.getText())) {
                aux = p;
                JOptionPane.showMessageDialog(null, "Nome: " + aux.getNome()
                        + "\nCPF: " + aux.getCpf()
                        + "\nE-mail: " + aux.getEmail());

            }
        }
        s.setPessoaId(aux);


    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cadastro;
    private javax.swing.JTextField cpf;
    private javax.swing.JFormattedTextField data;
    private javax.swing.JFormattedTextField hora;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane local;
    private javax.swing.JButton vFechar;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
