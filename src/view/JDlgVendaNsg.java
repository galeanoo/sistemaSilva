/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.ClienteNsg;
import bean.VendaNsg;
import bean.VendaProdutoNsg;
import bean.VendedorNsg;
import dao.Cliente_DAO_Nsg;
import dao.VendaProduto_DAO_Nsg;
import dao.Venda_DAO_Nsg;
import dao.Vendedor_DAO_Nsg;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import tools.Util;

/**
 *
 * @author nayar
 */
public class JDlgVendaNsg extends javax.swing.JDialog {
    private boolean incluindo;
    Venda_DAO_Nsg venda_DAO_Nsg;
    VendaProduto_DAO_Nsg vendaProduto_DAO_Nsg;
    VendaProdutoNsg vendaProdutoNsg;
    VendaNsg vendaNsg;
    JDlgVendaProdutoNsg jDlgVendaProdutoNsg;
    VendaProdutoControleNsg vendaProdutoControleNsg;
    public JDlgVendaPesquisaNsg JDlgvendaPesquisaNsg;
    private MaskFormatter mascaraData;

    /**
     * Creates new form JDlgVendaNsg
     */
    public JDlgVendaNsg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Venda");
        setLocationRelativeTo(null);
        Util.limparCampos(jTxtNumVenda_Nsg, jFmtData_Nsg, jCboCliente_Nsg, jCboVendedor_Nsg, jTxtUnidade_Nsg, jTxtTotal_Nsg);
        Util.habilitar(false, jBtnExcluir_Nsg2, jBtnAlterar_Nsg2, jBtnIncluir_Nsg2, jBtnExcluir_Nsg, jBtnAlterar_Nsg, jBtnConfirmar_Nsg, jBtnCancelar_Nsg, jTxtNumVenda_Nsg, jFmtData_Nsg, jCboCliente_Nsg, jCboVendedor_Nsg, jTxtUnidade_Nsg, jTxtTotal_Nsg);
        Util.habilitar(true, jBtnIncluir_Nsg, jBtnPesquisar_Nsg);
        venda_DAO_Nsg = new Venda_DAO_Nsg();
        
        Cliente_DAO_Nsg cliente_DAO_Nsg = new Cliente_DAO_Nsg();
        List listaCli = cliente_DAO_Nsg.listAll();
        for (int i = 0; i < listaCli.size(); i++) {
            jCboCliente_Nsg.addItem((ClienteNsg) listaCli.get(i));
        }
        
        Vendedor_DAO_Nsg vendedor_DAO_Nsg = new Vendedor_DAO_Nsg();
        List listaVend = vendedor_DAO_Nsg.listAll();
        for (int i = 0; i < listaVend.size(); i++) {
            jCboVendedor_Nsg.addItem((VendedorNsg) listaVend.get(i));
        }
        
        vendaProdutoControleNsg = new VendaProdutoControleNsg();
        List lista = new ArrayList();
        vendaProdutoControleNsg.setList(lista);
        jTable1.setModel(vendaProdutoControleNsg);
        
        
        try {
            mascaraData = new MaskFormatter("##/##/####");
        } catch (ParseException ex) {
            Logger.getLogger(JDlgUsuariosNsg.class.getName()).log(Level.SEVERE, null, ex);
        }
          
