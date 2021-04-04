/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.*;
public class stack extends Buku{
    private final Stack<Buku> Judul = new Stack<Buku>();
    
    stack(){
        
    }
    
    public Buku tambah(Buku judul){
        return this.Judul.push(judul);
    }
    
    public void hapus(){
        Buku hapusBuku = this.Judul.pop();
        System.out.println("Hapus Buku: "+hapusBuku.getJudul());
    }
    
    public void ambil(){
        Buku ambilBuku = this.Judul.peek();
        System.out.println("Ambil Buku : "+ambilBuku.getJudul());
    }
    
    public void tampil(){
        for (int i=0; i < Judul.size(); i++){
            System.out.println(Judul.get(i).getJudul());
        }
    }
}
