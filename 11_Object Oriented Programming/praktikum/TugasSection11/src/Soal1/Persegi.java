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
public class Persegi {
    int sisi;
    
    public int luas(){
        return sisi*sisi;
    }
    public int keliling(){
        return 4*sisi;
    }
    public void kelp(){
        System.out.println("Persegi : " + keliling());
     }
    public void luasp(){
        System.out.println("Persegi : " + luas());
     }
    
}
