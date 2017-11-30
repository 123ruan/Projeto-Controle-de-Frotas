package br.edu.uerr.controlefrotas.visao;

import br.edu.uerr.controlefrotas.controle.FuncionarioJpaController;
import br.edu.uerr.controlefrotas.modelo.Funcionario;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

public class UILogin extends javax.swing.JFrame {

    public UILogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jDesktopPane2 = new javax.swing.JDesktopPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jDesktopPane12 = new javax.swing.JDesktopPane();
        vSenha = new javax.swing.JPasswordField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        vLogin = new javax.swing.JTextField();
        acesso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\Users\\Ruan PC\\Documents\\NetBeansProjects\\controleFrotas\\src\\main\\java\\logo\\Bitmap em CFROTA.jpg")); // NOI18N

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        vSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vSenhaActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(204, 204, 204));
        jLabel35.setText("Usuário");

        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Senha:");

        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Login:");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, vLogin, org.jdesktop.beansbinding.ELProperty.create("${login}"), vLogin, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        acesso.setBackground(new java.awt.Color(255, 255, 255));
        acesso.setText("Acesso");
        acesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acessojButton1ActionPerformed(evt);
            }
        });

        jDesktopPane12.setLayer(vSenha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane12.setLayer(jLabel35, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane12.setLayer(jLabel36, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane12.setLayer(jLabel37, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane12.setLayer(vLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane12.setLayer(acesso, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane12Layout = new javax.swing.GroupLayout(jDesktopPane12);
        jDesktopPane12.setLayout(jDesktopPane12Layout);
        jDesktopPane12Layout.setHorizontalGroup(
            jDesktopPane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jDesktopPane12Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel35))
                    .addGroup(jDesktopPane12Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(vLogin))
                    .addGroup(jDesktopPane12Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(acesso)
                .addGap(54, 54, 54))
        );
        jDesktopPane12Layout.setVerticalGroup(
            jDesktopPane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane12Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(vLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(vSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(acesso)
                .addGap(16, 16, 16))
        );

        jDesktopPane2.setLayer(jDesktopPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jDesktopPane12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDesktopPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void acessojButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acessojButton1ActionPerformed
        javax.persistence.EntityManagerFactory emf = Persistence.createEntityManagerFactory("br.edu.uerr_controleFrotas_jar_1.0-SNAPSHOTPU");
        FuncionarioJpaController funcionarioJpaController = new FuncionarioJpaController(emf);

        List<Funcionario> func_id = new ArrayList<>();
        func_id = funcionarioJpaController.findFuncionarioEntities();

        Integer erro = 0, aux = 0;

        if (erro == 0) {
            if (vLogin.getText().isEmpty() && vSenha.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Insira Usuario e Senha!");
                return;
            }
            if (!vLogin.getText().isEmpty() && !vSenha.getText().isEmpty()) {
                if (vLogin.getText().equals("admin") && vSenha.getText().equals("123")) {
                    JOptionPane.showMessageDialog(null, "Bem vindo, Adminstrador!");
                    new UITela().setVisible(true);
                    this.dispose();
                    return;
                } else {
                    for (Funcionario f : func_id) {
                        if ((f.getConta().equals(vLogin.getText())) && (f.getSenha().equals(vSenha.getText()))) {
                            JOptionPane.showMessageDialog(null, "Bem vindo \nUsuário: " + f.getConta());
                            new UITela().setVisible(true);
                            this.dispose();
                            aux = 0;
                        } else {
                            aux++;
                        }
                    }
                }
            }
        }
        erro++;
        if (erro > 0 && aux != 0) {
            JOptionPane.showMessageDialog(null, "Usuário/Senha Inválidos!");
        }
    }//GEN-LAST:event_acessojButton1ActionPerformed

    private void vSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(UILogin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UILogin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UILogin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UILogin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UILogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acesso;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane12;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JTextField vLogin;
    private javax.swing.JPasswordField vSenha;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
