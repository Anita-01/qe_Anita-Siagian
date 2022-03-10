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
public class Balok {
    int a,b,c;
    
    public int VolumeBalok() {
        return a*b*c;
    }
    public void volbal(){
        System.out.println("Balok:" + VolumeBalok());
    }
    
}
