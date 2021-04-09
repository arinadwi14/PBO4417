/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import Transportasi.Mobil;
import Transportasi.Bicycle;
public class TransportasiDemo {
    public static void main(String[] args){
        Mobil car = new Mobil();
        car.setMerkMobil("Toyota");
        car.setWarna("Merah");
        
        car.Cetak();
        
        Bicycle sepeda = new Bicycle();
        sepeda.setMerkSepeda("Polygon");
        sepeda.setWarna("Hitam");
        
        System.out.println("\n");
        sepeda.Cetak();
    }
}
