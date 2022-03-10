/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal3;

/**
 *
 * @author ACER
 */
public class Operator {
   
  
    public void Penjumlahan(int a, int b){
       
        int jumlah = a + b;
         System.out.println("Penjumlahan:" + jumlah);
       
    }
    public void Pengurangan(int a, int b){
        int kurang = a-b;
        System.out.println("Pengurangan:" + kurang);
    }
    public void Perkalian(int a, int b){
        int kali = a*b;
        System.out.println("Perkalian:" + kali);
    }
    public void Pembagian(int a, int b){
        int bagi = a/b;
        System.out.println("Pembagian:" + bagi);
    }

    
}
