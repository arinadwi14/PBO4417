/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transportasi;

/**
 *
 * @author User
 */
public class Mobil {
    String merkMobil;
    String warna;
    public Mobil(){
        this.merkMobil = " ";
        this.warna = " ";
    }
    
    public String setMerkMobil(String MerkMobil){
        return this.merkMobil = MerkMobil;    
    }
    
    public String setWarna(String warna){
        return this.warna = warna;
    }
    
    public String getMerkMobil(){
        return merkMobil;
    }
    
    public String getWarna(){
        return warna;
    }
    
    public void Cetak(){
        System.out.println("Jenis Mobil: "+merkMobil);
        System.out.println("Warna: "+warna);
    }
}
