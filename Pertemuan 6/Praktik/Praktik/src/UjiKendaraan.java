/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class UjiKendaraan {
    public static void main(String[] args) {
        Bicycle mesin1 = new Bicycle();
        mesin1.speed = 2.8;
        mesin1.color = "Biru Muda";
        System.out.println("\n Sepeda itu melaju dengan kecepatan "+mesin1.speed + " km/jam dan memiliki warna "+mesin1.color);
        System.out.println("Belnya berbunyi ");
        mesin1.ringBell();
        
        Vehicle mesin2 = new Vehicle();
        System.out.println("\n Kendaraan tersebut memiliki kecepatan "+mesin2.speed + " km/jsm dan memiliki warna "+mesin2.color);
        mesin2.goStraight();
        mesin2.turnLeft();
        mesin2.turnRight();
        
        Car mesin3 = new Car();
        mesin3.sizeofEngine = 2000;
        System.out.println("\n Mesinnya berukuran "+mesin3.getSizeofEngine()+ " cc");
        mesin3.setSeatBelt(true);
        System.out.println("Apakah sudah memakai seatbelt? "+mesin3.getSeatBelt());
        
        MotorVehicle mesin4 = new MotorVehicle();
        mesin4.speed = 30.0;
        mesin4.color = "Merah dengan pola hitam";
        System.out.println("\n Motor itu melaju dengan kecepatan "+mesin4.speed+ " km/jam dan memiliki warna "+mesin4.color);
        mesin4.sizeofEngine = 200;
        System.out.println("Mesinnya berukuran "+mesin4.getSizeofEngine()+ " cc");
        mesin4.licencePlate = "H 1401 ADS";
        System.out.println("Nomor Plat Motornya "+mesin4.getLicencePlate());
        
        MotorCycle mesin5 = new MotorCycle();
        mesin5.sizeofEngine = 150;
        System.out.println("\n Mesinnya berukuran "+mesin5.getSizeofEngine()+ " cc");
        mesin5.setGearFoot(3);
        System.out.println("Giginya saat ini berada di posisi "+mesin5.getGearFoot());
        
        KendaraanMelaju(mesin2);
        KendaraanMelaju(new MotorCycle());
        KendaraanMelaju(mesin3);
        
        
    }
    public static void KendaraanMelaju(Vehicle obj){
        obj.goStraight();
    }
}
