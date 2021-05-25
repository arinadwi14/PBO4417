/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.awt.*;
import java.awt.event.*;

public class HitungBMI extends Frame implements ActionListener{
    Label l1;
    Label l2;
    Label l3;
    Label l4;
    Label l5;
    Label l6;
    Label l7;
    
    TextField tf1;
    TextField tf2;
    TextField tf3;
    TextField tf4;
    
    Button b1;
    
    HitungBMI(){
        Frame f = new Frame("IBM Program: ");
        l1 = new Label("NIM: ");
        l1.setBounds(50,50,100,30);
        
        l2 = new Label("Nama: ");
        l2.setBounds(50,100,100,30);
        
        l3 = new Label("Berat: ");
        l3.setBounds(50,150,100,30);
        
        l4 = new Label("Tinggi: ");
        l4.setBounds(50,200,100,30);
        
        l5 = new Label();
        l5.setBounds(50,300,500,30);
        
        l6 = new Label();
        l6.setBounds(50,330,200,30);
        
        l7 = new Label();
        l7.setBounds(50,360,380,30);
        
        tf1 = new TextField();
        tf1.setBounds(150,53,150,20);
        
        tf2 = new TextField();
        tf2.setBounds(150,103,150,20);
        
        tf3 = new TextField();
        tf3.setBounds(150,153,150,20);
        
        tf4 = new TextField();
        tf4.setBounds(150,203,150,20);
        
        b1 = new Button("HITUNG");
        b1.setBounds(50,250,100,30);
        b1.addActionListener(this);
        
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(l7);
        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(tf4);
        f.add(b1);
        f.setSize(350,480);
        f.setLayout(null);
        f.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        f.setVisible(true);
    }
    @Override
        public void actionPerformed(ActionEvent e){
            String ket = "";
            String nim = tf1.getText();
            String nama = tf2.getText();
            Double berat = Double.parseDouble(tf3.getText());
            Double tinggi = Double.parseDouble(tf4.getText());
            tinggi = tinggi / 100;
            Double bmi = berat / (tinggi*tinggi);
            
            if ((bmi >= 18.5) && (bmi <= 25)){
                ket = "BERAT ANDA SUDAH IDEAL";
            }else{
                ket = "BERAT ANDA BELUM IDEAL";
            }
            l5.setText("NIM : "+nim);
            l6.setText("Nama : "+nama);
            l7.setText("HASIL BMI : "+ket);
        }
        public static void main(String[] args){
            new HitungBMI();
        }
    }
