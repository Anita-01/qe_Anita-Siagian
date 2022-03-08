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
public class Main2 {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    for (int i = 0; i<4; i++){
         int Number = sc.nextInt();
    
     if (Number >= 80 & Number <= 100){
    System.out.println("A");
    } else if  (Number  >= 65 && Number <= 79) {
    System.out.println("B+");
    } else if (Number >= 50 && Number <= 64){
    System.out.println("B");
    } else if (Number >= 35 && Number <= 49){
    System.out.println("C");
    } else if  (Number >= 0 && Number <= 34){
    System.out.println("D"); 
    } else {
        System.out.println("Invalid");
    }
    
    }
  
}
        

    
}
