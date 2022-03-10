/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal4;

import java.util.Scanner;

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
          Scanner scanner = new Scanner(System.in);
        Barang b = new Barang();
        System.out.print("Panjang = ");
        b.length = scanner.nextDouble();
        System.out.print("Lebar = ");
        b.wide = scanner.nextDouble();
        System.out.print("Tinggi = ");
        b.height = scanner.nextDouble();
        System.out.print("Berat = ");
        b.weight = scanner.nextDouble();

        b.volume();

        double minVolume = 50d;
        double minWeight = 1d;

        b.divideVolume = Math.ceil(b.volume() / minVolume);
        b.divideWeight = Math.ceil(b.weight / minWeight);

        System.out.println(String.format("Harga : Rp.%.0f", b.price()));
       
    }
    
}
