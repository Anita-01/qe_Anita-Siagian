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
public class Problem3 {
    private static void DrawXYZ(int n) {
        int b = 1;
        char height[] = { 'Y', 'Z', 'X' };

        for (int i = 0; i < n; i++) {
            for (int z = 0; z < n; z++) {
                if (b % 3 == 0) {
                    System.out.print(height[2]);
                } else if (b% 2 == 0) {
                    System.out.print(height[1]);
                } else if (b % 2 != 0) {
                    System.out.print(height[0]);
                }

                System.out.print(" ");
                b++;
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
     
//        DrawXYZ(5);
////        DrawXYZ(3);
     DrawXYZ(1);
        
    }

}

