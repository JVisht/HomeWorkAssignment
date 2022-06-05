package String;

import java.util.Arrays;
import java.util.Scanner;

public class DetermineLargestWord {


    /*
     *
     * implement a code to find the length and longest word in the given sentence
     * should return "10" (for length), "biological" (longest word)
     *
     */

    public static void main(String[] args) {
      // String sen = "Human brain is a biological learning machine";

        //write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String sen = sc.nextLine();

        sen = sen.trim();
         sen = sen + " ";
         int length = sen.length();
         int l = 0; // to store the length of the longest word
         String TempWord = " "; // to store temp word
         String LongestWord = " "; // to store the longest word

        for (int i = 0; i < length;i++ ) {
            char ch = sen.charAt('i');
            if (ch != ' ') {
                TempWord = ch + TempWord; //concatenation
            } else {
                int wordLength = TempWord.length(); //to store temp length of the word
                if (wordLength > l){
                    wordLength = l;
                    LongestWord = TempWord;

                    TempWord = " ";
            }
            }
        System.out.println("Longest word: "+LongestWord+" with Length : " +TempWord );



            }


















    }

}
