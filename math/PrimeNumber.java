package math;

import java.math.BigInteger;

public class PrimeNumber {



    /*
     *
     * find collections of Prime numbers from number 2 to 1 million.
     * output number of Prime numbers on the given range.
     *
     */

    public static void main(String[] args) {

        int collection= 0;
        int i = 1;
        int j = 1;
        int n = 0;

        while (n< 1000) {
            j = 1;
            collection = 0;

            while (j <= i) {
                if (i % j == 0) {
                    collection++;
                    j++;
                }
            } if (collection == 2) {

                    System.out.printf("%d ", i);
                    n++;
                }
                i++;






        }


    }
}