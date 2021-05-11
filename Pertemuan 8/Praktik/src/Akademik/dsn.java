/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Akademik;

/**
 *
 * @author User
 */
public class dsn extends akademik{
    String nid;
    String nama;
    String mk;
    
    public dsn(){
        
    }
    
    public void setNid(String nid){
        this.nid = nid;
    }
    
    public String getNid(){
        return nid;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }

    public void setMk(String mk){
        this.mk = mk;
    }
    
    public String getMk(){
        return mk;
    }
    
    public void Cetak(){
        System.out.println("NOMOR INDUK DOSEN PENGAMPU: "+nid);
        System.out.println("NAMA DOSEN PENGAMPU: "+nama);
        System.out.println("MATA KULIAH YANG DIAJARKAN: "+mk);
    }
}
