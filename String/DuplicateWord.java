package String;

import java.util.Objects;

public class DuplicateWord {


    /*
     *
     * write a java code to find the duplicate words and their number of occurrences in the string
     * also Find the average length of the words
     *
     */

    public static void main(String[] args) {

        String str = "Java is a programming Language.Java is also an Island of Indonesia.Java is widely used language,Java is also coffee";

        //run your code here
        int count;
        str = str.trim();
        str = str.toLowerCase();
        String[] dupWord = str.split(" ");
        System.out.println("Duplicate word in a given string:");
        int i;
        for (i = 0; i < dupWord.length; i++) {
            count = 1;
            int j;
        for (j = i + 1; j < dupWord.length; j++) {

        if (dupWord[i].equals(dupWord[j])) {
            count++;
            dupWord[j] = "0";
        }
        }

        if (count > 1 && !Objects.equals(dupWord[i], "0")) {
            System.out.println(dupWord[i]);
        }
            }

        }
    }
