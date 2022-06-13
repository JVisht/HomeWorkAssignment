package math;
//
public class Fibonacci {
    //
//    /*
//     *
//     * write 30 Fibonacci numbers with java
//     * 0,1,1,2,3,5,8,13
//     *
//     */
    public static void main(String[] args) {

        int length = 30;
        int firstNo = 0;
        int secondNo = 1;
        int thirdNo;

        System.out.println(firstNo);
        System.out.println(secondNo);

        for ( int i= 3; i< length; i++){
            thirdNo = firstNo + secondNo;
            secondNo = thirdNo;
            firstNo = secondNo;
            System.out.println(thirdNo);

        }





    }
}