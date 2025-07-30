package javabasic_01.jungol.선택제어문.전체풀이;

import java.util.Scanner;

public class If_632_self9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        int tmp1 = Math.min(number1, number2);
        int tmp2 = Math.min(number2, number3);
        int minValue = Math.min(tmp1, tmp2);

        System.out.println(minValue);
    }
}
