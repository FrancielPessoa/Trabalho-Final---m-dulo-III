package trabalho.orm.view;

import java.util.List;
import javax.swing.JOptionPane;
import trabalho.orm.dao.FuncionarioDAO;
import trabalho.orm.model.Funcionario;

/**
 *
 * @author Franciel Pessoa
 */
public class Principal2 extends javax.swing.JFrame {
     FuncionarioDAO funcionarioDAO ;
     Funcionario seletora ;
     int contadora = 0;

    public Principal2() {
        initComponents();
        funcionarioDAO = new FuncionarioDAO();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        lblFuncionario = new javax.swing.JLabel();
        lblMatricula = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblFuncao = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtFuncao = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        bntSalvar = new javax.swing.JButton();
        bntPesquisar = new javax.swing.JButton();
        bntAtualizar = new javax.swing.JButton();
        bntApagar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaLista = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        bntListar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblFUndo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblFuncionario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFuncionario.setForeground(new java.awt.Color(0, 255, 0));
        lblFuncionario.setText("Funcionário");
        getContentPane().add(lblFuncionario);
        lblFuncionario.setBounds(230, 10, 107, 22);

        lblMatricula.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMatricula.setForeground(new java.awt.Color(0, 255, 0));
        lblMatricula.setText("Matricula:");
        getContentPane().add(lblMatricula);
        lblMatricula.setBounds(20, 70, 56, 14);

        lblNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNome.setForeground(new java.awt.Color(0, 255, 0));
        lblNome.setText("Nome:");
        getContentPane().add(lblNome);
        lblNome.setBounds(20, 130, 35, 14);

        lblFuncao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFuncao.setForeground(new java.awt.Color(0, 255, 0));
        lblFuncao.setText("Função:");
        getContentPane().add(lblFuncao);
        lblFuncao.setBounds(20, 180, 43, 14);

        lblEndereco.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblEndereco.setForeground(new java.awt.Color(0, 255, 0));
        lblEndereco.setText("Endereço:");
        getContentPane().add(lblEndereco);
        lblEndereco.setBounds(20, 240, 55, 14);

        txtMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculaActionPerformed(evt);
            }
        });
        getContentPane().add(txtMatricula);
        txtMatricula.setBounds(80, 60, 413, 30);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(70, 120, 414, 30);

        txtFuncao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFuncaoActionPerformed(evt);
            }
        });
        getContentPane().add(txtFuncao);
        txtFuncao.setBounds(90, 180, 414, 30);

        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });
        getContentPane().add(txtEndereco);
        txtEndereco.setBounds(90, 230, 414, 30);

        bntSalvar.setText("Salvar");
        bntSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(bntSalvar);
        bntSalvar.setBounds(30, 290, 63, 23);

        bntPesquisar.setText("Pesquisar");
        bntPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(bntPesquisar);
        bntPesquisar.setBounds(120, 290, 100, 23);

        bntAtualizar.setText("Atualizar");
        bntAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(bntAtualizar);
        bntAtualizar.setBounds(250, 290, 75, 23);

        bntApagar.setText("Apagar");
        bntApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntApagarActionPerformed(evt);
            }
        });
        getContentPane().add(bntApagar);
        bntApagar.setBounds(350, 290, 67, 23);

        txaLista.setColumns(20);
        txaLista.setRows(5);
        jScrollPane1.setViewportView(txaLista);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 330, 483, 107);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(5, 450, 560, 10);

        bntListar.setText("Listar");
        bntListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntListarActionPerformed(evt);
            }
        });
        getContentPane().add(bntListar);
        bntListar.setBounds(460, 290, 70, 23);

        jLabel1.setForeground(new java.awt.Color(0, 255, 0));
        jLabel1.setText("- A matrícula será composta por no mínimo 8 caracteres, não possuindo caracteres especiais.");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 40, 550, 14);

        jLabel2.setForeground(new java.awt.Color(0, 255, 0));
        jLabel2.setText("- Informe apenas o primeiro nome que deverá iniciar com letra maiúscula. ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 90, 500, 20);

        jLabel3.setForeground(new java.awt.Color(0, 255, 0));
        jLabel3.setText("- O funcionário poderá exercer a função de VENDEDOR, MOTORISTA e VIGILANTE.");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 160, 540, 14);

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(230, 460, 73, 23);

        lblFUndo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho/orm/image/001.jpg"))); // NOI18N
        getContentPane().add(lblFUndo);
        lblFUndo.setBounds(0, 0, 570, 490);

        setSize(new java.awt.Dimension(581, 528));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaActionPerformed
       
    }//GEN-LAST:event_txtMatriculaActionPerformed

    private void bntSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSalvarActionPerformed
        if (txtMatricula.getText().matches("\\w{8,}") && txtNome.getText().matches("^[A-Z][a-z]+") && txtFuncao.getText().matches("(?i)vendedor|motorista|vigilante")) {
            Funcionario f = new Funcionario(txtMatricula.getText(),txtNome.getText(),txtFuncao.getText(), txtEndereco.getText());
            funcionarioDAO.insert(f);
            txaLista.setText("Salvo: " + f);
        } else {
            JOptionPane.showMessageDialog(null, "Você preencheu algum campo errado siga os exemplos acima de cada campo.");
        }
        
    }//GEN-LAST:event_bntSalvarActionPerformed

    private void bntPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntPesquisarActionPerformed
        String f = txtMatricula.getText();
        seletora = funcionarioDAO.select(f);
        txaLista.setText(seletora.toString());
    }//GEN-LAST:event_bntPesquisarActionPerformed

    private void bntAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAtualizarActionPerformed
         if(contadora == 0){
        String fMatricula = txtMatricula.getText();
        seletora = funcionarioDAO.select(fMatricula);
        txaLista.setText("Mudar: " + seletora + "\npara:");
        txtMatricula.setEnabled(false);
        bntSalvar.setEnabled(false);
        bntPesquisar.setEnabled(false);
        bntApagar.setEnabled(false);
        bntPesquisar.setEnabled(false);
        contadora++;
        
        }else if(contadora == 1){
        Funcionario f = new Funcionario(txtMatricula.getText(),txtNome.getText(),txtFuncao.getText(), txtEndereco.getText());
        txaLista.setText("Mudou: " + seletora + "\npara: " + f);
        funcionarioDAO.update(f);
        txtMatricula.setEnabled(true);
        bntApagar.setEnabled(true);
        bntPesquisar.setEnabled(true);
        bntSalvar.setEnabled(true);
        bntListar.setEnabled(true);
        contadora--;
        }
    }//GEN-LAST:event_bntAtualizarActionPerformed

    private void bntApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntApagarActionPerformed
        seletora = funcionarioDAO.select(txtMatricula.getText());
        funcionarioDAO.delete(seletora);
        txaLista.setText("Apagou: " + seletora);
    }//GEN-LAST:event_bntApagarActionPerformed

    private void bntListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntListarActionPerformed
        String lista = ("Funcionários cadastrados: \n" );
        List<Funcionario> fLista =  funcionarioDAO.select();
        for (Funcionario f : fLista) {
            lista += f + "\n";
        }
        txaLista.setText(lista);
    }//GEN-LAST:event_bntListarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
       
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtFuncaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFuncaoActionPerformed
        
    }//GEN-LAST:event_txtFuncaoActionPerformed

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        
    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Principal principal = new Principal();
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntApagar;
    private javax.swing.JButton bntAtualizar;
    private javax.swing.JButton bntListar;
    private javax.swing.JButton bntPesquisar;
    private javax.swing.JButton bntSalvar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblFUndo;
    private javax.swing.JLabel lblFuncao;
    private javax.swing.JLabel lblFuncionario;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTextArea txaLista;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtFuncao;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

}
