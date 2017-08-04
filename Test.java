package ssru.toshihiro;

import java.util.Scanner;

public class Test {
    public static void main(String [] args) {

        Scanner kb = new Scanner(System.in);
        System.out.print("Enter number1 = " );
        int number1 = kb.nextInt();
        System.out.print("Enter number2 = " );
        int number2 = kb.nextInt();
        number1 = Math.abs(number1);
        number2 = Math.abs(number2);

        int result = 1;

        int min = Math.min(number1, number2);

        for (int i = 2; i < min; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                number1 /= i;
                number2 /= i;
                result *= i;
                i = 1;
            }

            if (i > number1 || i > number2) {
                break;
            }
        }

        System.out.println("Result is = " + result);


    }
}
