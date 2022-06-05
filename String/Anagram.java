package String;

import java.util.Arrays;
import java.util.Locale;

public class Anagram {

    /*
     *
     * write a Java Program to check if the two String are Anagram
     * two Strings are called Anagram when there is same character but in different order
     * examples: "CAT" and "ACT", "ARMY" and "MARY"
     *
     */

    public static void main(String[] args) {

        //run your code here
        String str1 = " ARMY";
        String str2 = " MARY";
        str1 = str1.toLowerCase(Locale.ROOT);
        str2 = str2.toLowerCase(Locale.ROOT);


        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
        } else {
            char[] String1 = str1.toCharArray();
            char[] String2 = str2.toCharArray();

            Arrays.sort(String1);
            Arrays.sort(String2);

            if (Arrays.equals(String1, String2) == true) {
                System.out.println("Both are Anagram");
            }


        }

    }
}