package math;

public  class Factorial {
    public static void main(String[] args) {

        //  5! = 5 x 4 X 3 X 2 X 1 = 120

        factorial((5));
        System.out.println("Factorial of 5! = "+factorial(5)  );
    }
        public static int factorial(int n) {
         if (n==1) {
             return 1;
         }else {
             return n * factorial (n-1);
         }



}
}