/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterabledatastructure;

/**
 *
 * @author ACER
 */
public class Problem6 {
      public static int maxSum(int arr[], int n, int k) {
        int total = 0;
        for (int i = 0; i < k; i++)
            total += arr[i];

        int result = total;
        for (int i = k; i < n; i++) {
            result += arr[i] - arr[i - k];
            total = Math.max(total, result);
        }
 
        return total;
    }

    public static void main(String[] args) {
        int arr[] = { 2,3,4,1,5};
        int k = 2;
        int n = arr.length;
        System.out.println(maxSum(arr, n, k));
    }
}