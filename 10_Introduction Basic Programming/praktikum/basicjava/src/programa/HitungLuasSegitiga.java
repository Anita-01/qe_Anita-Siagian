/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class HitungLuasSegitiga {
    
    Scanner sc = new Scanner(System.in);
   private static void hitungsegitiga(){
        float alas = sc.nextFloat();
        float tinggi = sc.nextFloat();
        float hasil = alas*tinggi/2;
        return hasil;
   }
   
   public static void main (String[] args){
       hitungsegitiga();
   }
   
    
}
