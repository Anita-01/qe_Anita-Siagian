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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operator op1 = new Operator();
        System.out.println("Output : ");
        op1.Penjumlahan(4,5);
        op1.Pengurangan(4,15);
        op1.Perkalian(10, 10);
        op1.Pembagian(12, 3);
    }
    
}
