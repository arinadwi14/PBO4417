/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan3;

/**
 *
 * @author User
 */
public class TestGame {
    public static void main(String[]args){
        GamePlayer pemain = new GamePlayer();
        pemain.setPosition(60, 90);
        
        pemain.Run(); 
        pemain.Run(30);
        
        GameEnemy prajurit = new GameEnemy();
        prajurit.Run();
    }
}
