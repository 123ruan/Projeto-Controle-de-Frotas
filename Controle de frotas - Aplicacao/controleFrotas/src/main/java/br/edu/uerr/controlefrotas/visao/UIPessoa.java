package br.edu.uerr.controlefrotas.visao;

import br.edu.uerr.controlefrotas.controle.PessoaJpaController;
import br.edu.uerr.controlefrotas.modelo.Pessoa;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

public class UIPessoa extends javax.swing.JFrame {

    public UIPessoa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("br.edu.uerr_controleFrotas_jar_1.0-SNAPSHOTPU").createEntityManager();
        pessoaQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM Pessoa p");
        pessoaList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : pessoaQuery.getResultList();
        pessoaQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM Pessoa p");
        pessoaList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : pessoaQuery1.getResultList();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButton1 = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        jLabel16 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        vCelular = new javax.swing.JTextField();
        vNome = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        vend = new javax.swing.JTextField();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        vCidade = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        vCelular1 = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        vFechar = new javax.swing.JButton();
        vDatanasc = new javax.swing.JFormattedTextField();
        vBairro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        vCep = new javax.swing.JFormattedTextField();
        vEmail = new javax.swing.JTextField();
        vCpf = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        vSexo = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        vTelefone1 = new javax.swing.JFormattedTextField();
        vEndereco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        vRg = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        vNome1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        vNumero1 = new javax.swing.JTextField();
        vUf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 255));

        jButton1.setText("Pesquisar pessoas");
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

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, pessoaList, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${celular}"));
        columnBinding.setColumnName("Celular");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${endereco}"));
        columnBinding.setColumnName("Endereco");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${email}"));
        columnBinding.setColumnName("Email");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cpf}"));
        columnBinding.setColumnName("Cpf");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${sexo}"));
        columnBinding.setColumnName("Sexo");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${datadenascimento}"));
        columnBinding.setColumnName("Datadenascimento");
        columnBinding.setColumnClass(java.util.Date.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(jTable1);

        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(voltar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(voltar))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(voltar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Nome:");

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Endereço:");

        vNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vNomeActionPerformed(evt);
            }
        });

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Celular:");

        jDesktopPane3.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jLabel22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(vCelular, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(vNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jLabel21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(vend, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane3Layout = new javax.swing.GroupLayout(jDesktopPane3);
        jDesktopPane3.setLayout(jDesktopPane3Layout);
        jDesktopPane3Layout.setHorizontalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22))
                .addGap(4, 4, 4)
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vNome, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vend, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jDesktopPane3Layout.setVerticalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel16))
                    .addComponent(vNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel21))
                    .addComponent(vCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel22))
                    .addGroup(jDesktopPane3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(vend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        vCidade.setName("vCidade"); // NOI18N

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Celular:");
        jLabel15.setName("vCelular"); // NOI18N

        try {
            vCelular1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Endereço:");
        jLabel17.setName("vEndereco"); // NOI18N

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Telefone:");
        jLabel12.setName("vTelefone"); // NOI18N

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Email:");
        jLabel13.setName("vEmail"); // NOI18N

        vFechar.setText("Limpar");
        vFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vFecharActionPerformed(evt);
            }
        });

        try {
            vDatanasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        vDatanasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vDatanascActionPerformed(evt);
            }
        });

        vBairro.setName("vBairro"); // NOI18N
        vBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vBairroActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sexo:");

        try {
            vCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        vEmail.setName("vEmail"); // NOI18N

        vCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vCpfActionPerformed(evt);
            }
        });

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("CEP:");
        jLabel19.setName("vCep"); // NOI18N

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("UF:");
        jLabel11.setName("vUf"); // NOI18N

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Data de Nascimento:");

        vSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        vSexo.setAutoscrolls(true);
        vSexo.setName("vSexo"); // NOI18N
        vSexo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                vSexoFocusLost(evt);
            }
        });
        vSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vSexoActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("Cadastro de Pessoas");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("RG:");
        jLabel8.setName("vRg"); // NOI18N

        try {
            vTelefone1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        vEndereco.setName("vEndereco"); // NOI18N

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CPF:");
        jLabel5.setName("vCpf"); // NOI18N

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Bairro:");
        jLabel18.setName("vBairro"); // NOI18N

        vRg.setName("vRg"); // NOI18N

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cidade:");
        jLabel9.setName("vCidade"); // NOI18N

        jButton2.setText("Cadastrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        vNome1.setName("vNome"); // NOI18N
        vNome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vNome1ActionPerformed(evt);
            }
        });

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("N.:");
        jLabel20.setName("vCep"); // NOI18N

        vNumero1.setName("vNumero"); // NOI18N

        vUf.setName("vNumero"); // NOI18N

        jDesktopPane2.setLayer(vCidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(vCelular1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(vFechar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(vDatanasc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(vBairro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(vCep, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(vEmail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(vCpf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(vSexo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(vTelefone1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(vEndereco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(vRg, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(vNome1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(vNumero1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(vUf, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel15))
                                .addGap(0, 7, Short.MAX_VALUE))
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addComponent(vBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                    .addComponent(vCelular1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20)
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                    .addComponent(vTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(vNome1)))
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(vDatanasc, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vUf, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(vFechar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(vCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vRg, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vCep, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabel14))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(vEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vNome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(vDatanasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(vCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(vRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(vSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(vCelular1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(vTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(vEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(vEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(vCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(vBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(vCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel11)
                    .addComponent(vNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(vFechar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDesktopPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jDesktopPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String pesquisarNome = JOptionPane.showInputDialog("Digite um CPF para pequisar:");
        if (pesquisarNome.length() > 0) {
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                if (pesquisarNome.equals(jTable1.getValueAt(i, 5))) {
                    vNome.setText(jTable1.getValueAt(i, 1).toString());
                    vCelular.setText(jTable1.getValueAt(i, 2).toString());
                    vend.setText(jTable1.getValueAt(i, 3).toString());
                }
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        this.dispose();
        new UITela().setVisible(true);
    }//GEN-LAST:event_voltarActionPerformed

    private void vNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vNomeActionPerformed

    private void vNome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vNome1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vNome1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("br.edu.uerr_controleFrotas_jar_1.0-SNAPSHOTPU");
        PessoaJpaController pessoaJpaController = new PessoaJpaController(emf);
        Pessoa pessoa = new Pessoa();

        int erro = 0;
        String msg = "";
        Date data = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dateFormatada = dateFormat.format(data);

        pessoa.setNome(vNome1.getText());
        pessoa.setSexo(vSexo.getSelectedIndex());
        pessoa.setCpf(vCpf.getText());
        pessoa.setBairro(vBairro.getText());
        pessoa.setCelular(vCelular1.getText());
        pessoa.setTelefone(vTelefone1.getText());
        pessoa.setCep(vCep.getText());
        pessoa.setEmail(vEmail.getText());
        pessoa.setCidade(vCidade.getText());
        pessoa.setRg(vRg.getText());
        pessoa.setNumero(vRg.getText());
        pessoa.setEndereco(vEndereco.getText());
        pessoa.setUf(vUf.getText());
        pessoa.setTelefone(vend.getText());

        if (pessoa.getNome().isEmpty()) {
            msg = msg + "Nome é obrigatorio";
            erro++;
        }
        if (pessoa.getCpf().isEmpty()) {
            msg = msg + "\n CPF é obrigatorio";
            erro++;
        }
        if (erro > 0) {
            JOptionPane.showMessageDialog(null, msg);
        } else {
            try {
                if (!vDatanasc.getText().isEmpty()) {
                    pessoa.setDatadenascimento((Date) dateFormat.parse(vDatanasc.getText()));
                }
                pessoaJpaController.create(pessoa);
                JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!");
                this.dispose();
                new UIPessoa().setVisible(true);
            } catch (Exception e) {
                System.out.println("Problemas ao tentar conectar ao banco de dados");
            }

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void vSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vSexoActionPerformed

    private void vCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vCpfActionPerformed

    private void vBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vBairroActionPerformed

    private void vDatanascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vDatanascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vDatanascActionPerformed

    private void vFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vFecharActionPerformed
        vNome.setText("");
        vCpf.setText("");
        vRg.setText("");
        vDatanasc.setText("");
        vCep.setText("");
        vEndereco.setText("");
        vBairro.setText("");
        vCidade.setText("");
        vRg.setText("");
        vUf.setText("");
        vEmail.setText("");
        vCelular.setText("");
        vend.setText("");
    }//GEN-LAST:event_vFecharActionPerformed

    private void vSexoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vSexoFocusLost
        // TODO add your handling code here:
        // System.out.println(vSexo.getSelectedIndex());
    }//GEN-LAST:event_vSexoFocusLost

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.util.List<br.edu.uerr.controlefrotas.modelo.Pessoa> pessoaList;
    private java.util.List<br.edu.uerr.controlefrotas.modelo.Pessoa> pessoaList1;
    private javax.persistence.Query pessoaQuery;
    private javax.persistence.Query pessoaQuery1;
    private javax.swing.JTextField vBairro;
    private javax.swing.JTextField vCelular;
    private javax.swing.JFormattedTextField vCelular1;
    private javax.swing.JFormattedTextField vCep;
    private javax.swing.JTextField vCidade;
    private javax.swing.JTextField vCpf;
    private javax.swing.JFormattedTextField vDatanasc;
    private javax.swing.JTextField vEmail;
    private javax.swing.JTextField vEndereco;
    private javax.swing.JButton vFechar;
    private javax.swing.JTextField vNome;
    private javax.swing.JTextField vNome1;
    private javax.swing.JTextField vNumero1;
    private javax.swing.JTextField vRg;
    private javax.swing.JComboBox<String> vSexo;
    private javax.swing.JFormattedTextField vTelefone1;
    private javax.swing.JTextField vUf;
    private javax.swing.JTextField vend;
    private javax.swing.JButton voltar;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

}
