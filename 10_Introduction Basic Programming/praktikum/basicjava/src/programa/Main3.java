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
public class Main3 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input: ");
        int bilangan = sc.nextInt();
                int i;
                System.out.println("Output: ");
        for (i=1;i<= bilangan; i++){
            if (bilangan % i == 0) {
               System.out.println(i + " ");
            }
        }
               
    }
    
}
