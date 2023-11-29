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
    };
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
        return vendaNsg.getClienteNsg();
        }
        if (columnIndex == 2){
        return vendaNsg.getVendedorNsg();
        }
        if (columnIndex == 3){
        return vendaNsg.getQuantidadeNsg();
        }
        return "";
    }
    
    @Override
    public String getColumnName(int column){
        if (column == 0){
        return "id";
        }
        if (column == 1){
        return "cliente";
        }
        if (column == 2){
        return "vendedor";
        }
        if (column == 3){
        return "quantidade";
        }
               
        return "";
    };
}
