package jungol.연산자;

import java.util.Scanner;

public class Operator_9018_ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("두 개의 수를 입력하시오. ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.printf("%1$d + %2$d = %3$d \n", number1, number2, number1 + number2);
        System.out.printf("%1$d - %2$d = %3$d \n", number1, number2, number1 - number2);
        System.out.printf("%1$d * %2$d = %3$d \n", number1, number2, number1 * number2);
        System.out.printf("%1$d / %2$d = %3$d \n", number1, number2, (int)(number1 / number2));
        int result = number1 % number2;
        System.out.println(number1 + " % " + number2 + " = " + result);
    }

}
