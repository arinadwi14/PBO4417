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
public class mt extends akademik {
    String matkult;
    
    public mt(){
    }
    
    public void setMatkult(String matkult){
        this.matkult = matkult;
    }
    
    public String getMatkult(){
        return matkult;
    }
    
    public void Cetak(){
        System.out.println("MATA KULIAH TAMBAHAN YANG DIAMBIL: "+matkult);
    }
}

