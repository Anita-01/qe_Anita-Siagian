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
public class Main4 {
 
    public static void main(String[] args) {
        int bilangan;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        bilangan = sc.nextInt();
        System.out.println("Output: ");
        for (int i=bilangan; i>=1; i--){
            if (bilangan%i == 0){
                System.out.println(i + " ");
            }
        }
    }
}

