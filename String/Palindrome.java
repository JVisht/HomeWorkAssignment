package String;

public class Palindrome {

    /*
     *
     * write java code to check if a given String is Palindrome
     * when a String is reversed and remains unchanged, that is called Palindrome
     * example, MOM,DAD,MADAM,KAYAK
     *
     */
//not working
    public static void main(String[] args) {

        String str = "dream";
        String reverse = " ";
        int i;
        for (i = str.length() - 1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        boolean palindrome = true;
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) != reverse.charAt(i)) {
                palindrome = false;
            }
            if (palindrome) {
            }
            System.out.println("PALINDROME!");

        }
    }
}