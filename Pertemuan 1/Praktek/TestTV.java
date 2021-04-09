/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan1.Praktik2;

/**
 *
 * @author User
 */
public class TestTV {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);
        
        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();
        
        System.out.println("Channel TV 1 adalah " + tv1.channel + " dan volume levelnya adalah " + tv1.volumeLevel);
        System.out.println("Channel TV 2 adalah " + tv2.channel + " dan volume levelnya adalah " + tv2.volumeLevel);
        
    }
}
