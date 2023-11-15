/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.UsuariosNsg;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u09229145165
 */
public class UsuariosControleNsg extends AbstractTableModel{
    private List lista;
    
    public void setList(List lista){
    this.lista = lista;
    this.fireTableDataChanged();
    
    };
    public UsuariosNsg getBean(int row){
    return (UsuariosNsg)lista.get(row);
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
       
        UsuariosNsg usuariosNsg = (UsuariosNsg) lista.get(rowIndex);
        if (columnIndex == 0){
        return usuariosNsg.getIdUsuariosNsg();
        }
        if (columnIndex == 1){
        return usuariosNsg.getNomeNsg();
        }
        if (columnIndex == 2){
        return usuariosNsg.getApelidoNsg();
        }
        if (columnIndex == 3){
        return usuariosNsg.getCpfNsg();
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
        return "apelido";
        }
        if (column == 3){
        return "cpf";
        }
               
        return "";
    };
}
