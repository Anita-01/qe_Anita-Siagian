

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterabledatastructure;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author ACER
 */
public class Problem1 {

    public static void main(String[] args) {
        String array1[] = { "kazuya", "jin", "lee" };
        String array2[] = { "kazuya", "feng" };

        Set<String> list3 = new LinkedHashSet<String>();
        list3.addAll(Arrays.asList(array1));
        list3.addAll(Arrays.asList(array2));
        String array3[] = list3.toArray(new String[list3.size()]);

        System.out.println(Arrays.toString(array3));

    }

}