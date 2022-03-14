/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem4;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Soal4 {

    /**
     * @param args the command line arguments
     */
 
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, String > huruf = new HashMap<String, String>();
        
        huruf.put("A", "1 1");
        huruf.put("B", "2 1");
        huruf.put("C", "3 1");
        huruf.put("D", "4 1");
        huruf.put("E", "5 1");
        huruf.put("F", "1 2");
        huruf.put("G", "2 2");
        huruf.put("H", "3 2");
        huruf.put("I", "4 2");
        huruf.put("J", "5 2");
        huruf.put("K", "3 1");
        huruf.put("L", "1 3");
        huruf.put("M", "2 3");
        huruf.put("N", "3 3");
        huruf.put("O", "4 3");
        huruf.put("P", "5 3");
        huruf.put("Q", "1 4");
        huruf.put("R", "2 4");
        huruf.put("S", "3 4");
        huruf.put("T", "4 4");
        huruf.put("U", "5 4");
        huruf.put("V", "1 5");
        huruf.put("W", "2 5");
        huruf.put("X", "3 5");
        huruf.put("Y", "4 5");
        huruf.put("Z", "5 5");
     
       
        String input = scan.next();
        System.out.println(huruf.get(input));
        

    }
}