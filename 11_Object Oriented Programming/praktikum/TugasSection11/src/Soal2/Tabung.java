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
public class Tabung {
    int r ;
    int t ;
    double phi ;
    int volume;
    
    
    public int volumetabung(){
        volume= (int) (phi * (r*r) * t);
        return volume;
    }
    public void cetak(){
        System.out.println("Tabung: " + volumetabung());
    }
}
