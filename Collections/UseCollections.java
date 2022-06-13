package Collections;

import java.util.HashSet;

public class UseCollections {
   // import java.util.Arrays;
   // import java.util.HashSet;
 //   import java.util.Set;



        /*
         *
         * given 2 arrays, array1 and array2
         * int[] array1 = {1, 3, 2, 4, 8, 9, 0}
         * int[] array2 = {1, 3, 7, 5, 4, 0, 7, 5}
         *
         * use collections (List and Set to solve this exercise)
         *
         * 1. find union of the two arrays. output: [0, 1, 2, 3, 4, 5, 7, 8, 9]
         * 2. find the intersection of the two arrays. output: [0, 1, 3, 4]
         * 3. find the symmetric difference of the two arrays. output: [2, 5, 7, 8, 9]
         *
         */

        public static void main(String[] args) {

            //write your code here

                   int[] array1 = {1, 3, 2, 4, 8, 9, 0};
                    int[] array2 = {1, 3, 7, 5, 4, 0, 7, 5};
                    int m = array2.length;
                    int n = array1.length;
                    HashSet<Integer> str= new HashSet<>();

            for (int i=0; i< n;i ++) {
                str.add(array1[i]);

            }  for (int i =0; i < m; i++)
                    str.add(array2[i]);

            System.out.println("no of element after union operation:" +str.size()+ "  \n");
            System.out.print("The union set of both arrays is :" +"\n");

            System.out.print(str.toString()+ " ");





        }








    }
