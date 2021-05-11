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
public class akademik {
    public static void main(String[] args){
        dsn Dsn = new dsn();
        Dsn.nid = "A11";
        Dsn.nama = "";
        Dsn.mk = "PBO";
        Dsn.Cetak();
        
        mhs Mhs = new mhs();
        Mhs.nim = "A11.2019.11645";
        Mhs.nm = "Arina Dwi Safitri";
        Mhs.Cetak();
        
        mp matkulp = new mp();
        matkulp.matkulp = "PBO";
        matkulp.Cetak();
        
        mt matkult = new mt();
        matkult.matkult = "PWL";
        matkult.Cetak();
        
        kelompok kel = new kelompok();
        kel.kel = "A11.4417";
        kel.Cetak();
        
        nilai nilai = new nilai();
        nilai.np = 80;
        nilai.nt = 75;
        nilai.Cetak();
        
    }
}
