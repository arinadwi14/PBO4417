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
public class nilai extends akademik {
    float na; // na = nilai akhir
    int np;
    int nt;
    
    public nilai(){
        
    }
    
    public void setNilai(int np, int nt){ //np = nilai mata kuliah pokok, nt = nilai mata kuliah tambahan
        
        na = (float)((np * 0.60)+(nt*0.40));  
    }
    public float getNa(){
        return na;
    }

    public void Cetak(){
        System.out.println("Nilai MataKuliah Pokok:  "+np);
        System.out.println("Nilai MataKuliah Tambahan: "+nt);
        System.out.println("NILAI AKHIR "+na);
    }
}
