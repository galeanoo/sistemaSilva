/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.VendedorNsg;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u09229145165
 */
public class VendedorControleNsg extends AbstractTableModel{
    
    List lista;
    
    public void setList(List lista){
    this.lista = lista;
    this.fireTableDataChanged();
    };
    public VendedorNsg getBean(int row){
    return (VendedorNsg)lista.get(row);
    }
    
    @Override
    public int getRowCount() {
       return lista.size();
    }

    @Override
    public int getColumnCount() {
return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       
        VendedorNsg vendedorNsg = (VendedorNsg) lista.get(rowIndex);
        if (columnIndex == 0){
        return vendedorNsg.getIdVendedorNsg();
        }
        if (columnIndex == 1){
        return vendedorNsg.getNomeNsg();
        }
        if (columnIndex == 2){
        return vendedorNsg.getCpfNsg();
        }
        if (columnIndex == 3){
        return vendedorNsg.getComissaoNsg();
        }
        if (columnIndex == 4){
        return vendedorNsg.getGeneroNsg();
        }
        return "";
    }
    
    @Override
    public String getColumnName(int column){
        if (column == 0){
        return "id";
        }
        if (column == 1){
        return "nome";
        }
        if (column == 2){
        return "cpf";
        }
        if (column == 3){
        return "comissao";
        }
        if (column == 4){
        return "genero";
        }
               
        return "";
    };
}
