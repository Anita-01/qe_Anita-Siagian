/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal5;

/**
 *
 * @author ACER
 */
public class Animal {
    
    /**
     * @param args the command line arguments
     */
    String nama_binatang;
    String jenis_makanan;
    String gigi_binatang;
    
    public static void main(String[] args) {
        // TODO code application logic here
    Carnivor carnivor = new Carnivor();
    Herbivor herbivor = new Herbivor();
    Omnivor omnivor = new Omnivor();
  
    
    System.out.println("Hi I'm Parent of All Animal, My Name is Binatang");
    System.out.println("");
    herbivor.identify_myself();
    carnivor.identify_myself();
    System.out.println("");
    omnivor.identify_myself();
    }
    
}
