/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class ModTblForm extends AbstractTableModel {

    List<ModUser> lmb;

    public ModTblForm(List<ModUser> lmb) {
        this.lmb = lmb;
    }
        
    @Override
    public int getRowCount() {
        return lmb.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int row, int column) {
        
        switch(column){
            case 0:
                return lmb.get(row).getId();
            case 1:
                return lmb.get(row).getNik();
            case 2:
                return lmb.get(row).getNama();
            case 3:
                return lmb.get(row).getJk();
            case 4:
                return lmb.get(row).getAlamat();
            case 5:
                return lmb.get(row).getUsia();
            case 6:
                return lmb.get(row).getAlasan();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0:
                return "ID";
            case 1:
                return "Nik";
            case 2:
                return "Nama";
            case 3:
                return "Jenis Kelamin";
            case 4:
                return "Alamat";
            case 5:
                return "Usia";
            case 6:
                return "Alasan";
            default:
                return null;
              
        }
        
    }
    
    
}
