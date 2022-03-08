/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

/**
 *
 * @author ACER
 */
public class Main6 {
    
    private static boolean palindrome (String value) {
        int i =0, j = value.length() - 1;
        while (i<j) {
            if (value.charAt(i) != value.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(palindrome("civic"));
        System.out.println(palindrome("katak"));
        System.out.println(palindrome("kasur rusak"));
        System.out.println(palindrome("kupu-kupu"));
        System.out.println(palindrome("lion"));
              
    }
}
