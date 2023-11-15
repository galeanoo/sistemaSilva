/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.ClienteNsg;
import dao.Cliente_DAO_Nsg;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import tools.Util;

/**
 *
 * @author u09229145165
 */
public class JDlgClienteNsg extends javax.swing.JDialog {
    private boolean incluindo;
    private MaskFormatter mascaraNascimento, mascaraRG, mascaraCPF, mascaraCEP, mascaraCelular;
    public ClienteNsg clienteNsg;
    public Cliente_DAO_Nsg cliente_DAO_Nsg;

    /**
     * Creates new form ClienteNsg
     */
    public JDlgClienteNsg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Clientes");
        setLocationRelativeTo(null);
        Util.habilitar(false, jBtnAlterar_Nsg, jBtnCancelar_Nsg, jBtnConfirmar_Nsg, jBtnExcluir_Nsg,jTxtCodigo_Nsg, jTxtNome_Nsg, jCboGenero_Nsg, jTxtProfissao_Nsg, jFmtNascimento_Nsg, jFmtRg_Nsg, jFmtCpf_Nsg, jTxtEmail_Nsg, jFmtCelular_Nsg, jFmtCep_Nsg, jTxtEndereco_Nsg, jTxtNumero_Nsg, jTxtBairro_Nsg, jTxtCidade_Nsg, jTxtUf_Nsg, jTxtComplemento_Nsg);
        Util.habilitar(true, jBtnIncluir_Nsg, jBtnPesquisar_Nsg);
    
