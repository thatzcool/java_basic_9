package javabasic_01.jungol.선택제어문.전체풀이;

import java.util.InputMismatchException;
import java.util.Scanner;

public class If_9037_ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력하세요. ");

        try {
            int score = scanner.nextInt();
            char grade = 0;
            if ((score >= 90) && (score <= 100)) grade = 'A';
            else if ((score >= 80) && (score < 90)) grade = 'B';
            else if ((score >= 70) && (score < 80)) grade = 'C';
            else if ((score >= 60) && (score < 70)) grade = 'D';
            else if ((score >= 0) && (score < 60)) grade = 'F';
            else System.out.println("0부터 100 사이의 숫자를 입력해주세요.");

            System.out.println(grade);

        } catch (InputMismatchException e) {
            System.out.println("숫자만 입력가능합니다.");
        }
    }
}
