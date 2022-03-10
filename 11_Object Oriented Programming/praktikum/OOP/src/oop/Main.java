/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args) {
        BangunDatar bangunDatar = new BangunDatar();
        
        Persegi persegi = new Persegi();
        persegi.sisi = 2;
        
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang= 8;
        persegiPanjang.lebar = 4;
        
        persegi.luas();
        System.out.println("==================");
        persegiPanjang.luas();
        persegiPanjang.keliling();
    }
    
}
