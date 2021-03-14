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
class Mobil2 {
    String warna;
    int tahunProduksi;
    boolean mobilHidup = false;
    int gigi = 0;
    
    public void hidupkanMobil(){
        mobilHidup = true;
        System.out.println("Keadaan Mobil : Hidup " + "(" + mobilHidup + ")");
    }
    
    public void matikanMobil(){
        mobilHidup = false;
        System.out.println("Keadaan Mobil : Mati " + "(" + mobilHidup + ")");
    }
    
    public void ubahGigi(int gigi){
        this.gigi = gigi;
        System.out.println("Posisi Gigi sekarang : " + this.gigi);
    }
}
