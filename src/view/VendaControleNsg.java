/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.VendaNsg;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u09229145165
 */
public class VendaControleNsg extends AbstractTableModel{
    
    List lista;
    
    public void setList(List lista){
    this.lista = lista;
    this.fireTableDataChanged();
    };
    public VendaNsg getBean(int row){
    return (VendaNsg)lista.get(row);
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
       
        VendaNsg vendaNsg = (VendaNsg) lista.get(rowIndex);
        if (columnIndex == 0){
        return vendaNsg.getIdVendaNsg();
        }
        if (columnIndex == 1){
        return vendaNsg.getDataNsg();
        }
        if (columnIndex == 2){
        return vendaNsg.getTotalVendaNsg();
        }
        if (columnIndex == 3){
        return vendaNsg.getUnidadeNsg();
        }
        return "";
    }
    
    @Override
    public String getColumnName(int column){
        if (column == 0){
        return "id";
        }
        if (column == 1){
        return "data";
        }
        if (column == 2){
        return "totalVenda";
        }
        if (column == 3){
        return "unidade";
        }
               
        return "";
    };
}
