/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan2.Praktik2;

/**
 *
 * @author User
 */
class Manusia {
    String nama;
    boolean punyaTV = false;
    
    public Manusia() { 
    }
    
    Manusia (String nama){
        this.nama = nama;
     
    }
    
    String namaSaya(){
        return nama;
    }
    
    public void beliTV(TV tvku) {
        punyaTV = true;
    }
    
    public void jualSemuaTV(){
        punyaTV = false;
    }
    
    public boolean cekTV(){
        return  punyaTV;
    }
    
}