         jFmtData_Nsg.setFormatterFactory(new DefaultFormatterFactory(mascaraData));
    }
    
    public VendaNsg viewBean() {
        VendaNsg vendaNsg = new VendaNsg();
        int id = Util.strInt(jTxtNumVenda_Nsg.getText());
        vendaNsg.setIdVendaNsg(id);
        //vendaNsg.setIdVendaNsg(Util.strInt(jTxtNumVenda_Nsg.getText()));
        vendaNsg.setClienteNsg((ClienteNsg) jCboCliente_Nsg.getSelectedItem());
        vendaNsg.setVendedorNsg((VendedorNsg) jCboVendedor_Nsg.getSelectedItem());
       
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            vendaNsg.setDataNsg (formato.parse(jFmtData_Nsg.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(JDlgVendaNsg.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        vendaNsg.setUnidadeNsg(jTxtUnidade_Nsg.getText());
        vendaNsg.setTotalVendaNsg(Util.strDouble(jTxtTotal_Nsg.getText()));
        double total = Util.strDouble(jTxtTotal_Nsg.getText());
        vendaNsg.setTotalVendaNsg(total);
        
        return vendaNsg;
       
    }
    
    public void beanView(VendaNsg venda) {
        vendaNsg = venda;
       
        jTxtNumVenda_Nsg.setText(String.valueOf(vendaNsg.getIdVendaNsg()));
        jCboCliente_Nsg.setSelectedItem(vendaNsg.getClienteNsg());
        jCboVendedor_Nsg.setSelectedItem(vendaNsg.getVendedorNsg());
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        jFmtData_Nsg.setText(formato.format(vendaNsg.getDataNsg()));
        jTxtUnidade_Nsg.setText(vendaNsg.getUnidadeNsg());
        jTxtTotal_Nsg.setText(String.valueOf(vendaNsg.getTotalVendaNsg()));
        
        vendaProduto_DAO_Nsg = new VendaProduto_DAO_Nsg();
        List listaProd = (List) vendaProduto_DAO_Nsg.listProduto(vendaNsg);
        vendaProdutoControleNsg.setList(listaProd);
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

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTxtNumVenda_Nsg = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jFmtData_Nsg = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jCboCliente_Nsg = new javax.swing.JComboBox<ClienteNsg>();
        jLabel4 = new javax.swing.JLabel();
        jCboVendedor_Nsg = new javax.swing.JComboBox<VendedorNsg>();
        jLabel5 = new javax.swing.JLabel();
        jTxtUnidade_Nsg = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTxtTotal_Nsg = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jBtnPesquisar_Nsg = new javax.swing.JButton();
        jBtnIncluir_Nsg = new javax.swing.JButton();
        jBtnConfirmar_Nsg = new javax.swing.JButton();
        jBtnCancelar_Nsg = new javax.swing.JButton();
        jBtnExcluir_Nsg = new javax.swing.JButton();
        jBtnAlterar_Nsg = new javax.swing.JButton();
        jBtnIncluir_Nsg2 = new javax.swing.JButton();
        jBtnAlterar_Nsg2 = new javax.swing.JButton();
        jBtnExcluir_Nsg2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Num venda");

        jLabel2.setText("Data");

        jLabel3.setText("Cliente");

        jCboCliente_Nsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboCliente_NsgActionPerformed(evt);
            }
        });

        jLabel4.setText("Vendedor");

        jLabel5.setText("Unidade");

        jTxtUnidade_Nsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtUnidade_NsgActionPerformed(evt);
            }
        });

        jLabel6.setText("Total venda");

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/12 - caixa.png"))); // NOI18N
        jLabel10.setText("Cadastrar Vendas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jTxtNumVenda_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jFmtData_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCboCliente_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jCboVendedor_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jTxtUnidade_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jTxtTotal_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtTotal_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtNumVenda_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFmtData_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCboCliente_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCboVendedor_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtUnidade_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jBtnPesquisar_Nsg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/06 - pesquisar.png"))); // NOI18N
        jBtnPesquisar_Nsg.setText("Pesquisar");
        jBtnPesquisar_Nsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisar_NsgActionPerformed(evt);
            }
        });

        jBtnIncluir_Nsg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/04 - incluir.png"))); // NOI18N
        jBtnIncluir_Nsg.setText("Incluir");
        jBtnIncluir_Nsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluir_NsgActionPerformed(evt);
            }
        });

        jBtnConfirmar_Nsg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/07 - confirmar.png"))); // NOI18N
        jBtnConfirmar_Nsg.setText("Confirmar");
        jBtnConfirmar_Nsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmar_NsgActionPerformed(evt);
            }
        });

        jBtnCancelar_Nsg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/03 - exit.png"))); // NOI18N
        jBtnCancelar_Nsg.setText("Cancelar");
        jBtnCancelar_Nsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelar_NsgActionPerformed(evt);
            }
        });

        jBtnExcluir_Nsg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/02 - excluir.png"))); // NOI18N
        jBtnExcluir_Nsg.setText("Excluir");
        jBtnExcluir_Nsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluir_NsgActionPerformed(evt);
            }
        });

        jBtnAlterar_Nsg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/01 - alterar.png"))); // NOI18N
        jBtnAlterar_Nsg.setText("Alerar");
        jBtnAlterar_Nsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterar_NsgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jBtnIncluir_Nsg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnPesquisar_Nsg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnAlterar_Nsg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnExcluir_Nsg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnConfirmar_Nsg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnCancelar_Nsg)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnCancelar_Nsg)
                        .addComponent(jBtnConfirmar_Nsg))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnAlterar_Nsg)
                        .addComponent(jBtnExcluir_Nsg))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnIncluir_Nsg)
                        .addComponent(jBtnPesquisar_Nsg)))
                .addContainerGap())
        );

        jBtnIncluir_Nsg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/04 - incluir.png"))); // NOI18N
        jBtnIncluir_Nsg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluir_Nsg2ActionPerformed(evt);
            }
        });

        jBtnAlterar_Nsg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/01 - alterar.png"))); // NOI18N
        jBtnAlterar_Nsg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterar_Nsg2ActionPerformed(evt);
            }
        });

        jBtnExcluir_Nsg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/02 - excluir.png"))); // NOI18N
        jBtnExcluir_Nsg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluir_Nsg2ActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnIncluir_Nsg2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jBtnAlterar_Nsg2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jBtnExcluir_Nsg2, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnIncluir_Nsg2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnAlterar_Nsg2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnExcluir_Nsg2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 56, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnPesquisar_NsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisar_NsgActionPerformed
        // TODO add your handling code here:
        JDlgVendaPesquisaNsg jDlgVendaPesquisaNsg = new JDlgVendaPesquisaNsg(null, true);
        jDlgVendaPesquisaNsg.setTelaAnterior(this);
        jDlgVendaPesquisaNsg.setVisible(true);
        
        Util.habilitar(true,  jBtnAlterar_Nsg, jBtnPesquisar_Nsg, jBtnCancelar_Nsg,jBtnExcluir_Nsg);
        Util.habilitar(false, jBtnIncluir_Nsg, jBtnConfirmar_Nsg, jBtnAlterar_Nsg2, jBtnExcluir_Nsg2, jBtnIncluir_Nsg2);
    }//GEN-LAST:event_jBtnPesquisar_NsgActionPerformed

    private void jBtnIncluir_NsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluir_NsgActionPerformed
        // TODO add your handling code here:
        Util.habilitar(true, jBtnExcluir_Nsg2, jBtnAlterar_Nsg2, jBtnIncluir_Nsg2, jBtnConfirmar_Nsg, jBtnCancelar_Nsg, jTxtNumVenda_Nsg, jFmtData_Nsg, jCboCliente_Nsg, jCboVendedor_Nsg, jTxtUnidade_Nsg, jTxtTotal_Nsg);
        Util.habilitar(false, jBtnIncluir_Nsg, jBtnAlterar_Nsg, jBtnExcluir_Nsg, jBtnPesquisar_Nsg);
        
        vendaProdutoControleNsg.setList(new ArrayList());
        jTxtNumVenda_Nsg.grabFocus();
        incluindo = true;
        vendaNsg = new VendaNsg();
        
        Util.limparCampos(jTxtNumVenda_Nsg, jFmtData_Nsg, jCboCliente_Nsg, jCboVendedor_Nsg, jTxtUnidade_Nsg, jTxtTotal_Nsg);
    }//GEN-LAST:event_jBtnIncluir_NsgActionPerformed

    private void jBtnAlterar_NsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterar_NsgActionPerformed
        // TODO add your handling code here:
        Util.habilitar(false, jBtnExcluir_Nsg, jBtnIncluir_Nsg, jBtnAlterar_Nsg, jBtnPesquisar_Nsg);
        Util.habilitar(true, jBtnExcluir_Nsg2, jBtnIncluir_Nsg2, jBtnAlterar_Nsg2, jBtnConfirmar_Nsg, jTxtNumVenda_Nsg, jFmtData_Nsg, jCboCliente_Nsg, jCboVendedor_Nsg, jTxtUnidade_Nsg, jTxtTotal_Nsg);

        if (vendaNsg != null) {
            
           venda_DAO_Nsg = new Venda_DAO_Nsg();
                VendaProdutoNsg vendaProdutoNsg;
                for (int linha = 0; linha < jTable1.getRowCount(); linha++) {
                    vendaProdutoNsg = vendaProdutoControleNsg.getBean(linha);
                    venda_DAO_Nsg.delete(vendaProdutoNsg);
                }
                
                
            Util.habilitar(true, jBtnExcluir_Nsg2, jBtnAlterar_Nsg2, jBtnIncluir_Nsg2, jBtnConfirmar_Nsg, jBtnCancelar_Nsg, jTxtNumVenda_Nsg, jFmtData_Nsg, jCboCliente_Nsg, jCboVendedor_Nsg, jTxtUnidade_Nsg, jTxtTotal_Nsg);
            Util.habilitar(false, jBtnIncluir_Nsg, jBtnAlterar_Nsg, jBtnExcluir_Nsg, jBtnPesquisar_Nsg);

        } else {
            Util.mensagem("Deve ser realizada uma pesquisa antes");
        }
        incluindo = false;
    }//GEN-LAST:event_jBtnAlterar_NsgActionPerformed

    private void jBtnExcluir_NsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluir_NsgActionPerformed
        // TODO add your handling code here:
        if (vendaNsg != null) {
            if (Util.perguntar("Deseja excluir o pedido?") == true) {
                VendaProdutoNsg vendaProdutoNsg;
                for (int linha = 0; linha < jTable1.getRowCount(); linha++) {
                    vendaProdutoNsg = vendaProdutoControleNsg.getBean(linha);
                    vendaProduto_DAO_Nsg.delete(vendaProdutoNsg);
                }
                venda_DAO_Nsg.delete(vendaNsg);
            }
        } else {
            Util.mensagem("Deve ser realizada uma pesquisa antes");
        }
        vendaProdutoControleNsg.setList(new ArrayList());
        Util.limparCampos(jTxtNumVenda_Nsg, jFmtData_Nsg, jCboCliente_Nsg, jCboVendedor_Nsg, jTxtUnidade_Nsg, jTxtTotal_Nsg);
        vendaNsg = null;
        
