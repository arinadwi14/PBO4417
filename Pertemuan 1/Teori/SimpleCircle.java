/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan1.SimpleCircle;

/**
 *
 * @author User
 */
class SimpleCircle {
    double radius;
    
    SimpleCircle() {
        radius = 1;
    }
    
    SimpleCircle(double newRadius) {
        radius = newRadius;
    }
    
    double getArea() {
        return radius * radius * Math.PI;
    }
    
    double getParameter() {
        return 2 * radius * Math.PI;
    }
    
    void setRadius(double newRadius) {
        radius = newRadius;
    }
}
