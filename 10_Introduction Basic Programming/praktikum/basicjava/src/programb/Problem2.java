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
public class Problem2 {
 
     private static void playWithAsterisk(int n) {
        StringBuilder result = new StringBuilder();
        for (int r = 1; r <= n; r++) {
            for (int sp = 1; sp <= n - r; sp++) {
                result.append(" ");
            }
            for (int c = 1; c <= (r * 2) - 1; c++) {
                result.append("*");
            }
            result.append(System.lineSeparator());
        }
        System.out.println(result.toString());
    }

    public static void main(String[] args) {
        playWithAsterisk(5);
    }
}