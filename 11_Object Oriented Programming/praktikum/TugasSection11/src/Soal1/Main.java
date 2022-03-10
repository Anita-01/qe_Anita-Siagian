/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal1;

/**
 *
 * @author ACER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersegiPanjang p1= new PersegiPanjang();
        Segitiga s1 = new Segitiga();
        Persegi r1 = new Persegi();
        r1.sisi=4;
        s1.alas=3;
        s1.tinggi=4;
        p1.a = 7;
        p1.b = 8;
        
        System.out.println("Input:" );
        System.out.println("Luas" );
        r1.luasp();
        s1.luass();
        p1.luasPP();
        System.out.println("Keliling" );
        r1.kelp();
        s1.kels();
        p1.kelPP();
           
    }
    
}
