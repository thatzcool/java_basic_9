package jungol.선택제어문.전체풀이;

import java.util.Scanner;

public class If_9035_ex6 {
    public static void main(String[] args) {
        System.out.print("세 수를 입력하세요. ");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        int tmp1 = Math.max(number1, number2);
        int tmp2 = Math.max(number2, number3);
        int maxValue = Math.max(tmp1, tmp2);

        System.out.printf("입력받은 수 중 가장 큰 수는 %d입니다.", maxValue);
    }
}
