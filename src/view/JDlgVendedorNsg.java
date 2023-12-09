/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.VendedorNsg;
import dao.Vendedor_DAO_Nsg;
import java.util.List;
import tools.Util;

/**
 *
 * @author u09229145165
 */
public class JDlgVendedorNsg extends javax.swing.JDialog {
    boolean incluindo;
    Vendedor_DAO_Nsg vendedor_DAO_Nsg;
    VendedorNsg vendedorNsg;
    VendedorControleNsg vendedorControleNsg;
    JDlgVendedorIANsg jDlgVendedorIANsg;

    /**
     * Creates new form JDlgVendedorNsg
     */
    public JDlgVendedorNsg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Inclusão de vendedores");
        setLocationRelativeTo(null);
        jDlgVendedorIANsg = new JDlgVendedorIANsg(null, true);
        vendedor_DAO_Nsg = new Vendedor_DAO_Nsg();
        vendedorControleNsg = new VendedorControleNsg();
        List lista = vendedor_DAO_Nsg.listAll();
        vendedorControleNsg.setList(lista);
        jTable1.setModel(vendedorControleNsg);
    }
    
    public int getSelectedRowProd() {
        return jTable1.getSelectedRow();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jBtnIncluir_Nsg = new javax.swing.JButton();
        jBtnAlterar_Nsg = new javax.swing.JButton();
        jBtnExcluir_Nsg = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jBtnIncluir_Nsg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/04 - incluir.png"))); // NOI18N
        jBtnIncluir_Nsg.setText("Incluir");
        jBtnIncluir_Nsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluir_NsgActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnIncluir_Nsg);

        jBtnAlterar_Nsg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/01 - alterar.png"))); // NOI18N
        jBtnAlterar_Nsg.setText("Alterar");
        jBtnAlterar_Nsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterar_NsgActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnAlterar_Nsg);

        jBtnExcluir_Nsg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/02 - excluir.png"))); // NOI18N
        jBtnExcluir_Nsg.setText("Excluir");
        jBtnExcluir_Nsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluir_NsgActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnExcluir_Nsg);

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/13 - venda.png"))); // NOI18N
        jLabel10.setText("Vendedores");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnIncluir_NsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluir_NsgActionPerformed
        // TODO add your handling code here:
        incluindo = true;
        
        jDlgVendedorIANsg.setTitle("Incluir");
        jDlgVendedorIANsg.setVisible(true);
        
        List lista = vendedor_DAO_Nsg.listAll();
        vendedorControleNsg.setList(lista);
    }//GEN-LAST:event_jBtnIncluir_NsgActionPerformed

    private void jBtnAlterar_NsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterar_NsgActionPerformed
        // TODO add your handling code here:
        jDlgVendedorIANsg.setTitle("Alterar");
          
        int sel = jTable1.getSelectedRow();
        
        VendedorNsg vendedorNsg = vendedorControleNsg.getBean(sel);
        jDlgVendedorIANsg.beanView(vendedorNsg);
        
        jDlgVendedorIANsg.setVisible(true); 
         List lista = vendedor_DAO_Nsg.listAll();
          vendedorControleNsg.setList(lista);
    }//GEN-LAST:event_jBtnAlterar_NsgActionPerformed

    private void jBtnExcluir_NsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluir_NsgActionPerformed
        // TODO add your handling code here:
        if (Util.perguntar("Deseja excluir vendedor?") == true){
            int sel = jTable1.getSelectedRow();
            VendedorNsg vendedorNsg = vendedorControleNsg.getBean(sel);
            vendedor_DAO_Nsg.delete(vendedorNsg);
            List lista = vendedor_DAO_Nsg.listAll();
            vendedorControleNsg.setList(lista);
        } else{
            Util.mensagem("Exclusão cancelada");
        }
        
        List lista = vendedor_DAO_Nsg.listAll();
        vendedorControleNsg.setList(lista);
    }//GEN-LAST:event_jBtnExcluir_NsgActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgVendedorNsg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgVendedorNsg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgVendedorNsg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgVendedorNsg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgVendedorNsg dialog = new JDlgVendedorNsg(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBtnAlterar_Nsg;
    private javax.swing.JButton jBtnExcluir_Nsg;
    private javax.swing.JButton jBtnIncluir_Nsg;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
