/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan2.Slide26;

/**
 *
 * @author User
 */
public class Buku {
    String judul;
    String Pengarang;
    String Penerbit;
    int Tahun;
    
    public Buku(String judul, String Pengarang, String Penerbit, int Tahun){
        this.judul = judul;
        this.Pengarang = Pengarang;
        this.Penerbit = Penerbit;
        this.Tahun = Tahun;
    }
    
    public void cetakBuku(){
        System.out.println("Judul:  "+ this.judul);
        System.out.println("Pengarang: "+ this.Pengarang);
        System.out.println("Penerbit: "+ this.Penerbit);
        System.out.println("Tahun: "+ this.Tahun);
    }
    
}
