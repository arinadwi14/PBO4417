/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Buku {
    String judul;
    String tambahBuku;
    
    Buku(){
        this.judul = " ";
    }
    
    public String setJudul(String judul){
        return this.judul = judul;
    }
    
    public String getJudul(){
        return judul;
    }
}
