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
public class kelompok extends akademik {
    String kel;
    
    public kelompok(){
    }
    
    public void setKelompok(String kel){
        this.kel = kel;
    }
    
    public String getKelompok(){
        return kel;
    }
    
    public void Cetak(){
        System.out.println("KELOMPOK MATA KULIAH: "+kel);
    }
}
