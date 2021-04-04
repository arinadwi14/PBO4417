/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.ArrayList;
public class Array extends Buku{
   private final ArrayList<Buku> namaBuku = new ArrayList<>() ;
   
   public void tambah(Buku judul){
       namaBuku.add(judul);
   }
   
   public void hapus(Buku judul){
       namaBuku.remove(judul);
   }
   
   public void tampil(){
       for (int i=0; i < namaBuku.size(); i++){
           System.out.println("Judul Buku: "+namaBuku.get(i).getJudul());
       }
   }
    
}
