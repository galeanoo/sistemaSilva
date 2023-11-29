package bean;
// Generated 13/11/2023 15:15:33 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * VendaNsg generated by hbm2java
 */
@Entity
@Table(name="venda_nsg"
//    ,catalog="db_nayara_silva"
    ,catalog="test"
)
public class VendaNsg  implements java.io.Serializable {


     private int idVendaNsg;
     private ClienteNsg clienteNsg;
     private VendedorNsg vendedorNsg;
     private Date dataNsg;
     private String totalVendaNsg;
     private String unidadeNsg;

    public VendaNsg() {
    }

	
    public VendaNsg(int idVendaNsg, ClienteNsg clienteNsg, VendedorNsg vendedorNsg, Date dataNsg, String totalVendaNsg, String unidadeNsg) {
        this.idVendaNsg = idVendaNsg;
        this.clienteNsg = clienteNsg;
        this.vendedorNsg = vendedorNsg;
        this.dataNsg = dataNsg;
        this.totalVendaNsg = totalVendaNsg;
        this.unidadeNsg = unidadeNsg;
    }
   
     @Id 

    
    @Column(name="id_venda_nsg", unique=true, nullable=false)
    public int getIdVendaNsg() {
        return this.idVendaNsg;
    }
    
    public void setIdVendaNsg(int idVendaNsg) {
        this.idVendaNsg = idVendaNsg;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cliente_nsg", nullable=false)
    public ClienteNsg getClienteNsg() {
        return this.clienteNsg;
    }
    
    public void setClienteNsg(ClienteNsg clienteNsg) {
        this.clienteNsg = clienteNsg;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="vendedor_nsg", nullable=false)
    public VendedorNsg getVendedorNsg() {
        return this.vendedorNsg;
    }
    
    public void setVendedorNsg(VendedorNsg vendedorNsg) {
        this.vendedorNsg = vendedorNsg;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="data_nsg", nullable=false, length=10)
    public Date getDataNsg() {
        return this.dataNsg;
    }
    
    public void setDataNsg(Date dataNsg) {
        this.dataNsg = dataNsg;
    }

    
    @Column(name="total_venda_nsg", nullable=false, length=80)
    public String getTotalVendaNsg() {
        return this.totalVendaNsg;
    }
    
    public void setTotalVendaNsg(String totalVendaNsg) {
        this.totalVendaNsg = totalVendaNsg;
    }
    
    @Column(name="unidade_nsg", nullable=false, length=80)
    public String getUnidadeNsg() {
        return this.unidadeNsg;
    }
    
    public void setUnidadeNsg(String unidadeNsg) {
        this.unidadeNsg = unidadeNsg;
    }
}


