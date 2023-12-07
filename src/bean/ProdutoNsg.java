package bean;
// Generated 13/11/2023 15:15:33 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ProdutoNsg generated by hbm2java
 */
@Entity
@Table(name="produto_nsg"
    ,catalog="db_nayara_silva"
//    ,catalog="test"
)
public class ProdutoNsg  implements java.io.Serializable {


     private int idProdutoNsg;
     private double valorUnitNsg;
     private String saborNsg;
     private String unidadeNsg;
     private int massaNsg;
     private int modoNsg;
     private int tamanhoNsg;
     private String retirarNsg;

    public ProdutoNsg() {
    }

	
    public ProdutoNsg(int idProdutoNsg, double valorUnitNsg, String saborNsg, String unidadeNsg, int massaNsg, int modoNsg, int tamanhoNsg, String retirarNsg) {
        this.idProdutoNsg = idProdutoNsg;
        this.valorUnitNsg = valorUnitNsg;
        this.saborNsg = saborNsg;
        this.unidadeNsg = unidadeNsg;
        this.massaNsg = massaNsg;
        this.modoNsg = modoNsg;
        this.tamanhoNsg = tamanhoNsg;
        this.retirarNsg = retirarNsg;
    }
   
     @Id 

    
    @Column(name="id_produto_nsg", unique=true, nullable=false)
    public int getIdProdutoNsg() {
        return this.idProdutoNsg;
    }
    
    public void setIdProdutoNsg(int idProdutoNsg) {
        this.idProdutoNsg = idProdutoNsg;
    }

    
    @Column(name="valor_unit_nsg", nullable=false, length=80)
    public double getValorUnitNsg() {
        return this.valorUnitNsg;
    }
    
    public void setValorUnitNsg(double valorUnitNsg) {
        this.valorUnitNsg = valorUnitNsg;
    }

    
    @Column(name="sabor_nsg", nullable=false, length=80)
    public String getSaborNsg() {
        return this.saborNsg;
    }
    
    public void setSaborNsg(String saborNsg) {
        this.saborNsg = saborNsg;
    }

    
    @Column(name="unidade_nsg", nullable=false, length=80)
    public String getUnidadeNsg() {
        return this.unidadeNsg;
    }
    
    public void setUnidadeNsg(String unidadeNsg) {
        this.unidadeNsg = unidadeNsg;
    }

    
    @Column(name="massa_nsg", nullable=false)
    public int getMassaNsg() {
        return this.massaNsg;
    }
    
    public void setMassaNsg(int massaNsg) {
        this.massaNsg = massaNsg;
    }

    
    @Column(name="modo_nsg", nullable=false)
    public int getModoNsg() {
        return this.modoNsg;
    }
    
    public void setModoNsg(int modoNsg) {
        this.modoNsg = modoNsg;
    }

    
    @Column(name="tamanho_nsg", nullable=false)
    public int getTamanhoNsg() {
        return this.tamanhoNsg;
    }
    
    public void setTamanhoNsg(int tamanhoNsg) {
        this.tamanhoNsg = tamanhoNsg;
    }

    
    @Column(name="retirar_nsg", nullable=false, length=80)
    public String getRetirarNsg() {
        return this.retirarNsg;
    }
    
    public void setRetirarNsg(String retirarNsg) {
        this.retirarNsg = retirarNsg;
    }
    
    @Override
    public String toString() {
        return getSaborNsg();
    }

    
    
    public boolean equals (Object object) {
    if (object instanceof ProdutoNsg) {
        ProdutoNsg produtoNsg = (ProdutoNsg) object;
        
        if (this.getIdProdutoNsg() == produtoNsg.getIdProdutoNsg()){
            return true;
        }
    }
    return false;
    }}



