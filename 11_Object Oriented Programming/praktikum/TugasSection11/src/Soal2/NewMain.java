/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal2;

/**
 *
 * @author ACER
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tabung tabung = new Tabung();
        Kubus kubus = new Kubus();
        Balok balok = new Balok();
        // Deklariasi nilai 
        kubus.ku = 10;
        balok.a=3;
        balok.b=6;
        balok.c = 10;
        tabung.phi= 22/7;
        tabung.r= 7;
        tabung.t = 10;
        
        // Deklarasi output
    
        System.out.println("Output :");
        kubus.volkubus();
        balok.volbal();
        tabung.cetak();
        
    }
    
}
