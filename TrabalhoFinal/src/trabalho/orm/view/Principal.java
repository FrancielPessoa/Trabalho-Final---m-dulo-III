package trabalho.orm.view;


import java.util.List;
import javax.swing.JOptionPane;
import trabalho.orm.dao.EmpresaDAO;
import trabalho.orm.model.Empresa;

public class Principal extends javax.swing.JFrame {
        EmpresaDAO empresaDAO ;
        Empresa seletora ;
        int contadora = 0;

    public Principal() {
        initComponents();
        empresaDAO = new EmpresaDAO();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCNPJ = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        txtCNPJ = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        spnLista = new javax.swing.JScrollPane();
        txaLista = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        lblTamanho = new javax.swing.JLabel();
        txtTamanho = new javax.swing.JTextField();
        lblEmpresa = new javax.swing.JLabel();
        lblMatricula = new javax.swing.JLabel();
        lblCNPJExemplo = new javax.swing.JLabel();
        lblNomeExemplo = new javax.swing.JLabel();
        lblTamanhoExemplo = new javax.swing.JLabel();
        bntFuncionario = new javax.swing.JButton();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setMinimumSize(new java.awt.Dimension(405, 293));
        setResizable(false);
        getContentPane().setLayout(null);

        lblCNPJ.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCNPJ.setForeground(new java.awt.Color(0, 255, 0));
        lblCNPJ.setText("CNPJ: ");
        getContentPane().add(lblCNPJ);
        lblCNPJ.setBounds(10, 59, 33, 14);

        lblNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNome.setForeground(new java.awt.Color(0, 255, 0));
        lblNome.setText("Nome:");
        getContentPane().add(lblNome);
        lblNome.setBounds(10, 108, 35, 14);

        lblEndereco.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblEndereco.setForeground(new java.awt.Color(0, 255, 0));
        lblEndereco.setText("Endereço: ");
        getContentPane().add(lblEndereco);
        lblEndereco.setBounds(8, 149, 58, 14);

        txtCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCNPJActionPerformed(evt);
            }
        });
        getContentPane().add(txtCNPJ);
        txtCNPJ.setBounds(76, 49, 522, 30);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(76, 105, 522, 30);

        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });
        getContentPane().add(txtEndereco);
        txtEndereco.setBounds(76, 143, 520, 30);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(25, 246, 95, 23);

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar);
        btnPesquisar.setBounds(149, 246, 95, 23);

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtualizar);
        btnAtualizar.setBounds(262, 246, 96, 23);

        btnApagar.setText("Apagar");
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });
        getContentPane().add(btnApagar);
        btnApagar.setBounds(376, 246, 95, 23);

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        getContentPane().add(btnListar);
        btnListar.setBounds(261, 439, 105, 23);

        txaLista.setEditable(false);
        txaLista.setColumns(20);
        txaLista.setRows(5);
        spnLista.setViewportView(txaLista);

        getContentPane().add(spnLista);
        spnLista.setBounds(14, 322, 611, 96);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 302, 635, 2);

        lblTamanho.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTamanho.setForeground(new java.awt.Color(0, 255, 0));
        lblTamanho.setText("Tamanho:");
        getContentPane().add(lblTamanho);
        lblTamanho.setBounds(10, 204, 56, 14);

        txtTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTamanhoActionPerformed(evt);
            }
        });
        getContentPane().add(txtTamanho);
        txtTamanho.setBounds(76, 201, 520, 30);

        lblEmpresa.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblEmpresa.setForeground(new java.awt.Color(0, 255, 0));
        lblEmpresa.setText("Empresa");
        getContentPane().add(lblEmpresa);
        lblEmpresa.setBounds(284, 0, 78, 22);

        lblMatricula.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(lblMatricula);
        lblMatricula.setBounds(10, 322, 0, 24);

        lblCNPJExemplo.setForeground(new java.awt.Color(0, 255, 0));
        lblCNPJExemplo.setText("Exemplo de CNPJ: 00.000.000/0000-00");
        getContentPane().add(lblCNPJExemplo);
        lblCNPJExemplo.setBounds(76, 34, 520, 14);

        lblNomeExemplo.setForeground(new java.awt.Color(0, 255, 0));
        lblNomeExemplo.setText("Informe apenas o primeiro nome que deverá iniciar com letra maiúscula.");
        getContentPane().add(lblNomeExemplo);
        lblNomeExemplo.setBounds(76, 85, 520, 14);

        lblTamanhoExemplo.setForeground(new java.awt.Color(0, 255, 0));
        lblTamanhoExemplo.setText("O tamanho da empresa deverá ser GRANDE ou PEQUENA.");
        getContentPane().add(lblTamanhoExemplo);
        lblTamanhoExemplo.setBounds(76, 181, 520, 14);

        bntFuncionario.setText("Add Funcionário");
        bntFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(bntFuncionario);
        bntFuncionario.setBounds(489, 246, 120, 23);

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho/orm/image/002.jpg"))); // NOI18N
        getContentPane().add(lblFundo);
        lblFundo.setBounds(0, 0, 640, 490);

        setSize(new java.awt.Dimension(652, 530));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (txtCNPJ.getText().matches("[0-9]{2}[.| ][0-9]{3}[.| ][0-9]{3}[/| ][0-9]{4}[-| ][0-9]{2}") && txtNome.getText().matches("^[A-Z][a-z]+") && txtTamanho.getText().matches("(?i)pequena|grande")){
        Empresa e = new Empresa(txtCNPJ.getText(),txtNome.getText(),txtEndereco.getText(), txtTamanho.getText());
        empresaDAO.insert(e);
        txaLista.setText("Salvo: " + e);
        }else{
            JOptionPane.showMessageDialog(null, "Você preencheu algum campo errado siga os exemplos acima de cada campo.");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
        String e = txtCNPJ.getText();
        seletora = empresaDAO.select(e);
        txaLista.setText(seletora.toString());
        
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // TODO add your handling code here:
        String lista = ("Empresas cadastradas: \n" );
        List<Empresa> eLista =  empresaDAO.select();
        for (Empresa e : eLista) {
            lista += e + "\n";
        }
        txaLista.setText(lista);
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // TODO add your handling code here:
        if(contadora == 0){
        String eCNPJ = txtCNPJ.getText();
        seletora = empresaDAO.select(eCNPJ);
        txaLista.setText("Mudar: " + seletora + "\npara:");
        txtCNPJ.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnListar.setEnabled(false);
        btnApagar.setEnabled(false);
        btnPesquisar.setEnabled(false);
        contadora++;
        
        }else if(contadora == 1){
        Empresa e = new Empresa(txtCNPJ.getText(),txtNome.getText(),txtEndereco.getText(), txtTamanho.getText());
        txaLista.setText("Mudou: " + seletora + "\npara: " + e);
        empresaDAO.update(e);
        txtCNPJ.setEnabled(true);
        btnApagar.setEnabled(true);
        btnPesquisar.setEnabled(true);
        btnSalvar.setEnabled(true);
        btnListar.setEnabled(true);
        contadora--;
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        // TODO add your handling code here:
        seletora = empresaDAO.select(txtCNPJ.getText());
        empresaDAO.delete(seletora);
        txaLista.setText("Apagou: " + seletora);
    }//GEN-LAST:event_btnApagarActionPerformed

    private void txtTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTamanhoActionPerformed
      
    }//GEN-LAST:event_txtTamanhoActionPerformed

    private void txtCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCNPJActionPerformed
                  
    }//GEN-LAST:event_txtCNPJActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
      
    }//GEN-LAST:event_txtNomeActionPerformed

    private void bntFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntFuncionarioActionPerformed
    Principal2 principal = new Principal2();
    principal.setVisible(true);
    dispose();
    }//GEN-LAST:event_bntFuncionarioActionPerformed

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
       
    }//GEN-LAST:event_txtEnderecoActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntFuncionario;
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCNPJ;
    private javax.swing.JLabel lblCNPJExemplo;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeExemplo;
    private javax.swing.JLabel lblTamanho;
    private javax.swing.JLabel lblTamanhoExemplo;
    private javax.swing.JScrollPane spnLista;
    private javax.swing.JTextArea txaLista;
    private javax.swing.JTextField txtCNPJ;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTamanho;
    // End of variables declaration//GEN-END:variables

    private void JOptionPaneShowMessageDialog(Object object, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
