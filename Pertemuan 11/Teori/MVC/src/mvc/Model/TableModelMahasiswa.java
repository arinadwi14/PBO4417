/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Model;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author User
 */
public class TableModelMahasiswa extends AbstractTableModel{
    List<Mahasiswa> lb;
    
    public TableModelMahasiswa(List<Mahasiswa> lb){
        this.lb = lb;
    }
    
    @Override
    public int getColumnCount(){
        return 5;
    }
    
    @Override
    public int getRowCount(){
        return lb.size();
    }
}
