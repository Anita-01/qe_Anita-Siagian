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
public class Problem1 {
    private static int pangkat(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public static void main(String[] args) {
        System.out.println(pangkat(2, 3));
        System.out.println(pangkat(5, 3));
        System.out.println(pangkat(10, 2));
        System.out.println(pangkat(2, 5));
        System.out.println(pangkat(7, 3));
    }
}