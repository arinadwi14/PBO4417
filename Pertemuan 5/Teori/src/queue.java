/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Queue;
import java.util.LinkedList;
public class queue {
      public static void main(String args[]){
            Lagu judul = new Lagu();
            System.out.println(judul.sisaLagu());
 
            judul.tambahLagu("Coldplay - A Head Full Of Dreams");
            judul.tambahLagu("Coldplay - The Scientist");
            judul.tambahLagu("Coldplay - Everglow");
            judul.tambahLagu("Coldplay - Yellow");
            judul.tambahLagu("Coldplay - Miracles");
            System.out.println("Lagu yang sedang dimainkan:  "+judul.sisaLagu());
 
            System.out.println("\n");
            System.out.println("Lagu yang sudah selesai : ");
            judul.hapusLagu(3);
            
            System.out.println("\n");
            System.out.println("Sisa Lagu : ");
            System.out.println(judul.sisaLagu());
      }      
}

class Spotify {
      Queue<String> song = new LinkedList<String>();
 
      public Spotify(){
 
      }
      public void setSayur(Queue<String> song) {
            this.song = song;
      }
      public Queue<String> getLagu(){
            return this.song;
      }
}

class Lagu extends Spotify {
      public void tambahLagu(String song){
            super.getLagu().add(song);
      }
      public void hapusLagu(int index){
            System.out.println(super.getLagu().poll());
      }
      public Queue<String> sisaLagu(){
            return super.getLagu();
      }
}