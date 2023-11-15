/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.ProdutoNsg;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u09229145165
 */
public class ProdutoControleNsg extends AbstractTableModel{
    
    List lista;
    
    public void setList(List lista){
    this.lista = lista;
    this.fireTableDataChanged();
    };
    public ProdutoNsg getBean(int row){
    return (ProdutoNsg)lista.get(row);
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
       
        ProdutoNsg produtoNsg = (ProdutoNsg) lista.get(rowIndex);
        if (columnIndex == 0){
        return produtoNsg.getIdProdutoNsg();
        }
        if (columnIndex == 1){
        return produtoNsg.getSaborNsg();
        }
        if (columnIndex == 2){
        return produtoNsg.getModoNsg();
        }
        if (columnIndex == 3){
        return produtoNsg.getTamanhoNsg();
        }
        return "";
    }
    
    @Override
    public String getColumnName(int column){
        if (column == 0){
        return "id";
        }
        if (column == 1){
        return "sabor";
        }
        if (column == 2){
        return "modo";
        }
        if (column == 3){
        return "tamanho";
        }
               
        return "";
    };
}
