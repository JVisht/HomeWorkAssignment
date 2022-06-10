package Collections;

import java.util.HashSet;
import java.util.Set;

public class UseHashSet {

    public static void main(String[] args) {
        /*
         *
         * demonstrate how to use HashSet that includes add,remove elements
         * add these elements to your collections: 3,3,4,1,7,1,0,7,4,5,0,9,8
         * use for each loop to print out data
         * print out the number of the elements of your HashSet
         *
         */
        HashSet<Integer> codeSet = new HashSet<>();
        codeSet.add(3);
        codeSet.add(3);
        codeSet.add(4);
        codeSet.add(1);
        codeSet.add(7);
        codeSet.add(1);
        codeSet.add(0);
        codeSet.add(7);
        codeSet.add(4);
        codeSet.add(5);
        codeSet.add(0);
        codeSet.add(9);
        codeSet.add(8);

        for (Integer number : codeSet) {
            System.out.println(number);
        }
         codeSet.add(13);
        System.out.println(codeSet);

    codeSet.remove(5);
        System.out.println(codeSet);



    }

    }




