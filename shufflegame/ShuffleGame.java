//package shufflegame;
//
//import java.util.Random;
//import java.util.Scanner;
//import java.util.concurrent.ThreadLocalRandom;
//
//public class ShuffleGame implements GameRoadMap{
//
//    String welcome = "------------------------------welcome to shuffle game--------------------------------";
//    Scanner scanner = new Scanner(System.in);
//
//
//
//     String guess = "guess where the 0 is ? ";
//     int guessedNo = scanner.nextInt();
//     String mode ;
//     int[] array = {1, 0 ,1};
//
//    /**
//     * method that takes an array shuffles the components in random way and returns it
//     * @param array: array to shuffle
//     * @return array: shuffled array
//     */
////    public int[] shuffleGame(int[] array) {
////        Random rnd = ThreadLocalRandom.current();
////        for (int i = array.length - 1; i > 0; i--) {
////            int index = rnd.nextInt(i + 1);
////            int a = array[index];
////            array[index] = array[i];
////            array[i] = a;
////        }
////        return array;
//    }
//
//    /**
//     * captures the user input (1, 2 or 3) saves it in an integer variable and returns it
//     * @return playerGuess: userInput value
//     */
//    public int playerGuess() {
//        //implement here
//
////   /        ask user if ready to start
//        String playerGuess = "Are you ready to play?  Yes/No";
//        if (mode == "yes") {
//            Random rnd = ThreadLocalRandom.current();
//            for (int i = array.length - 1; i > 0; i--) {
//                int index = rnd.nextInt(i + 1);
//                int a = array[index];
//                array[index] = array[i];
//                array[i] = a;
//            }
//            while()
//
//
//          //  String ask = "ask user to choose position";
//                int.scanner.nextInt();
//
//
//           if (int )
////        pick 1, 2 or 3! (handle add entry cases -lowercase uppercase, different number, special character, any text-)
//
//
//
//            return playerGuess();
//        }
//        if (mode == "No")
//
//
//            return 0;
//    }
//
//    /**
//     * checks whether the player guess position is in a correct position in the shuffled array or not
//     * and prints the corresponding statements
//     * @param shuffledArray: takes the shuffled array
//     * @param playerGuess: takes the chosen position user input
//     */
//    public void checkGuess(int[] shuffledArray, int playerGuess) {
//        //implement here
//
//
///
//
//
//
//
//    }
//
//
//
//
//
//
//
//    /**
//     * uses the previous functions in a good sequential way to run the game
//     * uses the method recursion in order to loop in the game
//     */
//    public void play() {
//        //implement here
//    }
//
//}
////    shuffle game
//
////Hint: use methods (return and non-return), interface, main method, classes, if statement, print statement, recursion, random,
////
////        int[] array = {1,0,1};
////
////        print (welcome message and instructions)
////        ------------------------------welcome to shuffle game--------------------------------
////        guess where the 0 is ?
////
////        ask user if ready to start
////        are you ready to play? y/n (handle add entry cases -lowercase uppercase, number, special character, any text-)
////
////        if y:
////        shuffle the game (invoke shuffle game method - shuffle game method will be provided)
////
////        ask user to choose position
////        pick 1, 2 or 3! (handle add entry cases -lowercase uppercase, different number, special character, any text-)
////
////        print results of user guess
////        if good guess:
////        good guess!
////
////        if not good guess:
////        sorry!!! wrong guess
////
////        ask if user wants to play again
////        do you want to try again? y/n (handle add entry cases -lowercase uppercase, different number, special character, any text-)
////
////        if y:
////        loop the game (use recursive)
////        if n:
////
////        print (wellfare message)
////
////---------------------------------see you next time!-----------------------------------
