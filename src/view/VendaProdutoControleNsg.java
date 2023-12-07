/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.VendaProdutoNsg;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u09229145165
 */
public class VendaProdutoControleNsg extends AbstractTableModel{
    
    List lista;
    
    public void setList(List lista){
    this.lista = lista;
    this.fireTableDataChanged();
    }
    
    public VendaProdutoNsg getBean(int row){
    return (VendaProdutoNsg)lista.get(row);
    }
    
    @Override
    public int getRowCount() {
       return lista.size();
    }

    @Override
    public int getColumnCount() {
return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       
        VendaProdutoNsg vendaNsg = (VendaProdutoNsg) lista.get(rowIndex);
        if (columnIndex == 0){
        return vendaNsg.getIdVendaProdutoNsg();
        }
        if (columnIndex == 1){
        return vendaNsg.getProdutoNsg();
        }
        if (columnIndex == 2){
        return vendaNsg.getQuantidadeNsg();
        }
        if (columnIndex == 3){
        return vendaNsg.getValorUnitNsg();
        }
        return "";
    }
    
    public void addBean(VendaProdutoNsg vendaProdutoNsg) {
            lista.add(vendaProdutoNsg);
            this.fireTableDataChanged();
    }
    
    public void removeBean(int index) {
            lista.remove(index);
            this.fireTableDataChanged();
    }
    
    public void updateBean(int index, VendaProdutoNsg vendaProdutoNsg){
        lista.set(index, vendaProdutoNsg);
        this.fireTableDataChanged();
    }
    
    @Override
    public String getColumnName(int column){
        if (column == 0){
        return "id";
        }
        if (column == 1){
        return "produto";
        }
        if (column == 2){
        return "quantidade";
        }
        if (column == 3){
        return "valor unitario";
        }
               
        return "";
    };
}
