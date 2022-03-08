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
public class Problem6 {
        public static float Mean(float[] numbers) {
        float total = 0;
        for (int i = 0; i < numbers.length; i++)
            total += numbers[i];

        float hasil = total / numbers.length;
        return (float) hasil;
    }

    public static void main(String[] args) {
        float[] value = { 1, 2, 3, 4 };
        System.out.println(Mean(value));
    }

}

