package bean;
// Generated 13/11/2023 15:15:33 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * UsuariosNsg generated by hbm2java
 */
@Entity
@Table(name="usuarios_nsg"
//    ,catalog="db_nayara_silva"
    ,catalog="test"
)
public class UsuariosNsg  implements java.io.Serializable {


     private int idUsuariosNsg;
     private String nomeNsg;
     private String apelidoNsg;
     private String cpfNsg;
     private Date nascimentoNsg;
     private int nivelNsg;
     private String ativoNsg;
     private String senhaNsg;

    public UsuariosNsg() {
    }

    public UsuariosNsg(int idUsuariosNsg, String nomeNsg, String apelidoNsg, String cpfNsg, Date nascimentoNsg, int nivelNsg, String ativoNsg, String senhaNsg) {
       this.idUsuariosNsg = idUsuariosNsg;
       this.nomeNsg = nomeNsg;
       this.apelidoNsg = apelidoNsg;
       this.cpfNsg = cpfNsg;
       this.nascimentoNsg = nascimentoNsg;
       this.nivelNsg = nivelNsg;
       this.ativoNsg = ativoNsg;
       this.senhaNsg = senhaNsg;
    }
   
     @Id 

    
    @Column(name="id_usuarios_nsg", unique=true, nullable=false)
    public int getIdUsuariosNsg() {
        return this.idUsuariosNsg;
    }
    
    public void setIdUsuariosNsg(int idUsuariosNsg) {
        this.idUsuariosNsg = idUsuariosNsg;
    }

    
    @Column(name="nome_nsg", nullable=false, length=80)
    public String getNomeNsg() {
        return this.nomeNsg;
    }
    
    public void setNomeNsg(String nomeNsg) {
        this.nomeNsg = nomeNsg;
    }

    
    @Column(name="apelido_nsg", nullable=false, length=80)
    public String getApelidoNsg() {
        return this.apelidoNsg;
    }
    
    public void setApelidoNsg(String apelidoNsg) {
        this.apelidoNsg = apelidoNsg;
    }

    
    @Column(name="cpf_nsg", nullable=false, length=80)
    public String getCpfNsg() {
        return this.cpfNsg;
    }
    
    public void setCpfNsg(String cpfNsg) {
        this.cpfNsg = cpfNsg;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="nascimento_nsg", nullable=false, length=10)
    public Date getNascimentoNsg() {
        return this.nascimentoNsg;
    }
    
    public void setNascimentoNsg(Date nascimentoNsg) {
        this.nascimentoNsg = nascimentoNsg;
    }

    
    @Column(name="nivel_nsg", nullable=false)
    public int getNivelNsg() {
        return this.nivelNsg;
    }
    
    public void setNivelNsg(int nivelNsg) {
        this.nivelNsg = nivelNsg;
    }

    
    @Column(name="ativo_nsg", nullable=false, length=80)
    public String getAtivoNsg() {
        return this.ativoNsg;
    }
    
    public void setAtivoNsg(String ativoNsg) {
        this.ativoNsg = ativoNsg;
    }

    
    @Column(name="senha_nsg", nullable=false, length=80)
    public String getSenhaNsg() {
        return this.senhaNsg;
    }
    
    public void setSenhaNsg(String senhaNsg) {
        this.senhaNsg = senhaNsg;
    }




}


