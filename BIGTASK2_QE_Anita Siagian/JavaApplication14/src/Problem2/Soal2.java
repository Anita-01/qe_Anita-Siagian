/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem2;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Soal2 {
    public static void main(String[] args) {
        String kalimat;
        Scanner in = new Scanner(System.in);
        for (int i=0;i<=4;i++) {
            kalimat = in.nextLine();
        kalimat = kalimat.toLowerCase();
        checkWordsO(kalimat);
        }
        
    }

    private static void checkWordsO(String word) {
        for (int i = 0; i < word.length(); ++i) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                if (ch == 'o') {
                    ch = '-';
                    System.out.print(ch + " ");
                } else {
                    ch = '.';
                    System.out.print(ch + " ");
                }
            }
        }
    }

}



