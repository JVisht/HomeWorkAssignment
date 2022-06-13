package math;

import java.util.Arrays;

public class FindLowestDifference {

    /*
     *
     * consider these below two arrays (array1 and array2)
     * find the lowest difference between the two arrays cells
     * hint: the lowest difference between cells is 1
     *
     */

    public static void main(String[] args) {

        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        Arrays.sort(array1);
        Arrays.sort(array2);
        int n = array1.length;
        int m = array2.length;
        int a = 0;
        int b = 0;
        int result = Integer.MAX_VALUE;

        while (a < m && b < n) {
            if (Math.abs(array1[a] - array2[b]) < result)
                result = Math.abs(array1[a] - array2[b]);

            if (array1[a] < array2[b])
                a++;
            else
                b++;

        }
        System.out.println("lowest difference between the cell : " + (result));

    }
}