//        Util.habilitar(false, jBtnConfirmar_Nsg, jBtnCancelar_Nsg, jTxtNumVenda_Nsg, jFmtData_Nsg, jCboCliente_Nsg, jCboVendedor_Nsg, jTxtUnidade_Nsg, jTxtTotal_Nsg);
//        Util.habilitar(true, jBtnIncluir_Nsg, jBtnAlterar_Nsg, jBtnPesquisar_Nsg, jBtnExcluir_Nsg);
    }//GEN-LAST:event_jBtnExcluir_NsgActionPerformed

    private void jBtnConfirmar_NsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmar_NsgActionPerformed
        // TODO add your handling code here:
        vendaNsg = viewBean();
        if (incluindo == true) {
            venda_DAO_Nsg.insert(vendaNsg);
              vendaProduto_DAO_Nsg = new VendaProduto_DAO_Nsg();
            
            for (int linha = 0; linha < jTable1.getRowCount(); linha++) {
                vendaProdutoNsg = vendaProdutoControleNsg.getBean(linha);
                vendaProdutoNsg.setVendaNsg(vendaNsg);
                  vendaProduto_DAO_Nsg.insert(vendaProdutoNsg);
            }
        } else {
            venda_DAO_Nsg.update(vendaNsg);
            vendaProduto_DAO_Nsg = new VendaProduto_DAO_Nsg();
            
        
            for (int linha = 0; linha < jTable1.getRowCount(); linha++) {
                vendaProdutoNsg = vendaProdutoControleNsg.getBean(linha);
                vendaProdutoNsg.setVendaNsg(vendaNsg);
                this.vendaProduto_DAO_Nsg.insert(vendaProdutoNsg);
               
            } }
        
        Util.limparCampos(jTxtNumVenda_Nsg, jFmtData_Nsg, jCboCliente_Nsg, jCboVendedor_Nsg, jTxtUnidade_Nsg, jTxtTotal_Nsg);
        vendaProdutoControleNsg.setList(new ArrayList());
        vendaNsg = null;
        
        Util.habilitar(false, jBtnConfirmar_Nsg, jBtnCancelar_Nsg, jTxtNumVenda_Nsg, jFmtData_Nsg, jCboCliente_Nsg, jCboVendedor_Nsg, jTxtUnidade_Nsg, jTxtTotal_Nsg);
        Util.habilitar(true, jBtnExcluir_Nsg, jBtnAlterar_Nsg, jBtnIncluir_Nsg, jBtnPesquisar_Nsg);
    }//GEN-LAST:event_jBtnConfirmar_NsgActionPerformed

    private void jBtnCancelar_NsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelar_NsgActionPerformed
        // TODO add your handling code here:
        Util.limparCampos(jTxtNumVenda_Nsg, jFmtData_Nsg, jCboCliente_Nsg, jCboVendedor_Nsg, jTxtUnidade_Nsg, jTxtTotal_Nsg);
        vendaProdutoControleNsg.setList(new ArrayList());
        vendaNsg = null;
        
        Util.habilitar(false, jBtnExcluir_Nsg2, jBtnAlterar_Nsg2, jBtnIncluir_Nsg2, jBtnAlterar_Nsg, jBtnExcluir_Nsg, jBtnConfirmar_Nsg, jBtnCancelar_Nsg, jTxtNumVenda_Nsg, jFmtData_Nsg, jCboCliente_Nsg, jCboVendedor_Nsg, jTxtUnidade_Nsg, jTxtTotal_Nsg);
        Util.habilitar(true, jBtnIncluir_Nsg, jBtnPesquisar_Nsg);
        
        Util.mensagem("Operação cancelada");
    }//GEN-LAST:event_jBtnCancelar_NsgActionPerformed

    private void jBtnIncluir_Nsg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluir_Nsg2ActionPerformed
        // TODO add your handling code here:
        JDlgVendaProdutoNsg jDlgVendaProdutoNsg = new JDlgVendaProdutoNsg(null, true);
        jDlgVendaProdutoNsg.setTitle("Inclusão de produtos");
        jDlgVendaProdutoNsg.setTelaAnterior(this);
        jDlgVendaProdutoNsg.setVisible(true);
        
        Util.habilitar(true, jBtnConfirmar_Nsg, jBtnAlterar_Nsg, jBtnPesquisar_Nsg, jBtnCancelar_Nsg,jBtnExcluir_Nsg);
        Util.habilitar(false, jBtnIncluir_Nsg, jBtnAlterar_Nsg, jBtnExcluir_Nsg, jBtnPesquisar_Nsg);
    }//GEN-LAST:event_jBtnIncluir_Nsg2ActionPerformed

    private void jBtnAlterar_Nsg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterar_Nsg2ActionPerformed
        // TODO add your handling code here:
        JDlgVendaProdutoNsg jDlgVendaProdutoNsg = new JDlgVendaProdutoNsg (null, true);
        jDlgVendaProdutoNsg.setTitle("Alteração de produtos");
        jDlgVendaProdutoNsg.setTelaAnterior(this);
        
        int linSel = jTable1.getSelectedRow();
        
        VendaProdutoNsg vendaProdutoNsg = (VendaProdutoNsg) vendaProdutoControleNsg.getBean(linSel);
        jDlgVendaProdutoNsg.beanView(vendaProdutoNsg);
        jDlgVendaProdutoNsg.setVisible(true);
    }//GEN-LAST:event_jBtnAlterar_Nsg2ActionPerformed

    private void jBtnExcluir_Nsg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluir_Nsg2ActionPerformed
        // TODO add your handling code here:
        int linha = jTable1.getSelectedRow();
        if (linha == -1) {
            Util.mensagem("Nenhuma linha selecionada");
        } else {
            if (Util.perguntar("Confirma exclusão do produto?") == true) {
                vendaProdutoControleNsg.removeBean(linha);
            }
        }
    }//GEN-LAST:event_jBtnExcluir_Nsg2ActionPerformed

    private void jTxtUnidade_NsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtUnidade_NsgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtUnidade_NsgActionPerformed

    private void jCboCliente_NsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboCliente_NsgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboCliente_NsgActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgVendaNsg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgVendaNsg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgVendaNsg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgVendaNsg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgVendaNsg dialog = new JDlgVendaNsg(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBtnAlterar_Nsg2;
    private javax.swing.JButton jBtnCancelar_Nsg;
    private javax.swing.JButton jBtnConfirmar_Nsg;
    private javax.swing.JButton jBtnExcluir_Nsg;
    private javax.swing.JButton jBtnExcluir_Nsg2;
    private javax.swing.JButton jBtnIncluir_Nsg;
    private javax.swing.JButton jBtnIncluir_Nsg2;
    private javax.swing.JButton jBtnPesquisar_Nsg;
    private javax.swing.JComboBox<ClienteNsg> jCboCliente_Nsg;
    private javax.swing.JComboBox<VendedorNsg> jCboVendedor_Nsg;
    private javax.swing.JFormattedTextField jFmtData_Nsg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTxtNumVenda_Nsg;
    private javax.swing.JTextField jTxtTotal_Nsg;
    private javax.swing.JTextField jTxtUnidade_Nsg;
    // End of variables declaration//GEN-END:variables
}
