package jungol.선택제어문.전체풀이;

import java.util.InputMismatchException;
import java.util.Scanner;

public class If_9031_ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();

            if (number1 > number2) {
                System.out.printf("입력받은 수 중 큰 수는 %1$d이고 작은 수는 %2$d입니다.", number1, number2);
            } else if (number1 < number2) {
                System.out.printf("입력받은 수 중 큰 수는 %2$d이고 작은 수는 %1$d입니다.", number1, number2);
            } else if (number1 == number2) {
                System.out.println("입력받은 두 수는 서로 같습니다.");
            }
        } catch (InputMismatchException e) {
            System.out.println("정수를 입력해주세요.");
        }
    }
}
