/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal1;

import static java.lang.Math.sqrt;

/**
 *
 * @author ACER
 */
public class Segitiga {
    int alas;
    int tinggi;
    int m;
    int l;
    
    public int keliling(){
        m =  (int) sqrt((alas*alas) + (tinggi*tinggi));
        return alas + tinggi + m;
        }
   public int luas(){
       l = (alas*tinggi)/2;
       return l;
       
   }
    public void kels(){
        System.out.println("Segitiga : " + keliling());
     }
    public void luass(){
        System.out.println("Segitiga : " + luas());
     }
    
}
