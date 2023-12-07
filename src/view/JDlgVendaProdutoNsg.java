/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.ClienteNsg;
import bean.ProdutoNsg;
import bean.VendaNsg;
import bean.VendaProdutoNsg;
import bean.VendedorNsg;
import dao.Cliente_DAO_Nsg;
import dao.Produto_DAO_Nsg;
import dao.VendaProduto_DAO_Nsg;
import dao.Venda_DAO_Nsg;
import dao.Vendedor_DAO_Nsg;
import java.util.List;
import tools.Util;
/**
 *
 * @author nayar
 */
public class JDlgVendaProdutoNsg extends javax.swing.JDialog {
    boolean incluir;
    JDlgVendaNsg jDlgVendaNsg;
    
    /**
     * Creates new form JDlgVendaProdutoNsg
     */
    public JDlgVendaProdutoNsg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        Util.habilitar(false, jTxtTotal_Nsg);
        
        Produto_DAO_Nsg produto_DAO_Nsg = new Produto_DAO_Nsg();
        List listaProd = produto_DAO_Nsg.listAll();
        for (int i = 0; i < listaProd.size(); i++) {
            jCboProduto_Nsg.addItem((ProdutoNsg) listaProd.get(i));
        }
        
        
    }
    
    public JDlgVendaProdutoNsg (boolean incluindo){
        this.incluir = incluindo;
        initComponents();
    }
    
    public VendaProdutoNsg viewBean() {
        VendaProdutoNsg vendaProdutoNsg = new VendaProdutoNsg();
        
        vendaProdutoNsg.setProdutoNsg((ProdutoNsg) jCboProduto_Nsg.getSelectedItem());
        vendaProdutoNsg.setQuantidadeNsg(jTxtQuantidade_Nsg.getText());
        vendaProdutoNsg.setValorUnitNsg(jTxtValorUnit_Nsg.getText());
        
        return vendaProdutoNsg;
    }
    
    public void beanView(VendaProdutoNsg vendaProdutoNsg) {
        String id = String.valueOf(vendaProdutoNsg.getIdVendaProdutoNsg());
       
        jCboProduto_Nsg.setSelectedItem(vendaProdutoNsg.getProdutoNsg());
        jTxtQuantidade_Nsg.setText(vendaProdutoNsg.getQuantidadeNsg());
        jTxtValorUnit_Nsg.setText(vendaProdutoNsg.getValorUnitNsg());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnOK_Nsg = new javax.swing.JButton();
        jBtnCancelar_Nsg = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTxtQuantidade_Nsg = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTxtValorUnit_Nsg = new javax.swing.JTextField();
        jCboProduto_Nsg = new javax.swing.JComboBox<ProdutoNsg>();
        jLabel8 = new javax.swing.JLabel();
        jTxtTotal_Nsg = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jBtnOK_Nsg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/05 - ok.png"))); // NOI18N
        jBtnOK_Nsg.setText("OK");
        jBtnOK_Nsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOK_NsgActionPerformed(evt);
            }
        });

        jBtnCancelar_Nsg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/03 - exit.png"))); // NOI18N
        jBtnCancelar_Nsg.setText("Cancelar");
        jBtnCancelar_Nsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelar_NsgActionPerformed(evt);
            }
        });

        jLabel3.setText("Produto");

        jLabel5.setText("Quantidade");

        jTxtQuantidade_Nsg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTxtQuantidade_NsgKeyReleased(evt);
            }
        });

        jLabel6.setText("Valor Unitário");

        jTxtValorUnit_Nsg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTxtValorUnit_NsgKeyReleased(evt);
            }
        });

        jCboProduto_Nsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboProduto_NsgActionPerformed(evt);
            }
        });

        jLabel8.setText("Total");

        jTxtTotal_Nsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtTotal_NsgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBtnOK_Nsg)
                        .addGap(5, 5, 5)
                        .addComponent(jBtnCancelar_Nsg)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCboProduto_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jTxtQuantidade_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jTxtValorUnit_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(jTxtTotal_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCboProduto_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(26, 26, 26)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtQuantidade_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtValorUnit_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtTotal_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnOK_Nsg)
                    .addComponent(jBtnCancelar_Nsg))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnOK_NsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOK_NsgActionPerformed
    VendaProdutoNsg vendaProdutoNsg = new VendaProdutoNsg();
    //VendaProdutoControleNsg vendaProdutoControleNsg = new VendaProdutoControleNsg();
    vendaProdutoNsg.setProdutoNsg((ProdutoNsg) jCboProduto_Nsg.getSelectedItem());
    vendaProdutoNsg.setQuantidadeNsg(jTxtQuantidade_Nsg.getText());
    vendaProdutoNsg.setValorUnitNsg(jTxtValorUnit_Nsg.getText());
    
    if (getTitle().toUpperCase().substring(0, 1).equals("I")) {
        jDlgVendaNsg.vendaProdutoControleNsg.addBean(vendaProdutoNsg);
    } else {
        jDlgVendaNsg.vendaProdutoControleNsg.updateBean(jDlgVendaNsg.getSelectedRowProd(), vendaProdutoNsg);
    }
    
        setVisible(false);
    }//GEN-LAST:event_jBtnOK_NsgActionPerformed

    private void jBtnCancelar_NsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelar_NsgActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Util.limparCampos(jCboProduto_Nsg, jTxtQuantidade_Nsg, jTxtValorUnit_Nsg, jTxtTotal_Nsg);
        Util.mensagem("Operação Cancelada");
    }//GEN-LAST:event_jBtnCancelar_NsgActionPerformed

    private void jCboProduto_NsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboProduto_NsgActionPerformed
        // TODO add your handling code here:
        if (jCboProduto_Nsg.getSelectedIndex() != -1){
        jTxtQuantidade_Nsg.setText("1");
        ProdutoNsg produtoNsg = (ProdutoNsg) jCboProduto_Nsg.getSelectedItem();
        jTxtValorUnit_Nsg.setText(Util.DoubleStr(produtoNsg.getValorUnitNsg()));
        jTxtTotal_Nsg.setText(jTxtValorUnit_Nsg.getText());
        }
    }//GEN-LAST:event_jCboProduto_NsgActionPerformed

    private void jTxtQuantidade_NsgKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtQuantidade_NsgKeyReleased
        // TODO add your handling code here:
        if(jTxtQuantidade_Nsg.getText().isEmpty() == false){
            double unitario = Util.strDouble(jTxtValorUnit_Nsg.getText());
            double quantidade = Util.strInt(jTxtQuantidade_Nsg.getText());
            jTxtTotal_Nsg.setText(Util.DoubleStr(quantidade * unitario));
        } else{
        jTxtTotal_Nsg.setText("0"); }
    }//GEN-LAST:event_jTxtQuantidade_NsgKeyReleased

    private void jTxtValorUnit_NsgKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtValorUnit_NsgKeyReleased
        // TODO add your handling code here:
        if(jTxtValorUnit_Nsg.getText().isEmpty() == false){
            double unitario = Util.strDouble(jTxtValorUnit_Nsg.getText());
            int quantidade = Util.strInt(jTxtQuantidade_Nsg.getText());
            jTxtTotal_Nsg.setText(Util.DoubleStr(quantidade * unitario));
        } else{
        jTxtTotal_Nsg.setText("0");
        }
    }//GEN-LAST:event_jTxtValorUnit_NsgKeyReleased

    private void jTxtTotal_NsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtTotal_NsgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtTotal_NsgActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgVendaProdutoNsg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgVendaProdutoNsg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgVendaProdutoNsg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgVendaProdutoNsg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgVendaProdutoNsg dialog = new JDlgVendaProdutoNsg(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCancelar_Nsg;
    private javax.swing.JButton jBtnOK_Nsg;
    private javax.swing.JComboBox<ProdutoNsg> jCboProduto_Nsg;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTxtQuantidade_Nsg;
    private javax.swing.JTextField jTxtTotal_Nsg;
    private javax.swing.JTextField jTxtValorUnit_Nsg;
    // End of variables declaration//GEN-END:variables
    public void setTelaAnterior(JDlgVendaNsg jDlgVendaNsg) {
        this.jDlgVendaNsg = jDlgVendaNsg;
    }
}
