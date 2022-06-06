import java.util.Scanner;

public class TemperatureConvert {
    public static void main(String[] args) {

        //  Hint: use do while / while / scanner / int mode / int tempToConvert / int tempConverted / if statement / print statement


        System.out.println("-----------------------------------Welcome------------------------------------------");
        System.out.println("-----------------Celsius-Fahrenheit/Fahrenheit-Celsius converter--------------------");
        Scanner scan = new Scanner(System.in);
        int mode;

        do {
            System.out.println("choose the conversion mode:");
            System.out.println("1-Celsius-Fahrenheit");
            System.out.println("2- Fahrenheit-Celsius ");
            mode = scan.nextInt();
            while (mode != 1 && mode != 2) {
                System.out.println("invalid entry please enter 1 or 2");


            }  if (mode == 1) {
                    System.out.println("Enter the temperature to convert:");
                    int tempToConvert = scan.nextInt();
                    int formula = (tempToConvert * 9 / 5) + 32;
                    System.out.println(tempToConvert + "C---------->" + formula + "F");
                } else if (mode == 2) {
                    System.out.println("Enter the temperature to convert:");
                    int tempToConvert = scan.nextInt();
                    int formula = (tempToConvert - 32) * 5 / 9;
                    System.out.println(tempToConvert + "F---------->" + formula + "C");
                }
                System.out.println("do you want to convert other temperatures ? 1- Yes/2- No");
                mode = scan.nextInt();


            }
            while (mode == 1) ;

            System.out.println("-----------------------------Good bye, see you soon----------------------------------");


        }


    }


