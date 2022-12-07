/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import classes.Cliente;
import classes.Endereco;

/**
 *
 * @author guilherme.miranda1
 */
public class FCadastroConta extends javax.swing.JFrame {

    Cliente cliente = null;
    Endereco endereco = null;

    /**
     * Creates new form FCadastroConta
     */
    public FCadastroConta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTxtCNome = new javax.swing.JLabel();
        jCampoCNome = new javax.swing.JTextField();
        jTxtCCPF = new javax.swing.JLabel();
        jTxtCFone = new javax.swing.JLabel();
        jTxtCDataNasc = new javax.swing.JLabel();
        jCampoCEmail = new javax.swing.JTextField();
        jTxtCEmail = new javax.swing.JLabel();
        jTxtCSexo = new javax.swing.JLabel();
        jBoxCSexo = new javax.swing.JComboBox<>();
        jCampoCFone = new javax.swing.JTextField();
        jCampoCDataNasc = new javax.swing.JFormattedTextField();
        JCampoCadCPF = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jTxtCUF = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jCampoCidade = new javax.swing.JTextField();
        jCampoCRua = new javax.swing.JTextField();
        jTxtCRua = new javax.swing.JLabel();
        jCampoCCEP = new javax.swing.JTextField();
        jTxtCCEP = new javax.swing.JLabel();
        jTxtCNum = new javax.swing.JLabel();
        jCampoCNum = new javax.swing.JTextField();
        jBoxCUF = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jBotCCadastrar = new javax.swing.JButton();
        jCampoCSenha = new javax.swing.JPasswordField();
        jTxtCSenha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(390, 600));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro Social"));

        jTxtCNome.setText("Nome:");

        jCampoCNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCampoCNomeActionPerformed(evt);
            }
        });

        jTxtCCPF.setText("CPF:");

        jTxtCFone.setText("Telefone:");

        jTxtCDataNasc.setText("Data Nascimento:");

        jCampoCEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCampoCEmailActionPerformed(evt);
            }
        });

        jTxtCEmail.setText("E-mail:");

        jTxtCSexo.setText("Sexo");

        jBoxCSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Não Informar" }));
        jBoxCSexo.setSelectedIndex(2);
        jBoxCSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBoxCSexoActionPerformed(evt);
            }
        });

        jCampoCFone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCampoCFoneActionPerformed(evt);
            }
        });

        try {
            jCampoCDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jCampoCDataNasc.setToolTipText("");

        try {
            JCampoCadCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTxtCEmail)
                        .addGap(23, 23, 23)
                        .addComponent(jCampoCEmail))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTxtCNome)
                        .addGap(24, 24, 24)
                        .addComponent(jCampoCNome))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTxtCDataNasc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCampoCDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTxtCSexo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTxtCFone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCampoCFone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTxtCCPF)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JCampoCadCPF)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBoxCSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtCNome)
                    .addComponent(jCampoCNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtCFone)
                    .addComponent(jTxtCCPF)
                    .addComponent(jCampoCFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCampoCadCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtCDataNasc)
                    .addComponent(jTxtCSexo)
                    .addComponent(jBoxCSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCampoCDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCampoCEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtCEmail))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jCampoCNome.getAccessibleContext().setAccessibleName("jtxtCNome");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        jTxtCUF.setText("Estado:");

        jLabel8.setText("Cidade:");

        jCampoCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCampoCidadeActionPerformed(evt);
            }
        });

        jCampoCRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCampoCRuaActionPerformed(evt);
            }
        });

        jTxtCRua.setText("Rua:");

        jCampoCCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCampoCCEPActionPerformed(evt);
            }
        });

        jTxtCCEP.setText("CEP:");

        jTxtCNum.setText("Nº:");

        jCampoCNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCampoCNumActionPerformed(evt);
            }
        });

        jBoxCUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "BA ", "CE ", "DE", "ES ", "GO ", "MA", "MT", "MS ", "MG ", "PA ", "PB ", "PR ", "PE ", "PI ", "RJ ", "RS ", "RO ", "SC ", "SP ", "SE ", "TO" }));
        jBoxCUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBoxCUFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jTxtCCEP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(jCampoCCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jTxtCRua)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCampoCRua, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTxtCNum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCampoCNum, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTxtCUF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBoxCUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCampoCidade)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtCUF)
                    .addComponent(jBoxCUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jCampoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtCRua)
                    .addComponent(jCampoCRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtCNum)
                    .addComponent(jCampoCNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCampoCCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtCCEP))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel12.setText("Cadastro de Usuario");

        jBotCCadastrar.setText("Cadastrar");
        jBotCCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotCCadastrarActionPerformed(evt);
            }
        });

        jTxtCSenha.setText("Senha:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jBotCCadastrar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jTxtCSenha)
                        .addGap(18, 18, 18)
                        .addComponent(jCampoCSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel12)
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCampoCSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtCSenha))
                .addGap(18, 18, 18)
                .addComponent(jBotCCadastrar)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCampoCNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCampoCNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCampoCNomeActionPerformed

    private void jCampoCEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCampoCEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCampoCEmailActionPerformed

    private void jBoxCUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBoxCUFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBoxCUFActionPerformed

    private void jCampoCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCampoCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCampoCidadeActionPerformed

    private void jCampoCRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCampoCRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCampoCRuaActionPerformed

    private void jCampoCCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCampoCCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCampoCCEPActionPerformed

    private void jCampoCNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCampoCNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCampoCNumActionPerformed

    private void jBoxCSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBoxCSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBoxCSexoActionPerformed

    private void jCampoCFoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCampoCFoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCampoCFoneActionPerformed

    private void jBotCCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotCCadastrarActionPerformed
        // Salva as informações no Getters and Setters
        cliente.setNome(jCampoCNome.getText());
        cliente.setCpf(JCampoCadCPF.getText());
        
        // *VERIFICAR* String datacriacao = datacriacao.setDataNasc(jCampoCDataNasc.getText());
        cliente.setSexo((String) jBoxCSexo.getSelectedItem());
        cliente.setTelefone(jCampoCFone.getText());
        cliente.setEmail(jCampoCEmail.getText());
        // Salva as informações de endereço no Getters and Setters
        endereco.setEstado((String) jBoxCUF.getSelectedItem());
        endereco.setCidade(jCampoCidade.getText());
        endereco.setRua(jCampoCRua.getText());
        endereco.setNumRua(jCampoCNum.getText());
        endereco.setCep(jCampoCCEP.getText());

        FLogin ViewLogin = new FLogin();
        ViewLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBotCCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(FCadastroConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FCadastroConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FCadastroConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FCadastroConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FCadastroConta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JFormattedTextField JCampoCadCPF;
    public javax.swing.JButton jBotCCadastrar;
    public javax.swing.JComboBox<String> jBoxCSexo;
    public javax.swing.JComboBox<String> jBoxCUF;
    public javax.swing.JTextField jCampoCCEP;
    public javax.swing.JFormattedTextField jCampoCDataNasc;
    public javax.swing.JTextField jCampoCEmail;
    public javax.swing.JTextField jCampoCFone;
    public javax.swing.JTextField jCampoCNome;
    public javax.swing.JTextField jCampoCNum;
    public javax.swing.JTextField jCampoCRua;
    public javax.swing.JPasswordField jCampoCSenha;
    public javax.swing.JTextField jCampoCidade;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jTxtCCEP;
    private javax.swing.JLabel jTxtCCPF;
    private javax.swing.JLabel jTxtCDataNasc;
    private javax.swing.JLabel jTxtCEmail;
    private javax.swing.JLabel jTxtCFone;
    private javax.swing.JLabel jTxtCNome;
    private javax.swing.JLabel jTxtCNum;
    private javax.swing.JLabel jTxtCRua;
    private javax.swing.JLabel jTxtCSenha;
    private javax.swing.JLabel jTxtCSexo;
    private javax.swing.JLabel jTxtCUF;
    // End of variables declaration//GEN-END:variables
}
