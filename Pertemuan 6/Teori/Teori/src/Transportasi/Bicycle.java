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
public class Bicycle {
    String merkSepeda;
    String warna;
    
    public Bicycle(){
        this.merkSepeda = " ";
        this.warna = " ";
    }
    
    public String setMerkSepeda (String merkSepeda){
        return this.merkSepeda = merkSepeda;    
    }
    
    public String setWarna(String warna){
        return this.warna = warna;
    }
    
    public String getmerkSepeda(){
        return merkSepeda;
    }
    
    public String getWarna(){
        return warna;
    }
    
    public void Cetak(){
        System.out.println("Merk Sepeda: "+merkSepeda);
        System.out.println("Warna: "+warna);
    }
    
}
