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
public class Carnivor extends Animal{
    
    public void identify_myself(){
        nama_binatang = "Singa";
        jenis_makanan = "daging";
        gigi_binatang = "I have tajam teeth";
       System.out.println( "Hi I'm Carnivore, My name is " + nama_binatang+ ", My Food is " + jenis_makanan + "," + gigi_binatang);
       
        
    }
}
