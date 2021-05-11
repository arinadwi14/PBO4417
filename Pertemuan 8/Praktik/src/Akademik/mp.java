/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Akademik;

/**
 *
 * @author User
 */
public class mp extends akademik{ 
    String matkulp;
    
    public mp(){
    }
    
    public void setMatkulp(String matkulp){
        this.matkulp = matkulp;
    }
    
    public String getMatkulp(){
        return matkulp;
    }
    
    public void Cetak(){
        System.out.println("MATA KULIAH POKOK YANG DIAMBIL: "+matkulp);
    }
}
