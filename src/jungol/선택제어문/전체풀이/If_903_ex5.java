package jungol.선택제어문.전체풀이;

import java.util.Scanner;

public class If_903_ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("주사위를 두 번 던진 결과를 입력하세요. ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if ((number1 >= 4) && (number2 >= 4)) System.out.println("이겼습니다.");
        else if ((number1 >= 4) ^ (number2 >= 4)) System.out.println("비겼습니다.");
        else System.out.println("졌습니다.");
    }
}
