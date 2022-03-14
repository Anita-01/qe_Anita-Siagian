/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem1;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Soal1 {

      public static void main(String[] args) {
        Soal1 s = new Soal1();
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        s.go(i);
    }

    private void go(int n) {
        String s = "";
        for (int i = 0; i < n; i++)
            s += " *";
        String w = "";
        for (int i = 0; i < n; i++)
            w += " ";

        for (int i = n; i > 0; i--) {
            System.out.print(w.substring(i));
            System.out.println(s.substring((n - i) * 2));
        }
        for (int i = 2; i <= n; i++) {
            System.out.print(w.substring(i));
            System.out.println(s.substring((n - i) * 2));
        }
    }
}