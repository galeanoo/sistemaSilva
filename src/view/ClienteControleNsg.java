/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.ClienteNsg;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u09229145165
 */
public class ClienteControleNsg extends AbstractTableModel{
    
    List lista;
    
    public void setList(List lista){
    this.lista = lista;
    this.fireTableDataChanged();
    };
    public ClienteNsg getBean(int row){
    return (ClienteNsg)lista.get(row);
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
       
        ClienteNsg clienteNsg = (ClienteNsg) lista.get(rowIndex);
        if (columnIndex == 0){
        return clienteNsg.getIdClienteNsg();
        }
        if (columnIndex == 1){
        return clienteNsg.getNomeNsg();
        }
        if (columnIndex == 2){
        return clienteNsg.getProfissaoNsg();
        }
        if (columnIndex == 3){
        return clienteNsg.getGeneroNsg();
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
        return "profissao";
        }
        if (column == 3){
        return "genero";
        }
               
        return "";
    };
}
