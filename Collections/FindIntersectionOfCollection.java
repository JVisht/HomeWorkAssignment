package Collections;

import java.util.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindIntersectionOfCollection {
    public static void main(String[] args) {


        int[] array1 = {1, 3, 2, 4, 8, 9, 0};
        int[] array2 = {1, 3, 7, 5, 4, 0, 7, 5};

        Arrays.sort(array1);
        Arrays.sort(array2);
      ArrayList<Integer> result =new ArrayList<>();
          int i= 0;
          int j = 0;
       while (i<array1.length && j < array2.length){
           if (array1[i] > array2[j]) {
               j++;
           } else if (array1[i] < array2[j]) {
               i++;
           }else{
               result.add(array1[i]);
           i++;
           j++;

           }

       }

        System.out.println(result);



    }
}