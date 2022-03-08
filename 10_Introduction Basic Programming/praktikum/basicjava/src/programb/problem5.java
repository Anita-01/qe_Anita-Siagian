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
import java.util.Scanner;

public class problem5 {
    private static String ubahHuruf(String s) {
        int min = 'A';
        int max = 'Z';
        int offset = 10;
        char[] split = s.toCharArray();
        int count = 0;
        for (char x : split) {
            if (x >= min && x <= max) {
                int mod = ((int) x + offset) % max;
                if (mod < min && mod != 0) {
                    mod += min - 1;
                } else if (mod == 0) {
                    mod = max;
                }
                split[count] = (char) mod;
            } else {
                split[count] = x;
            }
            count++;
        }
        return String.valueOf(split);
    }

    public static void main(String[] args) {
        System.out.println(ubahHuruf("SEPULSA OKE"));
        System.out.println(ubahHuruf("ALTERA ACADEMY"));
        System.out.println(ubahHuruf("INDONESIA"));
        System.out.println(ubahHuruf("GOLANG"));
        System.out.println(ubahHuruf("PROGRAMMER"));
    }

}