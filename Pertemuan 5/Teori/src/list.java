/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Stack;
public class list {
    public static void main(String[] args) {
        System.out.println("<<< Input Data Buku >>>\n");
        Array arraylist = new Array();
        Buku nama = new Buku();
        Buku nama1 = new Buku();
        Buku nama2 = new Buku();
        Buku nama3 = new Buku();
        Buku nama4 = new Buku();
        
        nama.setJudul("Autumn In Paris");
        nama1.setJudul("Protect");
        nama2.setJudul("A princess and A knight");
        nama3.setJudul("True Stalker");
        nama4.setJudul("FriendZone");
        
        arraylist.tambah(nama);
        arraylist.tambah(nama1);
        arraylist.tambah(nama2);
        arraylist.tambah(nama3);
        arraylist.tambah(nama4);
        arraylist.tampil();
        
        System.out.println("Hapus Data Buku \n");
        arraylist.hapus(nama3);
        arraylist.tampil();
        
        System.out.println("\n");
        stack stack1 = new stack();
        
        System.out.println("<<< Input Data Buku (Stack) >>>");
        
        stack1.tambah(nama);
        stack1.tambah(nama1);
        stack1.tambah(nama2);
        stack1.tambah(nama3);
        stack1.tambah(nama4);
        stack1.tampil();
        
        stack1.hapus();
        System.out.println("\n");
        System.out.println("<<< Setelah dihapus >>>");
        stack1.tampil();
        stack1.ambil();
        System.out.println("\n");
        stack1.tampil();
        
        
//        System.out.println("\n");
//        queue Queue1 = new queue();
//        System.out.println("<<< Input Data Buku (Queue) >>>");
//        
//        Queue1.tambah(nama);
//        Queue1.tambah(nama1);
//        Queue1.tambah(nama2);
//        Queue1.tambah(nama3);
//        Queue1.tambah(nama4);
//        Queue1.tampil();
//        
//        Queue1.hapus(nama);
//        System.out.println("<<< Setelah dihapus >>>");
//        Queue1.tampil();
//        
//        Queue1.hapushead();
//        System.out.println("<<< Poll Queue >>>");
//        Queue1.tampil();
//        Queue1.ukuran();
    }
}
