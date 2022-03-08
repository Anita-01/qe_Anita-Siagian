/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programb;

/**
 *
 * @author ACER
 */
public class Problem4 {
    private static void cetakTablePerkalian(int n){
        for (int bil1 = 1; bil1 <= n; bil1++){
            System.out.print(bil1);
            System.out.print(" ");
            System.out.print(bil1 * 2);
            System.out.print(" ");
            System.out.print(bil1 * 3);
            System.out.print(" ");
            System.out.print(bil1 * 4);
            System.out.print(" ");
            System.out.print(bil1 * 5);
            System.out.print(" ");
            System.out.print(bil1 * 6);
            System.out.print(" ");
            System.out.print(bil1 * 7);
            System.out.print(" ");
            System.out.print(bil1 * 8);
            System.out.print(" ");
            System.out.print(bil1  * 9);
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        cetakTablePerkalian(9);
    }
}

