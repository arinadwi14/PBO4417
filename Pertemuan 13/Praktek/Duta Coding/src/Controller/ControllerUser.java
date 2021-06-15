/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOUser;
import DAOInterface.ImplementUser;
import java.util.List;
import javax.swing.JOptionPane;
import model.ModTblForm;
import model.ModUser;
import view.FormUser;

/**
 *
 * @author User
 */
public class ControllerUser {
    FormUser frame;
    ImplementUser implUser;
    List<ModUser> lmb;

    public ControllerUser(FormUser frame) {
        this.frame = frame;
        implUser = new DAOUser();
        lmb = implUser.getAll();
    }
    
    public void reset(){
        frame.getTxtID().setText("");
        frame.getTxtNik().setText("");
        frame.getTxtNama().setText("");
        frame.getSetJk().setSelectedItem("");
        frame.getTxtAlamat().setText("");
        frame.getTxtUsia().setText("");
        frame.getTxtAlasan().setText("");
    }
    
    public void isiTable(){
        lmb = implUser.getAll();
        ModTblForm mtf = new ModTblForm(lmb);
        frame.getTblForm().setModel(mtf);
    }
    
    public void insert(){
        if(!frame.getTxtNama().getText().trim().isEmpty() & !frame.getTxtNama().getText().trim().isEmpty()){
            ModUser mu= new ModUser();
            
            mu.setNik(Integer.parseInt(frame.getTxtNik().getText()));
            mu.setNama(frame.getTxtNama().getText());
            mu.setJk(frame.getSetJk().getSelectedItem().toString());
            mu.setAlamat(frame.getTxtAlamat().getText());
            mu.setUsia(Integer.parseInt(frame.getTxtUsia().getText()));
            mu.setAlasan(frame.getTxtAlasan().getText());
            
            implUser.insert(mu);
            JOptionPane.showMessageDialog(null, "Data Disimpan");
        } else{
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan");
        }
    }
    
    public void isiTableCariNama(){
        lmb = implUser.getCariNama(frame.getTxtCari().getText());
        ModTblForm mtf = new ModTblForm(lmb);
        frame.getTblForm().setModel(mtf);   
    }
    
    public void carinama(){
        if (!frame.getTxtCari().getText().trim().isEmpty()){
            implUser.getCariNama(frame.getTxtCari().getText());
            isiTableCariNama();
        }else{
            JOptionPane.showMessageDialog(frame,"SILAHKAN PILIH DATA");
        }
    }
}
