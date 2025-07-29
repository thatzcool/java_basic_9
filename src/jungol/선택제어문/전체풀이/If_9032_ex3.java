package jungol.선택제어문.전체풀이;

import java.util.InputMismatchException;
import java.util.Scanner;

public class If_9032_ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("점수를 입력하세요. ");
            int score = scanner.nextInt();
            if (score >= 80 && score <= 100) {
                System.out.println("축하합니다. 합격입니다.");
            } else if (score >= 0 && score < 80) {
                System.out.println("죄송합니다. 불합격입니다.");
            } else System.out.println("0부터 100사이의 수를 입력해 주세요.");
        } catch (InputMismatchException e) {
            System.out.println("숫자만 입력 가능합니다.");
        }

    }
}
