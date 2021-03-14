/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan2.Slide18;

/**
 *
 * @author User
 */
public class MobilDemo2 {
    public static void main(String [] args){
        Mobil2 mobilku = new Mobil2();
        
        mobilku.warna = "Hitam";
        mobilku.tahunProduksi = 2006;
        System.out.println("Warna : " + mobilku.warna);
        System.out.println("Tahun Produksi : " + mobilku.tahunProduksi);
        
        mobilku.hidupkanMobil();
        mobilku.matikanMobil();
        mobilku.ubahGigi(1);
        mobilku.ubahGigi(2);
    }
}
