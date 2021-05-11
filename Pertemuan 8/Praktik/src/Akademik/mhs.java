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
public class mhs extends akademik {
    String nim;
    String nm;
    
    public mhs(){
    }
    
    public void setNim(String nim){
        this.nim = nim;
    }
    
    public void setNm (String nm){
        this.nm = nm;
    }
    
    
    public String getNim(){
        return nim;
    }
    
    public String getNm(){
        return nm;
    }

    public void Cetak(){
        System.out.println("NOMOR INDUK MAHASISWA: "+nim);
        System.out.println("NAMA MAHASISWA: "+nm);
    }

}
