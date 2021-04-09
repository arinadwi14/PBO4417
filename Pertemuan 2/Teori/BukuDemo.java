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
public class BukuDemo {
    public static void main(String [] args){
        Buku judul1 = new Buku ("Pemrograman Berbasis Objek dengan Java", " Indrajani", "Elexmedia Komputindo", 2007);
        Buku judul2 = new Buku ("Dasar", "Abdul Kadir", " Andi Offset ", 2004);
        judul1.cetakBuku();
        judul2.cetakBuku();
        
    }
}
