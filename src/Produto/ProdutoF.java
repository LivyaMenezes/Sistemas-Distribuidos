/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produto;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dácio Alves
 */
public class ProdutoF extends javax.swing.JFrame {

    /**
     * Creates new form BebidaF
     */
    //ArrayList<Bebida> bebidas = new ArrayList<Bebida>();
     
    

        private void novoCadastro(){
            

        Produto b1 = new Produto();

        //preencherObjeto(b1);

          //Pecas peca = new Pecas();
       // AplicarException aplicEx = new AplicarException();
       // PecasException excepPecas = new PecasException();
        
        //b1.setCodigo(tf_codigo.getText());
        b1.setNomeProduto(nomeBebida.getText());
        b1.setQuantidadeProduto(Integer.parseInt(quantidadeBebida.getText()));
        b1.setValorProduto(Double.parseDouble(valorBebida.getText()));
        
        
        
            ProdutoDAO dao;
            try {
                dao = new ProdutoDAO();
                 dao.adicionaProduto(b1);
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoF.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");      
        }
       
       public void preencherTabela() {
       
        try{
        ProdutoDAO dao = new ProdutoDAO();
        List<Produto> ListaDeProdutos = dao.ListarProduto();
        
        DefaultTableModel tabela = new DefaultTableModel();
        tabela = (DefaultTableModel) Tabela.getModel();
        tabela.setRowCount(0);
        for (int i = 0; i < ListaDeProdutos.size(); i++) {
        Object[] objeto = {ListaDeProdutos.get(i).getId(), ListaDeProdutos.get(i).getNomeProduto(),ListaDeProdutos.get(i).getQuantidadeProduto(),ListaDeProdutos.get(i).getValorProduto()};
            tabela.addRow(objeto);
        }}catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public ProdutoF() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jCheckBox2 = new javax.swing.JCheckBox();
        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        nomeBebida = new javax.swing.JTextField();
        quantidadeBebida = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        valorBebida = new javax.swing.JTextField();
        salvar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        listar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        btExcluir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jCampoExcluir = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btAtualizarBebida = new javax.swing.JButton();
        NomeA = new javax.swing.JTextField();
        jQuantA = new javax.swing.JTextField();
        jValorA = new javax.swing.JTextField();
        campoID = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jCheckBox2.setText("jCheckBox2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nome:");

        nomeBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeBebidaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Valor:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Quant:");

        salvar.setText("Salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        listar.setText("listar");
        listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarActionPerformed(evt);
            }
        });

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "QuantidadeProduto", "ValorProduto"
            }
        ));
        jScrollPane3.setViewportView(Tabela);

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        jLabel4.setText("Digite o Id que deseja excluir");

        jCampoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCampoExcluirActionPerformed(evt);
            }
        });

        jLabel5.setText("Atualizar Produto");

        btAtualizarBebida.setText("Atualizar");
        btAtualizarBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarBebidaActionPerformed(evt);
            }
        });

        NomeA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeAActionPerformed(evt);
            }
        });

        jQuantA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jQuantAActionPerformed(evt);
            }
        });

        jValorA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jValorAActionPerformed(evt);
            }
        });

        campoID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCampoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btExcluir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jValorA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                    .addComponent(jQuantA, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NomeA, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(campoID)
                                        .addGap(15, 15, 15)))
                                .addGap(18, 18, 18)
                                .addComponent(btAtualizarBebida))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(29, 29, 29)
                                .addComponent(nomeBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(121, 121, 121)
                                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(quantidadeBebida)
                                    .addComponent(valorBebida, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addComponent(listar)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nomeBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(valorBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(quantidadeBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(listar)))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCampoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluir))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btAtualizarBebida)
                    .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NomeA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jQuantA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jValorA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(250, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
       
            novoCadastro();
           
            salvar.setEnabled(true);
           
            
        
    }//GEN-LAST:event_salvarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
       // if(id.getText().equals(""))
        dispose();
       // else{
        //    editar.setEnabled(false);
        //    excluir.setEnabled(false);
            salvar.setEnabled(true);
         //   limparCampos();
       // }
    }//GEN-LAST:event_cancelarActionPerformed

    private void nomeBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeBebidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeBebidaActionPerformed

    private void listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarActionPerformed
        preencherTabela();
    }//GEN-LAST:event_listarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
    
            
        
            Produto produto = new Produto();
           
            

            try{
                 ProdutoDAO dao = new ProdutoDAO();
                  List<Produto> ListaDeProdutos = dao.ListarProduto();
               int achou =0;

             
            for (int i = 0; i < ListaDeProdutos.size(); i++) 
            {
                    produto = ListaDeProdutos.get(i);
                    if((ListaDeProdutos.get(i).getId())==(((Integer.parseInt(jCampoExcluir.getText())))));
                           // getCPF().equals(ft_cpf.getText()))
                    {
            
                        produto.setId(Integer.parseInt(jCampoExcluir.getText()));
                            
                           dao.excluirProduto(produto);
                           JOptionPane.showMessageDialog(null,"Cadastro excluído com sucesso!");

                          
                           achou++;
                        
                    }
                    
                    
             
                       
                       
            }
            if(achou==0)
             {
                 
                  JOptionPane.showMessageDialog(null,"Erro! O CPF digitado não está cadastrado!");
    
                    
             }                                                   
            }catch(Exception e){
                e.printStackTrace();
            }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void jCampoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCampoExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCampoExcluirActionPerformed

    private void btAtualizarBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarBebidaActionPerformed
      Produto produto = new Produto();
       //PecasException excepPecas= new PecasException();
        //AplicarException aplicEx = new AplicarException();
      
        try{
        ProdutoDAO dao = new ProdutoDAO ();

               List<Produto> ListaDeBebidas = dao.ListarProduto();
                 
               
                    produto.setId(Integer.parseInt(campoID.getText()));
                    produto.setNomeProduto(NomeA.getText());
                    produto.setQuantidadeProduto(Integer.parseInt(jQuantA.getText()));
                    produto.setValorProduto(Double.parseDouble(jValorA.getText()));
                   
                 
            int achou=0;

        

            for (int i = 0; i < ListaDeBebidas.size(); i++) 
            {
                 produto = ListaDeBebidas.get(i);
                    
                    if(ListaDeBebidas.get(i).getId()==(Integer.parseInt(campoID.getText())))
                    {
            
                    produto.setId(Integer.parseInt(campoID.getText()));
                    produto.setNomeProduto(NomeA.getText());
                    produto.setQuantidadeProduto(Integer.parseInt(jQuantA.getText()));
                    produto.setValorProduto(Double.parseDouble(jValorA.getText()));
                       
                    dao.AtualizarProduto(produto);
                        

                        JOptionPane.showMessageDialog(null, "Cadastro alterado com sucesso!");
                        achou++;
                        
                        //this.dispose();
                    }
                    
                    
              
            }}catch(Exception e)  {
                    e.printStackTrace();
                    }      
                       
           
            
        
                 
    }//GEN-LAST:event_btAtualizarBebidaActionPerformed

    private void NomeAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeAActionPerformed

    private void campoIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoIDActionPerformed

    private void jQuantAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jQuantAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jQuantAActionPerformed

    private void jValorAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jValorAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jValorAActionPerformed

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
            java.util.logging.Logger.getLogger(ProdutoF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutoF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutoF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutoF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutoF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NomeA;
    private javax.swing.JTable Tabela;
    private javax.swing.JButton btAtualizarBebida;
    private javax.swing.JButton btExcluir;
    private javax.swing.JTextField campoID;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField jCampoExcluir;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jQuantA;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jValorA;
    private javax.swing.JButton listar;
    private javax.swing.JTextField nomeBebida;
    private javax.swing.JTextField quantidadeBebida;
    private javax.swing.JButton salvar;
    private javax.swing.JTextField valorBebida;
    // End of variables declaration//GEN-END:variables
}