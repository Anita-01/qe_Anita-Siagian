/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterabledatastructure;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ACER
 */
public class Problem5 {
    static int[] removeDuplicates(int[] array) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i : array) {
            list.add(i);
        }
        List<Integer> withoutDuplicates = list.stream().distinct().collect(Collectors.toList());
        int[] myArray = new int[withoutDuplicates.size()];
        for (int i = 0; i < myArray.length; i++)
            myArray[i] = withoutDuplicates.get(i);
        return myArray;
    }

    public static void main(String[] args) {
        int[] array = { 2 , 2, 2, 11};
        array = removeDuplicates(array);
        int length2 = array.length;
        System.out.println(length2);
    }

}