        try {
        mascaraNascimento = new MaskFormatter("##/##/####");
        mascaraRG = new MaskFormatter("#.###.###");
        mascaraCPF = new MaskFormatter("###.###.###-##");
        mascaraCEP = new MaskFormatter("#####-###");
        mascaraCelular = new MaskFormatter("(##)#####-####");
    } catch (ParseException ex) {
        Logger.getLogger(JDlgClienteNsg.class.getName()).log(Level.SEVERE, null, ex);
    }
         jFmtCpf_Nsg.setFormatterFactory(new DefaultFormatterFactory(mascaraCPF));
         jFmtNascimento_Nsg.setFormatterFactory(new DefaultFormatterFactory(mascaraNascimento));
         jFmtCep_Nsg.setFormatterFactory(new DefaultFormatterFactory(mascaraCEP));
         jFmtRg_Nsg.setFormatterFactory(new DefaultFormatterFactory(mascaraRG));
         jFmtCelular_Nsg.setFormatterFactory(new DefaultFormatterFactory(mascaraCelular));
        
    }
    
    public ClienteNsg viewBean() {
        ClienteNsg clienteNsg = new ClienteNsg();
       
        clienteNsg.setIdClienteNsg(Util.strInt(jTxtCodigo_Nsg.getText()));
        clienteNsg.setNomeNsg(jTxtNome_Nsg.getText());
        clienteNsg.setGeneroNsg(jCboGenero_Nsg.getSelectedIndex());
        clienteNsg.setProfissaoNsg(jTxtProfissao_Nsg.getText());
       
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            clienteNsg.setNascimentoNsg (formato.parse(jFmtNascimento_Nsg.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(JDlgClienteNsg.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        clienteNsg.setRgNsg(jFmtRg_Nsg.getText());
        clienteNsg.setCpfNsg(jFmtCpf_Nsg.getText());
        clienteNsg.setEmailNsg(jTxtEmail_Nsg.getText());
        clienteNsg.setCelularNsg(jFmtCelular_Nsg.getText());
        clienteNsg.setCepNsg(jFmtCep_Nsg.getText());
        clienteNsg.setEnderecoNsg(jTxtEndereco_Nsg.getText());
        clienteNsg.setNumeroNsg(jTxtNumero_Nsg.getText());
        clienteNsg.setBairroNsg(jTxtBairro_Nsg.getText());
        clienteNsg.setCidadeNsg(jTxtCidade_Nsg.getText());
        clienteNsg.setUfNsg(jTxtUf_Nsg.getText());
        clienteNsg.setComplementoNsg(jTxtComplemento_Nsg.getText());
        
        return clienteNsg;
       
    }
    
    public void beanView(ClienteNsg clienteNsg) {
        String id = String.valueOf(clienteNsg.getIdClienteNsg());
       
        jTxtCodigo_Nsg.setText(id);
        jTxtNome_Nsg.setText(clienteNsg.getNomeNsg());
        jCboGenero_Nsg.setSelectedIndex(clienteNsg.getGeneroNsg());
        jTxtProfissao_Nsg.setText(clienteNsg.getProfissaoNsg());
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        jFmtNascimento_Nsg.setText(formato.format (clienteNsg.getNascimentoNsg()));
        jFmtRg_Nsg.setText(clienteNsg.getRgNsg());
        jFmtCpf_Nsg.setText(clienteNsg.getCpfNsg());
        jTxtEmail_Nsg.setText(clienteNsg.getEmailNsg());
        jFmtCelular_Nsg.setText(clienteNsg.getCelularNsg());
        jFmtCep_Nsg.setText(clienteNsg.getCepNsg());
        jTxtEndereco_Nsg.setText(clienteNsg.getEnderecoNsg());
        jTxtNumero_Nsg.setText(clienteNsg.getNumeroNsg());
        jTxtBairro_Nsg.setText(clienteNsg.getBairroNsg());
        jTxtCidade_Nsg.setText(clienteNsg.getCidadeNsg());
        jTxtUf_Nsg.setText(clienteNsg.getUfNsg());
        jTxtComplemento_Nsg.setText(clienteNsg.getComplementoNsg());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jTxtNumero_Nsg = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jFmtCep_Nsg = new javax.swing.JFormattedTextField();
        jTxtCodigo_Nsg = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTxtProfissao_Nsg = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jFmtCpf_Nsg = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jTxtEmail_Nsg = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jFmtCelular_Nsg = new javax.swing.JFormattedTextField();
        jBtnIncluir_Nsg = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jBtnAlterar_Nsg = new javax.swing.JButton();
        jTxtEndereco_Nsg = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jBtnExcluir_Nsg = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jFmtRg_Nsg = new javax.swing.JFormattedTextField();
        jTxtBairro_Nsg = new javax.swing.JTextField();
        jBtnConfirmar_Nsg = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jBtnCancelar_Nsg = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTxtNome_Nsg = new javax.swing.JTextField();
        jTxtCidade_Nsg = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jFmtNascimento_Nsg = new javax.swing.JFormattedTextField();
        jTxtComplemento_Nsg = new javax.swing.JTextField();
        jBtnPesquisar_Nsg = new javax.swing.JButton();
        jTxtUf_Nsg = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jCboGenero_Nsg = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel6.setText("Complemento");

        jLabel1.setText("Código Cliente");

        jTxtCodigo_Nsg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTxtCodigo_NsgFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTxtCodigo_NsgFocusLost(evt);
            }
        });
        jTxtCodigo_Nsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCodigo_NsgActionPerformed(evt);
            }
        });

        jLabel8.setText("Profissão");

        jTxtProfissao_Nsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtProfissao_NsgActionPerformed(evt);
            }
        });

        jLabel9.setText("CPF");

        jLabel10.setText("E-mail");

        jTxtEmail_Nsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtEmail_NsgActionPerformed(evt);
            }
        });

        jLabel11.setText("Celular");

        jLabel3.setText("Gênero");

        jBtnIncluir_Nsg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/04 - incluir.png"))); // NOI18N
        jBtnIncluir_Nsg.setText("Incluir");
        jBtnIncluir_Nsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluir_NsgActionPerformed(evt);
            }
        });

        jLabel12.setText("CEP");

        jLabel13.setText("Endereço");

        jBtnAlterar_Nsg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/01 - alterar.png"))); // NOI18N
        jBtnAlterar_Nsg.setText("Alerar");
        jBtnAlterar_Nsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterar_NsgActionPerformed(evt);
            }
        });

        jTxtEndereco_Nsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtEndereco_NsgActionPerformed(evt);
            }
        });

        jLabel4.setText("RG");

        jLabel14.setText("Número");

        jBtnExcluir_Nsg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/02 - excluir.png"))); // NOI18N
        jBtnExcluir_Nsg.setText("Excluir");
        jBtnExcluir_Nsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluir_NsgActionPerformed(evt);
            }
        });

        jLabel15.setText("Bairro");

        jTxtBairro_Nsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtBairro_NsgActionPerformed(evt);
            }
        });

        jBtnConfirmar_Nsg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/07 - confirmar.png"))); // NOI18N
        jBtnConfirmar_Nsg.setText("Confirmar");
        jBtnConfirmar_Nsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmar_NsgActionPerformed(evt);
            }
        });

        jLabel16.setText("Cidade");

        jLabel5.setText("Nascimento");

        jBtnCancelar_Nsg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/03 - exit.png"))); // NOI18N
        jBtnCancelar_Nsg.setText("Cancelar");
        jBtnCancelar_Nsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelar_NsgActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome");

        jTxtCidade_Nsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCidade_NsgActionPerformed(evt);
            }
        });

        jLabel17.setText("UF");

        jBtnPesquisar_Nsg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/06 - pesquisar.png"))); // NOI18N
        jBtnPesquisar_Nsg.setText("Pesquisar");
        jBtnPesquisar_Nsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisar_NsgActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/09 - cliente.png"))); // NOI18N
        jLabel7.setText("Cadastrar Clientes");

        jCboGenero_Nsg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fem", "Masc", "Outro", "Prefiro não dizer" }));
        jCboGenero_Nsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboGenero_NsgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(jFmtNascimento_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jFmtRg_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jFmtCpf_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTxtProfissao_Nsg, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1)
                                                .addComponent(jTxtCodigo_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addComponent(jTxtNome_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jCboGenero_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(16, 16, 16)))
                            .addComponent(jTxtEmail_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTxtComplemento_Nsg, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jTxtEndereco_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTxtNumero_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel15)
                                                    .addComponent(jTxtBairro_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel16)
                                                    .addComponent(jTxtCidade_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel17)
                                            .addComponent(jTxtUf_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jBtnIncluir_Nsg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnAlterar_Nsg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnExcluir_Nsg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnPesquisar_Nsg))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(jBtnConfirmar_Nsg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnCancelar_Nsg)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jFmtCelular_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel12))
                                    .addComponent(jFmtCep_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTxtCodigo_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTxtNome_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCboGenero_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTxtProfissao_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jFmtNascimento_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jFmtRg_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFmtCpf_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtEmail_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFmtCelular_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jFmtCep_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTxtEndereco_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTxtNumero_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTxtBairro_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTxtCidade_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTxtUf_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(31, 31, 31)))
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtComplemento_Nsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnIncluir_Nsg)
                    .addComponent(jBtnAlterar_Nsg)
                    .addComponent(jBtnExcluir_Nsg)
                    .addComponent(jBtnPesquisar_Nsg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnCancelar_Nsg)
                    .addComponent(jBtnConfirmar_Nsg))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtCodigo_NsgFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtCodigo_NsgFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCodigo_NsgFocusGained

    private void jTxtCodigo_NsgFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtCodigo_NsgFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCodigo_NsgFocusLost

    private void jTxtCodigo_NsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCodigo_NsgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCodigo_NsgActionPerformed

    private void jTxtProfissao_NsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtProfissao_NsgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtProfissao_NsgActionPerformed

    private void jTxtEmail_NsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtEmail_NsgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtEmail_NsgActionPerformed

    private void jBtnIncluir_NsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluir_NsgActionPerformed
        // TODO add your handling code here:
        Util.habilitar(true, jBtnConfirmar_Nsg, jBtnCancelar_Nsg, jTxtCodigo_Nsg, jTxtNome_Nsg, jCboGenero_Nsg, jTxtProfissao_Nsg, jFmtNascimento_Nsg, jFmtRg_Nsg, jFmtCpf_Nsg, jTxtEmail_Nsg, jFmtCelular_Nsg, jFmtCep_Nsg, jTxtEndereco_Nsg, jTxtNumero_Nsg, jTxtBairro_Nsg, jTxtCidade_Nsg, jTxtUf_Nsg, jTxtComplemento_Nsg);
        Util.habilitar(false, jBtnIncluir_Nsg, jBtnAlterar_Nsg, jBtnExcluir_Nsg, jBtnPesquisar_Nsg);
        Util.limparCampos(jTxtCodigo_Nsg, jTxtNome_Nsg, jCboGenero_Nsg, jTxtProfissao_Nsg, jFmtNascimento_Nsg, jFmtRg_Nsg, jFmtCpf_Nsg, jTxtEmail_Nsg, jFmtCelular_Nsg, jFmtCep_Nsg, jTxtEndereco_Nsg, jTxtNumero_Nsg, jTxtBairro_Nsg, jTxtCidade_Nsg, jTxtUf_Nsg, jTxtComplemento_Nsg);
        
        incluindo = true;
    }//GEN-LAST:event_jBtnIncluir_NsgActionPerformed

    private void jBtnAlterar_NsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterar_NsgActionPerformed
        // TODO add your handling code here:
        Util.habilitar(true, jBtnConfirmar_Nsg, jBtnCancelar_Nsg, jTxtCodigo_Nsg, jTxtNome_Nsg, jCboGenero_Nsg, jTxtProfissao_Nsg, jFmtNascimento_Nsg, jFmtRg_Nsg, jFmtCpf_Nsg, jTxtEmail_Nsg, jFmtCelular_Nsg, jFmtCep_Nsg, jTxtEndereco_Nsg, jTxtNumero_Nsg, jTxtBairro_Nsg, jTxtCidade_Nsg, jTxtUf_Nsg, jTxtComplemento_Nsg);
        Util.habilitar(false, jBtnIncluir_Nsg, jBtnAlterar_Nsg, jBtnExcluir_Nsg, jBtnPesquisar_Nsg);
        
        incluindo = false;
    }//GEN-LAST:event_jBtnAlterar_NsgActionPerformed

    private void jTxtEndereco_NsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtEndereco_NsgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtEndereco_NsgActionPerformed

    private void jBtnExcluir_NsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluir_NsgActionPerformed
        // TODO add your handling code here:
        if (Util.perguntar("Deseja excluir o projeto?") == true){
       Util.habilitar(false, jBtnCancelar_Nsg, jBtnConfirmar_Nsg, jTxtCodigo_Nsg, jTxtNome_Nsg, jCboGenero_Nsg, jTxtProfissao_Nsg, jFmtNascimento_Nsg, jFmtRg_Nsg, jFmtCpf_Nsg, jTxtEmail_Nsg, jFmtCelular_Nsg, jFmtCep_Nsg, jTxtEndereco_Nsg, jTxtNumero_Nsg, jTxtBairro_Nsg, jTxtCidade_Nsg, jTxtUf_Nsg, jTxtComplemento_Nsg);
       Util.habilitar(true, jBtnIncluir_Nsg, jBtnAlterar_Nsg, jBtnExcluir_Nsg, jBtnPesquisar_Nsg);
       ClienteNsg clienteNsg = viewBean();
       Cliente_DAO_Nsg cliente_DAO_Nsg = new Cliente_DAO_Nsg();
       cliente_DAO_Nsg.delete(clienteNsg);
       
       Util.mensagem("Excluído com sucesso");
       }else {
                Util.mensagem("Exclusão cancelada");
                }
       
       Util.limparCampos(jTxtCodigo_Nsg, jTxtNome_Nsg, jCboGenero_Nsg, jTxtProfissao_Nsg, jFmtNascimento_Nsg, jFmtRg_Nsg, jFmtCpf_Nsg, jTxtEmail_Nsg, jFmtCelular_Nsg, jFmtCep_Nsg, jTxtEndereco_Nsg, jTxtNumero_Nsg, jTxtBairro_Nsg, jTxtCidade_Nsg, jTxtUf_Nsg, jTxtComplemento_Nsg);
       Util.habilitar(true, jBtnCancelar_Nsg, jBtnConfirmar_Nsg, jTxtCodigo_Nsg, jTxtNome_Nsg, jCboGenero_Nsg, jTxtProfissao_Nsg, jFmtNascimento_Nsg, jFmtRg_Nsg, jFmtCpf_Nsg, jTxtEmail_Nsg, jFmtCelular_Nsg, jFmtCep_Nsg, jTxtEndereco_Nsg, jTxtNumero_Nsg, jTxtBairro_Nsg, jTxtCidade_Nsg, jTxtUf_Nsg, jTxtComplemento_Nsg);
       Util.habilitar(false, jBtnIncluir_Nsg, jBtnAlterar_Nsg, jBtnExcluir_Nsg, jBtnPesquisar_Nsg);
    }//GEN-LAST:event_jBtnExcluir_NsgActionPerformed

    private void jTxtBairro_NsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtBairro_NsgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtBairro_NsgActionPerformed

    private void jBtnConfirmar_NsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmar_NsgActionPerformed
        // TODO add your handling code here:
        ClienteNsg clienteNsg = viewBean();
        Cliente_DAO_Nsg cliente_DAO_Nsg = new Cliente_DAO_Nsg();

        if (incluindo == true) {
            cliente_DAO_Nsg.insert(clienteNsg);
        } else {
            cliente_DAO_Nsg.update(clienteNsg);
        }

        Util.habilitar(false, jBtnAlterar_Nsg, jBtnExcluir_Nsg, jBtnConfirmar_Nsg, jBtnCancelar_Nsg, jTxtCodigo_Nsg, jTxtNome_Nsg, jCboGenero_Nsg, jTxtProfissao_Nsg, jFmtNascimento_Nsg, jFmtRg_Nsg, jFmtCpf_Nsg, jTxtEmail_Nsg, jFmtCelular_Nsg, jFmtCep_Nsg, jTxtEndereco_Nsg, jTxtNumero_Nsg, jTxtBairro_Nsg, jTxtCidade_Nsg, jTxtUf_Nsg, jTxtComplemento_Nsg);
        Util.habilitar(true, jBtnIncluir_Nsg, jBtnPesquisar_Nsg);
        Util.limparCampos(jTxtCodigo_Nsg, jTxtNome_Nsg, jCboGenero_Nsg, jTxtProfissao_Nsg, jFmtNascimento_Nsg, jFmtRg_Nsg, jFmtCpf_Nsg, jTxtEmail_Nsg, jFmtCelular_Nsg, jFmtCep_Nsg, jTxtEndereco_Nsg, jTxtNumero_Nsg, jTxtBairro_Nsg, jTxtCidade_Nsg, jTxtUf_Nsg, jTxtComplemento_Nsg);
    }//GEN-LAST:event_jBtnConfirmar_NsgActionPerformed

    private void jBtnCancelar_NsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelar_NsgActionPerformed
        // TODO add your handling code here:
        Util.habilitar(false, jBtnAlterar_Nsg, jBtnExcluir_Nsg, jBtnConfirmar_Nsg, jBtnCancelar_Nsg, jTxtCodigo_Nsg, jTxtNome_Nsg, jCboGenero_Nsg, jTxtProfissao_Nsg, jFmtNascimento_Nsg, jFmtRg_Nsg, jFmtCpf_Nsg, jTxtEmail_Nsg, jFmtCelular_Nsg, jFmtCep_Nsg, jTxtEndereco_Nsg, jTxtNumero_Nsg, jTxtBairro_Nsg, jTxtCidade_Nsg, jTxtUf_Nsg, jTxtComplemento_Nsg);
        Util.habilitar(true, jBtnIncluir_Nsg, jBtnPesquisar_Nsg);
        Util.limparCampos(jTxtCodigo_Nsg, jTxtNome_Nsg, jCboGenero_Nsg, jTxtProfissao_Nsg, jFmtNascimento_Nsg, jFmtRg_Nsg, jFmtCpf_Nsg, jTxtEmail_Nsg, jFmtCelular_Nsg, jFmtCep_Nsg, jTxtEndereco_Nsg, jTxtNumero_Nsg, jTxtBairro_Nsg, jTxtCidade_Nsg, jTxtUf_Nsg, jTxtComplemento_Nsg);
        Util.mensagem("Operação cancelada com sucesso!");
    }//GEN-LAST:event_jBtnCancelar_NsgActionPerformed

    private void jTxtCidade_NsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCidade_NsgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCidade_NsgActionPerformed

    private void jBtnPesquisar_NsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisar_NsgActionPerformed
        // TODO add your handling code here:
        JDlgClientePesquisaNsg jDlgClientePesquisaNsg = new JDlgClientePesquisaNsg(null, true);
        jDlgClientePesquisaNsg.setTelaAnterior(this);
        jDlgClientePesquisaNsg.setVisible(true);
        
        Util.habilitar(false, jBtnConfirmar_Nsg, jBtnIncluir_Nsg, jTxtCodigo_Nsg, jTxtNome_Nsg, jCboGenero_Nsg, jTxtProfissao_Nsg, jFmtNascimento_Nsg, jFmtRg_Nsg, jFmtCpf_Nsg, jTxtEmail_Nsg, jFmtCelular_Nsg, jFmtCep_Nsg, jTxtEndereco_Nsg, jTxtNumero_Nsg, jTxtBairro_Nsg, jTxtCidade_Nsg, jTxtUf_Nsg, jTxtComplemento_Nsg);
        Util.habilitar(true, jBtnAlterar_Nsg, jBtnExcluir_Nsg, jBtnPesquisar_Nsg, jBtnCancelar_Nsg);
    }//GEN-LAST:event_jBtnPesquisar_NsgActionPerformed

    private void jCboGenero_NsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboGenero_NsgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboGenero_NsgActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgClienteNsg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgClienteNsg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgClienteNsg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgClienteNsg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgClienteNsg dialog = new JDlgClienteNsg(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBtnCancelar_Nsg;
    private javax.swing.JButton jBtnConfirmar_Nsg;
    private javax.swing.JButton jBtnExcluir_Nsg;
    private javax.swing.JButton jBtnIncluir_Nsg;
    private javax.swing.JButton jBtnPesquisar_Nsg;
    private javax.swing.JComboBox<String> jCboGenero_Nsg;
    private javax.swing.JFormattedTextField jFmtCelular_Nsg;
    private javax.swing.JFormattedTextField jFmtCep_Nsg;
    private javax.swing.JFormattedTextField jFmtCpf_Nsg;
    private javax.swing.JFormattedTextField jFmtNascimento_Nsg;
    private javax.swing.JFormattedTextField jFmtRg_Nsg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTxtBairro_Nsg;
    private javax.swing.JTextField jTxtCidade_Nsg;
    private javax.swing.JTextField jTxtCodigo_Nsg;
    private javax.swing.JTextField jTxtComplemento_Nsg;
    private javax.swing.JTextField jTxtEmail_Nsg;
    private javax.swing.JTextField jTxtEndereco_Nsg;
    private javax.swing.JTextField jTxtNome_Nsg;
    private javax.swing.JTextField jTxtNumero_Nsg;
    private javax.swing.JTextField jTxtProfissao_Nsg;
    private javax.swing.JTextField jTxtUf_Nsg;
    // End of variables declaration//GEN-END:variables
}
