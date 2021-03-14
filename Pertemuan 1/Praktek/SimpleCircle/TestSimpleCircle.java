
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class TestSimpleCircle {
    public static void main(String[] args) {
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("Luas lingkaran dengan jari-jari " + circle1.radius + " adalah " + circle1.getArea());
        
        SimpleCircle circle2 = new SimpleCircle(50);
        System.out.println("Luas lingkaran dengan jari-jari " + circle2.radius + " adalah " + circle2.getArea());
        
        SimpleCircle circle3 = new SimpleCircle(150);
        System.out.println("Luas lingkaran dengan jari-jari " + circle3.radius + " adalah " + circle3.getArea());
        
        circle2.radius = 28;
        System.out.println("Luas lingkaran dengan jari-jari " + circle2.radius + " adalah " + circle2.getArea());
    }
}
