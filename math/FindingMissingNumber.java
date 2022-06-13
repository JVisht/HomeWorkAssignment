package math;

public class FindingMissingNumber {


    public static void main(String[] args) {


        int [] n = {10, 2, 1, 4, 5, 3, 7, 8, 6};

        int sum1 = 0;
        for (int i = 0; i < n.length;i++) {
            sum1 = sum1 + n[i];
        }
        int sum2 = 0;
        for (int i=1;i<=10;i++){
        sum2= sum2 + i;
    }
        System.out.println("Missing number in the range is:" + (sum2-sum1));

    }}