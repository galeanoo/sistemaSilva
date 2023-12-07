package bean;
// Generated 13/11/2023 15:15:33 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ClienteNsg generated by hbm2java
 */
@Entity
@Table(name="cliente_nsg"
    ,catalog="db_nayara_silva"
//    ,catalog="test"
)
public class ClienteNsg  implements java.io.Serializable {


     private int idClienteNsg;
     private String nomeNsg;
     private int generoNsg;
     private String profissaoNsg;
     private Date nascimentoNsg;
     private String rgNsg;
     private String cpfNsg;
     private String emailNsg;
     private String celularNsg;
     private String cepNsg;
     private String enderecoNsg;
     private String numeroNsg;
     private String bairroNsg;
     private String cidadeNsg;
     private String ufNsg;
     private String complementoNsg;

    public ClienteNsg() {
    }

	
    public ClienteNsg(int idClienteNsg, String nomeNsg, int generoNsg, String profissaoNsg, Date nascimentoNsg, String rgNsg, String cpfNsg, String emailNsg, String celularNsg, String cepNsg, String enderecoNsg, String numeroNsg, String bairroNsg, String cidadeNsg, String ufNsg, String complementoNsg) {
        this.idClienteNsg = idClienteNsg;
        this.nomeNsg = nomeNsg;
        this.generoNsg = generoNsg;
        this.profissaoNsg = profissaoNsg;
        this.nascimentoNsg = nascimentoNsg;
        this.rgNsg = rgNsg;
        this.cpfNsg = cpfNsg;
        this.emailNsg = emailNsg;
        this.celularNsg = celularNsg;
        this.cepNsg = cepNsg;
        this.enderecoNsg = enderecoNsg;
        this.numeroNsg = numeroNsg;
        this.bairroNsg = bairroNsg;
        this.cidadeNsg = cidadeNsg;
        this.ufNsg = ufNsg;
        this.complementoNsg = complementoNsg;
    }
   
     @Id 

    
    @Column(name="id_cliente_nsg", unique=true, nullable=false)
    public int getIdClienteNsg() {
        return this.idClienteNsg;
    }
    
    public void setIdClienteNsg(int idClienteNsg) {
        this.idClienteNsg = idClienteNsg;
    }

    
    @Column(name="nome_nsg", nullable=false, length=80)
    public String getNomeNsg() {
        return this.nomeNsg;
    }
    
    public void setNomeNsg(String nomeNsg) {
        this.nomeNsg = nomeNsg;
    }

    
    @Column(name="genero_nsg", nullable=false)
    public int getGeneroNsg() {
        return this.generoNsg;
    }
    
    public void setGeneroNsg(int generoNsg) {
        this.generoNsg = generoNsg;
    }

    
    @Column(name="profissao_nsg", nullable=false, length=80)
    public String getProfissaoNsg() {
        return this.profissaoNsg;
    }
    
    public void setProfissaoNsg(String profissaoNsg) {
        this.profissaoNsg = profissaoNsg;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="nascimento_nsg", nullable=false, length=10)
    public Date getNascimentoNsg() {
        return this.nascimentoNsg;
    }
    
    public void setNascimentoNsg(Date nascimentoNsg) {
        this.nascimentoNsg = nascimentoNsg;
    }

    
    @Column(name="rg_nsg", nullable=false, length=80)
    public String getRgNsg() {
        return this.rgNsg;
    }
    
    public void setRgNsg(String rgNsg) {
        this.rgNsg = rgNsg;
    }

    
    @Column(name="cpf_nsg", nullable=false, length=80)
    public String getCpfNsg() {
        return this.cpfNsg;
    }
    
    public void setCpfNsg(String cpfNsg) {
        this.cpfNsg = cpfNsg;
    }

    
    @Column(name="email_nsg", nullable=false, length=80)
    public String getEmailNsg() {
        return this.emailNsg;
    }
    
    public void setEmailNsg(String emailNsg) {
        this.emailNsg = emailNsg;
    }

    
    @Column(name="celular_nsg", nullable=false, length=80)
    public String getCelularNsg() {
        return this.celularNsg;
    }
    
    public void setCelularNsg(String celularNsg) {
        this.celularNsg = celularNsg;
    }

    
    @Column(name="cep_nsg", nullable=false, length=80)
    public String getCepNsg() {
        return this.cepNsg;
    }
    
    public void setCepNsg(String cepNsg) {
        this.cepNsg = cepNsg;
    }

    
    @Column(name="endereco_nsg", nullable=false, length=80)
    public String getEnderecoNsg() {
        return this.enderecoNsg;
    }
    
    public void setEnderecoNsg(String enderecoNsg) {
        this.enderecoNsg = enderecoNsg;
    }

    
    @Column(name="numero_nsg", nullable=false, length=80)
    public String getNumeroNsg() {
        return this.numeroNsg;
    }
    
    public void setNumeroNsg(String numeroNsg) {
        this.numeroNsg = numeroNsg;
    }

    
    @Column(name="bairro_nsg", nullable=false, length=80)
    public String getBairroNsg() {
        return this.bairroNsg;
    }
    
    public void setBairroNsg(String bairroNsg) {
        this.bairroNsg = bairroNsg;
    }

    
    @Column(name="cidade_nsg", nullable=false, length=80)
    public String getCidadeNsg() {
        return this.cidadeNsg;
    }
    
    public void setCidadeNsg(String cidadeNsg) {
        this.cidadeNsg = cidadeNsg;
    }

    
    @Column(name="uf_nsg", nullable=false, length=80)
    public String getUfNsg() {
        return this.ufNsg;
    }
    
    public void setUfNsg(String ufNsg) {
        this.ufNsg = ufNsg;
    }

    
    @Column(name="complemento_nsg", nullable=false, length=80)
    public String getComplementoNsg() {
        return this.complementoNsg;
    }
    
    public void setComplementoNsg(String complementoNsg) {
        this.complementoNsg = complementoNsg;
    }
    
    @Override
    public String toString() {
        return getNomeNsg();
    }
    
    public boolean equals (Object object) {
    if (object instanceof ClienteNsg) {
        ClienteNsg clienteNsg = (ClienteNsg) object;
        
        if (this.getNomeNsg() == clienteNsg.getNomeNsg()){
            return true;
        }
    }
    return false;
    }}



